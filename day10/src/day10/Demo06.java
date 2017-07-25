package day10;

import java.util.Scanner;

public class Demo06 {
	static Scanner input=new Scanner(System.in);
	public static boolean validate(String username,String password,String repassword,String email){
		boolean f=false;
		if(username.length()<=6 || username.length()>=8){
			System.out.println("用户名不符合规定");
			return false;
		}
		else if(password.length()!=6){
			System.out.println("用户密码不符合规定");
			return false;
		}
		else if(!password.equals(repassword) || password.length()!=6){
			System.out.println("两次密码不一致");
			return false;
		}
		else if(!email.contains("@") || !email.contains(".") || email.indexOf("@")>email.indexOf(".")){
			System.out.println("邮箱格式错误");
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[] args) {
		while(true){
			System.out.println("==========用户注册===================");
			System.out.print("请输入用户名：");
			String username=input.next();
			System.out.print("请输入密码：");
			String password=input.next();
			System.out.print("请输入确认密码：");
			String repassword=input.next();
			System.out.print("请输入邮箱：");
			String email=input.next();
			if(validate(username,password,repassword,email)){
				System.out.println("恭喜注册成功！");
				break;
			}else{
				System.out.println("注册失败");
			}
			
		}
		
		
	}
}
