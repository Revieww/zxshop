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
 * ZspUser entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_user", catalog = "zxshop")
public class User implements java.io.Serializable {

	// Fields

	private Integer uid;
	private String username;
	private String email;
	private String mobile;
	private String password;
	private String salt;
	private Short verifyemail;
	private Short verifymobile;
	private Short userrid;
	private String avatar;
	private String nickname;
	private Integer paycredits;
	private Integer rankcredits;
	private Timestamp liftbantime;

	// Constructors

	/** default constructor */
	public User() {
	}

	/** full constructor */
	public User(String username, String email, String mobile,
			String password, String salt, Short verifyemail,
			Short verifymobile, Short userrid, String avatar, String nickname,
			Integer paycredits, Integer rankcredits, Timestamp liftbantime) {
		this.username = username;
		this.email = email;
		this.mobile = mobile;
		this.password = password;
		this.salt = salt;
		this.verifyemail = verifyemail;
		this.verifymobile = verifymobile;
		this.userrid = userrid;
		this.avatar = avatar;
		this.nickname = nickname;
		this.paycredits = paycredits;
		this.rankcredits = rankcredits;
		this.liftbantime = liftbantime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "uid", unique = true, nullable = false)
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "username", length = 20)
	public String getUsername() {
		return this.username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	@Column(name = "email", length = 50)
	public String getEmail() {
		return this.email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	@Column(name = "mobile", length = 15)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "password", length = 100)
	public String getPassword() {
		return this.password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "salt", length = 100)
	public String getSalt() {
		return this.salt;
	}

	public void setSalt(String salt) {
		this.salt = salt;
	}

	@Column(name = "verifyemail")
	public Short getVerifyemail() {
		return this.verifyemail;
	}

	public void setVerifyemail(Short verifyemail) {
		this.verifyemail = verifyemail;
	}

	@Column(name = "verifymobile")
	public Short getVerifymobile() {
		return this.verifymobile;
	}

	public void setVerifymobile(Short verifymobile) {
		this.verifymobile = verifymobile;
	}

	@Column(name = "userrid")
	public Short getUserrid() {
		return this.userrid;
	}

	public void setUserrid(Short userrid) {
		this.userrid = userrid;
	}

	@Column(name = "avatar", length = 50)
	public String getAvatar() {
		return this.avatar;
	}

	public void setAvatar(String avatar) {
		this.avatar = avatar;
	}

	@Column(name = "nickname", length = 40)
	public String getNickname() {
		return this.nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Column(name = "paycredits")
	public Integer getPaycredits() {
		return this.paycredits;
	}

	public void setPaycredits(Integer paycredits) {
		this.paycredits = paycredits;
	}

	@Column(name = "rankcredits")
	public Integer getRankcredits() {
		return this.rankcredits;
	}

	public void setRankcredits(Integer rankcredits) {
		this.rankcredits = rankcredits;
	}

	@Column(name = "liftbantime", length = 19)
	public Timestamp getLiftbantime() {
		return this.liftbantime;
	}

	public void setLiftbantime(Timestamp liftbantime) {
		this.liftbantime = liftbantime;
	}

}