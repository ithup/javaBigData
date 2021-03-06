package homework;

import java.util.HashMap;
import java.util.Set;

/**
 * 创建HashMap对象，并在其中添加一些学员的姓名和分数
 * @author acer
 *
 */
public class Task02 {
	public static void main(String[] args) {
		//创建hashmap集合对象
		HashMap<String,Integer> student=new HashMap<>();
		//添加数据
		student.put("郭靖", 100);
		student.put("黄蓉", 90);
		student.put("杨过", 80);
		student.put("小龙女", 95);
		//使用增强for循环遍历集合数据
		System.out.println("修改学员之前的学员信息：");
		Set<String> studentKey = student.keySet();
		for (String stu : studentKey) {
			System.out.println("学员姓名："+stu+"\t学员分数："+student.get(stu));
		}
		//修改其中一个学员成绩信息
		Set<String> studentKeys = student.keySet();
		for (String stu : studentKeys) {
			if(student.containsKey("黄蓉")){
				student.put("黄蓉", 98);
			}
		}
		System.out.println("修改之后学员信息");
		Set<String> studentKeyss = student.keySet();
		for (String stu : studentKeyss) {
			System.out.println("学员姓名："+stu+"\t学员分数："+student.get(stu));
		}
	}
}
