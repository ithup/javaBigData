package homework02;

import java.util.Scanner;

/**
 * ²âÊÔ´úÂë
 * @author acer
 *
 */
public class GradenerTest {
	public static void main(String[] args) {
		Scanner input=new Scanner(System.in);
		System.out.println("ÇëÑ¡ÔñË®¹û(ÆÏÌÑ/Ïã½¶/Æ»¹û):");
		String fruit=input.next();
		Gardener.getFruit(fruit);
	}
}
