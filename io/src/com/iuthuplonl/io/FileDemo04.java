package com.iuthuplonl.io;

import java.io.FileOutputStream;
import java.io.IOException;

public class FileDemo04 {
	public static void main(String[] args) throws IOException {
		FileOutputStream fos=new FileOutputStream("D:\\javacode\\file\\a.txt");
		String str="hellowold";
		byte[] b=str.getBytes();
		int len=b.length;
		fos.write(b, 0, len);
		//fos.close();
	}
}
