package day06;
/**
 * Dog类
 * @author 顾怀要
 *
 */
public class Dog {
	private String name;//昵称
	private double healthValue;//健康值
	private String petFriendly;//亲密度
	private String breed;//品种
	//无参的构造方法
	public Dog(){}
	 /**
	  *显示狗的基本信息
	  */
	public void show(){
		System.out.println("昵称:"+name+"健康值:"+healthValue+"亲密度："+petFriendly+"品种："+breed);
	}
	//有参数的构造方法
	public Dog(String name, double healthValue, String petFriendly, String breed) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.petFriendly = petFriendly;
		this.breed = breed;
	}
	/**
	 * 生成set/get方法
	 * @down
	 */
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getHealthValue() {
		return healthValue;
	}
	public void setHealthValue(double healthValue) {
		this.healthValue = healthValue;
	}
	public String getPetFriendly() {
		return petFriendly;
	}
	public void setPetFriendly(String petFriendly) {
		this.petFriendly = petFriendly;
	}
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
