package com.ithuplion.bjs.domain;

/**
 * 会员类
 * 
 * @author Administrator
 *
 */
public class Customer {
	private int custNo; // 会员编号
	private String custBirth; // 会员生日
	private int custScore; // 会员
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
