<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%> 
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="/struts-tags" prefix="s"%>
<%@ page import="com.llx.ocsys.entity.TbManageRegistration"%>
<%@ page import="com.llx.ocsys.entity.TbDrugInformation"%>
<%@ page import="com.llx.ocsys.entity.TbCheckitemInformation"%>
<%@ page import="com.llx.ocsys.entity.TbTempDrug"%>
<%@ page import="com.llx.ocsys.entity.TbTempCheckitem"%>
<%
	String path = request.getContextPath();
String basePath = request.getScheme() + "://"
+ request.getServerName() + ":" + request.getServerPort()
+ path + "/";
%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'bills_detail.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/colorpicker.css" />
<link rel="stylesheet" href="css/datepicker.css" />
<link rel="stylesheet" href="css/uniform.css" />
<link rel="stylesheet" href="css/select2.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link rel="stylesheet" href="css/bootstrap-wysihtml5.css" />
<link rel="stylesheet" href="font-awesome/css/font-awesome.css" />

<link rel="stylesheet" type="text/css" href="css/table-content.css" />
<link rel="stylesheet" href="css/information-input.css" />
<link rel="stylesheet" href="css/input-hight.css">
<style type="text/css">
.select2-drop {
	z-index: 999999;
}
</style>
</head>

<body>

	<!--Header-part-->
<div id="header">
	<h1>
		<a href="dashboard.html">Matrix Admin</a>
	</h1>
</div>
<!--close-Header-part-->

<!--top-Header-menu-->
<div id="user-nav" class="navbar navbar-inverse">
	<ul class="nav">
		<li class="dropdown" id="profile-messages"><a title="" href="#"
			data-toggle="dropdown" data-target="#profile-messages"
			class="dropdown-toggle"><i class="icon icon-user"></i> <span
				class="text">Welcome User</span><b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a href="#"><i class="icon-user"></i> My Profile</a></li>
				<li class="divider"></li>
				<li><a href="#"><i class="icon-check"></i> My Tasks</a></li>
				<li class="divider"></li>
				<li><a href="login.html"><i class="icon-key"></i> Log Out</a>
				</li>
			</ul></li>
		<li class="dropdown" id="menu-messages"><a href="#"
			data-toggle="dropdown" data-target="#menu-messages"
			class="dropdown-toggle"><i class="icon icon-envelope"></i> <span
				class="text">Messages</span> <span class="label label-important">5</span>
				<b class="caret"></b></a>
			<ul class="dropdown-menu">
				<li><a class="sAdd" title="" href="#"><i class="icon-plus"></i>
						new message</a></li>
				<li class="divider"></li>
				<li><a class="sInbox" title="" href="#"><i
						class="icon-envelope"></i> inbox</a></li>
				<li class="divider"></li>
				<li><a class="sOutbox" title="" href="#"><i
						class="icon-arrow-up"></i> outbox</a></li>
				<li class="divider"></li>
				<li><a class="sTrash" title="" href="#"><i
						class="icon-trash"></i> trash</a></li>
			</ul></li>
		<li class=""><a title="" href="#"><i class="icon icon-cog"></i>
				<span class="text">Settings</span></a></li>
		<li class=""><a title="" href="login.html"><i
				class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
	</ul>
</div>

<!--start-top-serch-->
<div id="search">
	<input type="text" placeholder="Search here..." />
	<button type="submit" class="tip-bottom" title="Search">
		<i class="icon-search icon-white"></i>
	</button>
</div>
<!--close-top-serch-->

<!--sidebar-menu-->

<div id="sidebar">
	<a href="#" class="visible-phone"><i class="icon icon-list"></i>Forms</a>
	<ul>
		<li><a href="#"><i class="icon icon-home"></i> <span>欢迎使用本系统</span></a>
		</li>
		<!--
	作者：515898710@QQ.COM
	时间：2014-12-30
	描述：修改菜单
-->
		<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
				<span>基础信息管理</span> <span class="label label-important">2</span></a>
			<ul>
				<li><a href="show_drug_information">药品信息管理</a></li>
				<li><a href="show_checkitem_information">检查信息管理</a></li>
			</ul></li>
		<li class="submenu active open"><a href="#"><i
				class="icon icon-list"></i> <span>划价收费管理</span> <span
				class="label label-important">4</span></a>
			<ul>
				<li><a href="jsp/charge-management/manage_registration.jsp">办理挂号</a></li>
				<li class="active"><a href="show_registration_information">诊疗结算</a></li>
				<li><a href="show_bills_information">诊疗退费</a></li>
				<li><a href="settle_account">收费日结</a></li>
			</ul></li>
		<li class="submenu"><a href="#"><i class="icon icon-file"></i>
				<span>查询统计</span> <span class="label label-important">5</span></a>
			<ul>
				<li><a href="show_drug">药品信息统计</a></li>
					<li><a href="show_checkitem">检查项信息统计</a></li>
					<li><a href="show_registration">挂号单信息统计</a></li>
					<li><a href="">账单信息统计</a></li>
					<li><a href="">登入登出统计</a></li>
			</ul></li>

		<li class="submenu"><a href="#"><i
					class="icon icon-tint"></i>
					<span>用户角色管理</span> <span class="label label-important">2</span></a>
				<ul>
					<!--/OCsys/jsp/base-information/drug_information.jsp -->
					<li><a href="">个人信息管理</a></li>
					<li><a href="">用户信息管理</a></li>
				</ul>
			</li>	
	</ul>
