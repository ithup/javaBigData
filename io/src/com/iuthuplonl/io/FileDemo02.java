package com.iuthuplonl.io;

import java.io.File;
import java.io.IOException;

public class FileDemo02 {
	public static void main(String[] args) {
		//创建文件
		String pathName="d:/javacode/file/demo.java";
		File file=new File(pathName);
		if(!file.exists()){
			//如果文件不存在，则创建文件
			try {
				file.createNewFile();
				System.out.println("创建文件成功");
			} catch (IOException e) {
				e.printStackTrace();
			}
		}else{//如果文件存在，则显示文件属性
			//返回此抽象路径名的绝对路径名字符串
			System.out.println(file.getAbsolutePath());		
			//将此抽象路径名转换为一个路径名字符串
			System.out.println(file.getPath()); 
			//返回由此抽象路径名表示的文件或目录的名称
			System.out.println(file.getName()); 			
			//返回此抽象路径名父目录的抽象路径名；如果此路径名没有指定父目录，则返回 null。
			System.out.println(file.getParentFile());
			//测试此抽象路径名表示的文件是否是一个标准文件
			System.out.println(file.isFile());
			//返回由此抽象路径名表示的文件的长度
			System.out.println(file.length());
			//测试此抽象路径名表示的文件是否是一个目录
			System.out.println(file.isDirectory());
			// 删除此抽象路径名表示的文件或目录
			file.delete();
		}
	}
}
