package day06;


import org.junit.Test;

/**
 * ʹ�õ�Ԫ���ԣ�task02,task03
 * @author acer
 *
 */
public class TaskTest {
	/**
	 * ����ԱԲ�����
	 */
	@Test
	public void test01(){
		Task02 task=new Task02();
		double s = task.calArea(2);
		System.out.println(s);
	}
	@Test
	public void test02(){
		Task02 task=new Task02();
		double s = task.calArea(4, 6);
		System.out.println(s);
	}
	/**
	 * �������������
	 */
	@Test
	public void test03(){
		Task02 task=new Task02();
		double s = task.calArea(2, 3, 4);
		System.out.println(s);
	}
}