</div>

<!--close-left-menu-stats-sidebar-->

<div id="content">
	<div id="content-header">
		<div id="breadcrumb">
			<a href="index.html" title="返回主页" class="tip-bottom"><i
				class="icon-home"></i> 主页</a> <a href="#" class="tip-bottom">划价收费管理</a>
			<a href="#" class="current">诊疗结算</a>
		</div>
		<!--
	作者：515898710@qq.com
	时间：2014-12-31
	描述：添加按钮
-->
		<!--<div class="container-fluid">
	<div class="row-fluid">
		<button class="btn btn-primary">添加收费单</button>
		<button class="btn btn-danger">删除收费单</button>
	</div>
</div>-->
	</div>
	<div class="container-fluid">
		<hr>
		<div class="row-fluid">
			<div class="span12">
				<!--
作者：515898710@qq.com
时间：2014-12-31
描述：表格开始
-->
				<div class="widget-box">
					<div class="widget-title">
						<span class="icon"> <i class="icon-th"></i>
						</span>
						<h5>诊疗挂号记录表</h5>
						<span class="label label-info">Featured</span>
					</div>
					<div class="widget-content">
						<div class="widget-box">
							<div class="widget-title">
								<span class="icon"> <i class="icon-th"></i>
								</span>
								<h5>患者挂号单详情信息</h5>
							</div>
							<div class="widget-content nopadding">
								<table class="table table-bordered table-striped">
									<thead>
										<tr>
											<th>就诊号码</th>
											<th>姓名</th>
											<th>性别</th>
											<th>年龄</th>
											<th>患者类型</th>
											<th>应收费用</th>
											<th>挂号时间</th>
											<th>结算方式</th>
											<th>状态</th>
											<th>经手人</th>
										</tr>
									</thead>
									<tbody>
										<!-- <tr class="odd gradeX"> -->
										<!-- <td>201513210648</td> -->
										<!-- <td>ABC君</td> -->
										<!-- <td>男</td> -->
										<!-- <td>35</td> -->
										<!-- <td>个人</td> -->
										<!-- <td>0.00</td> -->
										<!-- <td>现金</td> -->
										<!-- <td><span class="badge badge-warning">结算中</span></td> -->
										<!-- <td>CBA君</td> -->
										<!-- </tr> -->
										<%
											ArrayList<TbManageRegistration> manageRegistrationList = (ArrayList<TbManageRegistration>) 
											session.getAttribute("personalRegistration");
											if (!manageRegistrationList.isEmpty()) {
												TbManageRegistration personalRegistration = (TbManageRegistration) manageRegistrationList.get(0);
												session.setAttribute("registration_number",personalRegistration.getRegistrationNumber());					
										%>
										<tr class="odd gradeX">
											<td><input id="personal-registration-number"
												type="hidden"
												value="<%=personalRegistration.getRegistrationNumber()%>"><%=personalRegistration.getRegistrationNumber()%></td>
											<td><input id="personal-patient-name" type="hidden"
												value="<%=personalRegistration.getPatientName()%>"><%=personalRegistration.getPatientName()%></td>
											<td><%=personalRegistration.getPatientSex()%></td>
											<td><%=personalRegistration.getPatientAge()%></td>
											<td><%=personalRegistration.getPatientType()%></td>
											<td id="should-charge">0.00</td>
											<td><fmt:formatDate value="<%=personalRegistration.getRegisterTime()%>" pattern="yyyy-MM-dd HH:mm:ss"/></td>
											<td><%=personalRegistration.getSettlementMethod()%></td>
											<td><span class="badge badge-warning">结算中</span></td>
											<td>测试员llx</td>
										</tr>
										<%
											}
										%>
									</tbody>
								</table>
							</div>
						</div>
						<div style="height: 33px;">
						<c:choose>
						<c:when test="${ type eq '1'}">
						<button class="btn btn-success btn-lg"><i class="icon-print" style="padding-right: 10px"></i>打印预览</button>
						</c:when>
						<c:otherwise>
						<button class="btn btn-primary btn-lg" data-toggle="modal" data-target="#settlement">办理结算</button>	
						</c:otherwise>
						</c:choose>
							<div style="float: right;">
								<div style="font-size: 25px;font-weight: bolder">
									总计:
									<div id="total" style="color: #E9322D; display: inline;">
										<input id="total-value" type="hidden" value="0.00" />0.00
									</div>
									元
								</div>
							</div>
						</div>
						<!-- 结算模态框开始 -->
						<div class="modal fade" id="settlement" tabindex="-1"
							role="dialog" aria-labelledby="myModalLabel" aria-hidden="true">
							<div class="modal-dialog">
								<div class="modal-content">
									<div class="modal-header set-hight">
										<button class="close" data-dismiss="modal">
											<span aria-hidden="true">&times;</span><span class="sr-only"></span>
										</button>
										<h4 class="modal-title" id="myModalLabel">请填入实收费用</h4>
									</div>
									<form action="finish_charge" method="post"
										onsubmit="return calculateCharge()">
										<div class="modal-body set-hight">
											<div>
												<div class="add-information">就诊号码：</div>
												<input id="registration-number"
													name="billsInformation.registrationNumber" type="text"
													readonly="readonly" />
											</div>
											<div>
												<div class="add-information">患者姓名：</div>
												<input id="patient-name" type="text" readonly="readonly" />
											</div>
											<div>
												<div class="add-information">应收费用：</div>
												<input id="should-charge-value"
													name="billsInformation.shouldCharge" type="text"
													value="0.00" readonly="readonly" />
											</div>
											<div>
												<div class="add-information">实收费用：</div>
												<input id="actual-charge-value"
													name="billsInformation.actualCharge" type="number"
													min="0.00" max="99999999.99" value="0.00" step="0.01"
													required="required" />
											</div>
