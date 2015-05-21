package com.llx.ocsys.action;

import java.util.List;

import com.llx.ocsys.DAO.TbBillsInformationDAO;
import com.llx.ocsys.DAO.TbCheckitemInformationDAO;
import com.llx.ocsys.DAO.TbDrugInformationDAO;
import com.llx.ocsys.DAO.TbManageRegistrationDAO;
import com.llx.ocsys.entity.OPIInformation;
import com.llx.ocsys.entity.TbBillsInformation;
import com.llx.ocsys.entity.TbCheckitemInformation;
import com.llx.ocsys.entity.TbDrugInformation;
import com.llx.ocsys.entity.TbManageRegistration;

public class StatisticsAction extends BaseAction {

	private TbDrugInformation drugInformation;
	private TbCheckitemInformation checkitemInformation;
	private TbManageRegistration manageRegistration;
	private TbBillsInformation billsInformation;
	private OPIInformation opiInformation;

	private List<TbDrugInformation> drugInformationList;
	private List<TbCheckitemInformation> checkitemInformationList;
	private List<TbManageRegistration> manageRegistrationList;
	private List<TbBillsInformation> billsInformationList;
	private List<OPIInformation> opiInformationList;

	private TbDrugInformationDAO drugInformationDAO = new TbDrugInformationDAO();
	private TbCheckitemInformationDAO checkitemInformationDAO = new TbCheckitemInformationDAO();
	private TbManageRegistrationDAO manageRegistrationDAO = new TbManageRegistrationDAO();
	private TbBillsInformationDAO billsInformationDAO = new TbBillsInformationDAO();

	public TbDrugInformation getDrugInformation() {
		return drugInformation;
	}

	public void setDrugInformation(TbDrugInformation drugInformation) {
		this.drugInformation = drugInformation;
	}

	public TbCheckitemInformation getCheckitemInformation() {
		return checkitemInformation;
	}

	public void setCheckitemInformation(
			TbCheckitemInformation checkitemInformation) {
		this.checkitemInformation = checkitemInformation;
	}

	public TbManageRegistration getManageRegistration() {
		return manageRegistration;
	}

