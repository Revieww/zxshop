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

import org.hibernate.annotations.Cascade;
import org.hibernate.annotations.CascadeType;
import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;
import org.hibernate.annotations.Where;

/**
 * ZspProductskus entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_productskus", catalog = "zxshop")
public class Productsku implements java.io.Serializable {

	// Fields

	private Integer skuid;
	
	private Integer number;
	private Double price;
	private String name;
	private Timestamp createtime;

	private Product product;
	private List<ProductAttribute> saleattributes;		//商品销售属性
	
	
	// Constructors

	/** default constructor */
	public Productsku() {
	}


	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "skuid", unique = true, nullable = false)
	public Integer getSkuid() {
		return this.skuid;
	}

	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}
	@Column(name = "number")
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "price", precision = 9)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "name")
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
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
	@JoinColumn(name="pid")
	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	@Where(clause = "is_sku = 1")
	@OneToMany(mappedBy="productsku", fetch = FetchType.LAZY)
	@Cascade({CascadeType.ALL})
	public List<ProductAttribute> getSaleattributes() {
		return saleattributes;
	}
	public void setSaleattributes(List<ProductAttribute> saleattributes) {
		this.saleattributes = saleattributes;
	}

	
	
}