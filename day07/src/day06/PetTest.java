package day06;

import java.util.Scanner;

/**
 * 
 * @author �˻�Ҫ
 *
 */
public class PetTest {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("��ѡ��/��죺");
			String pet=input.next();
			switch(pet){
			case "��":
				System.out.println("�����빷�Ļ�����Ϣ��");
				System.out.println("�ǳƣ�");
				String name=input.next();
				System.out.println("����ֵ��");
				double healthValue=input.nextDouble();
				System.out.println("���ܶȣ�");
				String petFriendly=input.next();
				System.out.println("Ʒ�֣�");
				String breed=input.next();
				Dog dog=new Dog(name,healthValue,petFriendly,breed);
				dog.show();
				break;
			case "���":
				System.out.println("�����빷�Ļ�����Ϣ��");
				System.out.println("�ǳƣ�");
				String name1=input.next();
				System.out.println("����ֵ��");
				double healthValue1=input.nextDouble();
				System.out.println("���ܶȣ�");
				String petFriendly1=input.next();
				System.out.println("�ձ�");
				String sex1=input.next();
				Penguin p=new Penguin(name1,healthValue1,petFriendly1,sex1);
				p.show();
				break;
			}
	}

}
