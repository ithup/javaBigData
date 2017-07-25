package day08;

//测试类
public class Test {
	public static void sayContent(Person p){
		if(p instanceof Student){
			p.say();
		}
		if(p instanceof Worker){
			p.say();
		}
	}
	public static void main(String[] args) {
		sayContent(new Student());//学生
		sayContent(new Worker());//工人
	}
}
