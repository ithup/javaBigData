package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05 {
	public static void main(String[] args) throws Exception {
//		Date d1=new Date();
//		System.out.println("日期："+d1);
//		System.out.println(d1.toLocaleString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy年MM月dd日  H时m分s秒  S E");
		Date d1=new Date();
		System.out.println(d1.toLocaleString());
		//格式化日期
		String format = sdf.format(d1);
		System.out.println(format);
		System.out.println("------------------");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd");
		String s1="2017/07/17";
		Date parse = sdf1.parse(s1);
		System.out.println(parse);
	}
}
