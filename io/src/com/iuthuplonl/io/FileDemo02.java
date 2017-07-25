package com.iuthuplonl.io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
	public static void main(String[] args) {
		//�����ļ�
		String pathName="d:/javacode/file/demo.java";
		File file=new File(pathName);
		if(!file.exists()){
			//����ļ������ڣ��򴴽��ļ�
			try {
				file.createNewFile();
				System.out.println("�����ļ��ɹ�");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{//����ļ����ڣ�����ʾ�ļ�����
			//���ش˳���·�����ľ���·�����ַ���
			System.out.println(file.getAbsolutePath());		
			//���˳���·����ת��Ϊһ��·�����ַ���
			System.out.println(file.getPath()); 
			//�����ɴ˳���·������ʾ���ļ���Ŀ¼������
			System.out.println(file.getName()); 			
			//���ش˳���·������Ŀ¼�ĳ���·�����������·����û��ָ����Ŀ¼���򷵻� null��
			System.out.println(file.getParentFile());
			//���Դ˳���·������ʾ���ļ��Ƿ���һ����׼�ļ�
			System.out.println(file.isFile());
			//�����ɴ˳���·������ʾ���ļ��ĳ���
			System.out.println(file.length());
			//���Դ˳���·������ʾ���ļ��Ƿ���һ��Ŀ¼
			System.out.println(file.isDirectory());
			// ɾ���˳���·������ʾ���ļ���Ŀ¼
			file.delete();
		}
	}
}
