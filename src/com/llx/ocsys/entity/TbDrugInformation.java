package com.llx.ocsys.entity;

/**
 * TbDrugInformation entity. @author MyEclipse Persistence Tools
 */

public class TbDrugInformation implements java.io.Serializable {

	// Fields

	private Integer drugId;
	private String drugNumber;
	private String drugName;
	private String drugSpecifications;
	private String drugUnit;
	private Double drugFee;

	// Constructors

	/** default constructor */
	public TbDrugInformation() {
	}

	/** full constructor */
	public TbDrugInformation(String drugNumber, String drugName,
			String drugSpecifications, String drugUnit, Double drugFee) {
		this.drugNumber = drugNumber;
		this.drugName = drugName;
		this.drugSpecifications = drugSpecifications;
		this.drugUnit = drugUnit;
		this.drugFee = drugFee;
	}

	// Property accessors

	public Integer getDrugId() {
		return this.drugId;
	}

	public void setDrugId(Integer drugId) {
		this.drugId = drugId;
	}

	public String getDrugNumber() {
		return this.drugNumber;
	}

	public void setDrugNumber(String drugNumber) {
		this.drugNumber = drugNumber;
	}

	public String getDrugName() {
		return this.drugName;
	}

	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}

	public String getDrugSpecifications() {
		return this.drugSpecifications;
	}

	public void setDrugSpecifications(String drugSpecifications) {
		this.drugSpecifications = drugSpecifications;
	}

	public String getDrugUnit() {
		return this.drugUnit;
	}

	public void setDrugUnit(String drugUnit) {
		this.drugUnit = drugUnit;
	}

	public Double getDrugFee() {
		return this.drugFee;
	}

	public void setDrugFee(Double drugFee) {
		this.drugFee = drugFee;
	}

}