package day10;

import java.util.Scanner;

public class Demo05 {
	public static void main(String[] args) {
		// ģ��һ��ϵͳ��ע����̣����������У��û���(������6-8λ֮��)������(6λ)��ȷ������(6λ)/Email
		Scanner input = new Scanner(System.in);
		System.out.print("�������û���(������6-8λ֮��)��");
		String username = input.next();
		if (6 < username.length() && username.length() < 8) {
			System.out.print("����������(6λ)��");
			String password = input.next();
			if(password.length()==6){
				System.out.print("��ȷ�����룺");
				String repassword = input.next();
				if(repassword.length()==6 && repassword.equals(password)){
					System.out.print("���������䣺");
					String email=input.next();
				}
				else{
					System.out.println("�������벻һ��");
				}
			}else{
				System.out.println("���벻���Ϲ涨(6λ)");
			}
		}else{
			System.out.println("�û��������Ϲ涨(������6-8λ֮��)");
		}
	}
}