package com.ithup.io03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * public class BufferedWriter extends Writer
 * 将文本写入字符输出流，缓冲各个字符，从而提供单个字符、数组和字符串的高效写入。 
 * 可以指定缓冲区的大小，或者接受默认的大小。在大多数情况下，默认值就足够大了。 
 * @author acer
 *
 */
public class BufferedWriter01 {
	public static void main(String[] args) {
		//声明对象
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer sb = null;
		FileWriter fw = null;
		try {
			//创建对象
			fr = new FileReader("a.txt");		
			fw = new FileWriter("我的青春我做主.txt");
			br = new BufferedReader(fr);             //文件读对象
			bw = new BufferedWriter(fw);   			//文件写对象
			sb = new StringBuffer();
			while(br.readLine() != null){
				//sb.append(br.readLine());
				bw.write(br.readLine(), 0 , br.readLine().length());
				bw.flush(); //刷新
				System.out.println("写入成功");
			}
			//System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fw != null){
					fw.close();
				}
				if(bw != null){
					bw.close();
				}
				if(br != null ){
					br.close();
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
