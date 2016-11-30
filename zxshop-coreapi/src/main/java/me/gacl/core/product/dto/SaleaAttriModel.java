package me.gacl.core.product.dto;

import java.io.Serializable;
import java.util.List;

public class SaleaAttriModel implements Serializable{
	
	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = -5985820190092795375L;
	private String attribute;
	private List<SaleaAttriValueModel> valueModels;
	public String getAttribute() {
		return attribute;
	}
	public void setAttribute(String attribute) {
		this.attribute = attribute;
	}
	public List<SaleaAttriValueModel> getValueModels() {
		return valueModels;
	}
	public void setValueModels(List<SaleaAttriValueModel> valueModels) {
		this.valueModels = valueModels;
	}
	
	
	
}
