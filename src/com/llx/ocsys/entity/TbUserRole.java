package com.llx.ocsys.entity;

/**
 * TbUserRole entity. @author MyEclipse Persistence Tools
 */

public class TbUserRole implements java.io.Serializable {

	// Fields

	private Integer identityId;
	private String userNumber;
	private String identityName;
	private String identityPower;

	// Constructors

	/** default constructor */
	public TbUserRole() {
	}

	/** full constructor */
	public TbUserRole(String userNumber, String identityName,
			String identityPower) {
		this.userNumber = userNumber;
		this.identityName = identityName;
		this.identityPower = identityPower;
	}

	// Property accessors

	public Integer getIdentityId() {
		return this.identityId;
	}

	public void setIdentityId(Integer identityId) {
		this.identityId = identityId;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getIdentityName() {
		return this.identityName;
	}

	public void setIdentityName(String identityName) {
		this.identityName = identityName;
	}

	public String getIdentityPower() {
		return this.identityPower;
	}

	public void setIdentityPower(String identityPower) {
		this.identityPower = identityPower;
	}

}