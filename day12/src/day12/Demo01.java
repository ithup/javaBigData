package day12;

/**
 * �ڲ�����ָһ�����а�����һ�������� �ڲ�������ͣ� 1.��Ա�ڲ�������
 * 
 * @author acer
 *
 */
class Outer1 {
	String name = "tom";

	class Inner1 {
		String name = "rose";

		public void print() {
			System.out.println("������" + name);
			System.out.println("������"+new Outer1().name);
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