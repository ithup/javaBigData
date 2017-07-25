package day08;
/**
 * 构造代码块
 *
 *
 */
public class Demo01 {
	{
		System.out.println("构造代码块A");
	}
	{
		System.out.println("构造代码块B");
	}
	static{
		System.out.println("静态代码块");
	}
	public void print(){
		{
			System.out.println("普通代码块");
		}
	}
}
