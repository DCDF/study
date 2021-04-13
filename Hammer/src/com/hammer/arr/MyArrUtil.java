package com.hammer.arr;

import java.util.ArrayList;
import java.util.List;

public class MyArrUtil {
	public static void main(String[] args) {
		MyArrUtil obj = new MyArrUtil();
		obj.findDiagonalOrder(new int[][] { new int[] { 1 }, new int[] { 2 }, new int[] { 3 }, new int[] { 4 }, new int[] { 5 }, new int[] { 6 }, new int[] { 7 }, new int[] { 8 }, new int[] { 9 }, new int[] { 10 }});
	}

	//对角线遍历
	public int[] findDiagonalOrder(int[][] mat) {
		// 1(0,0) 2(0,1) 3(0,2)

		// 4(1,0) 5(1,1) 6(1,2)
		// ---------------------
		// 1(0,0) 2(0,1) 3(0,2)

		// 4(1,0) 5(1,1) 6(1,2)

		// 7(2,0) 8(2,1) 9(2,2)
		//----------------------
		//1(0,0)
		//2(1,0)
		//3(2,0)
		//4(3,0)
		//5(4,0)
		//6(5,0)
		// n = 每组长度
		// m = 组数
		// t=条数
		// 总条数=n+m-1
		// 奇数倒叙,偶数正序

		// i < n,t = i + 1;
		// t <= m
		// i=0 t=1
		// i=1 t=2
		// t=i+1
		// x1 = 0; x2 = t - 1;
		// y1 = i;y2 = i - (t-1)

		// i>=n,t=m-(i+1-n)=m-i-1+n
		// i=3,t=2
		// i=4 t=1
		// x1=i+1-n x2=i+1-n+t-1=m-1
		// y1=n-1 y2=n-1-(t-1)=n-t=i+1-m

		int n = mat[0].length;
		int m = mat.length;
		int[] newArr = new int[m * n];

		int max = n + m - 1;
		int index = 0;
		boolean z = false;
		for (int i = 0; i < max; i++) {
			int x = 0;
			int y = 0;
			int t = 0;
			if (z) {// 正序
				if (i < n) {
					t = i + 1;
					if (t > m) {
						t = m;
					}
					if (t > n) {
						t = n;
					}
					x = 0;
					y = i;
				} else {
					t = m - i - 1 + n;
					if (t > m) {
						t = m;
					}
					if (t > n) {
						t = n;
					}
					x = i + 1 - n;
					y = n - 1;
				}
			} else {// 逆序
				if (i < n) {
					t = i + 1;
					if (t > m) {
						t = m;
					}
					if (t > n) {
						t = n;
					}
					x = t - 1;
					y = i - (t - 1);
				} else {
					t = m - i - 1 + n;
					if (t > m) {
						t = m;
					}
					if (t > n) {
						t = n;
					}
					x = i-n+t;
					y = n-t;
				}
			}

			int xChange = z ? 1 : -1;
			int yChange = z ? -1 : 1;
			for (int j = 0; j < t; j++) {
//				System.out.println(mat[x][y]);
				newArr[index++] = mat[x][y];
				x += xChange;
				y += yChange;
			}
			if (z) {
				z = false;
			} else {
				z = true;
			}
		}
		return newArr;
	}
	
	//零矩阵
	public void setZeroes(int[][] matrix) {
		if (matrix == null || matrix.length == 0) {
			return;
		}
		int high = matrix[0].length;
		int weight = matrix.length;
		List<int[]> list = new ArrayList<>();
		for (int i = 0; i < weight; i++) {
			for (int j = 0; j < high; j++) {
				if (matrix[i][j] == 0) {
					list.add(new int[] { i, j });
				}
			}
		}
		for (int[] e : list) {
			for(int i = 0;i< matrix[e[0]].length;i++) {
				matrix[e[0]][i] = 0;
			}
			for(int i = 0;i< matrix.length;i++) {
				matrix[i][e[1]] = 0;
			}
		}
	}
	//旋转矩阵
	public void rotate(int[][] matrix) {
		int length = matrix.length;
		int[][] newArr = new int[length][length];
		/*
		 * x坐标 = 矩阵长度-x坐标 y坐标 = x坐标
		 */
		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				newArr[j][length - i - 1] = matrix[i][j];
			}
		}
		
		for(int i = 0;i < length;i++) {
			for(int j = 0;j < length;j++) {
				matrix[i][j] = newArr[i][j];
			}
		}
	}
}
