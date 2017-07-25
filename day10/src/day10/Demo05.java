package day10;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		// 模拟一个系统的注册过程：输入数据有：用户名(长度在6-8位之间)、密码(6位)、确认密码(6位)/Email
		Scanner input = new Scanner(System.in);
		System.out.print("请输入用户名(长度在6-8位之间)：");
		String username = input.next();
		if (6 < username.length() && username.length() < 8) {
			System.out.print("请输入密码(6位)：");
			String password = input.next();
			if(password.length()==6){
				System.out.print("请确认密码：");
				String repassword = input.next();
				if(repassword.length()==6 && repassword.equals(password)){
					System.out.print("请输入邮箱：");
					String email=input.next();
				}
				else{
					System.out.println("两次密码不一致");
				}
			}else{
				System.out.println("密码不符合规定(6位)");
			}
		}else{
			System.out.println("用户名不符合规定(长度在6-8位之间)");
		}
	}
}
