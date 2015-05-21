package com.llx.ocsys.action;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import com.llx.ocsys.DAO.TbBillsInformationDAO;
import com.llx.ocsys.DAO.TbCheckitemInformationDAO;
import com.llx.ocsys.DAO.TbDrugInformationDAO;
import com.llx.ocsys.DAO.TbManageRegistrationDAO;
import com.llx.ocsys.DAO.TbTempCheckitemDAO;
import com.llx.ocsys.DAO.TbTempDrugDAO;
import com.llx.ocsys.DAO.TbUsedCheckitemDAO;
import com.llx.ocsys.DAO.TbUsedDrugDAO;
import com.llx.ocsys.entity.OPIInformation;
import com.llx.ocsys.entity.TbBillsInformation;
import com.llx.ocsys.entity.TbCheckitemInformation;
import com.llx.ocsys.entity.TbDrugInformation;
import com.llx.ocsys.entity.TbManageRegistration;
import com.llx.ocsys.entity.TbTempCheckitem;
import com.llx.ocsys.entity.TbTempDrug;
import com.llx.ocsys.entity.TbUsedCheckitem;
import com.llx.ocsys.entity.TbUsedDrug;

public class ChargeAction extends BaseAction {

	private String temp_Registration_Number;
	private String invoice_Number;
	private String type;

	private TbManageRegistration manageRegistration;
	private TbTempDrug tempDrug;
	private TbUsedDrug usedDrug;
	private TbTempCheckitem tempCheckitem;
	private TbUsedCheckitem usedCheckitem;
	private TbBillsInformation billsInformation;
	private OPIInformation opiInformation;

	private List<TbManageRegistration> manageRegistrationList;
	private List<TbManageRegistration> personalRegistration;
	private List<TbDrugInformation> drugInformationList;
	private List<TbCheckitemInformation> checkitemInformationList;
	private List<TbTempDrug> tempDrugList;
	private List<TbUsedDrug> usedDrugList;
	private List<TbTempCheckitem> tempCheckItemList;
	private List<TbUsedCheckitem> usedCheckItemList;
	private List<TbBillsInformation> billsInformationList;
	private List<OPIInformation> opiInformationList;

	private TbManageRegistrationDAO manageRegistrationDAO = new TbManageRegistrationDAO();
	private TbDrugInformationDAO drugInformationDAO = new TbDrugInformationDAO();
	private TbCheckitemInformationDAO checkitemInformationDAO = new TbCheckitemInformationDAO();
	private TbTempDrugDAO tempDrugDAO = new TbTempDrugDAO();
	private TbUsedDrugDAO usedDrugDAO = new TbUsedDrugDAO();
	private TbTempCheckitemDAO tempCheckitemDAO = new TbTempCheckitemDAO();
	private TbUsedCheckitemDAO usedCheckitemDAO = new TbUsedCheckitemDAO();
	private TbBillsInformationDAO billsInformationDAO = new TbBillsInformationDAO();

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public TbManageRegistration getManageRegistration() {
		return manageRegistration;
	}

	public void setManageRegistration(TbManageRegistration manageRegistration) {
		this.manageRegistration = manageRegistration;
	}

	public TbTempDrug getTempDrug() {
		return tempDrug;
	}

	public void setTempDrug(TbTempDrug tempDrug) {
		this.tempDrug = tempDrug;
	}

	public TbUsedDrug getUsedDrug() {
		return usedDrug;
	}

	public void setUsedDrug(TbUsedDrug usedDrug) {
		this.usedDrug = usedDrug;
	}

	public TbTempCheckitem getTempCheckitem() {
		return tempCheckitem;
	}

	public void setTempCheckitem(TbTempCheckitem tempCheckitem) {
		this.tempCheckitem = tempCheckitem;
	}

	public TbUsedCheckitem getUsedCheckitem() {
		return usedCheckitem;
	}

	public void setUsedCheckitem(TbUsedCheckitem usedCheckitem) {
		this.usedCheckitem = usedCheckitem;
	}

	public TbBillsInformation getBillsInformation() {
		return billsInformation;
	}

	public void setBillsInformation(TbBillsInformation billsInformation) {
		this.billsInformation = billsInformation;
	}

	public OPIInformation getOpiInformation() {
		return opiInformation;
	}

