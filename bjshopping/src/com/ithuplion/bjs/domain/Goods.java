package com.ithuplion.bjs.domain;
/**
 * ��Ʒ��
 * @author Administrator
 *
 */
public class Goods {
	private Integer id;//id
	private String goodsName;//��Ʒ��
	private Double goodsPrice;//��Ʒ�۸�
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getGoodsName() {
		return goodsName;
	}
	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}
	public Double getGoodsPrice() {
		return goodsPrice;
	}
	public void setGoodsPrice(Double goodsPrice) {
		this.goodsPrice = goodsPrice;
	}
	public Goods() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Goods(Integer id, String goodsName, Double goodsPrice) {
		super();
		this.id = id;
		this.goodsName = goodsName;
		this.goodsPrice = goodsPrice;
	}
	@Override
	public String toString() {
		return "Goods [id=" + id + ", goodsName=" + goodsName + ", goodsPrice=" + goodsPrice + "]";
	}
}
