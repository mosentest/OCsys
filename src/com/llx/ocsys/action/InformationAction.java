package com.llx.ocsys.action;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.llx.ocsys.DAO.TbCheckitemInformationDAO;
import com.llx.ocsys.DAO.TbDrugInformationDAO;
import com.llx.ocsys.entity.TbCheckitemInformation;
import com.llx.ocsys.entity.TbDrugInformation;
import com.opensymphony.xwork2.ActionSupport;

public class InformationAction extends ActionSupport implements
		ServletRequestAware {

	private HttpServletRequest request;

	private List<TbDrugInformation> drugInformationList;
	private List<TbCheckitemInformation> checkitemInformationList;

	private TbDrugInformation drugInformation;
	private TbCheckitemInformation checkitemInformation;

	private TbDrugInformationDAO drugInformationDAO = new TbDrugInformationDAO();
	private TbCheckitemInformationDAO checkitemInformationDAO = new TbCheckitemInformationDAO();

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

	public List<TbDrugInformation> getDrugInformationList() {
		return drugInformationList;
	}

	public void setDrugInformationsList(
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

	@Override
	public String execute() throws Exception {
		// TODO Auto-generated method stub
		return super.execute();
	}

//显示药库已有药品
	public String showDurgInformation() throws Exception {
		try {
			drugInformationList = drugInformationDAO.findAll();
			request.getSession().setAttribute("drugInformationsList",
					drugInformationList);
			return SUCCESS;
		} catch (Exception findAll_Durg_Error) {
			findAll_Durg_Error.printStackTrace();
			return ERROR;
		}
	}

//添加新药品
	public String addDurgInformation() throws Exception {
		try {
			System.out.println(drugInformation.getDrugFee());
			drugInformationDAO.save(drugInformation);
			return SUCCESS;
		} catch (Exception add_Durg_Error) {
			add_Durg_Error.printStackTrace();
			return ERROR;
		}
	}

//更新药品信息
	public String updateDurgInformation() throws Exception {
		try {
			List<TbDrugInformation> temp = (List<TbDrugInformation>)drugInformationDAO.findByDrugNumber(drugInformation.getDrugNumber());
			TbDrugInformation drugInformation_temp = temp.get(0);
			drugInformation_temp.setDrugFee(drugInformation.getDrugFee());
			drugInformationDAO.merge(drugInformation_temp);
			return SUCCESS;
		} catch (Exception update_Durg_Error) {
			update_Durg_Error.printStackTrace();
			return ERROR;
		}
	}

//显示门诊提供的检查项
	public String showCheckItemInformation() throws Exception {
		try {
			checkitemInformationList = checkitemInformationDAO.findAll();
			request.getSession().setAttribute("checkitemInformationList",
					checkitemInformationList);
			// drugInformationsList = drugInformationDAO.findAll();
			// request.getSession().setAttribute("drugInformationsList",
			// drugInformationsList);
			return SUCCESS;
		} catch (Exception findAll_Check_Error) {
			findAll_Check_Error.printStackTrace();
			return ERROR;
		}
	}

//添加检查项
	public String addCheckItemInformation() throws Exception {
		try {
			checkitemInformationDAO.save(checkitemInformation);
			return SUCCESS;
		} catch (Exception add_Check_Error) {
			add_Check_Error.printStackTrace();
			return ERROR;
		}
	}

//更新检查项信息
	public String updateCheckItemInformation() throws Exception {
		try {
			List<TbCheckitemInformation> temp = (List<TbCheckitemInformation>)checkitemInformationDAO.findByCheckitemNumber(checkitemInformation.getCheckitemNumber());
			TbCheckitemInformation checkitemInformation_temp = temp.get(0);
			checkitemInformation_temp.setCheckitemFee(checkitemInformation.getCheckitemFee());
			checkitemInformationDAO.merge(checkitemInformation_temp);
			return SUCCESS;
		} catch (Exception update_Check_Error) {
			update_Check_Error.printStackTrace();
			return ERROR;
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest arg0) {
		// TODO Auto-generated method stub
		request = arg0;
	}
}
