package day06;
/**
 * �����
 * @author �˻�Ҫ
 *
 */
public class Penguin {
	private String name;//�ǳ�
	private double healthValue;//����ֵ
	private String petFriendly;//���ܶ�
	private String sex;//�Ա�
	public Penguin() {}
	public Penguin(String name, double healthValue, String petFriendly, String sex) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.petFriendly = petFriendly;
		this.sex = sex;
	}
	/**
	 * ��ʾ���Ļ�����Ϣ
	 */
	public void show(){
		System.out.println("�ǳ�:"+name+"����ֵ:"+healthValue+"���ܶȣ�"+petFriendly+"Ʒ�֣�"+sex);
	}
	/**
	 * ����set/get����
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