	public void setOpiInformation(OPIInformation opiInformation) {
		this.opiInformation = opiInformation;
	}

	public List<TbManageRegistration> getManageRegistrationList() {
		return manageRegistrationList;
	}

	public void setManageRegistrationList(
			List<TbManageRegistration> manageRegistrationList) {
		this.manageRegistrationList = manageRegistrationList;
	}

	public List<TbManageRegistration> getPersonalRegistration() {
		return personalRegistration;
	}

	public void setPersonalRegistration(
			List<TbManageRegistration> personalRegistration) {
		this.personalRegistration = personalRegistration;
	}

	public List<TbDrugInformation> getDrugInformationList() {
		return drugInformationList;
	}

	public void setDrugInformationList(
			List<TbDrugInformation> drugInformationList) {
		this.drugInformationList = drugInformationList;
	}

	public List<TbCheckitemInformation> getCheckitemInformationList() {
		return checkitemInformationList;
	}

	public void setCheckitemInformationList(
			List<TbCheckitemInformation> checkitemInformationList) {
		this.checkitemInformationList = checkitemInformationList;
	}

	public List<TbTempDrug> getTempDrugList() {
		return tempDrugList;
	}

	public void setTempDrugList(List<TbTempDrug> tempDrugList) {
		this.tempDrugList = tempDrugList;
	}

	public List<TbTempCheckitem> getTempCheckItemList() {
		return tempCheckItemList;
	}

	public void setTempCheckItemList(List<TbTempCheckitem> tempCheckItemList) {
		this.tempCheckItemList = tempCheckItemList;
	}

	public List<TbBillsInformation> getBillsInformationList() {
		return billsInformationList;
	}

	public void setBillsInformationList(
			List<TbBillsInformation> billsInformationList) {
		this.billsInformationList = billsInformationList;
	}

	public List<OPIInformation> getOpiInformationList() {
		return opiInformationList;
	}

	public void setOpiInformationList(List<OPIInformation> opiInformationList) {
		this.opiInformationList = opiInformationList;
	}

	// 办理挂号
	public String manageRegistration() throws Exception {
		try {
			Calendar instance = Calendar.getInstance();
			String temp = Long.toString(instance.getTimeInMillis());
			manageRegistration.setRegistrationNumber(temp);
			manageRegistration.setRegistrationStatus("0");
			Timestamp thisMoment = getThisMoment();
			manageRegistration.setRegisterTime(thisMoment);
			manageRegistrationDAO.save(manageRegistration);
			return SUCCESS;
		} catch (Exception save_Registration_Error) {
			save_Registration_Error.printStackTrace();
			return ERROR;
		}
	}

	// 显示挂号单
	public String showRegistrationInformation() throws Exception {
		try {
			// manageRegistrationList = manageRegistrationDAO.findAll();
			// manageRegistrationList =
			// manageRegistrationDAO.findByProperty("registrationStatus",
			// "诊疗中");
			manageRegistrationList = manageRegistrationDAO
					.findByRegistrationStatus("0");
			pushSession("manageRegistrationList", manageRegistrationList);
			return SUCCESS;
		} catch (Exception show_Registration_Error) {
			show_Registration_Error.printStackTrace();
			return ERROR;
		}
	}

	// 浏览未结算处方单
	public String browseRegistrationInformation() throws Exception {
		try {
			temp_Registration_Number = manageRegistration
					.getRegistrationNumber();
		} catch (Exception request_registration_number) {
			temp_Registration_Number = (String) pullSession("registration_number");
		}

		findInformation();

		personalRegistration = manageRegistrationDAO
				.findByRegistrationNumber(temp_Registration_Number);
		pushSession("personalRegistration", personalRegistration);
		return SUCCESS;
	}

	// 就诊结算
	public String medicalCharge() throws Exception {
		try {

			browseRegistrationInformation();
			// pushRequest("type", type);

			// if (personalRegistration.get(0).getTbBillsInformations() == null)
			// {
			// Calendar instance = Calendar.getInstance();
			// String temp = Long.toString(instance.getTimeInMillis());
			// temp = temp.substring(temp.length() - 8, temp.length());
			// System.out.println("===============================");
			// manageRegistration = personalRegistration.get(0);
			// System.out.println("-----------------------------");
			// billsInformation.setBillNumber(temp);
			// manageRegistration.setTbBillsInformations(billsInformation);
			// }

			return SUCCESS;
		} catch (Exception medical_Charge_Error) {
			medical_Charge_Error.printStackTrace();
			return ERROR;
		}
	}

