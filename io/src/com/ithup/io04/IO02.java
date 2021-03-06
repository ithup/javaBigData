package com.ithup.io04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * 需求：复制文件
 * 		步骤：
 * 			第一步：指定数据源，从指定的文件中复制数据
 * 			第二步：指定目的地：把指定的数据写入到指定的文件中
 * 			第三步：从数据源中的读数据
 * 			第四步：把数据写到目的中
 * 			第五步：关闭流
 * @author acer
 *
 */
public class IO02 {
	public static void main(String[] args) throws IOException {
		//明确数据源和目的地
		FileOutputStream fos = new FileOutputStream("a.txt");
		FileInputStream fis = new FileInputStream("b.txt");
		int ch = 0;
		while((ch=fis.read()) != -1){
			fos.write(ch);
			System.out.println("success");
		}
		//关闭流资源
		fos.close();
		fis.close();
	}
}