	public void setManageRegistration(TbManageRegistration manageRegistration) {
		this.manageRegistration = manageRegistration;
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

	public List<TbManageRegistration> getManageRegistrationList() {
		return manageRegistrationList;
	}

	public void setManageRegistrationList(
			List<TbManageRegistration> manageRegistrationList) {
		this.manageRegistrationList = manageRegistrationList;
	}

	// 显示药库已有药品
	public String showDurgInformation() throws Exception {
		try {
			drugInformationList = drugInformationDAO.findAll();
			pushRequest("drugInformationsList", drugInformationList);
			return SUCCESS;
		} catch (Exception findAll_Durg_Error) {
			findAll_Durg_Error.printStackTrace();
			return ERROR;
		}
	}

	public String searchDrugInformation() throws Exception {
		try {
			// System.out.println(drugInformation.getDrugSpecifications());
			// System.out.println(drugInformation.getDrugUnit());
			TbDrugInformation temp = new TbDrugInformation();
			// temp.setDrugUnit("盒");
			if (drugInformation.getDrugName().trim().length() > 0) {
				// System.out.println("1");
				temp.setDrugName(drugInformation.getDrugName());
			}
			if (drugInformation.getDrugNumber().trim().length() > 0) {
				// System.out.println("2");
				temp.setDrugNumber(drugInformation.getDrugNumber());
			}
			if (drugInformation.getDrugSpecifications().trim().length() > 0) {
				// System.out.println("3");
				// System.out.println(drugInformation.getDrugSpecifications());
				temp.setDrugSpecifications(drugInformation
						.getDrugSpecifications());
			}
			if (drugInformation.getDrugUnit().trim().length() > 0) {
				// System.out.println("4");
				temp.setDrugUnit(drugInformation.getDrugUnit());
			}
			// if(drugInformation.getDrugFee()!=null){
			// temp.setDrugFee(drugInformation.getDrugFee());
			// }
			/*
			 * if(drugInformation.getDrugNumber()==null){
			 * drugInformation.setDrugNumber(""); }
			 * if(drugInformation.getDrugName()==null){
			 * drugInformation.setDrugName(""); }
			 * if(drugInformation.getDrugSpecifications()==null){
			 * drugInformation.setDrugSpecifications(""); }
			 * if(drugInformation.getDrugUnit()==null){
			 * drugInformation.setDrugUnit(""); }
			 */
			// TbDrugInformation temp = new TbDrugInformation();
			// temp.setDrugUnit(drugInformation.getDrugUnit());

			drugInformationList = drugInformationDAO.findByExample(temp);
			// System.out.println(drugInformationList.size());
			pushRequest("drugInformationsList", drugInformationList);
			return SUCCESS;
		} catch (Exception search_Drug_Information_Error) {
			search_Drug_Information_Error.printStackTrace();
			return ERROR;
		}
	}

	// 显示门诊提供的检查项
	public String showCheckItemInformation() throws Exception {
		try {
			checkitemInformationList = checkitemInformationDAO.findAll();
			// System.out.println(checkitemInformationList.size());
			pushRequest("checkitemInformationList", checkitemInformationList);
			return SUCCESS;
		} catch (Exception findAll_Check_Error) {
			findAll_Check_Error.printStackTrace();
			return ERROR;
		}
	}

	public String searchCheckItemInformation() throws Exception {
		try {
			TbCheckitemInformation temp = new TbCheckitemInformation();
			if (checkitemInformation.getCheckitemNumber().trim().length() > 0) {
				temp.setCheckitemNumber(checkitemInformation
						.getCheckitemNumber());
			}
			if (checkitemInformation.getCheckitemName().trim().length() > 0) {
				temp.setCheckitemName(checkitemInformation.getCheckitemName());
			}
			if (checkitemInformation.getCheckitemUnit().trim().length() > 0) {
				temp.setCheckitemUnit(checkitemInformation.getCheckitemUnit());
			}
			checkitemInformationList = checkitemInformationDAO
					.findByExample(temp);
			pushRequest("checkitemInformationList", checkitemInformationList);
			return SUCCESS;
		} catch (Exception search_CheckItem_Information_Error) {
			search_CheckItem_Information_Error.printStackTrace();
			return ERROR;
		}
	}

	public String showRegistration() throws Exception {
		try {
			manageRegistrationList = manageRegistrationDAO.findAll();
			pushRequest("manageRegistrationList", manageRegistrationList);
			return SUCCESS;
		} catch (Exception show_Registration_Error) {
			show_Registration_Error.printStackTrace();
			return ERROR;
		}
	}

	public String searchRegistration() throws Exception {
		try {
			TbManageRegistration temp = new TbManageRegistration();
			if (manageRegistration.getRegistrationNumber().trim().length() > 0) {
				temp.setRegistrationNumber(manageRegistration
						.getRegistrationNumber());
			}
			if (manageRegistration.getPatientName().trim().length() > 0) {
				temp.setPatientName(manageRegistration.getPatientName());
			}
			if (manageRegistration.getPatientSex().trim().length() > 0) {
				temp.setPatientSex(manageRegistration.getPatientSex());
			}
			if(manageRegistration.getPatientType().trim().length() > 0){
				temp.setPatientType(manageRegistration.getPatientType());
			}
			// if (manageRegistration.getPatientAge().trim().length() > 0) {
			//
			// }
			if (manageRegistration.getSettlementMethod().trim().length() > 0) {
				temp.setSettlementMethod(manageRegistration
						.getSettlementMethod());
			}
			manageRegistrationList = manageRegistrationDAO.findByExample(temp);
			pushRequest("manageRegistrationList", manageRegistrationList);
			return SUCCESS;
		} catch (Exception search_Registration_Error) {
			search_Registration_Error.printStackTrace();
			return ERROR;
		}
	}
}