	// 添加临时用药
	public String addTempDurg() throws Exception {
		return addDurg();
	}

	// 添加临时检查项
	public String addTempCheckitem() throws Exception {
		return addCheckitem();
	}

	// 完成结算
	public String finishCharge() throws Exception {
		try {
			/*
			 * // 查找数据库中挂号单registration_number的用药和检查项信息 String
			 * registration_number = (String)
			 * pullSession("registration_number"); tempDrugList = tempDrugDAO
			 * .findByRegistrationNumber(registration_number); tempCheckItemList
			 * = tempCheckitemDAO
			 * .findByRegistrationNumber(registration_number); // 生成发票单号
			 * Calendar instance = Calendar.getInstance(); invoice_Number =
			 * "OPI" + Long.toString(instance.getTimeInMillis()).substring(1);
			 * // System.out.println(invoice_Number);
			 * billsInformation.setBillNumber(invoice_Number);
			 * 
			 * // 如果挂号单registration_number中拥有用药信息就进行正式保存，并删除临时的用药信息。 for (int i
			 * = 0; i < tempDrugList.size() && !tempDrugList.isEmpty(); i++) {
			 * try { TbUsedDrug drug = new TbUsedDrug();
			 * drug.setBillNumber(invoice_Number);
			 * drug.setUsedDrugNumber(tempDrugList.get(i) .getTempDrugNumber());
			 * drug.setUsedDrugName(tempDrugList.get(i).getTempDrugName());
			 * drug.setUsedDrugFee(tempDrugList.get(i).getTempDrugFee());
			 * drug.setUsedDrugAmount(tempDrugList.get(i) .getTempDrugAmount());
			 * drug.setUsedDrugSubtotal(tempDrugList.get(i)
			 * .getTempDrugSubtotal()); usedDrugDAO.save(drug);
			 * tempDrugDAO.delete(tempDrugList.get(i)); } catch (Exception
			 * save_Used_Drug_Error) { save_Used_Drug_Error.printStackTrace();
			 * System.out.println("保存第" + i + "行用药记录时出错！"); return ERROR; } }
			 * 
			 * // 如果挂号单registration_number中拥有检查项信息就进行正式保存，并删除临时的检查项信息。 for (int
			 * i = 0; i < tempCheckItemList.size() &&
			 * !tempCheckItemList.isEmpty(); i++) { try { TbUsedCheckitem
			 * checkItem = new TbUsedCheckitem();
			 * checkItem.setBillNumber(invoice_Number);
			 * checkItem.setUsedCheckitemNumber(tempCheckItemList.get(i)
			 * .getTempCheckitemNumber());
			 * checkItem.setUsedCheckitemName(tempCheckItemList.get(i)
			 * .getTempCheckitemName());
			 * checkItem.setUsedCheckitemFee(tempCheckItemList.get(i)
			 * .getTempCheckitemFee());
			 * checkItem.setUsedCheckitemAmount(tempCheckItemList.get(i)
			 * .getTempCheckitemAmount());
			 * checkItem.setUsedCheckitemSubtotal(tempCheckItemList.get(i)
			 * .getTempCheckitemSubtotal()); usedCheckitemDAO.save(checkItem);
			 * tempCheckitemDAO.delete(tempCheckItemList.get(i)); } catch
			 * (Exception save_Used_CheckItem_Error) {
			 * save_Used_CheckItem_Error.printStackTrace();
			 * System.out.println("保存第" + i + "行检查项记录时出错！"); return ERROR; } }
			 */
			TbBillsInformation temp_bill = new TbBillsInformation();
			temp_bill = saveBillsUsedInformation(temp_bill);
			double actualCharge = billsInformation.getActualCharge();
			double shouldCharge = billsInformation.getShouldCharge();
			double oddCharge = actualCharge - shouldCharge;
			temp_bill.setActualCharge(actualCharge);
			temp_bill.setShouldCharge(shouldCharge);
			temp_bill.setOddChange(oddCharge);

			// 补充发票单上其他信息
			// billsInformation.setOddChange(billsInformation.getActualCharge());
			// billsInformation.setShouldCharge(billsInformation.getShouldCharge());
			Timestamp thisMoment = getThisMoment();
			temp_bill.setPaymentTime(thisMoment);
			temp_bill.setBillStatus("1");
			billsInformationDAO.save(temp_bill);

			TbManageRegistration personalRegistration = (TbManageRegistration) manageRegistrationDAO
					.findByRegistrationNumber(temp_Registration_Number).get(0);
			personalRegistration.setRegistrationStatus("1");
			manageRegistrationDAO.attachDirty(personalRegistration);

			return SUCCESS;

		} catch (Exception finish_Charge_Error) {
			finish_Charge_Error.printStackTrace();
			return ERROR;
		}

	}

