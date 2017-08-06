package com.ithup.lucky;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * �齱ϵͳ����ʼ���˵�
 * 
 * @author acer
 *
 */
public class InitMenu {
	// private static User newUser=null;
	// private static Map<String,User> userMap=null;
	private static Scanner input = new Scanner(System.in);
	private static String name;
	private static String password;

	public static void main(String[] args) {
		boolean flag = true;
		while (flag) {
			System.out.println("*****��ӭ���뽱�͸���ϵͳ*****");
			System.out.println("1.ע��");
			System.out.println("2.��¼");
			System.out.println("3.�齱");
			System.out.println("*****************************");
			System.out.print("��ѡ��˵���");
			String choice = input.next();
			switch (choice) {
			case "1":
				userRegister();
				break;
			case "2":
				userLogin();
				break;
			case "3":
				System.out.println("[���͸���ϵͳ]�齱");
				break;
			default:
				System.out.print("����������������룺");
				break;
			}
			for (int i = 3; i > 0; i--) {
				System.out.println("������(y/n)��");
				String str = input.next();
				if ("y".equals(str)) {
					flag = true;
					break;
				} else if ("n".equals(str)) {
					flag = false;
					break;
				} else {
					System.out.println("�����������������,�㻹��" + (i--) + "�λ���");
				}
			}
		}
	}

	/**
	 * �û���¼����
	 */
	private static void userLogin() {
		System.out.println("[���͸���ϵͳ>��¼]");
		System.out.print("�û�����");
		String username = input.next();
		System.out.print("���룺");
		String password = input.next();
			if (username.equals(name) && password.equals(password)) {
				System.out.println("��ӭ����"+name);
			}else{
				System.out.println("��¼ʧ��");
			}
	}

	/**
	 * �û�ע�Ṧ��
	 */
	private static void userRegister() {
		System.out.println("[���͸���ϵͳ>ע��]");
		System.out.println("����д����ע����Ϣ��");
		System.out.print("�û�����");
		String username = input.next();
		System.out.print("���룺");
		String newPassword = input.next();
		int max = 9999;
		int min = 1000;
		int cardNumber = (int) (Math.random() * (max - min)) + min;
		name=username;
		password=newPassword;
		System.out.println("ע��ɹ�����Ǻ���Ļ�Ա��");
		System.out.println("�û���\t" + "����\t" + "��Ա����");
		System.out.println( name+ "\t" + password + "\t" + cardNumber);
	}
}