package com.llx.ocsys.entity;

import java.sql.Timestamp;

/**
 * TbManageRegistration entity. @author MyEclipse Persistence Tools
 */

public class TbManageRegistration implements java.io.Serializable {

	// Fields

	private Integer registrationId;
	private String registrationNumber;
	private String registrationStatus;
	private String patientName;
	private String patientSex;
	private Integer patientAge;
	private String patientType;
	private Timestamp registerTime;
	private String settlementMethod;

	// Constructors

	/** default constructor */
	public TbManageRegistration() {
	}

	/** minimal constructor */
	public TbManageRegistration(String registrationNumber,
			String registrationStatus, String patientName, String patientSex) {
		this.registrationNumber = registrationNumber;
		this.registrationStatus = registrationStatus;
		this.patientName = patientName;
		this.patientSex = patientSex;
	}

	/** full constructor */
	public TbManageRegistration(String registrationNumber,
			String registrationStatus, String patientName, String patientSex,
			Integer patientAge, String patientType, Timestamp registerTime,
			String settlementMethod) {
		this.registrationNumber = registrationNumber;
		this.registrationStatus = registrationStatus;
		this.patientName = patientName;
		this.patientSex = patientSex;
		this.patientAge = patientAge;
		this.patientType = patientType;
		this.registerTime = registerTime;
		this.settlementMethod = settlementMethod;
	}

	// Property accessors

	public Integer getRegistrationId() {
		return this.registrationId;
	}

	public void setRegistrationId(Integer registrationId) {
		this.registrationId = registrationId;
	}

	public String getRegistrationNumber() {
		return this.registrationNumber;
	}

	public void setRegistrationNumber(String registrationNumber) {
		this.registrationNumber = registrationNumber;
	}

	public String getRegistrationStatus() {
		return this.registrationStatus;
	}

	public void setRegistrationStatus(String registrationStatus) {
		this.registrationStatus = registrationStatus;
	}

	public String getPatientName() {
		return this.patientName;
	}

	public void setPatientName(String patientName) {
		this.patientName = patientName;
	}

	public String getPatientSex() {
		return this.patientSex;
	}

	public void setPatientSex(String patientSex) {
		this.patientSex = patientSex;
	}

	public Integer getPatientAge() {
		return this.patientAge;
	}

	public void setPatientAge(Integer patientAge) {
		this.patientAge = patientAge;
	}

	public String getPatientType() {
		return this.patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public Timestamp getRegisterTime() {
		return this.registerTime;
	}

	public void setRegisterTime(Timestamp registerTime) {
		this.registerTime = registerTime;
	}

	public String getSettlementMethod() {
		return this.settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

}