	// 显示已结算发票单信息
	public String showBillsInformation() throws Exception {
		try {
			// System.out.println("============");
			// type = (String) pullSession("type");
			try {
				if (type.equals("-1"))
					billsInformationList = billsInformationDAO
							.findByBillStatus("1");
			} catch (Exception e) {
				billsInformationList = billsInformationDAO
						.findByBillStatus("1");
			}

			opiInformationList = new ArrayList<OPIInformation>();
			while (!billsInformationList.isEmpty()) {

				OPIInformation opiTemp = new OPIInformation();
				manageRegistration = (TbManageRegistration) manageRegistrationDAO
						.findByRegistrationNumber(
								billsInformationList.get(0)
										.getRegistrationNumber()).get(0);
				billsInformation = billsInformationList.get(0);

				opiTemp.setBillNumber(billsInformation.getBillNumber());
				opiTemp.setPatientName(manageRegistration.getPatientName());
				opiTemp.setPatientSex(manageRegistration.getPatientSex());
				opiTemp.setPatientAge(manageRegistration.getPatientAge());
				opiTemp.setRegistrationNumber(manageRegistration
						.getRegistrationNumber());
				opiTemp.setPatientType(manageRegistration.getPatientType());
				opiTemp.setShouldCharge(billsInformation.getShouldCharge());
				opiTemp.setActualCharge(billsInformation.getActualCharge());
				opiTemp.setOddChange(billsInformation.getOddChange());
				opiTemp.setSettlementMethod(manageRegistration
						.getSettlementMethod());
				opiTemp.setPaymentTime(billsInformation.getPaymentTime());
				// opiTemp.setUserNumber();

				// System.out.println(opiTemp.getBillNumber());

				opiInformationList.add(opiTemp);
				billsInformationList.remove(0);

			}

			pushSession("opiInformationList", opiInformationList);

			// billsInformationList = billsInformationDAO.findByBillStatus("1");

			// opiInformationList
			//
			// for (int i = 0; manageRegistrationList.isEmpty()
			// || billsInformationList.isEmpty(); i++) {
			// String match_1 = manageRegistrationList.get(i)
			// .getRegistrationNumber();
			// String match_2 = billsInformationList.get(i)
			// .getRegistrationNumber();
			// if (match_1 == match_2) {
			// OPIInformation temp = new OPIInformation();
			// temp.setBillNumber(billsInformationList.get(i)
			// .getBillNumber());
			// temp.setPatientName(manageRegistrationList.get(i)
			// .getPatientName());
			// temp.setPatientSex(manageRegistrationList.get(i)
			// .getPatientSex());
			// temp.setRegistrationNumber(billsInformationList.get(i)
			// .getRegistrationNumber());
			// temp.setPatientType(manageRegistrationList.get(i)
			// .getPatientType());
			// temp.setShouldCharge(billsInformationList.get(i)
			// .getShouldCharge());
			// temp.setSettlementMethod(manageRegistrationList.get(i)
			// .getSettlementMethod());
			// temp.setPaymentTime(billsInformationList.get(i)
			// .getPaymentTime());
			// temp.setUserNumber(billsInformationList.get(i)
			// .getUserNumber());
			// }
			// }
			return SUCCESS;
		} catch (Exception show_Bills_Information_Error) {
			show_Bills_Information_Error.printStackTrace();
			return ERROR;
		}
	}

