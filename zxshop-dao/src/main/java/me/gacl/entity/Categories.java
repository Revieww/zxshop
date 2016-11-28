package me.gacl.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZspCategories entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_categories", catalog = "zxshop")
public class Categories implements java.io.Serializable {

	// Fields

	private Short cateid;
	private Integer displayorder;
	private String name;
	private String pricerange;
	private Short parentid;
	private Boolean layer;
	private Boolean haschild;
	private String path;

	// Constructors

	/** default constructor */
	public Categories() {
	}

	/** full constructor */
	public Categories(Integer displayorder, String name, String pricerange,
			Short parentid, Boolean layer, Boolean haschild, String path) {
		this.displayorder = displayorder;
		this.name = name;
		this.pricerange = pricerange;
		this.parentid = parentid;
		this.layer = layer;
		this.haschild = haschild;
		this.path = path;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cateid", unique = true, nullable = false)
	public Short getCateid() {
		return this.cateid;
	}

	public void setCateid(Short cateid) {
		this.cateid = cateid;
	}

	@Column(name = "displayorder")
	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	@Column(name = "name", length = 120)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "pricerange", length = 200)
	public String getPricerange() {
		return this.pricerange;
	}

	public void setPricerange(String pricerange) {
		this.pricerange = pricerange;
	}

	@Column(name = "parentid")
	public Short getParentid() {
		return this.parentid;
	}

	public void setParentid(Short parentid) {
		this.parentid = parentid;
	}

	@Column(name = "layer")
	public Boolean getLayer() {
		return this.layer;
	}

	public void setLayer(Boolean layer) {
		this.layer = layer;
	}

	@Column(name = "haschild")
	public Boolean getHaschild() {
		return this.haschild;
	}

	public void setHaschild(Boolean haschild) {
		this.haschild = haschild;
	}

	@Column(name = "path", length = 100)
	public String getPath() {
		return this.path;
	}

	public void setPath(String path) {
		this.path = path;
	}

}