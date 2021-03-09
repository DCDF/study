package com.hammer.utils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.charset.Charset;

public class HammerExcel {

	public static void main(String[] args) throws Exception {
		read();
	}

	public static void read() throws Exception {
		File file = new File("excel/test1.xlsx");
		FileInputStream fi = new FileInputStream(file);
		byte[] b = new byte[1024];
		while (fi.read(b) != -1) {
			System.err.println(b);
		}
	}

}