	// 浏览已结算处方单
	public String browseBillsInformation() throws Exception {
		try {
			opiInformationList = (List<OPIInformation>) pullSession("opiInformationList");

			// System.out.println(opiInformationList.size());

			temp_Registration_Number = opiInformation.getRegistrationNumber();
			String temp_Bills_Number = opiInformation.getBillNumber();
//			System.out.println(temp_Bills_Number);
			// System.out.println(opiInformation.getRegistrationNumber());
			// System.out.println(opiInformationList.get(0).getRegistrationNumber());
			if (temp_Bills_Number == null || temp_Bills_Number.equals("")) {
				for (int i = 0; i < opiInformationList.size(); i++) {
					if (opiInformationList.get(i).getRegistrationNumber()
							.equals(temp_Registration_Number)) {
						opiInformation = opiInformationList.get(i);
						// System.out.println(opiInformation.getActualCharge());
						// System.out.println(opiInformation.getShouldCharge());
						pushSession("opiInformation", opiInformation);
					}
				}
			} else {
				for (int i = 0; i < opiInformationList.size(); i++) {
					if ((opiInformationList.get(i).getRegistrationNumber()
							.equals(temp_Registration_Number))
							&& (opiInformationList.get(i).getBillNumber()
									.equals(temp_Bills_Number))) {
						opiInformation = opiInformationList.get(i);
						// System.out.println(opiInformation.getActualCharge());
						// System.out.println(opiInformation.getShouldCharge());
						pushSession("opiInformation", opiInformation);
					}
				}
			}

			// System.out.println(temp_Registration_Number);

			drugInformationList = drugInformationDAO.findAll();
			checkitemInformationList = checkitemInformationDAO.findAll();
			tempDrugList = tempDrugDAO
					.findByRegistrationNumber(temp_Registration_Number);
			tempCheckItemList = tempCheckitemDAO
					.findByRegistrationNumber(temp_Registration_Number);
			usedDrugList = usedDrugDAO.findByBillNumber(opiInformation
					.getBillNumber());
			usedCheckItemList = usedCheckitemDAO
					.findByBillNumber(opiInformation.getBillNumber());

			if (!tempDrugList.isEmpty()) {
				for (int i = 0; i < tempDrugList.size(); i++) {
					tempDrugDAO.delete(tempDrugList.get(i));
				}
			}
			if (!tempCheckItemList.isEmpty()) {
				for (int i = 0; i < tempCheckItemList.size(); i++) {
					tempCheckitemDAO.delete(tempCheckItemList.get(i));
				}
			}
			if (!usedDrugList.isEmpty()) {
				for (int i = 0; i < usedDrugList.size(); i++) {
					TbTempDrug tempDrug = new TbTempDrug();
					tempDrug.setRegistrationNumber(temp_Registration_Number);
					tempDrug.setTempDrugNumber(usedDrugList.get(i)
							.getUsedDrugNumber());
					tempDrug.setTempDrugName(usedDrugList.get(i)
							.getUsedDrugName());
					tempDrug.setTempDrugFee(usedDrugList.get(i)
							.getUsedDrugFee());
					tempDrug.setTempDrugAmount(usedDrugList.get(i)
							.getUsedDrugAmount());
					tempDrug.setTempDrugSubtotal(usedDrugList.get(i)
							.getUsedDrugSubtotal());
					tempDrugDAO.save(tempDrug);
				}
			}
			if (!usedCheckItemList.isEmpty()) {
				for (int i = 0; i < usedCheckItemList.size(); i++) {
					TbTempCheckitem tempCheckitem = new TbTempCheckitem();
					tempCheckitem
							.setRegistrationNumber(temp_Registration_Number);
					tempCheckitem.setTempCheckitemNumber(usedCheckItemList.get(
							i).getUsedCheckitemNumber());
					tempCheckitem.setTempCheckitemName(usedCheckItemList.get(i)
							.getUsedCheckitemName());
					tempCheckitem.setTempCheckitemFee(usedCheckItemList.get(i)
							.getUsedCheckitemFee());
					tempCheckitem.setTempCheckitemAmount(usedCheckItemList.get(
							i).getUsedCheckitemAmount());
					tempCheckitem.setTempCheckitemSubtotal(usedCheckItemList
							.get(i).getUsedCheckitemSubtotal());
					tempCheckitemDAO.save(tempCheckitem);
				}
			}

			tempDrugList = tempDrugDAO
					.findByRegistrationNumber(temp_Registration_Number);
			tempCheckItemList = tempCheckitemDAO
					.findByRegistrationNumber(temp_Registration_Number);

			pushSession("drugInformationsList", drugInformationList);
			pushSession("checkitemInformationList", checkitemInformationList);
			pushSession("tempDrugList", tempDrugList);
			pushSession("tempCheckItemList", tempCheckItemList);

			return SUCCESS;
		} catch (Exception browse_Bills_Information_Error) {
			browse_Bills_Information_Error.printStackTrace();
			return ERROR;
		}

	}

