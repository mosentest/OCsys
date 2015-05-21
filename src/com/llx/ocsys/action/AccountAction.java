package com.llx.ocsys.action;

import java.util.ArrayList;
import java.util.List;

import com.llx.ocsys.entity.OPIInformation;
import com.llx.ocsys.entity.TbBillsInformation;
import com.llx.ocsys.entity.TbManageRegistration;
import com.llx.ocsys.DAO.TbBillsInformationDAO;
import com.llx.ocsys.DAO.TbManageRegistrationDAO;

public class AccountAction extends BaseAction {

	int chargeRecords = 0;
	int refundRecords = 0;
	double actualCharge = 0.00;
	double refundCharge = 0.00;
	double shouldCharge = 0.00;
	double oddCharge = 0.00;

	private TbManageRegistration manageRegistration;
	private TbBillsInformation billsInformation;
	private OPIInformation opiInformation;

	private List<TbManageRegistration> manageRegistrationList;
	private List<TbBillsInformation> billsInformationList;
	private List<OPIInformation> opiInformationList;

	private TbManageRegistrationDAO manageRegistrationDAO = new TbManageRegistrationDAO();
	private TbBillsInformationDAO billsInformationDAO = new TbBillsInformationDAO();

	public TbManageRegistration getManageRegistration() {
		return manageRegistration;
	}

	public void setManageRegistration(TbManageRegistration manageRegistration) {
		this.manageRegistration = manageRegistration;
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

	public String settleAccount() throws Exception {
		try {
			// String userNumber = pullSession("userNumber");
			String userNumber = "201143502227";
			String today = getThisMoment().toString();

			today = today.substring(0, 10);
			// System.out.println(today);
			// String endData=today+" 23:59:59";
			// today=today+" 00:00:00";

			// System.out.println(today);
			// String userNumber = (String) pullSession("userNumber");
			// String userNumber = "201143502227";
			billsInformationList = billsInformationDAO.findByToday(today);
			billsInformationList = billsInformationDAO
					.findByToday("2015-05-01");
			// billsInformationList =
			// billsInformationDAO.findByPaymentTime("2015-05-01", today);

			// billsInformationList =
			// billsInformationDAO.findByPaymentTime(today, endData);
			// System.out.println(billsInformationList);
			// System.out.println(billsInformationList.size());
			// try{
			// System.out.println(billsInformationList.get(0).getRegistrationNumber());
			// }catch(Exception e){
			// e.printStackTrace();
			// }
			List<OPIInformation> opiInformationList = new ArrayList<OPIInformation>();

			for (int i = 0; i < billsInformationList.size(); i++) {
				// System.out.println("test");
				// TbBillsInformation tempBill = new TbBillsInformation();
				// tempBill = billsInformationList.get(i);
				// System.out.println("test2");
				// System.out.println(tempBill.getRegistrationNumber());
				if (userNumber.equals(billsInformationList.get(i)
						.getUserNumber())) {
					// System.out.println("success");
					OPIInformation opiInformation = new OPIInformation();
					billsInformation = billsInformationList.get(i);

					actualCharge = actualCharge
							+ billsInformation.getActualCharge();
					// shouldCharge = shouldCharge +
					// billsInformation.getShouldCharge();
					oddCharge = oddCharge + billsInformation.getOddChange();
					if (billsInformation.getBillStatus().equals("1")) {
						chargeRecords = chargeRecords + 1;
						shouldCharge = shouldCharge + billsInformation.getShouldCharge();
					} else {
						refundRecords = refundRecords + 1;
						refundCharge = refundCharge
								+ billsInformation.getShouldCharge();
					}

					manageRegistration = (TbManageRegistration) manageRegistrationDAO
							.findByRegistrationNumber(
									billsInformation.getRegistrationNumber())
							.get(0);
					opiInformation.setPatientName(manageRegistration
							.getPatientName());
					opiInformation.setRegistrationNumber(manageRegistration
							.getRegistrationNumber());
					opiInformation.setPatientSex(manageRegistration
							.getPatientSex());
					opiInformation.setPatientAge(manageRegistration
							.getPatientAge());
					opiInformation.setPatientType(manageRegistration
							.getPatientType());
					opiInformation.setSettlementMethod(manageRegistration
							.getSettlementMethod());
					opiInformation.setBillNumber(billsInformation
							.getBillNumber());
					opiInformation.setShouldCharge(billsInformation
							.getShouldCharge());
					opiInformation.setActualCharge(billsInformation
							.getActualCharge());
					opiInformation
							.setOddChange(billsInformation.getOddChange());
					opiInformation.setPaymentTime(billsInformation
							.getPaymentTime());
					opiInformation.setRefundTime(billsInformation
							.getRefundTime());
					opiInformation.setBillStatus(billsInformation
							.getBillStatus());
					opiInformationList.add(opiInformation);
				}
			}
			pushSession("chargeRecords", chargeRecords);
			pushSession("refundRecords", refundRecords);
			pushSession("actualCharge", actualCharge);
			pushSession("shouldCharge", shouldCharge);
			pushSession("oddCharge", oddCharge);
			pushSession("refundCharge", refundCharge);
			pushSession("opiInformationList", opiInformationList);
			// System.out.println(opiInformationList.get(0).getPatientSex());

			// SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			// Calendar instance = Calendar.getInstance();
			// String beginDate = formatter.format(new Date());
			// instance.add(Calendar.DATE, 1);
			// String endData = formatter.format(instance.getTime());
			//
			// System.out.println("beginDate:"+beginDate);
			// System.out.println("endData:"+endData);

			// billsInformationDAO.findByPaymentTime(beginDate, endData);
			return SUCCESS;
		} catch (Exception settle_Account_Error) {
			return ERROR;
		}
	}
}
