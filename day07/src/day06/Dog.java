package day06;
/**
 * Dog��
 * @author �˻�Ҫ
 *
 */
public class Dog {
	private String name;//�ǳ�
	private double healthValue;//����ֵ
	private String petFriendly;//���ܶ�
	private String breed;//Ʒ��
	//�޲εĹ��췽��
	public Dog(){}
	 /**
	  *��ʾ���Ļ�����Ϣ
	  */
	public void show(){
		System.out.println("�ǳ�:"+name+"����ֵ:"+healthValue+"���ܶȣ�"+petFriendly+"Ʒ�֣�"+breed);
	}
	//�в����Ĺ��췽��
	public Dog(String name, double healthValue, String petFriendly, String breed) {
		super();
		this.name = name;
		this.healthValue = healthValue;
		this.petFriendly = petFriendly;
		this.breed = breed;
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
	public String getBreed() {
		return breed;
	}
	public void setBreed(String breed) {
		this.breed = breed;
	}
	
}
