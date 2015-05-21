package com.llx.ocsys.entity;

/**
 * TbUserInformation entity. @author MyEclipse Persistence Tools
 */

public class TbUserInformation implements java.io.Serializable {

	// Fields

	private Integer userInfoId;
	private String userNumber;
	private String userSex;
	private Integer userAge;
	private String userPhone;
	private String userAddress;
	private String informationState;

	// Constructors

	/** default constructor */
	public TbUserInformation() {
	}

	/** minimal constructor */
	public TbUserInformation(String userNumber, String informationState) {
		this.userNumber = userNumber;
		this.informationState = informationState;
	}

	/** full constructor */
	public TbUserInformation(String userNumber, String userSex,
			Integer userAge, String userPhone, String userAddress,
			String informationState) {
		this.userNumber = userNumber;
		this.userSex = userSex;
		this.userAge = userAge;
		this.userPhone = userPhone;
		this.userAddress = userAddress;
		this.informationState = informationState;
	}

	// Property accessors

	public Integer getUserInfoId() {
		return this.userInfoId;
	}

	public void setUserInfoId(Integer userInfoId) {
		this.userInfoId = userInfoId;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserSex() {
		return this.userSex;
	}

	public void setUserSex(String userSex) {
		this.userSex = userSex;
	}

	public Integer getUserAge() {
		return this.userAge;
	}

	public void setUserAge(Integer userAge) {
		this.userAge = userAge;
	}

	public String getUserPhone() {
		return this.userPhone;
	}

	public void setUserPhone(String userPhone) {
		this.userPhone = userPhone;
	}

	public String getUserAddress() {
		return this.userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	public String getInformationState() {
		return this.informationState;
	}

	public void setInformationState(String informationState) {
		this.informationState = informationState;
	}

}