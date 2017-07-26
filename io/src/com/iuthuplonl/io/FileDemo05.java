package com.iuthuplonl.io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 文件的写和读操作
 * @author acer
 *
 */
public class FileDemo05 {
	public static void main(String[] args) throws IOException {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			fis=new FileInputStream("d:\\javacode\\file\\我的青春我做主.txt");
			fos= new FileOutputStream("D:\\javacode\\myfile\\myfile1.txt",true);
			//创建中转数组，存放每次读取的内容
			byte[] words = new byte[1024];
//			while(fis.read()!=-1){
				fis.read(words);
				fos.write(words, 0, words.length);
				System.out.println("写入成功");
//			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
}
