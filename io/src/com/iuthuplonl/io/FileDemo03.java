package com.iuthuplonl.io;

import java.io.FileInputStream;
import java.io.IOException;

/**
 * Ӧ��FileInputStream��ȡ�ļ�
 * @author acer
 *
 */
public class FileDemo03 {
	public static void main(String[] args) throws IOException {
		//�����ļ�������
		FileInputStream fis = new FileInputStream("D:\\javacode\\file\\a.txt");
		/*int available = fis.available();
		//���ļ��ֽڳ��ȸ�������
		byte[] b=new byte[available];
		//��ȡ�ļ�
		int read = fis.read(b);
		String str = new String(b);
		//�������
		System.out.println(str);
		fis.close();*/
		//�Ӵ��������ж�ȡһ�������ֽڡ�
		int ch=0;
		while((ch=fis.read())!=-1){
			System.out.println((char)ch);
		}
	}
}