package com.hammer.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MyArrUtil {
	public static void main(String[] args) {
		MyArrUtil obj = new MyArrUtil();
//		obj.findDiagonalOrder(new int[][] { new int[] { 1 }, new int[] { 2 }, new int[] { 3 }, new int[] { 4 }, new int[] { 5 }, new int[] { 6 }, new int[] { 7 }, new int[] { 8 }, new int[] { 9 }, new int[] { 10 } });
//		obj.longestPalindrome("dfkhddghaba");
//		obj.reverseWords(" lost river one two three");
//		int result = obj.strStr("hello", "ll");
//		char[] c = new char[] { 'h', 'a', 'm', 'm', 'e', 'r' };
//		obj.reverseString(c);
//		obj.arrayPairSum(new int[] { 1, 4, 3, 2 });
//		obj.twoSum(new int[] { 2, 7, 11, 15 }, 9);
//		System.out.println(obj.removeElement(new int[] { 3, 2, 2, 3 }, 3));
//		obj.minSubArrayLen(11, new int[] { 1, 2, 3, 4, 5 });
//		obj.minSubArrayLen(7, new int[] { 2, 3, 1, 2, 4, 3 });
//		obj.generate(5);
//		System.out.println(obj.reverseWordsTwo("i love u"));
		obj.moveZeroes(new int[] { 0, 1, 0, 3, 12 });
	}

	// 对角线遍历
	public int[] findDiagonalOrder(int[][] mat) {
		// 1(0,0) 2(0,1) 3(0,2)

		// 4(1,0) 5(1,1) 6(1,2)
		// ---------------------
		// 1(0,0) 2(0,1) 3(0,2)

		// 4(1,0) 5(1,1) 6(1,2)

		// 7(2,0) 8(2,1) 9(2,2)
		// ----------------------
		// 1(0,0)
		// 2(1,0)
		// 3(2,0)
		// 4(3,0)
		// 5(4,0)
		// 6(5,0)
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
					x = i - n + t;
					y = n - t;
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

	// 零矩阵
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
			for (int i = 0; i < matrix[e[0]].length; i++) {
				matrix[e[0]][i] = 0;
			}
			for (int i = 0; i < matrix.length; i++) {
				matrix[i][e[1]] = 0;
			}
		}
	}

	// 旋转矩阵
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

		for (int i = 0; i < length; i++) {
			for (int j = 0; j < length; j++) {
				matrix[i][j] = newArr[i][j];
			}
		}
	}

	// 最长回文字符串
	public String longestPalindrome(String s) {
		// 开头结尾相同 axa,aaa
		// 中间部分规律相同 a 12321 a
		if (s == null || s.length() == 1) {
			return s;
		}
		String result = "";
		char[] charArr = s.toCharArray();
		for (int i = 0; i < s.length(); i++) {
			for (int j = i + 1; j < s.length(); j++) {
				if (charArr[i] != charArr[j]) {
					continue;
				}
				int end = j;
				boolean have = true;
				for (int k = i; k < end; k++, end--) {
					if (charArr[k] != charArr[end]) {
						have = false;
						break;
					}
				}
				if (have) {
					String substring = s.substring(i, j + 1);
					if (substring.length() > result.length()) {
						result = substring;
					}
				}
			}
		}
		if (result.equals("")) {
			result = s.substring(0, 1);
		}
		return result;
	}

	public String reverseWords(String s) {

		char[] charArr = s.toCharArray();

		List<String> list = new ArrayList<>();
		for (int i = 0; i < charArr.length; i++) {
			if (charArr[i] == ' ') {
				continue;
			}
			StringBuilder sb = new StringBuilder();
			sb.append(charArr[i]);
			for (int j = i + 1; j < charArr.length; j++) {
				if (charArr[j] == ' ') {
					break;
				}
				sb.append(charArr[j]);
				i++;
			}
			list.add(sb.toString());
		}
		StringBuilder sb = new StringBuilder();
		for (int i = 0; i < list.size(); i++) {
			if (i == 0) {
				sb.append(list.get(list.size() - 1 - i));
			} else {
				sb.append(" " + list.get(list.size() - 1 - i));
			}
		}
		return sb.toString();
	}

	// 实现strstr函数
	public int strStr(String haystack, String needle) {
		if (needle.trim().equals("")) {
			return 0;
		}
		char[] arr1 = haystack.toCharArray();
		char[] arr2 = needle.toCharArray();
		int arr2Length = arr2.length;
		if (arr2.length > arr1.length) {
			return -1;
		}

		for (int i = 0; i < arr1.length; i++) {
			if (arr1.length - i < arr2Length) {
				return -1;
			}
			if (arr1[i] == arr2[0]) {

				int count = arr2Length - 1;
				int addNum = 1;
				for (int j = 1; j < arr2Length; j++) {
					if (arr1[i + addNum] == arr2[addNum]) {
						count--;
					} else {
						break;
					}
					addNum++;
				}
				if (count == 0) {
					return i;
				}
			}
		}
		return -1;
	}

	// 双指针翻转字符串
	public void reverseString(char[] s) {
		if (s.length <= 1) {
			return;
		}
		int left = 0;
		int right = s.length - 1;
		boolean ou = s.length % 2 == 0 ? true : false;
		for (int i = 0; i < s.length; i++) {
			char k = s[right];
			s[right] = s[left];
			s[left] = k;
			int next = left + 1;
			if (ou) {
				if (next == right) {
					break;
				}
			} else {
				if (next == right - 1) {
					break;
				}
			}
			left++;
			right--;
		}
	}

	public int arrayPairSum(int[] nums) {
		if (nums.length == 0) {
			return 0;
		}
		if (nums.length % 2 != 0) {
			return 0;
		}
		Arrays.sort(nums);
		int count = 0;
		for (int i = 0; i < nums.length; i += 2) {
			count += nums[i];
		}
		return count;
	}

	// 双指针两数之和
	public int[] twoSum(int[] numbers, int target) {

		int leftIndex = 0;
		int rightIndex = numbers.length - 1;
		for (int i = 0; i < numbers.length; i++) {
			int num = numbers[leftIndex] + numbers[rightIndex];
			if (num == target) {
				return new int[] { ++leftIndex, ++rightIndex };
			}
			if (leftIndex + 1 == rightIndex) {
				break;
			}
			if (num > target) {
				rightIndex--;
			} else {
				leftIndex++;
			}
		}
		return new int[] { 0, 0 };
	}

	// 双指针快慢指针删除元素
	public int removeElement(int[] nums, int val) {
		if (nums.length == 0) {
			return 0;
		}
		int slow = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] != val) {
				nums[slow++] = nums[i];
			}
		}
		return slow;
	}

	// 最大连续1的个数
	public int findMaxConsecutiveOnes(int[] nums) {

		int count = 0;
		int tmp = 0;
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == 0) {
				tmp = 0;
			} else {
				tmp++;
				if (tmp > count) {
					count = tmp;
				}
			}
		}
		return count;
	}

	// 长度最小的子数组
	public int minSubArrayLen(int target, int[] nums) {
		int min = 0;

		int slow = 0;
		int fast = 0;

		int value = 0;
		for (int i = 0; i < Integer.MAX_VALUE; i++) {

			if (i == 0) {
				value += nums[slow];
			}
			if (value >= target) {

				int curLen = fast - slow + 1;
				for (int j = slow; j <= fast; j++) {
					value -= nums[j];
					slow++;
					if (value < target) {
						break;
					} else {
						curLen--;
					}
				}
				if (min == 0) {
					min = curLen;
				} else if (curLen < min) {
					min = curLen;
				}
			}
			if (fast == nums.length - 1) {
				return min;
			}
			fast++;
			value += nums[fast];
		}
		return min;
	}

	// 杨辉三角
	public List<List<Integer>> generate(int numRows) {

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i < numRows; i++) {

			List<Integer> l1 = new ArrayList<>();

			int num = 1;

			if (i > 1) {
				for (int j = 0; j <= i; j++) {
					int value = 0;
					if (j - 1 >= 0 && j <= i - 1) {
						List<Integer> preList = list.get(i - 1);
						value += preList.get(j - 1);
						value += preList.get(j);
					} else {
						value = 1;
					}
					l1.add(value);
				}
			} else {
				for (int j = 0; j <= i; j++) {
					l1.add(num);
				}
			}
			list.add(l1);
		}

		return list;
	}

	public List<Integer> getRow(int rowIndex) {

		List<List<Integer>> list = new ArrayList<>();
		for (int i = 0; i <= rowIndex; i++) {

			List<Integer> l1 = new ArrayList<>();

			int num = 1;

			if (i > 1) {
				for (int j = 0; j <= i; j++) {
					int value = 0;
					if (j - 1 >= 0 && j <= i - 1) {
						List<Integer> preList = list.get(i - 1);
						value += preList.get(j - 1);
						value += preList.get(j);
					} else {
						value = 1;
					}
					l1.add(value);
				}
			} else {
				for (int j = 0; j <= i; j++) {
					l1.add(num);
				}
			}
			list.add(l1);
		}

		return list.get(rowIndex);
	}

	public String reverseWordsTwo(String s) {
		char[] arr1 = s.toCharArray();

		StringBuilder sb = new StringBuilder();
		int count = 0;
		for (int i = 0; i < arr1.length; i++) {
			if (arr1[i] == ' ' || i == arr1.length - 1) {
				int first = i == arr1.length - 1 ? 0 : 1;
				if (count != 0 || first == 0) {
					if (!sb.toString().equals("")) {
						sb.append(" ");
					}
					for (int j = first; j <= count; j++) {
						sb.append(arr1[i - j]);
					}
				}
				count = 0;
			} else {

				count++;
			}

		}
		return sb.toString();
	}

	public int findMin(int[] nums) {
		if (nums.length == 1) {
			return nums[0];
		}
		for (int i = 0; i < nums.length; i++) {
			if (i + 1 > nums.length - 1) {
				return nums[0];
			}
			if (nums[i + 1] < nums[i]) {
				return nums[i + 1];
			}
		}
		return 0;
	}

	// 删除重复项
	public int removeDuplicates(int[] nums) {

		if (nums.length == 0) {
			return 0;
		}
		int slow = 0;

		for (int i = 0; i < nums.length; i++) {
			if (i != 0) {
				if (nums[i] == nums[i - 1]) {
					continue;
				} else {
					slow++;
				}
			}
			nums[slow] = nums[i];
		}
		return slow + 1;
	}

	//移动零
	public void moveZeroes(int[] nums) {

		if (nums.length <= 1) {
			return;
		}

		//慢指针不动,快指针遇到非0则将数据替换到慢指针位置
		int slow = 0;
		for (int fast = 0; fast < nums.length; fast++) {
			if (nums[fast] != 0) {
				int k = nums[fast];
				nums[fast] = nums[slow];
				nums[slow] = k;
				slow++;
			}
		}
	}
}
