package com.ithuplion.MessageDao;

import com.ithuplion.domain.Message;

/**
 * �ӿڣ���һ�ֱ�׼
 * 		�ӿ���ֻ�ܰ��������������󷽷�
 * @author acer
 *
 */
public interface MessageDao {
	/**
	 * 1.�������
	 * @param message
	 */
	public void addMessage(Message message);
	/**
	 * 2.��ʾ����������Ϣ
	 */
	public void displayMessage();
	/**
	 * ��id������������Ϣ
	 * @param id
	 * @return
	 */
	public Message findById(int id);
	/**
	 * ����id���޸�������Ϣ
	 * @param id
	 * @param message
	 * @return
	 */
	public boolean modifyMessage(int id ,Message message);
	/**
	 * ��id��ɾ��������Ϣ
	 * @param id
	 * @return
	 */
	public boolean deleteMessage(int id);
}
