package homework01;
/**
 * �����ࣺ�Ӽ��˳��������
 * @author acer
 *
 */
public class OperationTest {
	public static void main(String[] args) {
		Operation o=new OperationImpl();
		/**
		 * �ӷ�����
		 */
		double plus = o.plus(2, 5);
		System.out.println(plus);
		/**
		 * ��������
		 */
		double subtract = o.subtract(5, 4);
		System.out.println(subtract);
		/**
		 * �˷�����
		 */
		double mul = o.mul(5, 4);
		System.out.println(mul);
		/**
		 * ��������
		 */
		double division = o.division(100, 5);
		System.out.println(division);
	}
}
