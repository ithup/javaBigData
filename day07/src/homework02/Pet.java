package homework02;
/**
 * 宠物类：定义为抽象类
 * @author acer
 *
 */
public abstract class Pet {
	 String name;//名称
	 double healthValue;//健康值
	 double love;//亲密度
	//定义抽象方法
	public abstract void print();
	public Pet() {
		super();
	}
	public Pet(String name, double healthValue, double love) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.love = love;
	}
	
}
