package com.ithup.io04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * ���󣺸����ļ�
 * 		���裺
 * 			��һ����ָ������Դ����ָ�����ļ��и�������
 * 			�ڶ�����ָ��Ŀ�ĵأ���ָ��������д�뵽ָ�����ļ���
 * 			��������������Դ�еĶ�����
 * 			���Ĳ���������д��Ŀ����
 * 			���岽���ر���
 * @author acer
 *
 */
public class IO02 {
	public static void main(String[] args) throws IOException {
		//��ȷ����Դ��Ŀ�ĵ�
		FileOutputStream fos = new FileOutputStream("a.txt");
		FileInputStream fis = new FileInputStream("b.txt");
		int ch = 0;
		while((ch=fis.read()) != -1){
			fos.write(ch);
			System.out.println("success");
		}
		//�ر�����Դ
		fos.close();
		fis.close();
	}
}