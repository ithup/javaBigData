package homework;

import java.util.LinkedList;

/**
 * 创建一个类Queue,代表队列（其特点为：先进先出）,添加方法add(Object obj)及get,
 * 并添加main()方法进行效果验证
 * @author acer
 *
 */
public class Task01 {
	public static void main(String[] args) {
		//创建LinkedList集合对象
		LinkedList<String> queue=new LinkedList<String>();
		//public void addLast(E e)将指定元素插入此列表的结尾
		queue.addLast("javaSE");
		queue.addLast("javaEE");
		queue.addLast("javaME");
		queue.addLast("java讲义");
		System.out.println("-------------");
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.get(i));
		}
	}
}