<!-- 												<input id="odd-charge-value" name="billsInformation.oddCharge" type="hidden" value="0.00"/> -->
										</div>
										<div class="modal-footer">
											<button type="submit" class="btn btn-primary">确定</button>
											<button class="btn btn-default" data-dismiss="modal">取消</button>
										</div>
									</form>
								</div>
							</div>
						</div>
						<!-- 结算模态框结束 -->
						<div class="row-fluid">
							<!--
	作者：515898710@qq.com
	时间：2015-01-04
	描述：用药详情开始
-->
							<div class="span6">
								<div class="widget-box">

									<div class="widget-title">
										<span class="icon"> <i class="icon-th"></i>
										</span>
										<h5>药品详细信息</h5>
									</div>
									<div class="widget-content nopadding">
										<table id="temp-drug-table"
											class="table table-bordered table-striped with-check data-table">
											<thead>
												<tr>
													<th>#</th>
													<th>药品编号</th>
													<th>通用名称</th>
													<th>计费单价</th>
													<th>用量</th>
													<th>小计</th>
												</tr>
											</thead>
											<tbody>
												<%
													//ArrayList<TbTempDrug> tempDrugList = (ArrayList<TbTempDrug>) 
												//session.getAttribute("tempDrugList");
												//if (!tempDrugList.isEmpty()) {
												//for (int i = 0; i < tempDrugList.size(); i++) {
												//TbTempDrug tempDrug = (TbTempDrug) tempDrugList.get(i);
												%>
												<c:forEach items="${tempDrugList }" var="tempDrugs"
													varStatus="varInt">
													<tr>
														<td>${varInt.count}</td>
														<td>${tempDrugs.tempDrugNumber }</td>
														<td>${tempDrugs.tempDrugName }</td>
														<td>${tempDrugs.tempDrugFee }</td>
														<td>${tempDrugs.tempDrugAmount }</td>
														<td><input type="hidden"
															id="tempDrug${varInt.count}"
															value="${tempDrugs.tempDrugSubtotal}">${tempDrugs.tempDrugSubtotal}</td>
													</tr>
												</c:forEach>
												<%
													//}
												//}
												%>
											</tbody>
										</table>
										<br>
										<div
											style="padding-bottom: 10px;padding-right:10px;padding-left: 10px;height: 30px">
											<c:choose>
											<c:when test="${ type eq '1'}">
											</c:when>
											<c:otherwise>
											<button class="btn btn-success btn-lg" data-toggle="modal"
												data-target="#addMedical">添加用药项</button></c:otherwise>
											</c:choose>
											<div style="float: right;">
												<h4>
													合计:
													<div style="color: #E9322D; display: inline;"
														id="drug-total">0.00</div>
													元
												</h4>
											</div>
										</div>
									</div>
								</div>
							</div>
							<!--
	作者：515898710@qq.com
	时间：2015-01-04
	描述：药品详情结束
