package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * �������ʽ
 * @author acer
 *
 */
public class PatternDemo01 {
	public static void main(String[] args) {
		//1.ʹ��Pattern��
		//Pattern pattern = Pattern.compile("[a-zA-Z]{3}");
		//String reg1="[^a-zA-Z]{3}";
		String reg1="[a|b]{3}";
		Pattern pattern = Pattern.compile(reg1);
		Matcher matcher = pattern.matcher("abb");
		if(matcher.matches()){
			System.out.println("����ƥ��");
		}else{
			System.out.println("���߲�ƥ��");
		}
	}
}