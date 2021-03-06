package day12;

/**
 * 内部类是指一个类中包含另一个类的情况 内部类的类型： 1.成员内部类类型
 * 
 * @author acer
 *
 */
class Outer1 {
	String name = "tom";

	class Inner1 {
		String name = "rose";

		public void print() {
			System.out.println("姓名：" + name);
			System.out.println("姓名："+new Outer1().name);
		}
	}

	public void display() {
		new Inner1().print();
	}
}

public class Demo01 {
	public static void main(String[] args) {
		Outer1 o = new Outer1();
		o.display();
	}
}
