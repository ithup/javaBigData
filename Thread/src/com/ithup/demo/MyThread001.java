package com.ithup.demo;
/**
 * ͨ��Runnable�̳�ʵ�ֶ��߳�
 * @author acer
 *
 */
public class MyThread001 implements Runnable{
	private String name;		//�̵߳�����
	public MyThread001(String name){
		this.name = name;
	}
	public void run(){		//��дrun����
		for(int i=0;i<100;i++){
			System.out.println(name+"���У�i="+i);
		}
	}
}
