package com.iuthuplonl.io2;

import java.io.FileReader;
import java.io.IOException;

/**
 * 通过fileReader读取文件
 * 
 * @author acer
 *
 */
public class FileReaderTest {
	public static void main(String[] args) {
		// 创建对象
		FileReader fileReader = null;
		StringBuffer sbf = null;
		try {
			fileReader = new FileReader("d:\\javacode\\file\\a.txt");
			char[] ch = new char[1024]; // 作为中转站
			sbf = new StringBuffer();
			int length = fileReader.read(ch); // 将字符数据读入数组
			//System.out.println(length);
			while (length != -1) { // 循环读取
				sbf.append(ch); // 追加字符
				length = fileReader.read(); // 读取文本文件数据
				System.out.println(length);
			}
			System.out.println(sbf);
			System.out.println("文件读取成功！");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// 关闭释放资源
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}
