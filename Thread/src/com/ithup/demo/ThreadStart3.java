package com.ithup.demo;
/**
 * ʹ���̵߳��������ڲ��෽ʽ�����Է����ʵ��ÿ���߳�ִ�в�ͬ���߳��������
 * @author acer
 *
 */
public class ThreadStart3 {
	public static void main(String[] args) {
		//��ʽ1�������̶߳���ʱ��ֱ����дThread���е�run����
		new Thread(){
			@Override
			public void run() {
				for(int i = 0; i<50;i++){
					System.out.println("run....."+i);
				}
			}
		}.start();
		for(int i = 0; i<50;i++){
			System.out.println("main....."+i);
		}
	}
}