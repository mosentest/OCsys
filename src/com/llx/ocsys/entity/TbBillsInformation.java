package com.llx.ocsys.entity;

import java.sql.Timestamp;

/**
 * TbBillsInformation entity. @author MyEclipse Persistence Tools
 */

public class TbBillsInformation implements java.io.Serializable {

	// Fields

	private Integer billId;
	private String billNumber;
	private String billStatus;
	private Double shouldCharge;
	private Double actualCharge;
	private Double oddChange;
	private Timestamp paymentTime;
	private Timestamp refundTime;
	private String registrationNumber;
	private String userNumber;

	// Constructors

	/** default constructor */
	public TbBillsInformation() {
	}

	/** full constructor */
	public TbBillsInformation(String billNumber, String billStatus,
			Double shouldCharge, Double actualCharge, Double oddChange,
			Timestamp paymentTime, Timestamp refundTime,
			String registrationNumber, String userNumber) {
		this.billNumber = billNumber;
		this.billStatus = billStatus;
		this.shouldCharge = shouldCharge;
		this.actualCharge = actualCharge;
		this.oddChange = oddChange;
		this.paymentTime = paymentTime;
		this.refundTime = refundTime;
		this.registrationNumber = registrationNumber;
		this.userNumber = userNumber;
	}

	// Property accessors

	public Integer getBillId() {
		return this.billId;
	}

	public void setBillId(Integer billId) {
		this.billId = billId;
	}

	public String getBillNumber() {
		return this.billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getBillStatus() {
		return this.billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public Double getShouldCharge() {
		return this.shouldCharge;
	}

	public void setShouldCharge(Double shouldCharge) {
		this.shouldCharge = shouldCharge;
	}

	public Double getActualCharge() {
		return this.actualCharge;
	}

	public void setActualCharge(Double actualCharge) {
		this.actualCharge = actualCharge;
	}

	public Double getOddChange() {
		return this.oddChange;
	}

	public void setOddChange(Double oddChange) {
		this.oddChange = oddChange;
	}

	public Timestamp getPaymentTime() {
		return this.paymentTime;
	}

	public void setPaymentTime(Timestamp paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Timestamp getRefundTime() {
		return this.refundTime;
	}

	public void setRefundTime(Timestamp refundTime) {
		this.refundTime = refundTime;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

}