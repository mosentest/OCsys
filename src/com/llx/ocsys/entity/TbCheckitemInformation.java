package com.llx.ocsys.entity;

/**
 * TbCheckitemInformation entity. @author MyEclipse Persistence Tools
 */

public class TbCheckitemInformation implements java.io.Serializable {

	// Fields

	private Integer checkitemId;
	private String checkitemNumber;
	private String checkitemName;
	private String checkitemUnit;
	private Double checkitemFee;

	// Constructors

	/** default constructor */
	public TbCheckitemInformation() {
	}

	/** full constructor */
	public TbCheckitemInformation(String checkitemNumber, String checkitemName,
			String checkitemUnit, Double checkitemFee) {
		this.checkitemNumber = checkitemNumber;
		this.checkitemName = checkitemName;
		this.checkitemUnit = checkitemUnit;
		this.checkitemFee = checkitemFee;
	}

	// Property accessors

	public Integer getCheckitemId() {
		return this.checkitemId;
	}

	public void setCheckitemId(Integer checkitemId) {
		this.checkitemId = checkitemId;
	}

	public String getCheckitemNumber() {
		return this.checkitemNumber;
	}

	public void setCheckitemNumber(String checkitemNumber) {
		this.checkitemNumber = checkitemNumber;
	}

	public String getCheckitemName() {
		return this.checkitemName;
	}

	public void setCheckitemName(String checkitemName) {
		this.checkitemName = checkitemName;
	}

	public String getCheckitemUnit() {
		return this.checkitemUnit;
	}

	public void setCheckitemUnit(String checkitemUnit) {
		this.checkitemUnit = checkitemUnit;
	}

	public Double getCheckitemFee() {
		return this.checkitemFee;
	}

	public void setCheckitemFee(Double checkitemFee) {
		this.checkitemFee = checkitemFee;
	}

}