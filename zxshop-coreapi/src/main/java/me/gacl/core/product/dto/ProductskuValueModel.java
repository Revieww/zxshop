package me.gacl.core.product.dto;

import java.io.Serializable;
import java.sql.Timestamp;

public class ProductskuValueModel implements Serializable{

	private Integer skuid;
	private Integer number;
	private Double price;
	private String name;
	private Timestamp createtime;
	
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public Integer getSkuid() {
		return skuid;
	}
	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}
	
}
