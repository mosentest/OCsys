package com.llx.ocsys.entity;

/**
 * TbTempCheckitem entity. @author MyEclipse Persistence Tools
 */

public class TbTempCheckitem implements java.io.Serializable {

	// Fields

	private Integer tempCheckitemId;
	private String tempCheckitemNumber;
	private String tempCheckitemName;
	private Double tempCheckitemFee;
	private Integer tempCheckitemAmount;
	private Double tempCheckitemSubtotal;
	private String registrationNumber;

	// Constructors

	/** default constructor */
	public TbTempCheckitem() {
	}

	/** full constructor */
	public TbTempCheckitem(String tempCheckitemNumber,
			String tempCheckitemName, Double tempCheckitemFee,
			Integer tempCheckitemAmount, Double tempCheckitemSubtotal,
			String registrationNumber) {
		this.tempCheckitemNumber = tempCheckitemNumber;
		this.tempCheckitemName = tempCheckitemName;
		this.tempCheckitemFee = tempCheckitemFee;
		this.tempCheckitemAmount = tempCheckitemAmount;
		this.tempCheckitemSubtotal = tempCheckitemSubtotal;
		this.registrationNumber = registrationNumber;
	}

	// Property accessors

	public Integer getTempCheckitemId() {
		return this.tempCheckitemId;
	}

	public void setTempCheckitemId(Integer tempCheckitemId) {
		this.tempCheckitemId = tempCheckitemId;
	}

	public String getTempCheckitemNumber() {
		return this.tempCheckitemNumber;
	}

	public void setTempCheckitemNumber(String tempCheckitemNumber) {
		this.tempCheckitemNumber = tempCheckitemNumber;
	}

	public String getTempCheckitemName() {
		return this.tempCheckitemName;
	}

	public void setTempCheckitemName(String tempCheckitemName) {
		this.tempCheckitemName = tempCheckitemName;
	}

	public Double getTempCheckitemFee() {
		return this.tempCheckitemFee;
	}

	public void setTempCheckitemFee(Double tempCheckitemFee) {
		this.tempCheckitemFee = tempCheckitemFee;
	}

	public Integer getTempCheckitemAmount() {
		return this.tempCheckitemAmount;
	}

	public void setTempCheckitemAmount(Integer tempCheckitemAmount) {
		this.tempCheckitemAmount = tempCheckitemAmount;
	}

	public Double getTempCheckitemSubtotal() {
		return this.tempCheckitemSubtotal;
	}

	public void setTempCheckitemSubtotal(Double tempCheckitemSubtotal) {
		this.tempCheckitemSubtotal = tempCheckitemSubtotal;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}