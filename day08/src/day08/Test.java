package day08;

//������
public class Test {
	public static void sayContent(Person p){
		if(p instanceof Student){
			p.say();
		}
		if(p instanceof Worker){
			p.say();
		}
	}
	public static void main(String[] args) {
		sayContent(new Student());//ѧ��
		sayContent(new Worker());//����
	}
}
