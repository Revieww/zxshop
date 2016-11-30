package me.gacl.core.product.dto;

import java.io.Serializable;
import java.sql.Timestamp;
import java.util.List;
import java.util.Map;

public class ProductModel implements Serializable{

	/**   
	 * @Fields serialVersionUID : TODO   
	 */  
	private static final long serialVersionUID = -1547380415771989836L;
	
	private Integer pid;
	private String psn;
	private String name;
	private Double shopprice;
	private Boolean state;
	private Integer displayorder;
	private String showimg;
	private Integer salecount;
	private Integer visitcount;
	private Integer reviewcount;
	private Timestamp createtime;
	
	private Map<String, ProductskuValueModel> skuatt; 			//销售属性
	
	private List<SaleaAttriModel> saleaAttriModels; 			//销售属性
	
	public Integer getPid() {
		return pid;
	}
	public void setPid(Integer pid) {
		this.pid = pid;
	}
	public String getPsn() {
		return psn;
	}
	public void setPsn(String psn) {
		this.psn = psn;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getShopprice() {
		return shopprice;
	}
	public void setShopprice(Double shopprice) {
		this.shopprice = shopprice;
	}
	public Boolean getState() {
		return state;
	}
	public void setState(Boolean state) {
		this.state = state;
	}
	public Integer getDisplayorder() {
		return displayorder;
	}
	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}
	public String getShowimg() {
		return showimg;
	}
	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}
	public Integer getSalecount() {
		return salecount;
	}
	public void setSalecount(Integer salecount) {
		this.salecount = salecount;
	}
	public Integer getVisitcount() {
		return visitcount;
	}
	public void setVisitcount(Integer visitcount) {
		this.visitcount = visitcount;
	}
	public Integer getReviewcount() {
		return reviewcount;
	}
	public void setReviewcount(Integer reviewcount) {
		this.reviewcount = reviewcount;
	}
	public Timestamp getCreatetime() {
		return createtime;
	}
	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	public List<SaleaAttriModel> getSaleaAttriModels() {
		return saleaAttriModels;
	}
	public void setSaleaAttriModels(List<SaleaAttriModel> saleaAttriModels) {
		this.saleaAttriModels = saleaAttriModels;
	}
	public Map<String, ProductskuValueModel> getSkuatt() {
		return skuatt;
	}
	public void setSkuatt(Map<String, ProductskuValueModel> skuatt) {
		this.skuatt = skuatt;
	}
	
	
}
