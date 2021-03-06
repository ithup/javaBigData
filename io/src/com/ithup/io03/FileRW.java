package com.ithup.io03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * 文件的读写操作
 * 
 * @author acer
 *
 */
public class FileRW {
	public static void main(String[] args) {
		// 声明对象
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer sb = null;
		try {
			// 创建对象
			fr = new FileReader("a.txt"); // 读取文件
			fw = new FileWriter("b.txt"); // 写文件
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			sb = new StringBuffer(); // 将数据写入字符串缓冲区中
			String line = null;
			String replace = null;
			while ((line = br.readLine()) != null) {
				sb.append(line);
				// 替换数据
				replace = sb.toString().replace("name", "欧欧")
						.replace("type", "哈巴狗").replace("master", "旺财");
			}
			bw.write(replace);
			System.out.println("修改前：" + sb);
			System.out.println("修改后：" + replace);
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// 关闭流资源
			try {
				if (bw != null) {
					bw.close();
				}
				if (br != null) {
					br.close();
				}
				if (fw != null) {
					fw.close();
				}
				if (fr != null) {
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}
