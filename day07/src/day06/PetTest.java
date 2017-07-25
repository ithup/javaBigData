package day06;

import java.util.Scanner;

/**
 * 
 * @author 顾怀要
 *
 */
public class PetTest {
	public static void main(String[] args) {
			Scanner input=new Scanner(System.in);
			System.out.println("请选择狗/企鹅：");
			String pet=input.next();
			switch(pet){
			case "狗":
				System.out.println("请输入狗的基本信息：");
				System.out.println("昵称：");
				String name=input.next();
				System.out.println("健康值：");
				double healthValue=input.nextDouble();
				System.out.println("亲密度：");
				String petFriendly=input.next();
				System.out.println("品种：");
				String breed=input.next();
				Dog dog=new Dog(name,healthValue,petFriendly,breed);
				dog.show();
				break;
			case "企鹅":
				System.out.println("请输入狗的基本信息：");
				System.out.println("昵称：");
				String name1=input.next();
				System.out.println("健康值：");
				double healthValue1=input.nextDouble();
				System.out.println("亲密度：");
				String petFriendly1=input.next();
				System.out.println("姓别：");
				String sex1=input.next();
				Penguin p=new Penguin(name1,healthValue1,petFriendly1,sex1);
				p.show();
				break;
			}
	}

}
