package com.iuthuplonl.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * 应用FileInputStream读取文件
 * @author acer
 *
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//创建文件流对象
		FileInputStream fis = new FileInputStream("D:\\javacode\\file\\a.txt");
		/*int available = fis.available();
		//把文件字节长度赋给数组
		byte[] b=new byte[available];
		//读取文件
		int read = fis.read(b);
		String str = new String(b);
		//输出内容
		System.out.println(str);
		fis.close();*/
		//从此输入流中读取一个数据字节。
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
		}
	}
}
