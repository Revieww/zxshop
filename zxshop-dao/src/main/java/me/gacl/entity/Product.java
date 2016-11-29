package me.gacl.entity;
// default package

import java.sql.Timestamp;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Where;

/**
 * ZspProducts entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_products", catalog = "zxshop")
public class Product implements java.io.Serializable {

	// Fields

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
	
	private Brand brand;
	private List<Productsku> productskus; 				//商品sku
	
	
	private List<ProductAttribute> attributes;			//商品基本属性
	private List<ProductAttribute> saleattributes;		//商品销售属性
	
	// Constructors

	/** default constructor */
	public Product() {
	}

	/** minimal constructor */
	public Product(String psn) {
		this.psn = psn;
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

	@Column(name = "state")
	public Boolean getState() {
		return this.state;
	}

	public void setState(Boolean state) {
		this.state = state;
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

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}
	
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="brandid")
	public Brand getBrand() {
		return brand;
	}

	public void setBrand(Brand brand) {
		this.brand = brand;
	}

	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	public List<Productsku> getProductskus() {
		return productskus;
	}

	public void setProductskus(List<Productsku> productskus) {
		this.productskus = productskus;
	}
	
	@Where(clause = "is_sku = 0")
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	public List<ProductAttribute> getAttributes() {
		return attributes;
	}

	public void setAttributes(List<ProductAttribute> attributes) {
		this.attributes = attributes;
	}

	@Where(clause = "is_sku = 1")
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
	public List<ProductAttribute> getSaleattributes() {
		return saleattributes;
	}
	public void setSaleattributes(List<ProductAttribute> saleattributes) {
		this.saleattributes = saleattributes;
	}
	
	
	
}