package homework02;

import java.util.Scanner;

/**
 * ���Դ���
 * @author acer
 *
 */
public class GradenerTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("��ѡ��ˮ��(����/�㽶/ƻ��):");
		String fruit=input.next();
		Gardener.getFruit(fruit);
	}
}
