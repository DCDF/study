package com.hammer.friend.singel.one;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;

import com.hammer.friend.singel.one.common.RoleType;
import com.hammer.friend.singel.one.role.Role;
import com.hammer.friend.singel.one.save.SaveData;

public class Client {

	/***
	 * 玩家好友数据<玩家ID,<好友ID,关系数据ID>>
	 */
	private Map<Integer, Map<Integer, Integer>> roleMap = new ConcurrentHashMap<>();

	/***
	 * 关系数据<ID,关系数据>
	 */
	private Map<Integer, Role> roleIdMap = new ConcurrentHashMap<>();

	/*** 关系唯一ID **/
	private AtomicInteger roleId = new AtomicInteger(1);

	private Client() {
	}

	private static class LazyHolder {
		private static final Client INSTANCE = new Client();
	}

	public static Client getInstance() {
		return LazyHolder.INSTANCE;
	}

	private SaveData saveData = null;

	public void initSaveData() {

		// 服务器启动时初始化
		// SavaData对象仅仅表示数据来源,实际使用应该是数据库数据提供类
		saveData = new SaveData();

		List<Role> roleSaveData = saveData.getRoleSaveData();

		Iterator<Role> it = roleSaveData.iterator();
		while (it.hasNext()) {
			Role next = it.next();
			addMyRoleMap(next.getPlayer1(), next.getPlayer2(), next);
		}
		// TODO 根据已使用的id初始化
//		roleId = new AtomicInteger(?);
	}

	/**
	 * 申请
	 * 
	 * @param player1
	 * @param player2
	 */
	public void apply(int player1, int player2) {
		Role role = getRole(player1, player2);
		if (role != null) {// 有关系
			if (role.getMainType() != 0) {// 有主关系
				if (role.getMainType() == RoleType.NORMAL) {// 已经为好友
					System.out.println("已经是好友");
					return;
				} else {// 拉黑了
					if (player1 == role.getTypeChangePlayer().getOrDefault(RoleType.BLACK, 0)) {// 主动拉黑的
						System.out.println("你已经拉黑对方");
						return;
					} else {
						System.out.println("多方已拉黑你");
						return;
					}
				}
			} else {
				synchronized (role.lock) {
					if (role.getOtherType().contains(RoleType.APPLY)) {// 已经在申请列表了
						if (player1 == role.getTypeChangePlayer().getOrDefault(RoleType.APPLY, 0)) {// 你申请的
							System.out.println("请勿重复申请");
							return;
						} else {// 对方申请的
							System.out.println("对方已申请你");
							return;
						}
					}
					role.getOtherType().add(RoleType.APPLY);
					role.getTypeChangePlayer().put(RoleType.APPLY, player1);
					System.out.println("申请成功:通知双方");
				}
			}
		} else {
			List<Integer> otherType = new ArrayList<>();
			otherType.add(RoleType.APPLY);
			Map<Integer, Integer> typeChangePlayer = new ConcurrentHashMap<>();
			typeChangePlayer.put(RoleType.APPLY, player1);
			role = createRole(player1, player2, 0, otherType, typeChangePlayer);
			System.out.println("申请成功:无关系申请,通知双方");
		}

	}

	/**
	 * 处理申请
	 * 
	 * @param player1
	 * @param player2
	 * @param type0拒绝1同意
	 */
	private void delApply(int player1, int player2, int type) {
		Role role = getRole(player1, player2);
		if (role == null) {
			System.out.println("申请不存在");
			return;
		}
		if (role.getMainType() != 0) {// 有主关系,清除申请信息
			synchronized (role.lock) {
				removeType(role.getOtherType(), RoleType.APPLY);
				System.out.println("已有主关系,清除申请信息");
			}
			return;
		} else {
			boolean haveAnyType = false;
			synchronized (role.lock) {
				removeType(role.getOtherType(), RoleType.APPLY);
				haveAnyType = role.getOtherType().size() > 0 ? true : false;
				System.out.println("已处理申请,清除申请消息:" + type);
			}
			if (type == 0) {
				if (haveAnyType) {

				}
			}
		}
	}

	private void removeType(List<Integer> types, int type) {
		Iterator<Integer> it = types.iterator();
		while (it.hasNext()) {
			if (it.next() == type) {
				it.remove();
				break;
			}
		}
	}

	private void add() {

	}

	private void del() {

	}

	private void change() {

	}

	private Map<Integer, Map<Integer, Role>> getMyRelationship() {

		return new ConcurrentHashMap<>();
	}

	private Role getRole(int player1, int player2) {
		if (!roleMap.containsKey(player1)) {
			return null;
		}
		Map<Integer, Integer> map = roleMap.get(player2);
		if (!map.containsKey(player2)) {
			return null;
		}
		int roleId = map.get(player2);
		return getRole(roleId);
	}

	private Role getRole(int id) {
		if (!roleIdMap.containsKey(id)) {
			return null;
		}
		return roleIdMap.get(id);
	}

	private void addMyRoleMap(int player1, int player2, Role role) {
		Map<Integer, Integer> map = null;
		map = getMyRoleMapAndInit(player1);
		map.put(player2, role.getId());
		map = getMyRoleMapAndInit(player2);
		map.put(player1, role.getId());
		if (!roleIdMap.containsKey(role.getId())) {
			roleIdMap.put(role.getId(), role);
		}
	}

	private Map<Integer, Integer> getMyRoleMap(int playerId) {
		if (!roleMap.containsKey(playerId)) {
			return new HashMap<>();
		}
		return roleMap.get(playerId);
	}

	private Map<Integer, Integer> getMyRoleMapAndInit(int playerId) {
		if (!roleMap.containsKey(playerId)) {
			roleMap.put(playerId, new ConcurrentHashMap<>());
		}
		return roleMap.get(playerId);
	}

	/**
	 * 创建加锁,不同玩家相互操作时
	 * 
	 * @param player1
	 * @param player2
	 * @param mainType
	 * @param otherType
	 * @param typeChangePlayer
	 * @return
	 */
	private synchronized Role createRole(int player1, int player2, int mainType, List<Integer> otherType, Map<Integer, Integer> typeChangePlayer) {
		Role check = getRole(player1, player2);
		if (check != null) {
			return check;
		}
		Role role = new Role(roleId.getAndIncrement());
		role.setPlayer1(player1);
		role.setPlayer2(player2);
		role.setMainType(mainType);
		role.setOtherType(otherType);
		role.setTypeChangePlayer(typeChangePlayer);
		addMyRoleMap(player1, player2, role);
		return role;
	}

	private void removeRole(int player1, int player2) {
		Role check = getRole(player1, player2);
		if (check == null) {
			return;
		}
		roleIdMap.remove(check.getId());
	}
}
