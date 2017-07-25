package day08;
//定义子类
public class Student extends Person{

	@Override//重写方法
	public void say() {
		name="李四";
		System.out.println(name+" ：说话的内容：我是一名大学生，我说话很文雅！");
	}
	
}
