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
 * ZspAttributes entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_attributes", catalog = "zxshop")
public class Attribute implements java.io.Serializable {

	// Fields

	private Integer attrid;
	private String name;
	private Integer displayorder;
	private Timestamp createtime;
	private Boolean isSales;   			//是否为销售属性
	private Boolean isBasic;			//是否为基本属性
	private Boolean isMust;				//是否必填
	private Boolean isCheck;			//是否为多选

	private Categorie categorie;
	
	// Constructors

	/** default constructor */
	public Attribute() {
	}


	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "attrid", unique = true, nullable = false)
	public Integer getAttrid() {
		return this.attrid;
	}

	public void setAttrid(Integer attrid) {
		this.attrid = attrid;
	}

	@Column(name = "name", length = 100)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "displayorder")
	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	@Column(name = "createtime", length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "is_sales")
	public Boolean getIsSales() {
		return this.isSales;
	}

	public void setIsSales(Boolean isSales) {
		this.isSales = isSales;
	}

	@Column(name = "is_basic")
	public Boolean getIsBasic() {
		return this.isBasic;
	}

	public void setIsBasic(Boolean isBasic) {
		this.isBasic = isBasic;
	}

	@Column(name = "is_must")
	public Boolean getIsMust() {
		return this.isMust;
	}

	public void setIsMust(Boolean isMust) {
		this.isMust = isMust;
	}

	@Column(name = "is_check")
	public Boolean getIsCheck() {
		return this.isCheck;
	}

	public void setIsCheck(Boolean isCheck) {
		this.isCheck = isCheck;
	}

	@ManyToOne(fetch=FetchType.EAGER)
	@NotFound(action = NotFoundAction.IGNORE)
	@JoinColumn(name="cateid")
	public Categorie getCategorie() {
		return categorie;
	}
	public void setCategorie(Categorie categorie) {
		this.categorie = categorie;
	}

	
}