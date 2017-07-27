package com.ithup.demo;
/**
 * interrupte�ж��߳�
 * @author acer
 *
 *����main�߳�
 *	main�߳�˯��5��
 *	1.����run�߳�
 *	����1��
 *	2.�߳̽�������״̬
 *	4.�߳���������
 *	�߳��ж�
 *
 *����main�߳�
 *		main�߳�˯��5��
 *		1.����run�߳�
 *		����10��
 *		2.�߳̽�������״̬
 *		�߳��ж�
 *		3.�߳�������ֹ
 */
class MyThreadInterrupt extends Thread{
	@Override
	public void run() {		//��дrun����
		System.out.println("1.����run�߳�");
		try {
			System.out.println("����10��");
			System.out.println("2.�߳̽�������״̬");
			sleep(10000);			//����10��
		} catch (Exception e) {
			System.out.println("3.�߳�������ֹ");
			return;
		}
		System.out.println("4.�߳���������");
	}
}
public class ThreadInterrupt {
	public static void main(String[] args) {
		//ʵ�����������
		MyThreadInterrupt mti=new MyThreadInterrupt();
		//ʵ�����̶߳���
		Thread th = new Thread(mti);
		th.start();
		try {
			System.out.println("����main�߳�");
			System.out.println("main�߳�˯��5��");
			Thread.sleep(5000);
		} catch (Exception e) {
			e.printStackTrace();
		}
		th.interrupt(); 		//�ж��߳�ִ��
		System.out.println("�߳��ж�");
	}
}
