package com.llx.ocsys.entity;

import java.sql.Timestamp;

public class OPIInformation {

	private String billNumber;
	private String patientName;
	private String patientSex;
	private Integer patientAge;
	private String registrationNumber;
	private String patientType;
	private Double shouldCharge;
	private Double actualCharge;
	private Double oddChange;
	private String settlementMethod;
	private Timestamp paymentTime;
	private Timestamp refundTime;
	private String billStatus;
	private String userNumber;

	public OPIInformation() {

	}

	public String getBillNumber() {
		return billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public String getPatientName() {
		return patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Integer getPatientAge() {
		return patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}

	public String getRegistrationNumber() {
		return registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getPatientType() {
		return patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public Double getShouldCharge() {
		return shouldCharge;
	}

	public void setShouldCharge(Double shouldCharge) {
		this.shouldCharge = shouldCharge;
	}

	public Double getActualCharge() {
		return actualCharge;
	}

	public void setActualCharge(Double actualCharge) {
		this.actualCharge = actualCharge;
	}

	public Double getOddChange() {
		return oddChange;
	}

	public void setOddChange(Double oddChange) {
		this.oddChange = oddChange;
	}

	public String getSettlementMethod() {
		return settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public Timestamp getPaymentTime() {
		return paymentTime;
	}

	public void setPaymentTime(Timestamp paymentTime) {
		this.paymentTime = paymentTime;
	}

	public Timestamp getRefundTime() {
		return refundTime;
	}

	public void setRefundTime(Timestamp refundTime) {
		this.refundTime = refundTime;
	}

	public String getBillStatus() {
		return billStatus;
	}

	public void setBillStatus(String billStatus) {
		this.billStatus = billStatus;
	}

	public String getUserNumber() {
		return userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

}
