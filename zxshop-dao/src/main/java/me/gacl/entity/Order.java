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
 * ZspOrders entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "zsp_orders", catalog = "zxshop")
public class Order implements java.io.Serializable {

	// Fields

	private Integer orderid;
	private Double productPrice;
	private Double orderPrice;
	private Double luggagePrice;
	private Double paymentPrice;
	private String orderNo;
	private Boolean status;
	private Timestamp createtime;
	private Timestamp paymenttime;
	private Timestamp sendtime;
	private Timestamp succeedtime;
	private String storename;
	private String consignee;
	private String mobile;
	private String phone;
	private String zipcode;
	private String address;
	private String buyerremark;
	private String paysn;

	private Integer uid;			//用户id
	private Integer storeid;		//店铺id
	private Integer regionid;		//区域id
	// Constructors

	/** default constructor */
	public Order() {
	}

	/** minimal constructor */
	public Order(Timestamp createtime, Timestamp paymenttime,
			Timestamp sendtime, Timestamp succeedtime) {
		this.createtime = createtime;
		this.paymenttime = paymenttime;
		this.sendtime = sendtime;
		this.succeedtime = succeedtime;
	}

	/** full constructor */
	public Order(Double productPrice, Double orderPrice,
			Double luggagePrice, Double paymentPrice, String orderNo,
			Boolean status, Timestamp createtime, Timestamp paymenttime,
			Timestamp sendtime, Timestamp succeedtime, Integer uid,
			String storename, Integer storeid, Integer regionid,
			String consignee, String mobile, String phone, String zipcode,
			String address, String buyerremark, String paysn) {
		this.productPrice = productPrice;
		this.orderPrice = orderPrice;
		this.luggagePrice = luggagePrice;
		this.paymentPrice = paymentPrice;
		this.orderNo = orderNo;
		this.status = status;
		this.createtime = createtime;
		this.paymenttime = paymenttime;
		this.sendtime = sendtime;
		this.succeedtime = succeedtime;
		this.uid = uid;
		this.storename = storename;
		this.storeid = storeid;
		this.regionid = regionid;
		this.consignee = consignee;
		this.mobile = mobile;
		this.phone = phone;
		this.zipcode = zipcode;
		this.address = address;
		this.buyerremark = buyerremark;
		this.paysn = paysn;
	}

	// Property accessors
	@Id
	@GeneratedValue(strategy = IDENTITY)
	@Column(name = "orderid", unique = true, nullable = false)
	public Integer getOrderid() {
		return this.orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	@Column(name = "product_price", precision = 9)
	public Double getProductPrice() {
		return this.productPrice;
	}

	public void setProductPrice(Double productPrice) {
		this.productPrice = productPrice;
	}

	@Column(name = "order_price", precision = 9)
	public Double getOrderPrice() {
		return this.orderPrice;
	}

	public void setOrderPrice(Double orderPrice) {
		this.orderPrice = orderPrice;
	}

	@Column(name = "luggage_price", precision = 9)
	public Double getLuggagePrice() {
		return this.luggagePrice;
	}

	public void setLuggagePrice(Double luggagePrice) {
		this.luggagePrice = luggagePrice;
	}

	@Column(name = "payment_price", precision = 9)
	public Double getPaymentPrice() {
		return this.paymentPrice;
	}

	public void setPaymentPrice(Double paymentPrice) {
		this.paymentPrice = paymentPrice;
	}

	@Column(name = "order_no", length = 225)
	public String getOrderNo() {
		return this.orderNo;
	}

	public void setOrderNo(String orderNo) {
		this.orderNo = orderNo;
	}

	@Column(name = "status")
	public Boolean getStatus() {
		return this.status;
	}

	public void setStatus(Boolean status) {
		this.status = status;
	}

	@Column(name = "createtime", nullable = false, length = 19)
	public Timestamp getCreatetime() {
		return this.createtime;
	}

	public void setCreatetime(Timestamp createtime) {
		this.createtime = createtime;
	}

	@Column(name = "paymenttime", nullable = false, length = 19)
	public Timestamp getPaymenttime() {
		return this.paymenttime;
	}

	public void setPaymenttime(Timestamp paymenttime) {
		this.paymenttime = paymenttime;
	}

	@Column(name = "sendtime", nullable = false, length = 19)
	public Timestamp getSendtime() {
		return this.sendtime;
	}

	public void setSendtime(Timestamp sendtime) {
		this.sendtime = sendtime;
	}

	@Column(name = "succeedtime", nullable = false, length = 19)
	public Timestamp getSucceedtime() {
		return this.succeedtime;
	}

	public void setSucceedtime(Timestamp succeedtime) {
		this.succeedtime = succeedtime;
	}

	@Column(name = "uid")
	public Integer getUid() {
		return this.uid;
	}

	public void setUid(Integer uid) {
		this.uid = uid;
	}

	@Column(name = "storename", length = 120)
	public String getStorename() {
		return this.storename;
	}

	public void setStorename(String storename) {
		this.storename = storename;
	}

	@Column(name = "storeid")
	public Integer getStoreid() {
		return this.storeid;
	}

	public void setStoreid(Integer storeid) {
		this.storeid = storeid;
	}

	@Column(name = "regionid")
	public Integer getRegionid() {
		return this.regionid;
	}

	public void setRegionid(Integer regionid) {
		this.regionid = regionid;
	}

	@Column(name = "consignee", length = 40)
	public String getConsignee() {
		return this.consignee;
	}

	public void setConsignee(String consignee) {
		this.consignee = consignee;
	}

	@Column(name = "mobile", length = 15)
	public String getMobile() {
		return this.mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	@Column(name = "phone", length = 11)
	public String getPhone() {
		return this.phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	@Column(name = "zipcode", length = 5)
	public String getZipcode() {
		return this.zipcode;
	}

	public void setZipcode(String zipcode) {
		this.zipcode = zipcode;
	}

	@Column(name = "address", length = 300)
	public String getAddress() {
		return this.address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	@Column(name = "buyerremark", length = 500)
	public String getBuyerremark() {
		return this.buyerremark;
	}

	public void setBuyerremark(String buyerremark) {
		this.buyerremark = buyerremark;
	}

	@Column(name = "paysn", length = 30)
	public String getPaysn() {
		return this.paysn;
	}

	public void setPaysn(String paysn) {
		this.paysn = paysn;
	}

}