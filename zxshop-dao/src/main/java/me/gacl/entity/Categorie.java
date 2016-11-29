package me.gacl.entity;
// default package

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
 * ZspCategories entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_categories", catalog = "zxshop")
public class Categorie implements java.io.Serializable {

	// Fields

	private Integer cateid;
	private Integer displayorder;
	private String name;
	private Boolean layer;
	private Boolean haschild;

	
	private Categorie categorie;
	
	
	// Constructors

	/** default constructor */
	public Categorie() {
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "cateid", unique = true, nullable = false)
	public Integer getCateid() {
		return this.cateid;
	}

	public void setCateid(Integer cateid) {
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
	
	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="parentid")
	public Categorie getCategorie() {
		return categorie;
	}

	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}
	
	
	

}