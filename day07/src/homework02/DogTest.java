package homework02;

import java.util.Scanner;

/**
 * ������
 * @author acer
 *
 */
public class DogTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ӭ�����������");
		System.out.print("������Ҫ������������֣�");
		String name=input.next();
		System.out.print("������Ҫ��������Ľ���ֵ��");
		double healthValue=input.nextDouble();
		System.out.print("������Ҫ������������ܶȣ�");
		double love=input.nextDouble();
		System.out.print("������Ҫ����������Ա�");
		String sex=input.next();
		System.out.println("������԰ף�");
		Pet dog=new Dog(name,healthValue,love,sex);
		dog.print();
	}
}
