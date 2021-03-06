package com.iuthuplonl.io;

import java.io.File;
import java.io.IOException;

public class FileMethod {
		/**
		 * 创建文件
		 * 
		 * @throws IOException
		 */
		public void createFile(File file) {
			// 判断文件是否存在
			if (!file.exists()) {
				try {
					file.createNewFile(); // 创建新的文件
					System.out.println("文件创建成功！");
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}

	/**
	 * 删除文件
	 */
	public void deleteFile(File file) {
		// 判断文件是否存在
		if (file.exists()) {
			file.delete(); // 删除文件
			System.out.println("文件删除成功");
		}
	}

	/**
	 * 显示文件信息
	 *
	 */
	public void showFileInfo(File file) {
		// 判断是否是文件
		if (file.exists()) {
			System.out.println("字符串的路径:" + file.getPath()); // 返回一个字符串的路径
			System.out.println("文件的决定路径:" + file.getAbsolutePath()); // 返回一个字符串的决定路径
			System.out.println("文件的名:" + file.getName()); // 返回一个字符串的决定路径
			System.out.println("文件的长度:" + file.length()); // 返回一个字符串的决定路径
		} else {
			if(file.isDirectory()){
				System.out.println("此为目录");
			}else{
				System.out.println("不是正确的文件");
			}
		}
	}
}
