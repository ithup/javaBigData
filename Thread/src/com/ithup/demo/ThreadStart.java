package com.ithup.demo;
/**
 * �̵߳�����������start����
 * @author acer
 *
 */
class MyThreadDemo extends Thread{
	private String name;		//�̵߳�����
	public MyThreadDemo(String name){
		this.name = name;
	}
	public void run(){		//��дrun����
		for(int i=0;i<10;i++){
			System.out.println(name+"���У�i="+i);
		}
	}
}
public class ThreadStart {
	public static void main(String[] args) {
		//ʵ��������
		MyThreadDemo mtd0 = new MyThreadDemo("�߳�A");
		MyThreadDemo mtd1 = new MyThreadDemo("�߳�B");
//		mtd0.run();
//		mtd1.run();
		mtd0.start();
		mtd1.start();
	}
}