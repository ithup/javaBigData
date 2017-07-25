package homework01;
/**
 * 测试类：加减乘除运算测试
 * @author acer
 *
 */
public class OperationTest {
	public static void main(String[] args) {
		Operation o=new OperationImpl();
		/**
		 * 加法运算
		 */
		double plus = o.plus(2, 5);
		System.out.println(plus);
		/**
		 * 减法运算
		 */
		double subtract = o.subtract(5, 4);
		System.out.println(subtract);
		/**
		 * 乘法运算
		 */
		double mul = o.mul(5, 4);
		System.out.println(mul);
		/**
		 * 除法运算
		 */
		double division = o.division(100, 5);
		System.out.println(division);
	}
}
