package com.hammer.leetcode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Fight1 {
	// 设计有限阻塞队列
	class BoundedBlockingQueue {

		private int capacity = 0;
		private Queue<Integer> queue = null;

		public BoundedBlockingQueue(int capacity) {
			this.capacity = capacity;
			queue = new ArrayDeque<>(2);
		}

		public void enqueue(int element) throws InterruptedException {
			synchronized (this) {
				while (queue.size() >= capacity) {
					this.wait();
				}
				queue.offer(element);
				this.notifyAll();
			}
		}

		public int dequeue() throws InterruptedException {
			synchronized (this) {
				while (queue.size() == 0) {
					this.wait();
				}
				int num = queue.poll();
				this.notifyAll();
				return num;
			}
		}

		public int size() {
			return queue.size();
		}
	}

	public int maxNumberOfBalloons(String text) {
		String need = "balloon";
		if (text.length() < need.length()) {
			return 0;
		}
		Map<Character, Integer> map1 = new HashMap<>();
		char[] needArr = need.toCharArray();
		for (char c : needArr) {
			map1.put(c, map1.getOrDefault(c, 0) + 1);
		}
		Map<Character, Integer> map2 = new HashMap<>();

		char[] charArr = text.toCharArray();
		for (char c : charArr) {
			map2.put(c, map2.getOrDefault(c, 0) + 1);
		}
		int count = -1;
		for (char c : map1.keySet()) {
			if (!map2.containsKey(c)) {
				count = 0;
				break;
			}
			int num = map2.get(c);
			num /= map1.get(c);
			if (count == -1) {
				count = num;
			} else {
				if (count > num) {
					count = num;
				}
			}
		}
		return count;
	}
	
	
	
}
