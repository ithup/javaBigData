package com.ithup.io04;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * FileInputStream���ȡ����read����
 * @author acer
 *
 */
public class IO01 {
	public static void main(String[] args) throws IOException {
		File file = new File("a.txt");
		//����һ���ֽ�����������,������ȷ����Դ����ʵ���Ǵ����ֽڶ�ȡ��������Դ�������  
		FileInputStream fis = new FileInputStream(file);
		byte[] b = new byte[1024];
		//��ȡ���ݡ�ʹ�� read();һ�ζ�һ���ֽڡ�
		int read = fis.read(b , 0, b.length);
		System.out.println((char)read);
	}
}