-->
							<!--
	作者：515898710@qq.com
	时间：2015-01-04
	描述：检查项详情开始
-->
							<div class="span6">
								<div class="widget-box">

									<div class="widget-title">
										<span class="icon"> <i class="icon-th"></i>
										</span>
										<h5>检查项详情信息</h5>
									</div>
									<div class="widget-content nopadding">
										<table id="temp-checkitem-table"
											class="table table-bordered table-striped with-check data-table">
											<thead>
												<tr>
													<th>#</th>
													<th>检查项编号</th>
													<th>项目名称</th>
													<th>计费单价</th>
													<th>用量</th>
													<th>小计</th>
												</tr>
											</thead>
											<tbody>
												<%
													//ArrayList<TbTempCheckitem> tempCheckitemList = (ArrayList<TbTempCheckitem>) 
												//session.getAttribute("tempCheckItemList");
												%>
												<c:forEach items="${tempCheckItemList}"
													var="tempCheckItems" varStatus="varInt">
													<tr>
														<td>${varInt.count}</td>
														<td>${tempCheckItems.tempCheckitemNumber }</td>
														<td>${tempCheckItems.tempCheckitemName }</td>
														<td>${tempCheckItems.tempCheckitemFee }</td>
														<td>${tempCheckItems.tempCheckitemAmount }</td>
														<td><input type="hidden"
															id="tempCheckItem${varInt.count}"
															value="${tempCheckItems.tempCheckitemSubtotal}">${tempCheckItems.tempCheckitemSubtotal}</td>
													</tr>
												</c:forEach>
												<%
													//}
												//}
												%>
											</tbody>
										</table>
										<br>
										<div
											style="padding-bottom: 10px;padding-right:10px;padding-left: 10px;height: 30px">
											<c:choose>
											<c:when test="${ type eq '1'}">
											</c:when>
											<c:otherwise>
											<button class="btn btn-success btn-lg" data-toggle="modal"
												data-target="#addCheckItem">添加检查项</button>
											</c:otherwise>
											</c:choose>
											<div style="float: right;">
												<h4>
													合计:
													<div style="color: #E9322D; display: inline;"
														id="checkitem-total">0.00</div>
													元
												</h4>
											</div>
										</div>
									</div>
								</div>
							</div>
						</div>
						<!--
作者：515898710@qq.com
时间：2015-01-04
描述：检查项详情结束
-->
					</div>
					<!--
作者：515898710@qq.com
时间：2015-01-04
描述：总计开始
-->
					<!--<div style="text-align: right;">
	<h3>总计 <div style="color: #E9322D; display: inline;">39.50</div> 元</h3>
</div>-->
					<!--
作者：515898710@qq.com
时间：2015-01-04
描述：总计结束
-->
				</div>

			</div>
		</div>
	</div>
	<!--
作者：515898710@qq.com
时间：2014-12-31
描述：表格结束
-->
</div>
</div>

