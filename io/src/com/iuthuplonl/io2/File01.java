package com.iuthuplonl.io2;

import java.io.File;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		File file = new File("我的青春我做主.txt");
		try {
			file.createNewFile();
			System.out.println("文件创建成功");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
