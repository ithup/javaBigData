package com.ithuplion.pojo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtils {
	// �Ự��������������ֻ��һ��
	private static SessionFactory sessionFactory;
	static {
		//1 ��������
		Configuration configuration=new Configuration().configure();
		//2 ��ù���
		sessionFactory = configuration.buildSessionFactory();
		//3 �ر������ʱ,�ͷ�SessionFactory
		Runtime.getRuntime().addShutdownHook(new Thread(new Runnable() {
			
			public void run() {
				System.out.println("������رգ��ͷ���Դ");
				sessionFactory.close();
			}
		}));
	}
	public static Session openSession(){
		return  sessionFactory.openSession();
	}
	public static Session getCurrentSession(){
		return  sessionFactory.getCurrentSession();
	}
}
