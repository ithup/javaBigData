package day12;

public class MyException extends Exception{
	String name;
	public MyException(String name){
		this.name=name;
	}
	//重写toString()方法
	public String toString(){
		return "信息:"+name;
	}
}
