package com.ithuplion.bjs.domain;

/**
 * ��Ա��
 * 
 * @author Administrator
 *
 */
public class Customer {
	private int custNo; // ��Ա���
	private String custBirth; // ��Ա����
	private int custScore; // ��Ա
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	public String getCustBirth() {
		return custBirth;
	}
	public void setCustBirth(String custBirth) {
		this.custBirth = custBirth;
	}
	public int getCustScore() {
		return custScore;
	}
	public void setCustScore(int custScore) {
		this.custScore = custScore;
	}
	public Customer() {
		super();
	}
	public Customer(int custNo, String custBirth, int custScore) {
		super();
		this.custNo = custNo;
		this.custBirth = custBirth;
		this.custScore = custScore;
	}
	@Override
	public String toString() {
		return "Customer [custNo=" + custNo + ", custBirth=" + custBirth + ", custScore=" + custScore + "]";
	}
	
}
