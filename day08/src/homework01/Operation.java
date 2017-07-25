package homework01;
/**
 * 定义一个接口：实现加减乘除四个方法
 * @author acer
 *
 */
public interface Operation {
	/**
	 * 加法运算
	 * @return
	 */
	public abstract double plus(double x,double y);
	/**
	 * 减法运算
	 * @return
	 */
	public abstract double subtract(double x,double y);
	/**
	 * 乘法运算
	 * @return
	 */
	public abstract double mul(double x,double y);
	/**
	 * 除法运算
	 * @return
	 */
	public abstract double division(double x,double y);
}
