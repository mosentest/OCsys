package com.llx.ocsys.entity;

/**
 * TbUsedCheckitem entity. @author MyEclipse Persistence Tools
 */

public class TbUsedCheckitem implements java.io.Serializable {

	// Fields

	private Integer usedCheckitemId;
	private String usedCheckitemNumber;
	private String usedCheckitemName;
	private Double usedCheckitemFee;
	private Integer usedCheckitemAmount;
	private Double usedCheckitemSubtotal;
	private String billNumber;

	// Constructors

	/** default constructor */
	public TbUsedCheckitem() {
	}

	/** full constructor */
	public TbUsedCheckitem(String usedCheckitemNumber,
			String usedCheckitemName, Double usedCheckitemFee,
			Integer usedCheckitemAmount, Double usedCheckitemSubtotal,
			String billNumber) {
		this.usedCheckitemNumber = usedCheckitemNumber;
		this.usedCheckitemName = usedCheckitemName;
		this.usedCheckitemFee = usedCheckitemFee;
		this.usedCheckitemAmount = usedCheckitemAmount;
		this.usedCheckitemSubtotal = usedCheckitemSubtotal;
		this.billNumber = billNumber;
	}

	// Property accessors

	public Integer getUsedCheckitemId() {
		return this.usedCheckitemId;
	}

	public void setUsedCheckitemId(Integer usedCheckitemId) {
		this.usedCheckitemId = usedCheckitemId;
	}

	public String getUsedCheckitemNumber() {
		return this.usedCheckitemNumber;
	}

	public void setUsedCheckitemNumber(String usedCheckitemNumber) {
		this.usedCheckitemNumber = usedCheckitemNumber;
	}

	public String getUsedCheckitemName() {
		return this.usedCheckitemName;
	}

	public void setUsedCheckitemName(String usedCheckitemName) {
		this.usedCheckitemName = usedCheckitemName;
	}

	public Double getUsedCheckitemFee() {
		return this.usedCheckitemFee;
	}

	public void setUsedCheckitemFee(Double usedCheckitemFee) {
		this.usedCheckitemFee = usedCheckitemFee;
	}

	public Integer getUsedCheckitemAmount() {
		return this.usedCheckitemAmount;
	}

	public void setUsedCheckitemAmount(Integer usedCheckitemAmount) {
		this.usedCheckitemAmount = usedCheckitemAmount;
	}

	public Double getUsedCheckitemSubtotal() {
		return this.usedCheckitemSubtotal;
	}

	public void setUsedCheckitemSubtotal(Double usedCheckitemSubtotal) {
		this.usedCheckitemSubtotal = usedCheckitemSubtotal;
	}

	public String getBillNumber() {
		return this.billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

}