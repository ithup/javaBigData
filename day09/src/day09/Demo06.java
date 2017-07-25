package day09;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo06 {
	public static void main(String[] args) throws Exception {
		DateFormat sdf=new SimpleDateFormat("yyyy/MM/dd");//Mon Jan 09 00:07:00 CST 2017
		Date date=new Date();                             //Sun Jul 09 00:00:00 CST 2017
		String format = sdf.format(date);
		System.out.println(format);
		String str="2017/07/09";
		Date parse = sdf.parse(str);
		System.out.println(parse);
	}
}
