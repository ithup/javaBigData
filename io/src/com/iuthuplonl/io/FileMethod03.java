package com.iuthuplonl.io;

import java.io.File;

public class FileMethod03 {
	public static void main(String[] args) {
		File file=new File("d:\\javacode\\file\\a.txt");
		FileMethod fm=new FileMethod();
		//创建文件
		fm.createFile(file);
		//删除文件
		//fm.deleteFile(file);
		fm.showFileInfo(file);
	}
}
