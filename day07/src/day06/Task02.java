package day06;
/**
 * ����Ρ������Ρ�Բ�����
 * @author acer
 *
 */
public class Task02 {
	private double x;//���εĳ��������εı�
	private double y;//���εĿ������εı�
	private double z;//�����εı�
	private double r;//Բ�İ뾶
	public Task02() {
	}
	public String toString() {
		return "Task02 [x=" + x + ", y=" + y + ", z=" + z + ", r=" + r + "]";
	}
	/**
	 * ����ε����
	 * @param x
	 * @param y
	 * @return
	 */
	public double calArea(double x,double y){
		return x*y;
	}
	/**
	 * �������ε����
	 * @param x
	 * @param y
	 * @param z
	 * @return
	 */
	public double calArea(double x,double y,double z){
		double h=(x+y+z)/2;
		double s=Math.sqrt(h*(h-x)*(h-y)*(h-z));
		return s;
	}
	/**
	 * ��Բ�����
	 * @param r
	 * @return
	 */
	public double calArea(double r){
		return Math.PI*r*r;
	}
}
