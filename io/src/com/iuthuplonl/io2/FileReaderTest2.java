package com.iuthuplonl.io2;

import java.io.FileReader;

/**
 * ��ȡd:\\javacode\\file\\a.txt�ļ��µ����ݵ�����̨
 * @author acer
 *
 */
public class FileReaderTest2 {
	public static void main(String[] args) {
		//�����ļ�������
		FileReader fr = null;
		StringBuffer sb = null;
		try {
			fr = new FileReader("d:\\javacode\\file\\a.txt");
			//�����ַ�����������
			 sb = new StringBuffer();
			//����һ���ַ�������תվ��ȡ������ ������
			char[] ch = new char[4];
			//������д���ַ�������
			int length = 0;	
			while((length=fr.read(ch)) != -1){
				sb.append(ch);
				length = fr.read(ch);
			}
			System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}