<!-- 添加用药模态框开始 -->
<div class="modal fade" id="addMedical" tabindex="-1" role="dialog"
	aria-labelledby="@myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header set-hight">
				<button class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only"></span>
				</button>
				<h4 class="modal-title" id="myModalLabel">请填写用药信息</h4>
				<%
					ArrayList<TbDrugInformation> durgList = (ArrayList<TbDrugInformation>) 
					session.getAttribute("drugInformationsList");
				%>
			</div>
			<form action="add_temp_drug" method="post">
				<div class="modal-body set-hight" style="max-height: 450px;">
					<div style="color: white;">&nbsp;</div>
					<div id="div-s-drugNumber">
						<div class="add-information">药品编号：</div>
						<select style="width: 39%" id="s-drugNumber"
							name="tempDrug.tempDrugNumber" onchange="onChangeByDrugNumber()">
							<%
								if (!durgList.isEmpty()) {
													for (int i = 0; i < durgList.size(); i++) {
													TbDrugInformation drugNum = (TbDrugInformation) durgList.get(i);
							%><option
								onclick="setDrugInfoByNumber('<%=drugNum.getDrugName()%>','<%=drugNum.getDrugFee()%>')"
								value="<%=drugNum.getDrugNumber()%>"><%=drugNum.getDrugNumber()%></option>
							<%
								}
																																}
							%>
						</select>
					</div>
					<div
						style="padding-left:17%;padding-top: 10px;padding-bottom: 10px;font-size:15px;"
						id="div-s-drugName">
						<div style="float: left;padding-right: 4px;line-height: 25px;">药品名称：</div>
						<select style="width: 47%;" id="s-drugName"
							onchange="onChangeByDrugName()">
							<%
								if (!durgList.isEmpty()) {
													for (int i = 0; i < durgList.size(); i++) {
													TbDrugInformation drugName = (TbDrugInformation) durgList.get(i);
							%><option
								onclick="setDrugInfoByName('<%=drugName.getDrugNumber()%>','<%=drugName.getDrugFee()%>')"
								value="<%=drugName.getDrugName()%>"><%=drugName.getDrugName()%></option>
							<%
								}
													}
							%>
						</select>
					</div>
					<!-- 						<div> -->
					<!-- 							<div class="add-information">药品编号：</div> -->
					<!-- 							<input type="text" required="required" pattern="[\d]{1,20}$" -->
					<!-- 								name="" /> -->
					<!-- 						</div> -->
					<!-- 						<div> -->
					<!-- 							<div class="add-information">通用名称：</div> -->
					<!-- 							<input type="text" required="required" name="" /> -->
					<!-- 						</div> -->
					<div>
						<div class="add-information">使用数量：</div>
						<input type="number" min="0" max="99" value="1" id="s-drugAmount"
							name="tempDrug.tempDrugAmount" onchange="onChangeByDrugAmount()" />
					</div>
					<div>
						<div class="add-information">计费单价：</div>
						<input type="text" readonly="readonly" id="s-drugFee"
							name="tempDrug.tempDrugFee"
							value="<%if (!durgList.isEmpty()){out.print(durgList.get(0).getDrugFee());}%>" />
					</div>
					<div>
						<div class="add-information">小计：</div>
						<input type="text" readonly="readonly" id="s-drugSub"
							name="tempDrug.tempDrugSubtotal"
							value="<%if (!durgList.isEmpty()){out.print(durgList.get(0).getDrugFee());}%>" />
					</div>
					<!-- 						<div> -->
					<!-- 							<div class="add-information">小&nbsp;&nbsp;&nbsp;&nbsp;计：</div> -->
					<!-- 							<select style="z-index: auto;"> -->
					<!-- 								<option>0</option> -->
					<!-- 								<option>1</option> -->
					<!-- 								<option>2</option> -->
					<!-- 							</select> -->
					<!-- 						</div> -->
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary">确定</button>
					<button class="btn btn-default" data-dismiss="modal">取消</button>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- 	添加用药模态框结束 -->

<!-- 测试模态框开始 -->
<!-- 	<div class="modal fade" id="addMedical" tabindex="-1" role="dialog" -->
<!-- 		aria-labelledby="myModalLabel" aria-hidden="true"> -->
<!-- 		<div class="modal-dialog"> -->
<!-- 			<div class="modal-content"> -->
<!-- 				<div class="modal-header"> -->
<!-- 					<button type="button" class="close" data-dismiss="modal"> -->
<!-- 						<span aria-hidden="true">&times;</span><span class="sr-only"></span> -->
<!-- 					</button> -->
<!-- 					<h4 class="modal-title" id="myModalLabel">请填写检查信息</h4> -->
<!-- 				</div> -->
<!-- 				<div class="widget-box"> -->
<!-- 					<div class="widget-content nopadding"> -->
<!-- 						<form action="#" method="get" class="form-horizontal"> -->
<!-- 							<div class="control-group"> -->
<!-- 								<label class="control-label">Select input</label> -->
<!-- 								<div class="controls"> -->
<!-- 									<select> -->
<!-- 										<option>First option</option> -->
<!-- 										<option>Second option</option> -->
<!-- 										<option>Third option</option> -->
<!-- 										<option>Fourth option</option> -->
<!-- 										<option>Fifth option</option> -->
<!-- 										<option>Sixth option</option> -->
<!-- 										<option>Seventh option</option> -->
<!-- 										<option>Eighth option</option> -->
<!-- 									</select> -->
<!-- 								</div> -->
<!-- 							</div> -->
<!-- 							<div class="form-actions"> -->
<!-- 								<button type="submit" class="btn btn-success">Save</button> -->
<!-- 							</div> -->
<!-- 						</form> -->
<!-- 					</div> -->
<!-- 				</div> -->
<!-- 			</div> -->
<!-- 		</div> -->
<!-- 	</div> -->
<!-- 测试模态框结束 -->

