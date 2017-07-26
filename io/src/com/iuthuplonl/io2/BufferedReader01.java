package com.iuthuplonl.io2;

import java.io.*;

public class BufferedReader01 {
	public static void main(String[] args) {
		// ÉùÃ÷¶ÔÏó
		FileReader fr = null;
		BufferedReader br = null;
		StringBuffer sb = null;
		try {
			fr = new FileReader("d:\\javacode\\file\\a.txt");
			br = new BufferedReader(fr);
			String readLine = null;
			while ((readLine = br.readLine()) != null) {
				sb.append(readLine);
				//readLine = br.readLine();
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
