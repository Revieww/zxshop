package me.gacl.core.order.dto;

import java.io.Serializable;

import me.gacl.core.common.dto.BaseEnter;

public class BuyNowDetailEnter extends BaseEnter{

	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = 6669754011496953484L;
	
	private Integer skuid;

	public Integer getSkuid() {
		return skuid;
	}

	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}
	
	
}
