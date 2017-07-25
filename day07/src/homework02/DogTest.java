package homework02;

import java.util.Scanner;

/**
 * 测试类
 * @author acer
 *
 */
public class DogTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("欢迎你来到宠物店");
		System.out.print("请输入要领养宠物的名字：");
		String name=input.next();
		System.out.print("请输入要领养宠物的健康值：");
		double healthValue=input.nextDouble();
		System.out.print("请输入要领养宠物的亲密度：");
		double love=input.nextDouble();
		System.out.print("请输入要领养宠物的性别：");
		String sex=input.next();
		System.out.println("宠物的自白：");
		Pet dog=new Dog(name,healthValue,love,sex);
		dog.print();
	}
}
