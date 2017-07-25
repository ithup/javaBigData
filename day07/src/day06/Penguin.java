package day06;
/**
 * 企鹅类
 * @author 顾怀要
 *
 */
public class Penguin {
	private String name;//昵称
	private double healthValue;//健康值
	private String petFriendly;//亲密度
	private String sex;//性别
	public Penguin() {}
	public Penguin(String name, double healthValue, String petFriendly, String sex) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.petFriendly = petFriendly;
		this.sex = sex;
	}
	/**
	 * 显示企鹅的基本信息
	 */
	public void show(){
		System.out.println("昵称:"+name+"健康值:"+healthValue+"亲密度："+petFriendly+"品种："+sex);
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	
}
