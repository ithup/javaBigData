package day10;

import java.util.Scanner;

public class Demo06 {
	static Scanner input=new Scanner(System.in);
	public static boolean validate(String username,String password,String repassword,String email){
		boolean f=false;
		if(username.length()<=6 || username.length()>=8){
			System.out.println("�û��������Ϲ涨");
			return false;
		}
		else if(password.length()!=6){
			System.out.println("�û����벻���Ϲ涨");
			return false;
		}
		else if(!password.equals(repassword) || password.length()!=6){
			System.out.println("�������벻һ��");
			return false;
		}
		else if(!email.contains("@") || !email.contains(".") || email.indexOf("@")>email.indexOf(".")){
			System.out.println("�����ʽ����");
			return false;
		}
		else{
			return true;
		}
	}
	public static void main(String[] args) {
		while(true){
			System.out.println("==========�û�ע��===================");
			System.out.print("�������û�����");
			String username=input.next();
			System.out.print("���������룺");
			String password=input.next();
			System.out.print("������ȷ�����룺");
			String repassword=input.next();
			System.out.print("���������䣺");
			String email=input.next();
			if(validate(username,password,repassword,email)){
				System.out.println("��ϲע��ɹ���");
				break;
			}else{
				System.out.println("ע��ʧ��");
			}
			
		}
		
		
	}
}