<!-- 添加检查模态框开始 -->
<div class="modal fade" id="addCheckItem" tabindex="-1" role="dialog"
	aria-labelledby="myModalLabel" aria-hidden="true">
	<div class="modal-dialog">
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">
					<span aria-hidden="true">&times;</span><span class="sr-only"></span>
				</button>
				<h4 class="modal-title" id="myModalLabel">请填写检查信息</h4>
				<%
					ArrayList<TbCheckitemInformation> checkitemList = (ArrayList<TbCheckitemInformation>) 
					session.getAttribute("checkitemInformationList");
				%>
			</div>
			<form action="add_temp_checkitem" method="post">
				<div class="modal-body set-hight">
					<div id="div-s-checkitemNumber">
						<div class="add-information">编号:</div>
						<select style="width: 39%" id="s-checkitemNumber"
							name="tempCheckitem.tempCheckitemNumber"
							onchange="onChangeByCheckItemNumber()">
							<%
								if (!checkitemList.isEmpty()) {
								for (int i = 0; i < checkitemList.size(); i++) {
								TbCheckitemInformation checkitemNum = (TbCheckitemInformation) checkitemList.get(i);
							%><option
								onclick="setCheckItemInfoByNumber('<%=checkitemNum.getCheckitemName()%>','<%=checkitemNum.getCheckitemFee()%>')"
								value="<%=checkitemNum.getCheckitemNumber()%>"><%=checkitemNum.getCheckitemNumber()%></option>
							<%
								}
								}
							%>
						</select>
					</div>
					<div
						style="padding-left:17%;padding-top: 10px;padding-bottom: 10px;font-size:15px;"
						id="div-s-checkitemName">
						<div style="float: left;padding-right: 4px;line-height: 25px;">通用名称：</div>
						<select style="width: 47%" id="s-checkitemName"
							onchange="onChangeByCheckItemName()">
							<%
								if (!checkitemList.isEmpty()) {
								for (int i = 0; i < checkitemList.size(); i++) {
								TbCheckitemInformation checkitemName = (TbCheckitemInformation) checkitemList.get(i);
							%><option
								onclick="setCheckItemInfoByName('<%=checkitemName.getCheckitemNumber()%>','<%=checkitemName.getCheckitemFee()%>')"
								value="<%=checkitemName.getCheckitemName()%>"><%=checkitemName.getCheckitemName()%></option>
							<%
								}
								}
							%>
						</select>
					</div>
					<!-- 						<div> -->
					<!-- 							<div class="add-information">编&nbsp;&nbsp;&nbsp;&nbsp;号:</div> -->
					<!-- 							<input type="text" pattern="[\d]{1,20}$" required="required" -->
					<!-- 								name="" /> -->
					<!-- 						</div> -->
					<!-- 						<div> -->
					<!-- 							<div class="add-information">通用名称：</div> -->
					<!-- 							<input type="text" required="required" name="" /> -->
					<!-- 						</div> -->
					<div>
						<div class="add-information">使用次数：</div>
						<input type="number" min="0" max="99" value="1"
							id="s-checkitemAmount" name="tempCheckitem.tempCheckitemAmount"
							onchange="onChangeByCheckItemAmount()" />
					</div>
					<div>
						<div class="add-information">计费单价：</div>
						<input type="text" readonly="readonly" id="s-checkitemFee"
							name="tempCheckitem.tempCheckitemFee"
							value="<%if (!checkitemList.isEmpty()){out.print(checkitemList.get(0).getCheckitemFee());}%>" />
					</div>
					<div>
						<div class="add-information">小计：</div>
						<input type="text" readonly="readonly" id="s-checkitemSub"
							name="tempCheckitem.tempCheckitemSubtotal"
							value="<%if (!checkitemList.isEmpty()){out.print(checkitemList.get(0).getCheckitemFee());}%>" />
					</div>
				</div>
				<div class="modal-footer">
					<button type="submit" class="btn btn-primary">确定</button>
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
				</div>
			</form>
		</div>
	</div>
</div>
<!-- 	添加检查模态框结束 -->
<!--Footer-part-->
<div class="row-fluid">
	<div id="footer" class="span12">
		2015 &copy; Matrix Admin. Modify to you by llx.
	</div>
</div>
<!--end-Footer-part-->
<script src="js/jquery.min.js"></script>
<script src="js/jquery.ui.custom.js"></script>
<script src="js/bootstrap.min.js"></script>
<script src="js/jquery.uniform.js"></script>
<script src="js/select2.min.js"></script>
<script src="js/jquery.dataTables.min.js"></script>
<script src="js/matrix.js"></script>
<script src="js/matrix.tables.js"></script>
<script src="js/bootstrap-colorpicker.js"></script>
<script src="js/bootstrap-datepicker.js"></script>
<script src="js/jquery.toggle.buttons.html"></script>
<script src="js/masked.js"></script>
<script src="js/matrix.form_common.js"></script>
<script src="js/wysihtml5-0.3.0.js"></script>
<script src="js/jquery.peity.min.js"></script>
<script src="js/bootstrap-wysihtml5.js"></script>

<script>
	var onchangeLock = false;
	$('.textarea_editor').wysihtml5();
