package homework02;
/**
 * 定义狗：继承pet
 * @author acer
 *
 */
public class Dog extends Pet{
	String sex;
	@Override
	public void print() {
		System.out.println("我的名字叫："+name+",我的健康值是："+healthValue+",我和主人的亲密度是："+love+",我的性别是："+sex);
	}
	public Dog() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Dog(String name, double healthValue, double love,String sex) {
		super(name, healthValue, love);
	}
	
}
