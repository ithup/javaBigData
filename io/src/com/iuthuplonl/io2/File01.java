package com.iuthuplonl.io2;

import java.io.File;
import java.io.IOException;

public class File01 {
	public static void main(String[] args) {
		File file = new File("�ҵ��ഺ������.txt");
		try {
			file.createNewFile();
			System.out.println("�ļ������ɹ�");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}