	// 办理退费
	public String medicalRefund() throws Exception {
		try {
			browseBillsInformation();
			// if(type.equals("")||type==null) pushRequest("type", "2");
			return SUCCESS;
		} catch (Exception medical_Refund_Error) {
			medical_Refund_Error.printStackTrace();
			return ERROR;
		}
	}

	// 退款添加用药
	public String addUsedDurg() throws Exception {
		try {
			temp_Registration_Number = opiInformation.getRegistrationNumber();
		} catch (Exception request_registration_number) {
			temp_Registration_Number = (String) pullSession("registration_number");
		}
		// System.out.println(temp_Registration_Number);
		String result = addDurg();
		findInformation();
		return result;
	}

	// 退款添加检查项
	public String addUsedCheckitem() throws Exception {
		try {
			temp_Registration_Number = opiInformation.getRegistrationNumber();
		} catch (Exception request_registration_number) {
			temp_Registration_Number = (String) pullSession("registration_number");
		}
		// System.out.println(temp_Registration_Number);
		String result = addCheckitem();
		findInformation();
		return result;
	}

	// 完成退款
	public String finishRefund() throws Exception {
		// System.out.println(billsInformation.getBillNumber());
		// System.out.println(billsInformation.getRegistrationNumber());
		// System.out.println(billsInformation.getShouldCharge());
		// System.out.println(billsInformation.getActualCharge());
		// System.out.println(pullSession("actual_charge"));
		// return SUCCESS;
		TbBillsInformation temp = (TbBillsInformation) billsInformationDAO
				.findByBillNumber(billsInformation.getBillNumber()).get(0);
		temp.setBillStatus("-1");
		Timestamp thisMomentRefund = getThisMoment();
		temp.setRefundTime(thisMomentRefund);
		billsInformationDAO.attachDirty(temp);

		TbBillsInformation temp_bill = new TbBillsInformation();
		try {
			temp_bill = saveBillsUsedInformation(temp_bill);
			// 补充发票单上其他信息
			// billsInformation.setOddChange(billsInformation.getActualCharge());
			// billsInformation.setShouldCharge(billsInformation.getShouldCharge());
			double actualCharge = billsInformation.getActualCharge();
			double shouldCharge = billsInformation.getShouldCharge();
			double paidCharge = (Double) pullSession("actual_charge");
			double oddCharge = actualCharge + paidCharge - shouldCharge;
			if(paidCharge>shouldCharge){
				temp_bill.setActualCharge(shouldCharge);
				temp_bill.setShouldCharge(shouldCharge);
				temp_bill.setOddChange(0.00);
			}else {
				temp_bill.setActualCharge(paidCharge + actualCharge);
				temp_bill.setShouldCharge(shouldCharge);
				temp_bill.setOddChange(oddCharge);
			}
			
			// if (billsInformation.getOddChange() >= 0) {
			// temp_bill.setOddChange();
			// } else {
			// temp_bill.setOddChange((double) 0);
			// }
			Timestamp thisMomentPayment = getThisMoment();
			temp_bill.setPaymentTime(thisMomentPayment);
			temp_bill.setBillStatus("1");
			billsInformationDAO.save(temp_bill);

			return SUCCESS;

		} catch (Exception finish_Charge_Error) {
			finish_Charge_Error.printStackTrace();
			return ERROR;
		}
	}

