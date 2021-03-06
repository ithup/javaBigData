package com.ithup.io04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream类读取数据read方法
 * @author acer
 *
 */
public class IO01 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		//创建一个字节输入流对象,必须明确数据源，其实就是创建字节读取流和数据源相关联。  
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[1024];
		//读取数据。使用 read();一次读一个字节。
		int read = fis.read(b , 0, b.length);
		System.out.println((char)read);
	}
}
