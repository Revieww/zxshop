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
 * ZspAttributevalues entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_attributevalues", catalog = "zxshop")
public class Attributevalue implements java.io.Serializable {

	// Fields

	private Integer attrvalueid;
	private String attrvalue;
	private Integer displayorder;
	private Timestamp createtime;

	private Attribute attribute;
	
	// Constructors

	/** default constructor */
	public Attributevalue() {
	}

	/** minimal constructor */
	public Attributevalue(Timestamp createtime) {
		this.createtime = createtime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "attrvalueid", unique = true, nullable = false)
	public Integer getAttrvalueid() {
		return this.attrvalueid;
	}

	public void setAttrvalueid(Integer attrvalueid) {
		this.attrvalueid = attrvalueid;
	}

	@Column(name = "attrvalue", length = 100)
	public String getAttrvalue() {
		return this.attrvalue;
	}

	public void setAttrvalue(String attrvalue) {
		this.attrvalue = attrvalue;
	}


	@Column(name = "displayorder")
	public Integer getDisplayorder() {
		return this.displayorder;
	}

	public void setDisplayorder(Integer displayorder) {
		this.displayorder = displayorder;
	}

	@Column(name = "createtime", nullable = false, length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
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

	
}