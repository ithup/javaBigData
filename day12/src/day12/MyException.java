package day12;

public class MyException extends Exception{
	String name;
	public MyException(String name){
		this.name=name;
	}
	//��дtoString()����
	public String toString(){
		return "��Ϣ:"+name;
	}
}
