package com.ithuplion.bjs.service;

import com.ithuplion.bjs.dao.ManagerDao;
import com.ithuplion.bjs.domain.Manager;

public class ManagerService {
	private ManagerDao managerDao=new ManagerDao();
	public Manager login(String username, String password) throws Exception {
		return managerDao.login(username,password);
	}
	/**
	 * ҵ���߼��㣺
	 * 		���ݿ��Ʋ㴫�ݵ�������Ϣ�������ݲ��޸Ĺ���Ա����
	 * @param username
	 * @param newUserName
	 * @param newPassword
	 * @return
	 * @throws Exception 
	 */
	public int editManagerPassword(String username, String newUserName, String newPassword) throws Exception {
		//�������ݲ�ķ���
		return managerDao.editManagerPassword(username,newUserName,newPassword);
	}

}
