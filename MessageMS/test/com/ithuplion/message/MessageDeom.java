package com.ithuplion.message;

import java.util.Date;

import com.ithuplion.domain.Message;

public class MessageDeom {
	public static void main(String[] args) {
		Message all[]=new Message[10];//�������飬���汣��Message�Ķ���
		Message m1 = new Message(1,"����","java��ѵ","java��������ѵ",new Date());
		Message m2 = new Message(2,"����","jspѧϰ","jspѧϰ�ĵ����",new Date());
		Message m3 = new Message(3,"���","servletѧϰ","servlet����",new Date());
		all[0]=m1;
	}
}
