package me.gacl.entity;
// default package

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * ZspUserranks entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_userranks", catalog = "zxshop")
public class Userranks implements java.io.Serializable {

	// Fields

	private Short userrid;
	private Integer isSystem;
	private String title;
	private String avatar;
	private Integer creditslower;
	private Integer creditsupper;
	private Integer limitdays;

	// Constructors

	/** default constructor */
	public Userranks() {
	}

	/** full constructor */
	public Userranks(Integer isSystem, String title, String avatar,
			Integer creditslower, Integer creditsupper, Integer limitdays) {
		this.isSystem = isSystem;
		this.title = title;
		this.avatar = avatar;
		this.creditslower = creditslower;
		this.creditsupper = creditsupper;
		this.limitdays = limitdays;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "userrid", unique = true, nullable = false)
	public Short getUserrid() {
		return this.userrid;
	}

	public void setUserrid(Short userrid) {
		this.userrid = userrid;
	}

	@Column(name = "is_system")
	public Integer getIsSystem() {
		return this.isSystem;
	}

	public void setIsSystem(Integer isSystem) {
		this.isSystem = isSystem;
	}

	@Column(name = "title", length = 100)
	public String getTitle() {
		return this.title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	@Column(name = "avatar", length = 50)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "creditslower")
	public Integer getCreditslower() {
		return this.creditslower;
	}

	public void setCreditslower(Integer creditslower) {
		this.creditslower = creditslower;
	}

	@Column(name = "creditsupper")
	public Integer getCreditsupper() {
		return this.creditsupper;
	}

	public void setCreditsupper(Integer creditsupper) {
		this.creditsupper = creditsupper;
	}

	@Column(name = "limitdays")
	public Integer getLimitdays() {
		return this.limitdays;
	}

	public void setLimitdays(Integer limitdays) {
		this.limitdays = limitdays;
	}

}