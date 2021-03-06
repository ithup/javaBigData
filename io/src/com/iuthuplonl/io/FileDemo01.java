package com.iuthuplonl.io;

import java.io.File;
import java.io.IOException;

/**
 * File对象
 * 
 * @author acer
 *
 */
public class FileDemo01 {
	public static void main(String[] args) throws IOException {
		/*
		 * String fileName="D:\\javacode\\file\\hello.java"; File file=new
		 * File(fileName); System.out.println(file);
		 * System.out.println("-----------------"); File file1 = new
		 * File("d:\\javacode\\file","hello.java"); System.out.println(file1);
		 * System.out.println("------------------------");
		 */
		// 将parent封装成file对象
		File dir = new File("d:\\javacode\\file");
		File file3 = new File(dir, "hello.java");
		// System.out.println(file3);
		// System.out.println(file3.getAbsolutePath());
		// System.out.println(file3.getName());
		// System.out.println(file3.getPath());
		// System.out.println(file3.getParentFile());
		// System.out.println(file3.getParent());
		//System.out.println(file3.exists());//判断文件是否存在
		// System.out.println(file3.length());//文件大小
		// boolean mkdirs = dir.mkdirs();
		// boolean b = file3.createNewFile();
		// System.out.println(b);
		//System.out.println(dir.isDirectory());
		//System.out.println(file3.isFile());
		String[] list = dir.list();
		System.out.println(list);
		File[] listFiles =dir.listFiles();
		System.out.println(listFiles);
	}
}
