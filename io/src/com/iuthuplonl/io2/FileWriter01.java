package com.iuthuplonl.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 应用FileWriter写文件 向文件中写入数据
 * 
 * @author acer
 *
 */
public class FileWriter01 {
	public static void main(String[] args) {
		// 声明对象
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");
			fw = new FileWriter("我的青春我做主.txt", true);
			char[] ch = new char[1024];
			//int length = ch.length;
			//fr.read(ch, 0, length);
			//fr.read(ch);
			while(fr.read(ch) != -1){
				fw.write(ch);
				// 刷新
				fw.flush();
			}
			// 定义一个字符串
			// String str = "中国我爱你！";
			// char[] ch =str.toCharArray();
			// int len = ch.length;
			// 写入文件中
			//fw.write(ch, 0, length);
			System.out.println("写入成功");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭并释放资源
				if (fw != null) {
					fw.close();
				}
				if(fr != null){
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
