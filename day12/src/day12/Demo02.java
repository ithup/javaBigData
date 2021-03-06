package day12;

/**
 * 局部内部类
 * 
 * @author acer
 *
 */
class Outer2 {
	String name1 = "tom";

	public void display() {
		//在局部类中，使用方法中的局部变量，该变量必须要使用final修饰
		final String name2 = "rose";
		class Inner2 {
			String name3 = "jack";

			public void print() {
				System.out.println("姓名1：" + name1);
				System.out.println("姓名2:" + name2);
				System.out.println("姓名3:" + name3);
			}
		}
		new Inner2().print();
	}

}

public class Demo02 {
	public static void main(String args[]) {
		Outer2 o = new Outer2();
		o.display();
	}
}
