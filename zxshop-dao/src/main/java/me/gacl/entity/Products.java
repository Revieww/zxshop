package me.gacl.entity;
// default package

import java.sql.Timestamp;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZspProducts entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_products", catalog = "zxshop")
public class Products implements java.io.Serializable {

	// Fields

	private Integer pid;
	private String psn;
	private String name;
	private Double shopprice;
	private Double marketprice;
	private Double costprice;
	private Boolean state;
	private Boolean isBest;
	private Boolean isHot;
	private Boolean isNew;
	private Integer displayorder;
	private String showimg;
	private Integer salecount;
	private Integer visitcount;
	private Integer reviewcount;
	private Timestamp addtime;
	private String description;
	private Short cateid;
	private Integer brandid;
	private Integer storeid;
	private Integer storecid;
	private Integer storestid;
	private Integer skugid;

	// Constructors

	/** default constructor */
	public Products() {
	}

	/** minimal constructor */
	public Products(String psn) {
		this.psn = psn;
	}

	/** full constructor */
	public Products(String psn, String name, Double shopprice,
			Double marketprice, Double costprice, Boolean state,
			Boolean isBest, Boolean isHot, Boolean isNew, Integer displayorder,
			String showimg, Integer salecount, Integer visitcount,
			Integer reviewcount, Timestamp addtime, String description,
			Short cateid, Integer brandid, Integer storeid, Integer storecid,
			Integer storestid, Integer skugid) {
		this.psn = psn;
		this.name = name;
		this.shopprice = shopprice;
		this.marketprice = marketprice;
		this.costprice = costprice;
		this.state = state;
		this.isBest = isBest;
		this.isHot = isHot;
		this.isNew = isNew;
		this.displayorder = displayorder;
		this.showimg = showimg;
		this.salecount = salecount;
		this.visitcount = visitcount;
		this.reviewcount = reviewcount;
		this.addtime = addtime;
		this.description = description;
		this.cateid = cateid;
		this.brandid = brandid;
		this.storeid = storeid;
		this.storecid = storecid;
		this.storestid = storestid;
		this.skugid = skugid;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "pid", unique = true, nullable = false)
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "psn", nullable = false, length = 30)
	public String getPsn() {
		return this.psn;
	}

	public void setPsn(String psn) {
		this.psn = psn;
	}

	@Column(name = "name", length = 400)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "shopprice", precision = 9)
	public Double getShopprice() {
		return this.shopprice;
	}

	public void setShopprice(Double shopprice) {
		this.shopprice = shopprice;
	}

	@Column(name = "marketprice", precision = 9)
	public Double getMarketprice() {
		return this.marketprice;
	}

	public void setMarketprice(Double marketprice) {
		this.marketprice = marketprice;
	}

	@Column(name = "costprice", precision = 9)
	public Double getCostprice() {
		return this.costprice;
	}

	public void setCostprice(Double costprice) {
		this.costprice = costprice;
	}

	@Column(name = "state")
	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
	}

	@Column(name = "is_best")
	public Boolean getIsBest() {
		return this.isBest;
	}

	public void setIsBest(Boolean isBest) {
		this.isBest = isBest;
	}

	@Column(name = "is_hot")
	public Boolean getIsHot() {
		return this.isHot;
	}

	public void setIsHot(Boolean isHot) {
		this.isHot = isHot;
	}

	@Column(name = "is_new")
	public Boolean getIsNew() {
		return this.isNew;
	}

	public void setIsNew(Boolean isNew) {
		this.isNew = isNew;
	}

	@Column(name = "displayorder")
	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	@Column(name = "showimg", length = 200)
	public String getShowimg() {
		return this.showimg;
	}

	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}

	@Column(name = "salecount")
	public Integer getSalecount() {
		return this.salecount;
	}

	public void setSalecount(Integer salecount) {
		this.salecount = salecount;
	}

	@Column(name = "visitcount")
	public Integer getVisitcount() {
		return this.visitcount;
	}

	public void setVisitcount(Integer visitcount) {
		this.visitcount = visitcount;
	}

	@Column(name = "reviewcount")
	public Integer getReviewcount() {
		return this.reviewcount;
	}

	public void setReviewcount(Integer reviewcount) {
		this.reviewcount = reviewcount;
	}

	@Column(name = "addtime", length = 19)
	public Timestamp getAddtime() {
		return this.addtime;
	}

	public void setAddtime(Timestamp addtime) {
		this.addtime = addtime;
	}

	@Column(name = "description", length = 65535)
	public String getDescription() {
		return this.description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Column(name = "cateid")
	public Short getCateid() {
		return this.cateid;
	}

	public void setCateid(Short cateid) {
		this.cateid = cateid;
	}

	@Column(name = "brandid")
	public Integer getBrandid() {
		return this.brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	@Column(name = "storeid")
	public Integer getStoreid() {
		return this.storeid;
	}

	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}

	@Column(name = "storecid")
	public Integer getStorecid() {
		return this.storecid;
	}

	public void setStorecid(Integer storecid) {
		this.storecid = storecid;
	}

	@Column(name = "storestid")
	public Integer getStorestid() {
		return this.storestid;
	}

	public void setStorestid(Integer storestid) {
		this.storestid = storestid;
	}

	@Column(name = "skugid")
	public Integer getSkugid() {
		return this.skugid;
	}

	public void setSkugid(Integer skugid) {
		this.skugid = skugid;
	}

}