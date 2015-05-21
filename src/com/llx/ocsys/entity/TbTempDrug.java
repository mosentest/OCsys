package com.llx.ocsys.entity;

/**
 * TbTempDrug entity. @author MyEclipse Persistence Tools
 */

public class TbTempDrug implements java.io.Serializable {

	// Fields

	private Integer tempDrugId;
	private String tempDrugNumber;
	private String tempDrugName;
	private Double tempDrugFee;
	private Integer tempDrugAmount;
	private Double tempDrugSubtotal;
	private String registrationNumber;

	// Constructors

	/** default constructor */
	public TbTempDrug() {
	}

	/** full constructor */
	public TbTempDrug(String tempDrugNumber, String tempDrugName,
			Double tempDrugFee, Integer tempDrugAmount,
			Double tempDrugSubtotal, String registrationNumber) {
		this.tempDrugNumber = tempDrugNumber;
		this.tempDrugName = tempDrugName;
		this.tempDrugFee = tempDrugFee;
		this.tempDrugAmount = tempDrugAmount;
		this.tempDrugSubtotal = tempDrugSubtotal;
		this.registrationNumber = registrationNumber;
	}

	// Property accessors

	public Integer getTempDrugId() {
		return this.tempDrugId;
	}

	public void setTempDrugId(Integer tempDrugId) {
		this.tempDrugId = tempDrugId;
	}

	public String getTempDrugNumber() {
		return this.tempDrugNumber;
	}

	public void setTempDrugNumber(String tempDrugNumber) {
		this.tempDrugNumber = tempDrugNumber;
	}

	public String getTempDrugName() {
		return this.tempDrugName;
	}

	public void setTempDrugName(String tempDrugName) {
		this.tempDrugName = tempDrugName;
	}

	public Double getTempDrugFee() {
		return this.tempDrugFee;
	}

	public void setTempDrugFee(Double tempDrugFee) {
		this.tempDrugFee = tempDrugFee;
	}

	public Integer getTempDrugAmount() {
		return this.tempDrugAmount;
	}

	public void setTempDrugAmount(Integer tempDrugAmount) {
		this.tempDrugAmount = tempDrugAmount;
	}

	public Double getTempDrugSubtotal() {
		return this.tempDrugSubtotal;
	}

	public void setTempDrugSubtotal(Double tempDrugSubtotal) {
		this.tempDrugSubtotal = tempDrugSubtotal;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

}