</script>
<script>
	function setDrugInfoByNumber(name, fee) {
		$("#s-drugName").attr("value", name);
		$("#s-drugName option[selected='selected']").removeAttr("selected");
		// 			var oldname = $("#s-drugName option[selected='selected']").val();
		$("#s-drugName option[value='" + name + "']").attr("selected",
				"selected");
		$("#div-s-drugName span").html(name);
		$("#s-drugFee").attr("value", fee);
		//计算收费
		onChangeByDrugAmount();
		// 			var amount=$("#s-drugAmount").val();
		// 			var m=0,temp=fee.toString();
		// 			try{
		// 				m+=temp.split(".")[1].length;
		// 				}
		// 			catch(e){

		// 			}
		// 			sub=Number(temp.replace(".",""))*amount/Math.pow(10,m);
		// 			$("#s-drugSub").attr("value",sub);
	}
	function setDrugInfoByName(number, fee) {
		$("#s-drugName").attr("value", number);
		$("#s-drugNumber option[selected='selected']").removeAttr(
				"selected");
		// 			var oldnumber = $("#s-drugNumber option[selected='selected']").val();
		$("#s-drugNumber option[value='" + number + "']").attr("selected",
				"selected");
		$("#div-s-drugNumber span").html(number);
		$("#s-drugFee").attr("value", fee);
		//计算收费
		onChangeByDrugAmount();
		// 			var amount=$("#s-drugAmount").val();
		// 			var m=0,temp=fee.toString();
		// 			try{
		// 				m+=temp.split(".")[1].length;
		// 			}
		// 			catch(e){

		// 			}
		// 			sub=Number(temp.replace(".",""))*amount/Math.pow(10,m);
		// 			$("#s-drugSub").attr("value",sub);
	}
	function onChangeByDrugNumber() {
		if (!onchangeLock) {
			onchangeLock = true;
			var value = $("#s-drugNumber").val();
			$("#s-drugNumber option[value='" + value + "']").click();
			onchangeLock = false;
		}
	}
	function onChangeByDrugName() {
		if (!onchangeLock) {
			onchangeLock = true;
			var value = $("#s-drugName").val();
			$("#s-drugName option[value='" + value + "']").click();
			onchangeLock = false;
		}
	}
	function onChangeByDrugAmount() {
		var amount = $("#s-drugAmount").val();

		var fee = $("#s-drugFee").val();
		var m = 0, temp = fee.toString();
		try {
			m += temp.split(".")[1].length;
		} catch (e) {

		}
		sub = Number(temp.replace(".", "")) * amount / Math.pow(10, m);
		$("#s-drugSub").attr("value", sub);
		if (amount == 0) {
			alert("温馨提示：\n使用数量为0时提交,如果已存在此用药信息,系统则会删除该用药记录。否则系统将仅刷新此页面。");
		}
	}
</script>
<script>
	function setCheckItemInfoByNumber(name, fee) {
		$("#s-checkitemName").attr("value", name);
		$("#s-checkitemName option[selected='selected']").removeAttr(
				"selected");
		$("#s-checkitemName option[value='" + name + "']").attr("selected",
				"selected");
		$("#div-s-checkitemName span").html(name);
		$("#s-checkitemFee").attr("value", fee);
		//计算收费
		onChangeByCheckItemAmount();
	}
	function setCheckItemInfoByName(number, fee) {
		$("#s-checkitemName").attr("value", number);
		$("#s-checkitemNumber option[selected='selected']").removeAttr(
				"selected");
		$("#s-checkitemNumber option[value='" + number + "']").attr(
				"selected", "selected");
		$("#div-s-checkitemNumber span").html(number);
		$("#s-checkitemFee").attr("value", fee);
		//计算收费
		onChangeByCheckItemAmount();
	}
	function onChangeByCheckItemNumber() {
		if (!onchangeLock) {
			onchangeLock = true;
			var value = $("#s-checkitemNumber").val();
			$("#s-checkitemNumber option[value='" + value + "']").click();
			onchangeLock = false;
		}
	}
	function onChangeByCheckItemName() {
		if (!onchangeLock) {
			onchangeLock = true;
			var value = $("#s-checkitemName").val();
			$("#s-checkitemName option[value='" + value + "']").click();
			onchangeLock = false;
		}
	}
	function onChangeByCheckItemAmount() {
		var amount = $("#s-checkitemAmount").val();

		var fee = $("#s-checkitemFee").val();
		var m = 0, temp = fee.toString();
		try {
			m += temp.split(".")[1].length;
		} catch (e) {
		}
		sub = Number(temp.replace(".", "")) * amount / Math.pow(10, m);
		$("#s-checkitemSub").attr("value", sub);
		if (amount == 0) {
			alert("温馨提示：\n使用次数为0时提交,如果已存在此检查项信息,系统则会删除该检查项记录。否则系统将仅刷新此页面。");
			return;
		}
	}
