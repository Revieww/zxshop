package me.gacl.core.product.dto;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

public class ProductskuKeyModel implements Serializable{
	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = 4023007961198876478L;
	
	Map<String, ProductskuValueModel> skuatt;

	public Map<String, ProductskuValueModel> getSkuatt() {
		return skuatt;
	}

	public void setSkuatt(Map<String, ProductskuValueModel> skuatt) {
		this.skuatt = skuatt;
	}
	
//	private String attributesb;
//	private ProductskuValueModel valueModels;
//	public String getAttributesb() {
//		return attributesb;
//	}
//	public void setAttributesb(String attributesb) {
//		this.attributesb = attributesb;
//	}
//	public ProductskuValueModel getValueModels() {
//		return valueModels;
//	}
//	public void setValueModels(ProductskuValueModel valueModels) {
//		this.valueModels = valueModels;
//	}
//	
	
	
}
