package com.iuthuplonl.io2;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Ӧ��FileWriterд�ļ� ���ļ���д������
 * 
 * @author acer
 *
 */
public class FileWriter01 {
	public static void main(String[] args) {
		// ��������
		FileWriter fw = null;
		FileReader fr = null;
		try {
			fr = new FileReader("a.txt");
			fw = new FileWriter("�ҵ��ഺ������.txt", true);
			char[] ch = new char[1024];
			//int length = ch.length;
			//fr.read(ch, 0, length);
			//fr.read(ch);
			while(fr.read(ch) != -1){
				fw.write(ch);
				// ˢ��
				fw.flush();
			}
			// ����һ���ַ���
			// String str = "�й��Ұ��㣡";
			// char[] ch =str.toCharArray();
			// int len = ch.length;
			// д���ļ���
			//fw.write(ch, 0, length);
			System.out.println("д��ɹ�");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �رղ��ͷ���Դ
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