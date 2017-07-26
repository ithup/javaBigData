package com.iuthuplonl.io2;

import java.io.FileReader;

/**
 * 读取d:\\javacode\\file\\a.txt文件下的内容到控制台
 * @author acer
 *
 */
public class FileReaderTest2 {
	public static void main(String[] args) {
		//创建文件读对象
		FileReader fr = null;
		StringBuffer sb = null;
		try {
			fr = new FileReader("d:\\javacode\\file\\a.txt");
			//创建字符缓冲区对象
			 sb = new StringBuffer();
			//创建一个字符数组中转站存取读出来 的数据
			char[] ch = new char[4];
			//将数据写入字符数组中
			int length = 0;	
			while((length=fr.read(ch)) != -1){
				sb.append(ch);
				length = fr.read(ch);
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
