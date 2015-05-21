package com.llx.ocsys.entity;

/**
 * TbPatientType entity. @author MyEclipse Persistence Tools
 */

public class TbPatientType implements java.io.Serializable {

	// Fields

	private Integer patientTypeId;
	private String patientType;
	private Double patientChargeRatio;

	// Constructors

	/** default constructor */
	public TbPatientType() {
	}

	/** full constructor */
	public TbPatientType(String patientType, Double patientChargeRatio) {
		this.patientType = patientType;
		this.patientChargeRatio = patientChargeRatio;
	}

	// Property accessors

	public Integer getPatientTypeId() {
		return this.patientTypeId;
	}

	public void setPatientTypeId(Integer patientTypeId) {
		this.patientTypeId = patientTypeId;
	}

	public String getPatientType() {
		return this.patientType;
	}

	public void setPatientType(String patientType) {
		this.patientType = patientType;
	}

	public Double getPatientChargeRatio() {
		return this.patientChargeRatio;
	}

	public void setPatientChargeRatio(Double patientChargeRatio) {
		this.patientChargeRatio = patientChargeRatio;
	}

}