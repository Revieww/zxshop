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
 * ZspOrderProducts entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_order_products", catalog = "zxshop")
public class OrderProduct implements java.io.Serializable {

	// Fields

	private Integer recordid;
	private String name;
	private String showimg;
	private Double price;
	private Integer number;
	private Timestamp createtime;

	private Integer orderid;
	private Integer uid;
	private Integer pid;
	private Integer skuid;
	// Constructors

	/** default constructor */
	public OrderProduct() {
	}

	/** minimal constructor */
	public OrderProduct(Timestamp createtime) {
		this.createtime = createtime;
	}

	/** full constructor */
	public OrderProduct(Integer orderid, Integer uid, Integer pid,
			String name, String showimg, Integer skuid, Double price,
			Integer number, Timestamp createtime) {
		this.orderid = orderid;
		this.uid = uid;
		this.pid = pid;
		this.name = name;
		this.showimg = showimg;
		this.skuid = skuid;
		this.price = price;
		this.number = number;
		this.createtime = createtime;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "recordid", unique = true, nullable = false)
	public Integer getRecordid() {
		return this.recordid;
	}

	public void setRecordid(Integer recordid) {
		this.recordid = recordid;
	}

	@Column(name = "orderid")
	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	@Column(name = "uid")
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "pid")
	public Integer getPid() {
		return this.pid;
	}

	public void setPid(Integer pid) {
		this.pid = pid;
	}

	@Column(name = "name", length = 400)
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Column(name = "showimg", length = 100)
	public String getShowimg() {
		return this.showimg;
	}

	public void setShowimg(String showimg) {
		this.showimg = showimg;
	}

	@Column(name = "skuid")
	public Integer getSkuid() {
		return this.skuid;
	}

	public void setSkuid(Integer skuid) {
		this.skuid = skuid;
	}

	@Column(name = "price", precision = 9)
	public Double getPrice() {
		return this.price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	@Column(name = "number")
	public Integer getNumber() {
		return this.number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	@Column(name = "createtime", nullable = false, length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

}