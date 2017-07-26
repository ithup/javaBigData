package com.ithup.io03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * �ļ��Ķ�д����
 * @author acer
 *
 */
public class FileRW {
	public static void main(String[] args) {
		//��������
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer sb =null;
		try {
			//��������
			fr = new FileReader("a.txt");	//��ȡ�ļ���
			fw = new FileWriter("b.txt");	//д�ļ�
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);
			sb = new StringBuffer();
			String line = null;
			String replace = null;
			while((line  = br.readLine()) != null){
				sb.append(line);
				replace = sb.toString().replace("name", "ŷŷ")
						.replace("type", "���͹�").replace("master", "����");
			}
			bw.write(replace);
			System.out.println("�޸�ǰ��"+sb);
			System.out.println("�޸ĺ�"+replace);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(bw!=null){
					bw.close();
				}
				if(br!=null){
					br.close();
				}
				if(fw!=null){
					fw.close();
				}
				if(fr!=null){
					fr.close();
				}
			} catch (Exception e2) {
				e2.printStackTrace();
			}
		}
	}
}