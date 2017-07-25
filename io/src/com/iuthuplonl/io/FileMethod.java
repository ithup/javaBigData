package com.iuthuplonl.io;

import java.io.File;
import java.io.IOException;

public class FileMethod {
		/**
		 * �����ļ�
		 * 
		 * @throws IOException
		 */
		public void createFile(File file) {
			// �ж��ļ��Ƿ����
			if (!file.exists()) {
				try {
					file.createNewFile(); // �����µ��ļ�
					System.out.println("�ļ������ɹ���");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	/**
	 * ɾ���ļ�
	 */
	public void deleteFile(File file) {
		// �ж��ļ��Ƿ����
		if (file.exists()) {
			file.delete(); // ɾ���ļ�
			System.out.println("�ļ�ɾ���ɹ�");
		}
	}

	/**
	 * ��ʾ�ļ���Ϣ
	 *
	 */
	public void showFileInfo(File file) {
		// �ж��Ƿ����ļ�
		if (file.exists()) {
			System.out.println("�ַ�����·��:" + file.getPath()); // ����һ���ַ�����·��
			System.out.println("�ļ��ľ���·��:" + file.getAbsolutePath()); // ����һ���ַ����ľ���·��
			System.out.println("�ļ�����:" + file.getName()); // ����һ���ַ����ľ���·��
			System.out.println("�ļ��ĳ���:" + file.length()); // ����һ���ַ����ľ���·��
		} else {
			if(file.isDirectory()){
				System.out.println("��ΪĿ¼");
			}else{
				System.out.println("������ȷ���ļ�");
			}
		}
	}
}