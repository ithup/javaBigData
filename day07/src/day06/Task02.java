package day06;
/**
 * 求矩形、三角形、圆的面积
 * @author acer
 *
 */
public class Task02 {
	private double x;//矩形的长、三角形的边
	private double y;//矩形的宽、三角形的边
	private double z;//三角形的边
	private double r;//圆的半径
	public Task02() {
	}
	public String toString() {
		return "Task02 [x=" + x + ", y=" + y + ", z=" + z + ", r=" + r + "]";
	}
	/**
	 * 求矩形的面积
	 * @param x
	 * @param y
	 * @return
	 */
	public double calArea(double x,double y){
		return x*y;
	}
	/**
	 * 求三角形的面积
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
	 * 求圆的面积
	 * @param r
	 * @return
	 */
	public double calArea(double r){
		return Math.PI*r*r;
	}
}