</script>
<script type="text/javascript">
	window.onload = function() {

		// 		alert($("#personal-registration-number").val());
		var total = 0.00;
		//获取用药行数
		var $used_drug_len = ($("#temp-drug-table").find("tr").length - 1);
		var drugTotal = 0.00;
		// 	console.log($used_drug_len);
		//计算用药合计价钱
		for (var i = 1; i <= $used_drug_len; i++) {
			var name = "#tempDrug" + i;
			// 		console.log(name);
			drugTotal += parseFloat($(name).val());
			// 		console.log(drugTotal);
		}
		if (drugTotal > 0) {
			$("#drug-total").html(formatNumber(drugTotal, 2));
		}

		//获取检查项行数
		var $used_checkitem_len = ($("#temp-checkitem-table").find("tr").length - 1);
		var checkitemTotal = 0.00;
		// 	console.log($used_checkitem_len);
		//计算检查项合计价钱
		for (var i = 1; i <= $used_checkitem_len; i++) {
			var name = "#tempCheckItem" + i;
			checkitemTotal += parseFloat($(name).val());
		}
		if (checkitemTotal > 0) {
			$("#checkitem-total").html(formatNumber(checkitemTotal, 2));
		}

		//总计
		if (!isNaN(drugTotal) || !isNaN(checkitemTotal)) {

			if (!isNaN(drugTotal) && isNaN(checkitemTotal)) {
				total = drugTotal;
			}
			if (isNaN(drugTotal) && !isNaN(checkitemTotal)) {
				total = checkitemTotal;
			}
			if (!isNaN(drugTotal) && !isNaN(checkitemTotal)) {
				total = drugTotal + checkitemTotal;
			}
			total = total + 0.001;
			total = total.toFixed(2);
			$("#total-value").attr("value", total);
			$("#total").html(formatNumber(total, 2));
			$("#should-charge-value").attr("value", total);
			$("#should-charge").html(formatNumber(total, 2));
		}

		$("#registration-number").attr("value",
				$("#personal-registration-number").val());
		$("#patient-name").attr("value", $("#personal-patient-name").val());
	}
</script>
<script type="text/javascript">
function calculateCharge(){
	if($("#should-charge-value").val()==0){
		alert("请完成处方单信息填写后再为患者 "+$("#patient-name").val()+" 办理结算！");
		return false;
	}
	var result = $("#actual-charge-value").val()-$("#should-charge-value").val();
	if(result < 0){
		result = 0 - result;
		result = formatNumber(result,2);
		alert("欠收费"+result+"元，请收齐后完成结算流程。");
		return false;
	}else{
		result = formatNumber(result,2);
		$("#odd-charge-value").attr("value",result);
// 		alert($("#odd-charge-value").val());
		alert("成功为患者 "+$("#patient-name").val()+" 办理结算，请找回患者"+result+"元。");
		return true;
	}
// 	var result = $("#actual-charge").val()-$("#should-charge-value").find("input[type=hidden]").val();
// 	alert($("#should-charge-value").find("input[type='hidden']").val());
// 	alert($("#actual-charge").val()+" "+result+" "+$("#should-charge-value").val());
// 	if(result<0){
// 		result=0-result;
// 		alert("欠收费"+result+"元，请收起后完成结算流程。");
// 		return false;
// 	}else{
// 		alert("成功为患者办理诊疗结算，应找零费用为"+result+"元。");
// 		return true;
// 	}
}
</script>
	<script type="text/javascript">
function formatNumber(num, precision, separator) {
	var parts;
	// 判断是否为数字
	if (!isNaN(parseFloat(num)) && isFinite(num)) {
		// 把类似 .5, 5. 之类的数据转化成0.5, 5, 为数据精度处理做准, 至于为什么
		// 不在判断中直接写 if (!isNaN(num = parseFloat(num)) && isFinite(num))
		// 是因为parseFloat有一个奇怪的精度问题, 比如 parseFloat(12312312.1234567119)
		// 的值变成了 12312312.123456713
		num = Number(num);
		// 处理小数点位数
		num = (typeof precision !== 'undefined' ? num
				.toFixed(precision) : num).toString();
		// 分离数字的小数部分和整数部分
		parts = num.split('.');
		// 整数部分加[separator]分隔, 借用一个著名的正则表达式
		parts[0] = parts[0].toString().replace(
				/(\d)(?=(\d{3})+(?!\d))/g, '$1' + (separator || ','));

		return parts.join('.');
	}
	return NaN;
}
</script>

</body>
</html>
