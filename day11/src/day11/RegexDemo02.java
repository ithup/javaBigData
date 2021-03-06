package day11;

import java.util.Scanner;
import java.util.regex.Pattern;

public class RegexDemo02 {
	/**
     * 正则表达式：验证邮箱
     */
    public static final String REGEX_EMAIL = "^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$";
    //public static final String REGEX_EMAIL = "\\w+@\\w+[.]?+[[.a-zA-Z]+]{1,2}$";
	/**
     * 校验邮箱
     * 
     * @param email
     * @return 校验通过返回true，否则返回false
     */
    public static boolean isEmail(String email) {
        return Pattern.matches(REGEX_EMAIL, email);
    }
	public static void main(String args[]){
		Scanner input=new Scanner(System.in);
		System.out.print("请输入邮箱：");
		String email = input.next();
		if(isEmail(email)){
			System.out.println("邮箱验证成功！");
		}else{
			System.out.println("邮箱验证失败！");
		}
	}
}
