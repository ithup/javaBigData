package day11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo02 {
	/**
     * �������ʽ����֤����
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    //public static final String REGEX_EMAIL = "\\w+@\\w+[.]?+[[.a-zA-Z]+]{1,2}$";
	/**
     * У������
     * 
     * @param email
     * @return У��ͨ������true�����򷵻�false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("���������䣺");
		String email = input.next();
		if(isEmail(email)){
			System.out.println("������֤�ɹ���");
		}else{
			System.out.println("������֤ʧ�ܣ�");
		}
	}
}