	// 寻找处方单信息
	public void findInformation() throws Exception {
		tempDrugList = tempDrugDAO
				.findByRegistrationNumber(temp_Registration_Number);
		tempCheckItemList = tempCheckitemDAO
				.findByRegistrationNumber(temp_Registration_Number);
		drugInformationList = drugInformationDAO.findAll();
		checkitemInformationList = checkitemInformationDAO.findAll();
		// System.out.println(tempCheckItemList.isEmpty());
		pushSession("tempDrugList", tempDrugList);
		pushSession("tempCheckItemList", tempCheckItemList);
		pushSession("drugInformationsList", drugInformationList);
		pushSession("checkitemInformationList", checkitemInformationList);
	}

	// 添加用药项
	public String addDurg() throws Exception {
		try {

			String registration_number = (String) pullSession("registration_number");
			pushSession("type", "2");
			// System.out.println(registration_number);

			TbTempDrug temp = new TbTempDrug();
			temp.setTempDrugNumber(tempDrug.getTempDrugNumber());
			temp.setRegistrationNumber(registration_number);
			List<TbTempDrug> tempList = tempDrugDAO.findByExample(temp);

			if (!tempList.isEmpty() && tempDrug.getTempDrugAmount() == 0) {
				tempDrugDAO.delete(tempList.get(0));
				return SUCCESS;
			} else if (tempList.isEmpty() && tempDrug.getTempDrugAmount() == 0) {
				return SUCCESS;
			}

			tempDrug.setRegistrationNumber(registration_number);
			List list = drugInformationDAO.findByDrugNumber(tempDrug
					.getTempDrugNumber());
			TbDrugInformation tempInfo = (TbDrugInformation) list.get(0);
			tempDrug.setTempDrugName(tempInfo.getDrugName());

			if (tempList.isEmpty() && tempDrug.getTempDrugAmount() != 0) {
				// System.out.println("插入药物");

				tempDrugDAO.save(tempDrug);
			} else {
				tempDrugDAO.delete(tempList.get(0));
				tempDrugDAO.save(tempDrug);
				// tempDrug.setTempDrugId(tempList.get(0).getTempDrugId());
				// System.out.println("更新药物");
			}
			// System.out.println(tempDrug.getTempDrugName() + "名字");
			// System.out.println(tempDrug.getTempDrugNumber());
			// System.out.println(tempDrug.getTempDrugAmount());
			// System.out.println(tempDrug.getTempDrugFee());
			// System.out.println(tempDrug.getTempDrugSubtotal());
			return SUCCESS;
		} catch (Exception add_Temp_Drug_Error) {
			add_Temp_Drug_Error.printStackTrace();
			return ERROR;
		}
	}

	// 添加检查项
	public String addCheckitem() throws Exception {
		try {

			String registration_number = (String) pullSession("registration_number");
			pushSession("type", "2");
			// System.out.println(registration_number);

			TbTempCheckitem temp = new TbTempCheckitem();
			// System.out.println(tempCheckitem.getTempCheckitemNumber());
			temp.setTempCheckitemNumber(tempCheckitem.getTempCheckitemNumber());
			temp.setRegistrationNumber(registration_number);
			List<TbTempCheckitem> tempList = tempCheckitemDAO
					.findByExample(temp);

			// System.out.println(tempList.isEmpty());

			if (!tempList.isEmpty()
					&& tempCheckitem.getTempCheckitemAmount() == 0) {
				tempCheckitemDAO.delete(tempList.get(0));
				return SUCCESS;
			} else if (tempList.isEmpty()
					&& tempCheckitem.getTempCheckitemAmount() == 0) {
				return SUCCESS;
			}

			tempCheckitem.setRegistrationNumber(registration_number);
			List list = checkitemInformationDAO
					.findByCheckitemNumber(tempCheckitem
							.getTempCheckitemNumber());
			TbCheckitemInformation tempInfo = (TbCheckitemInformation) list
					.get(0);
			tempCheckitem.setTempCheckitemName(tempInfo.getCheckitemName());

			if (tempList.isEmpty()
					&& tempCheckitem.getTempCheckitemAmount() != 0) {
				tempCheckitemDAO.save(tempCheckitem);
			} else {
				// System.out.println("删除检查");
				tempCheckitemDAO.delete(tempList.get(0));
				tempCheckitemDAO.save(tempCheckitem);
			}
			// System.out.println(tempCheckitem.getTempCheckitemName() + "名字");
			// System.out.println(tempCheckitem.getTempCheckitemNumber());
			// System.out.println(tempCheckitem.getTempCheckitemAmount());
			// System.out.println(tempCheckitem.getTempCheckitemFee());
			// System.out.println(tempCheckitem.getTempCheckitemSubtotal());
			return SUCCESS;
		} catch (Exception add_Temp_Checkitem_Error) {
			add_Temp_Checkitem_Error.printStackTrace();
			return ERROR;
		}
	}

