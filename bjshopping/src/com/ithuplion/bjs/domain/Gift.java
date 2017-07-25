package com.ithuplion.bjs.domain;
/**
 * 礼物
 * @author Administrator
 *
 */
public class Gift {
	private Integer id;//id
	private String name;//礼物名称
	private Double price;//价格
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Gift() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Gift(Integer id, String name, Double price) {
		super();
		this.id = id;
		this.name = name;
		this.price = price;
	}
	@Override
	public String toString() {
		return "Gift [id=" + id + ", name=" + name + ", price=" + price + "]";
	}
	
}
