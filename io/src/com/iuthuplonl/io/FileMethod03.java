package com.iuthuplonl.io;

import java.io.File;

public class FileMethod03 {
	public static void main(String[] args) {
		File file=new File("d:\\javacode\\file\\a.txt");
		FileMethod fm=new FileMethod();
		//�����ļ�
		fm.createFile(file);
		//ɾ���ļ�
		//fm.deleteFile(file);
		fm.showFileInfo(file);
	}
}
