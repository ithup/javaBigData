package com.ithuplion.bjs.controller;
/**
 * ����Ա��Ϣ��
 */
import com.ithuplion.bjs.domain.Manager;
import com.ithuplion.bjs.service.ManagerService;

public class ManagerController {
	private ManagerService managerService =new ManagerService();
	/*
	 * ��¼���ܣ�ʵ�ֹ���Ա�ĵ�¼
	 * 		��������ͼ����ã�����ҵ��㷽��
	 */
	public Manager login(String username, String password) throws Exception {
		return managerService.login(username,password);
	}
	/**
	 * ���Ʋ�:
	 * 		������ͼ�㴫�ݵ������޸Ĺ���Ա���룬����ͼ����ã�����ҵ���߼���
	 * @param username
	 * @param newUserName
	 * @param newPassword
	 * @return
	 * @throws Exception 
	 */
	public int editManagerPassword(String username, String newUserName, String newPassword) throws Exception {
		return managerService.editManagerPassword(username,newUserName,newPassword);
	}
}
