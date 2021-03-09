package com.hammer.utils;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.regex.Pattern;

public class HammerCutJar {
	/*
	 * 设置java -jar -verbose:class xxx.jar >>xxx.txt,运行jar文件,并输出加载的类到TXT,需要尽量使用程序所有功能
	 * 手动写入生成该文件的绝对父路径
	 */
	public static String CLASS_TXT_PATH = "C:\\Users\\Administrator\\Desktop\\Server";
	public static String TXT_NAME = "hammer.txt";

	public static void main(String[] args) throws Exception {
		boolean test = true;
		if (test) {
			
			String str = "[Loaded sdkfjdkf from sdfkdfjdkfjds";
//			String pattern = ".*Loaded.*";
//			System.err.println(pattern);
//			boolean matches = Pattern.matches(pattern, str);
//			System.err.println(matches);
			System.err.println(str.matches("^.*L.*"));
			return;
		}

		File jreDir = new File(CLASS_TXT_PATH);
		if (!jreDir.exists()) {
			System.err.println("错误:txt文件路径不存在");
			return;
		}
		if (jreDir.isFile()) {
			System.err.println("错误:txt文件路径找到的是一个文件,不是一个目录");
			return;
		}
		File txt = new File(CLASS_TXT_PATH + "\\" + TXT_NAME);
		if (!txt.exists()) {
			System.err.println("目录下没有该TXT文件,请线运行java -jar -verbose:class xxx.jar >>xxx.txt并尝试运行所有涉及到的功能,这么做是为了让所有类都加载");
			return;
		}
		BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(txt), "UTF-8"));
		String s = null;
		while ((s = br.readLine()) != null) {// 使用readLine方法，一次读一行
			// 正则匹配 [Loaded的行,删除from及其后所有内容
			if (s.matches(".*Loaded.*")) {// 只配置加载的类数据
				
			}
		}
		br.close();
	}
}
