package me.gacl.core.order.dto;

import java.io.Serializable;

public class OrderConfirmResult implements Serializable{

	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = -7032429130439931355L;

	private String name;
	private String showimg;
	private Double price;
	private Integer number;
	private String storename;
	private String attributevaluesb;
	
	private Integer storeid;
	private Integer skuid;
	private Integer pid;
	
	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getShowimg() {
		return showimg;
	}
	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	public Integer getNumber() {
		return number;
	}
	public void setNumber(Integer number) {
		this.number = number;
	}
	public String getStorename() {
		return storename;
	}
	public void setStorename(String storename) {
		this.storename = storename;
	}
	public Integer getStoreid() {
		return storeid;
	}
	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}
	public Integer getSkuid() {
		return skuid;
	}
	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getAttributevaluesb() {
		return attributevaluesb;
	}
	public void setAttributevaluesb(String attributevaluesb) {
		this.attributevaluesb = attributevaluesb;
	}
	
	
	
}
