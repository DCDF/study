package com.hammer.string;

import java.util.ArrayList;
import java.util.List;

public class MyStringUtile {
	public static void main(String[] args) {
		longestCommonPrefix(new String[] { "flower", "flow", "flight" });
	}

	public static void testEquals() {
		String s1 = "Hello World";
		System.out.println("s1 is \"" + s1 + "\"");
		String s2 = s1;
		System.out.println("s2 is another reference to s1.");
		String s3 = new String(s1);
		System.out.println("s3 is a copy of s1.");
		// compare using '=='
		System.out.println("Compared by '==':");
		// true since string is immutable and s1 is binded to "Hello World"
		System.out.println("s1 and \"Hello World\": " + (s1 == "Hello World"));
		// true since s1 and s2 is the reference of the same object
		System.out.println("s1 and s2: " + (s1 == s2));
		// false since s3 is refered to another new object
		System.out.println("s1 and s3: " + (s1 == s3));
		// compare using 'equals'
		System.out.println("Compared by 'equals':");
		System.out.println("s1 and \"Hello World\": " + s1.equals("Hello World"));
		System.out.println("s1 and s2: " + s1.equals(s2));
		System.out.println("s1 and s3: " + s1.equals(s3));
		// compare using 'compareTo'
		System.out.println("Compared by 'compareTo':");
		System.out.println("s1 and \"Hello World\": " + (s1.compareTo("Hello World") == 0));
		System.out.println("s1 and s2: " + (s1.compareTo(s2) == 0));
		System.out.println("s1 and s3: " + (s1.compareTo(s3) == 0));
	}

	public static void testCanChange() {
		String s1 = "Hello World";
//        s1[5] = ',';编译不通过
		System.out.println(s1);
	}

	// 最长公共前缀
	public static String longestCommonPrefix(String[] strs) {
		if (strs == null || strs.length == 0) {
			return "";
		}
		if (strs.length == 1) {
			return strs[0];
		}
		char[] firstWord = strs[0].toCharArray();
		StringBuilder sb = new StringBuilder();
		int offsetIndex = -1;
		for (int i = 0; i < firstWord.length; i++) {
			boolean end = false;
			for (int j = 0; j < strs.length; j++) {
				boolean have = false;
				char[] compareWord = strs[j].toCharArray();
				for (int k = 0; k < compareWord.length; k++) {
					if (compareWord.length - 1 <= offsetIndex) {
						have = false;
						break;
					}
					if (k <= offsetIndex) {
						continue;
					}
					if (compareWord[k] == firstWord[i]) {
						have = true;
						break;
					} else {
						break;
					}
				}
				if (!have) {
					end = true;
					break;
				}
				if (j == strs.length - 1) {
					if (have) {
						sb.append(firstWord[i]);
						offsetIndex = i;
					}
				}
			}
			if (end) {
				break;
			}
		}
		return sb.toString();
	}

	public String longestPalindrome(String s) {
		//长度=1
		//
		return "";
	}
}
