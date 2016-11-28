package me.gacl.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZspBrands entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_brands", catalog = "zxshop")
public class Brands implements java.io.Serializable {

	// Fields

	private Integer brandid;
	private Integer displayorder;
	private String name;
	private String logo;

	// Constructors

	/** default constructor */
	public Brands() {
	}

	/** full constructor */
	public Brands(Integer displayorder, String name, String logo) {
		this.displayorder = displayorder;
		this.name = name;
		this.logo = logo;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "brandid", unique = true, nullable = false)
	public Integer getBrandid() {
		return this.brandid;
	}

	public void setBrandid(Integer brandid) {
		this.brandid = brandid;
	}

	@Column(name = "displayorder")
	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	@Column(name = "name", length = 40)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "logo", length = 40)
	public String getLogo() {
		return this.logo;
	}

	public void setLogo(String logo) {
		this.logo = logo;
	}

}