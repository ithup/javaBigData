package homework;

import java.util.LinkedList;

/**
 * ����һ����Queue,�������У����ص�Ϊ���Ƚ��ȳ���,���ӷ���add(Object obj)��get,
 * ������main()��������Ч����֤
 * @author acer
 *
 */
public class Task01 {
	public static void main(String[] args) {
		//����LinkedList���϶���
		LinkedList<String> queue=new LinkedList<String>();
		//public void addLast(E e)��ָ��Ԫ�ز�����б��Ľ�β
		queue.addLast("javaSE");
		queue.addLast("javaEE");
		queue.addLast("javaME");
		queue.addLast("java����");
		System.out.println("-------------");
		for(int i=0;i<queue.size();i++){
			System.out.println(queue.get(i));
		}
	}
}