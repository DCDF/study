package com.hammer.friend.singel.one.role;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

import com.hammer.friend.singel.one.chat.ChatRecord;

public class Role {

	/*** 唯一ID **/
	private int id = 0;

	/*** 发起方 **/
	private int player1 = 0;

	/*** 接收方 **/
	private int player2 = 0;

	/*** 主关系 **/
	private int mainType = 0;

	/*** 多个子关系 **/
	private List<Integer> otherType = new ArrayList<>();

	/*** 类型变化发起者 **/
	private Map<Integer, Integer> typeChangePlayer = new ConcurrentHashMap<>();

	/*** 聊天记录 **/
	private List<ChatRecord> chatRecords = new ArrayList<>();

	public Object lock = new Object();

	public Role(int id) {
		this.id = id;
	}

	public int getId() {
		return id;
	}

	public int getPlayer1() {
		return player1;
	}

	public void setPlayer1(int player1) {
		this.player1 = player1;
	}

	public int getPlayer2() {
		return player2;
	}

	public void setPlayer2(int player2) {
		this.player2 = player2;
	}

	public int getMainType() {
		return mainType;
	}

	public void setMainType(int mainType) {
		this.mainType = mainType;
	}

	public List<Integer> getOtherType() {
		return otherType;
	}

	public void setOtherType(List<Integer> otherType) {
		this.otherType = otherType;
	}

	public List<ChatRecord> getChatRecords() {
		return chatRecords;
	}

	public Map<Integer, Integer> getTypeChangePlayer() {
		return typeChangePlayer;
	}

	public void setTypeChangePlayer(Map<Integer, Integer> typeChangePlayer) {
		this.typeChangePlayer = typeChangePlayer;
	}

}
