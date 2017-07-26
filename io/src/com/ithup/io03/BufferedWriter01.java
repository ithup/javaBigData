package com.ithup.io03;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * public class BufferedWriter extends Writer
 * ���ı�д���ַ����������������ַ����Ӷ��ṩ�����ַ���������ַ����ĸ�Чд�롣 
 * ����ָ���������Ĵ�С�����߽���Ĭ�ϵĴ�С���ڴ��������£�Ĭ��ֵ���㹻���ˡ� 
 * @author acer
 *
 */
public class BufferedWriter01 {
	public static void main(String[] args) {
		//��������
		FileReader fr = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		StringBuffer sb = null;
		FileWriter fw = null;
		try {
			//��������
			fr = new FileReader("a.txt");		
			fw = new FileWriter("�ҵ��ഺ������.txt");
			br = new BufferedReader(fr);             //�ļ�������
			bw = new BufferedWriter(fw);   			//�ļ�д����
			sb = new StringBuffer();
			while(br.readLine() != null){
				//sb.append(br.readLine());
				bw.write(br.readLine(), 0 , br.readLine().length());
				bw.flush(); //ˢ��
				System.out.println("д��ɹ�");
			}
			//System.out.println(sb);
		} catch (Exception e) {
			e.printStackTrace();
		}finally{
			try {
				if(fw != null){
					fw.close();
				}
				if(bw != null){
					bw.close();
				}
				if(br != null ){
					br.close();
				}
				if(fr != null){
					fr.close();
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
}