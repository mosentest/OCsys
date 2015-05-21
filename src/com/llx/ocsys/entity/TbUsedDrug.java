package com.llx.ocsys.entity;

/**
 * TbUsedDrug entity. @author MyEclipse Persistence Tools
 */

public class TbUsedDrug implements java.io.Serializable {

	// Fields

	private Integer usedDrugId;
	private String usedDrugNumber;
	private String usedDrugName;
	private Double usedDrugFee;
	private Integer usedDrugAmount;
	private Double usedDrugSubtotal;
	private String billNumber;
	private TbBillsInformation billsInformation;

	// Constructors

	/** default constructor */
	public TbUsedDrug() {
	}

	/** full constructor */
	public TbUsedDrug(String usedDrugNumber, String usedDrugName,
			Double usedDrugFee, Integer usedDrugAmount,
			Double usedDrugSubtotal, String billNumber) {
		this.usedDrugNumber = usedDrugNumber;
		this.usedDrugName = usedDrugName;
		this.usedDrugFee = usedDrugFee;
		this.usedDrugAmount = usedDrugAmount;
		this.usedDrugSubtotal = usedDrugSubtotal;
		this.billNumber = billNumber;
	}

	// Property accessors

	public Integer getUsedDrugId() {
		return this.usedDrugId;
	}

	public void setUsedDrugId(Integer usedDrugId) {
		this.usedDrugId = usedDrugId;
	}

	public String getUsedDrugNumber() {
		return this.usedDrugNumber;
	}

	public void setUsedDrugNumber(String usedDrugNumber) {
		this.usedDrugNumber = usedDrugNumber;
	}

	public String getUsedDrugName() {
		return this.usedDrugName;
	}

	public void setUsedDrugName(String usedDrugName) {
		this.usedDrugName = usedDrugName;
	}

	public Double getUsedDrugFee() {
		return this.usedDrugFee;
	}

	public void setUsedDrugFee(Double usedDrugFee) {
		this.usedDrugFee = usedDrugFee;
	}

	public Integer getUsedDrugAmount() {
		return this.usedDrugAmount;
	}

	public void setUsedDrugAmount(Integer usedDrugAmount) {
		this.usedDrugAmount = usedDrugAmount;
	}

	public Double getUsedDrugSubtotal() {
		return this.usedDrugSubtotal;
	}

	public void setUsedDrugSubtotal(Double usedDrugSubtotal) {
		this.usedDrugSubtotal = usedDrugSubtotal;
	}

	public String getBillNumber() {
		return this.billNumber;
	}

	public void setBillNumber(String billNumber) {
		this.billNumber = billNumber;
	}

	public void setTbBillsInformation(TbBillsInformation billsInformation) {
		this.billsInformation = billsInformation;
		
	}

}