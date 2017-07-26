package com.iuthuplonl.io2;

import java.io.FileReader;
import java.io.IOException;

/**
 * ͨ��fileReader��ȡ�ļ�
 * 
 * @author acer
 *
 */
public class FileReaderTest {
	public static void main(String[] args) {
		// ��������
		FileReader fileReader = null;
		StringBuffer sbf = null;
		try {
			fileReader = new FileReader("d:\\javacode\\file\\a.txt");
			char[] ch = new char[1024]; // ��Ϊ��תվ
			sbf = new StringBuffer();
			int length = fileReader.read(ch); // ���ַ����ݶ�������
			//System.out.println(length);
			while (length != -1) { // ѭ����ȡ
				sbf.append(ch); // ׷���ַ�
				length = fileReader.read(); // ��ȡ�ı��ļ�����
				System.out.println(length);
			}
			System.out.println(sbf);
			System.out.println("�ļ���ȡ�ɹ���");
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				// �ر��ͷ���Դ
				if (fileReader != null) {
					fileReader.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}