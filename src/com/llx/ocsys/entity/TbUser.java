package com.llx.ocsys.entity;

/**
 * TbUser entity. @author MyEclipse Persistence Tools
 */

public class TbUser implements java.io.Serializable {

	// Fields

	private Integer userId;
	private String userNumber;
	private String userName;
	private String userPassword;

	// Constructors

	/** default constructor */
	public TbUser() {
	}

	/** full constructor */
	public TbUser(String userNumber, String userName, String userPassword) {
		this.userNumber = userNumber;
		this.userName = userName;
		this.userPassword = userPassword;
	}

	// Property accessors

	public Integer getUserId() {
		return this.userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public String getUserName() {
		return this.userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPassword() {
		return this.userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}

}