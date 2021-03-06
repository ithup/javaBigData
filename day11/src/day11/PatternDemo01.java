package day11;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * 正则表达式
 * @author acer
 *
 */
public class PatternDemo01 {
	public static void main(String[] args) {
		//1.使用Pattern类
		//Pattern pattern = Pattern.compile("[a-zA-Z]{3}");
		//String reg1="[^a-zA-Z]{3}";
		String reg1="[a|b]{3}";
		Pattern pattern = Pattern.compile(reg1);
		Matcher matcher = pattern.matcher("abb");
		if(matcher.matches()){
			System.out.println("两者匹配");
		}else{
			System.out.println("两者不匹配");
		}
	}
}
