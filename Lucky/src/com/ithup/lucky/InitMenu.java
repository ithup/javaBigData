package com.ithup.lucky;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

/**
 * 抽奖系统：初始化菜单
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
			System.out.println("*****欢迎进入奖客富翁系统*****");
			System.out.println("1.注册");
			System.out.println("2.登录");
			System.out.println("3.抽奖");
			System.out.println("*****************************");
			System.out.print("请选择菜单：");
			String choice = input.next();
			switch (choice) {
			case "1":
				userRegister();
				break;
			case "2":
				userLogin();
				break;
			case "3":
				System.out.println("[奖客富翁系统]抽奖");
				break;
			default:
				System.out.print("输入错误请重新输入：");
				break;
			}
			for (int i = 3; i > 0; i--) {
				System.out.println("继续吗？(y/n)：");
				String str = input.next();
				if ("y".equals(str)) {
					flag = true;
					break;
				} else if ("n".equals(str)) {
					flag = false;
					break;
				} else {
					System.out.println("输入错误请重新输入,你还有" + (i--) + "次机会");
				}
			}
		}
	}

	/**
	 * 用户登录功能
	 */
	private static void userLogin() {
		System.out.println("[奖客富翁系统>登录]");
		System.out.print("用户名：");
		String username = input.next();
		System.out.print("密码：");
		String password = input.next();
			if (username.equals(name) && password.equals(password)) {
				System.out.println("欢迎您："+name);
			}else{
				System.out.println("登录失败");
			}
	}

	/**
	 * 用户注册功能
	 */
	private static void userRegister() {
		System.out.println("[奖客富翁系统>注册]");
		System.out.println("请填写个人注册信息：");
		System.out.print("用户名：");
		String username = input.next();
		System.out.print("密码：");
		String newPassword = input.next();
		int max = 9999;
		int min = 1000;
		int cardNumber = (int) (Math.random() * (max - min)) + min;
		name=username;
		password=newPassword;
		System.out.println("注册成功，请记好你的会员号");
		System.out.println("用户名\t" + "密码\t" + "会员卡号");
		System.out.println( name+ "\t" + password + "\t" + cardNumber);
	}
}
