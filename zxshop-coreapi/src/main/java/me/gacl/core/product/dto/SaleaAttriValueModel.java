package me.gacl.core.product.dto;

import java.io.Serializable;

public class SaleaAttriValueModel implements Serializable{

	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = -8917486243785983186L;

	private Integer valueId;
	private String value;
	public Integer getValueId() {
		return valueId;
	}
	public void setValueId(Integer valueId) {
		this.valueId = valueId;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	
	
	
}
