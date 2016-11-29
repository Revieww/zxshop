package me.gacl.entity;
// default package

import java.sql.Timestamp;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import static javax.persistence.GenerationType.IDENTITY;

import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.NotFound;
import org.hibernate.annotations.NotFoundAction;

/**
 * ZspProductAttribute entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_product_attribute", catalog = "zxshop")
public class ProductAttribute implements java.io.Serializable {

	// Fields

	private Integer paid;
	
	private Boolean isSku;
	private Timestamp createtime;

	
	private Product product;
	private Attribute attribute;
	private Attributevalue attributevalue;
	private Productsku productsku;
	
	
	
	// Constructors

	/** default constructor */
	public ProductAttribute() {
	}


	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "paid", unique = true, nullable = false)
	public Integer getPaid() {
		return this.paid;
	}

	public void setPaid(Integer paid) {
		this.paid = paid;
	}
	@Column(name = "is_sku")
	public Boolean getIsSku() {
		return this.isSku;
	}

	public void setIsSku(Boolean isSku) {
		this.isSku = isSku;
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
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="attrid")
	public Attribute getAttribute() {
		return attribute;
	}
	public void setAttribute(Attribute attribute) {
		this.attribute = attribute;
	}
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="attrvalueid")
	public Attributevalue getAttributevalue() {
		return attributevalue;
	}
	public void setAttributevalue(Attributevalue attributevalue) {
		this.attributevalue = attributevalue;
	}
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="skuid")
	public Productsku getProductsku() {
		return productsku;
	}
	public void setProductsku(Productsku productsku) {
		this.productsku = productsku;
	}
	
	
	

}