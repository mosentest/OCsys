package com.llx.ocsys.entity;

import java.sql.Timestamp;

/**
 * TbUserLog entity. @author MyEclipse Persistence Tools
 */

public class TbUserLog implements java.io.Serializable {

	// Fields

	private Integer logId;
	private String userNumber;
	private Timestamp lastLoginTime;
	private Timestamp lastLogoutTime;

	// Constructors

	/** default constructor */
	public TbUserLog() {
	}

	/** full constructor */
	public TbUserLog(String userNumber, Timestamp lastLoginTime,
			Timestamp lastLogoutTime) {
		this.userNumber = userNumber;
		this.lastLoginTime = lastLoginTime;
		this.lastLogoutTime = lastLogoutTime;
	}

	// Property accessors

	public Integer getLogId() {
		return this.logId;
	}

	public void setLogId(Integer logId) {
		this.logId = logId;
	}

	public String getUserNumber() {
		return this.userNumber;
	}

	public void setUserNumber(String userNumber) {
		this.userNumber = userNumber;
	}

	public Timestamp getLastLoginTime() {
		return this.lastLoginTime;
	}

	public void setLastLoginTime(Timestamp lastLoginTime) {
		this.lastLoginTime = lastLoginTime;
	}

	public Timestamp getLastLogoutTime() {
		return this.lastLogoutTime;
	}

	public void setLastLogoutTime(Timestamp lastLogoutTime) {
		this.lastLogoutTime = lastLogoutTime;
	}

}