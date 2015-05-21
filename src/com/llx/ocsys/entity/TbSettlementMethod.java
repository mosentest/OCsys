package com.llx.ocsys.entity;

/**
 * TbSettlementMethod entity. @author MyEclipse Persistence Tools
 */

public class TbSettlementMethod implements java.io.Serializable {

	// Fields

	private Integer settlementMethodId;
	private String settlementMethod;
	private Integer settlementChargeRatio;

	// Constructors

	/** default constructor */
	public TbSettlementMethod() {
	}

	/** minimal constructor */
	public TbSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	/** full constructor */
	public TbSettlementMethod(String settlementMethod,
			Integer settlementChargeRatio) {
		this.settlementMethod = settlementMethod;
		this.settlementChargeRatio = settlementChargeRatio;
	}

	// Property accessors

	public Integer getSettlementMethodId() {
		return this.settlementMethodId;
	}

	public void setSettlementMethodId(Integer settlementMethodId) {
		this.settlementMethodId = settlementMethodId;
	}

	public String getSettlementMethod() {
		return this.settlementMethod;
	}

	public void setSettlementMethod(String settlementMethod) {
		this.settlementMethod = settlementMethod;
	}

	public Integer getSettlementChargeRatio() {
		return this.settlementChargeRatio;
	}

	public void setSettlementChargeRatio(Integer settlementChargeRatio) {
		this.settlementChargeRatio = settlementChargeRatio;
	}

}