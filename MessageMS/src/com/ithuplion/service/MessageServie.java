package com.ithuplion.service;

/**
 * ����ҵ���Ľӿ�
 * 
 * @author acer
 *
 */
public interface MessageServie {
	/**
	 * ϵͳ�˵�
	 */
	public void menuRun();
	/**
	 * ��ʾ������Ϣ
	 */
	public void displayAll();
	/**
	 * �������
	 */
	public void addOne();
	/**
	 * ���ݱ�Ų�ѯ������Ϣ
	 * @param id
	 * @return
	 */
	public void findMessageById();
}
