package day12;

/**
 * �ֲ��ڲ���
 * 
 * @author acer
 *
 */
class Outer2 {
	String name1 = "tom";

	public void display() {
		//�ھֲ����У�ʹ�÷����еľֲ��������ñ�������Ҫʹ��final����
		final String name2 = "rose";
		class Inner2 {
			String name3 = "jack";

			public void print() {
				System.out.println("����1��" + name1);
				System.out.println("����2:" + name2);
				System.out.println("����3:" + name3);
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