package com.hammer.test;

import java.io.IOException;
import java.lang.reflect.Field;
import java.net.InetSocketAddress;
import java.nio.ByteBuffer;
import java.nio.channels.SocketChannel;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Semaphore;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import java.util.function.IntConsumer;

import com.hammer.concurrent.readwritelock.ReadWriteLock;

public class HammerTest {

	private Object obj = new Object();
	private String abc = "";

//	public static void main(String[] args) {
//		HammerTest test = new HammerTest();
//		
//		test.getCoreNum();
//	}
	public static void main(String[] args) {
		int[][] arr = new int[3][3];
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[1][0] = 4;
		arr[1][1] = 0;
		arr[1][2] = 6;
		arr[2][0] = 7;
		arr[2][1] = 8;
		arr[2][2] = 9;
		rotate(arr);
	}

	/**
	 * 处理器核心数量
	 */
	public void getCoreNum() {
		int coreNum = Runtime.getRuntime().availableProcessors();
		System.out.println(coreNum + " 核处理器");
	}

	public void setStr(String str) {
		synchronized (abc) {
			this.abc = str;
		}
	}

	public String getStr() {
		synchronized (obj) {
			return abc;
		}
	}

	public static void rotate(int[][] matrix) {
		/*
		 * 1(0,0) 2(0,1) 3(0,2)
		 * 
		 * 4(1,0) 5(1,1) 6(1,2)
		 * 
		 * 7(2,0) 8(2,1) 9(2,2)
		 * 
		 * 奇数倒叙,偶数正序
		 * 
		 * 总条数 n+n-1
		 * 
		 * i < n: 每条个数下标+1 x = 0 x+=1 条数-1次 y = i y-=1 条数-1次
		 * 
		 * i >= n: 每条个数n - i + 2
		 * 
		 * x = i - n + 1 x+=1 条数-1次 y = n-1 y-=1 条数-1次
		 * 
		 */
	}

//--------------------------------------------------------------------------------------
	class Solution {
		public int[] findDiagonalOrder(int[][] mat) {
			/*
			 * 1(0,0) 2(0,1) 3(0,2)
			 * 
			 * 4(1,0) 5(1,1) 6(1,2)
			 * 
			 * 7(2,0) 8(2,1) 9(2,2)
			 * 
			 * 奇数倒叙,偶数正序
			 * 
			 * 总条数 n+n-1
			 * 
			 * i < n: 每条个数下标+1 x = 0 x+=1 条数-1次 y = i y-=1 条数-1次
			 * 
			 * i >= n: 每条个数n - i + 2
			 * 
			 * x = i - n + 1 x+=1 条数-1次 y = n-1 y-=1 条数-1次
			 * 
			 */
			int n = mat[0].length;
			int[] newArr = new int[n * 2];

			int max = n * 2 - 1;
			for (int i = 0; i < max; i++) {
				int num = 0;
				int x = 0;
				int y = 0;
				if(i < n) {
					num = i+1;
					y = i;
				}else {
					num = n-i+2;
					x = i - n + 1;
					y = n - 1;
				}
				for(int j = 0;j < num; j++) {
					System.out.println(mat[x++][y--]);
				}
			}
			return newArr;
		}
	}
// ------------------------------------------------------------------------------------
}