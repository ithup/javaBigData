package day09;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Demo05 {
	public static void main(String[] args) throws Exception {
//		Date d1=new Date();
//		System.out.println("���ڣ�"+d1);
//		System.out.println(d1.toLocaleString());
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy��MM��dd��  Hʱm��s��  S E");
		Date d1=new Date();
		System.out.println(d1.toLocaleString());
		//��ʽ������
		String format = sdf.format(d1);
		System.out.println(format);
		System.out.println("------------------");
		SimpleDateFormat sdf1=new SimpleDateFormat("yyyy/MM/dd");
		String s1="2017/07/17";
		Date parse = sdf1.parse(s1);
		System.out.println(parse);
	}
}