	// 保存用药和检查项信息，并删除临时数据
	public TbBillsInformation saveBillsUsedInformation(
			TbBillsInformation temp_bill) throws Exception {

		// 查找数据库中挂号单registration_number的用药和检查项信息
		temp_Registration_Number = billsInformation.getRegistrationNumber();
		tempDrugList = tempDrugDAO
				.findByRegistrationNumber(temp_Registration_Number);
		tempCheckItemList = tempCheckitemDAO
				.findByRegistrationNumber(temp_Registration_Number);
		// 生成发票单号
		Calendar instance = Calendar.getInstance();
		invoice_Number = "OPI"
				+ Long.toString(instance.getTimeInMillis()).substring(1);
		// System.out.println(invoice_Number);
		temp_bill.setBillNumber(invoice_Number);
		temp_bill.setRegistrationNumber(temp_Registration_Number);

		// 如果挂号单registration_number中拥有用药信息就进行正式保存，并删除临时的用药信息。
		for (int i = 0; i < tempDrugList.size() && !tempDrugList.isEmpty(); i++) {
			try {
				TbUsedDrug drug = new TbUsedDrug();
				drug.setBillNumber(invoice_Number);
				drug.setUsedDrugNumber(tempDrugList.get(i).getTempDrugNumber());
				drug.setUsedDrugName(tempDrugList.get(i).getTempDrugName());
				drug.setUsedDrugFee(tempDrugList.get(i).getTempDrugFee());
				drug.setUsedDrugAmount(tempDrugList.get(i).getTempDrugAmount());
				drug.setUsedDrugSubtotal(tempDrugList.get(i)
						.getTempDrugSubtotal());
				usedDrugDAO.save(drug);
				tempDrugDAO.delete(tempDrugList.get(i));
			} catch (Exception save_Used_Drug_Error) {
				save_Used_Drug_Error.printStackTrace();
				System.out.println("保存第" + i + "行用药记录时出错！");
				break;
			}
		}

		// 如果挂号单registration_number中拥有检查项信息就进行正式保存，并删除临时的检查项信息。
		for (int i = 0; i < tempCheckItemList.size()
				&& !tempCheckItemList.isEmpty(); i++) {
			try {
				TbUsedCheckitem checkItem = new TbUsedCheckitem();
				checkItem.setBillNumber(invoice_Number);
				checkItem.setUsedCheckitemNumber(tempCheckItemList.get(i)
						.getTempCheckitemNumber());
				checkItem.setUsedCheckitemName(tempCheckItemList.get(i)
						.getTempCheckitemName());
				checkItem.setUsedCheckitemFee(tempCheckItemList.get(i)
						.getTempCheckitemFee());
				checkItem.setUsedCheckitemAmount(tempCheckItemList.get(i)
						.getTempCheckitemAmount());
				checkItem.setUsedCheckitemSubtotal(tempCheckItemList.get(i)
						.getTempCheckitemSubtotal());
				usedCheckitemDAO.save(checkItem);
				tempCheckitemDAO.delete(tempCheckItemList.get(i));
			} catch (Exception save_Used_CheckItem_Error) {
				save_Used_CheckItem_Error.printStackTrace();
				System.out.println("保存第" + i + "行检查项记录时出错！");
				break;
			}
		}
		return temp_bill;
	}

	// 全额退款
	public String refundInFull() throws Exception {
		try {
			billsInformation = (TbBillsInformation) billsInformationDAO
					.findByBillNumber(billsInformation.getBillNumber()).get(0);
			billsInformation.setBillStatus("-1");
			billsInformation.setRefundTime(getThisMoment());
			billsInformationDAO.attachDirty(billsInformation);
		} catch (Exception refund_In_Full_Error) {
			refund_In_Full_Error.printStackTrace();
			return ERROR;
		}
		return SUCCESS;
	}

}
