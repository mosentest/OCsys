<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ page import="com.llx.ocsys.entity.TbDrugInformation"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
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

<title>My JSP 'drug-information.jsp' starting page</title>

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
<link rel="stylesheet" href="css/uniform.css" />

<link rel="stylesheet" href="css/information-input.css" />
<link rel="stylesheet" href="css/table-empty.css">
<link rel="stylesheet" href="css/input-hight.css">

</head>

<body>

	<!--Header-part-->
	<div id="header">
		<h1>
			<a href="index.jsp">Matrix Admin</a>
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
		<a href="#" class="visible-phone"><i class="icon icon-list"></i>
			基础信息管理</a>
		<ul>
			<li><a href="index.jsp"><i class="icon icon-home"></i> <span>欢迎使用本系统</span></a>
			</li>
			<!--
            	作者：515898710@QQ.COM
            	时间：2014-12-30
            	描述：修改菜单
            -->
			<li class="submenu active open"><a href="#"><i
					class="icon icon-list"></i> <span>基础信息管理</span> <span
					class="label label-important">2</span></a>
				<ul>
					<li class="active"><a href="show_drug_information">药品信息管理</a></li>
					<li><a href="show_checkitem_information">检查信息管理</a></li>
				</ul></li>
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>划价收费管理</span> <span class="label label-important">4</span></a>
				<ul>
					<li><a href="jsp/charge-management/manage_registration.jsp">办理挂号</a></li>
					<li><a href="show_registration_information">诊疗结算</a></li>
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
				<a href="index.jsp" title="返回主页" class="tip-bottom"><i
					class="icon-home"></i> 主页</a> <a href="#" class="tip-bottom">基础信息管理</a>
				<a href="#" class="current">药品信息管理</a>
			</div>
			<!--<h1>Common Form Elements</h1>-->
			<!--
                	作者：515898710@qq.com
                	时间：2014-12-30
                	描述：添加按钮
                -->
			<div class="container-fluid">

				<div class="row-fluid">
					<button type="button" class="btn btn-primary btn-lg"
						data-toggle="modal" data-target="#myModal">添加药品信息</button>
				</div>
			</div>
		</div>
		<div class="container-fluid">
			<hr>
			<div class="row-fluid">
				<div class="span12">

					<!--
                	作者：515898710@qq.com
                	时间：2014-12-30
                	描述：表格开始
                -->
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-th"></i>
							</span>
							<h5>药品信息表</h5>
							<span class="label label-info">Featured</span>
						</div>
						<div class="widget-content ">
							<table id="drug-table"
								class="table table-bordered table-striped with-check data-table">
								<thead>
									<tr>
										<th><input type="checkbox" id="title-table-checkbox"
											name="title-table-checkbox" /></th>
										<th style="width: 35px;">序号</th>
										<th>药品编号</th>
										<th>通用名称</th>
										<th>药品规格</th>
										<th>发药单位</th>
										<th>计费单价</th>
										<th>操作</th>
									</tr>
								</thead>
								<tbody>
									<%
										ArrayList<TbDrugInformation> list = (ArrayList<TbDrugInformation>) session.getAttribute("drugInformationsList");
										if (!list.isEmpty()) {
											for (int i = 0; i < list.size(); i++) {
												TbDrugInformation drug = (TbDrugInformation) list.get(i);
									%>
									<tr>
										<td><input type="checkbox" /></td>
										<th><%=i + 1%></th>
										<td><%=drug.getDrugNumber()%></td>
										<td><%=drug.getDrugName()%></td>
										<td><%=drug.getDrugSpecifications()%></td>
										<td><%=drug.getDrugUnit()%></td>
										<td><%=drug.getDrugFee()%></td>
										<td class="taskOptions"><a href="#" onclick="setDrugInformation('<%=drug.getDrugNumber()%>','<%=drug.getDrugName()%>','<%=drug.getDrugFee()%>')"
											class="tip-top" data-original-title="修改单价"><i
												class="icon-pencil" style="color: #468847"
												data-toggle="modal" data-target="#modMedicalPrice"></i></a></td>
									</tr>
									<%
										}
										}
									%>
									<!-- 									<s:iterator id="list" value="drugInformationsList"> -->
									<!-- 										<s:if test="#list!=null"> -->
									<!-- 											<s:property value="list.drugId" /> -->
									<!-- 											<s:property value="list.drugNumber" /> -->
									<!-- 											<s:property value="list.drugName" /> -->
									<!-- 											<s:property value="list.drugSpecifications" /> -->
									<!-- 											<s:property value="list.drugUnit" /> -->
									<!-- 											<s:property value="list.drugFee" /> -->
									<!-- 										</s:if> -->
									<!-- 									</s:iterator> -->
								</tbody>
							</table>
						</div>
					</div>
					<!--
                	作者：515898710@qq.com
                	时间：2014-12-30
                	描述：表格结束2
                -->
				</div>
			</div>
		</div>
	</div>
	<!--
      作者：515898710@qq.com
      时间：2015-01-06
      描述：添加药品模态框开始
                         -->
	<div class="modal fade" id="myModal" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only"></span>
					</button>
					<h4 class="modal-title" id="myModalLabel">填写新药品信息</h4>
				</div>
				<form action="add_drug_information" method="post">
					<div class="modal-body set-hight">
						<div>
							<div class="add-information">药品编号：</div>
							<input type="text" required="required" pattern="^[\d]{1,20}$"
								title="编号最长为20位阿拉伯数字" name="drugInformation.drugNumber" />
						</div>
						<div>
							<div class="add-information">通用名称：</div>
							<input type="text" required="required" maxLength="100"
								title="请输入最多50个中文或100个字母的名称。" name="drugInformation.drugName" />
						</div>
						<div>
							<div class="add-information">药品规格：</div>
							<input type="text" required="required" maxLength="20"
								name="drugInformation.drugSpecifications" />
						</div>
						<div>
							<div class="add-information">发药单位：</div>
							<input type="text" required="required" maxLength="20"
								name="drugInformation.drugUnit" />
						</div>
						<div>
							<div class="add-information">计费单价：</div>
							<input type="number" min="0.00" max="99999999.99" value="0.00" step="0.01" name="drugInformation.drugFee" />
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">保存</button>
						<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!--
      	作者：515898710@qq.com
      	时间：2015-01-06
      	描述：添加药品模态框结束
      -->

	<!-- 修改价格模态框开始 -->
	<div class="modal fade" id="modMedicalPrice" tabindex="-1"
		role="dialog" aria-labelledby="@myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header set-hight">
					<button class="close" data-dismiss="modal">
						<span aria-hidden="true">&times;</span><span class="sr-only"></span>
					</button>
					<h4 class="modal-title" id="myModalLabel">修改药品单价</h4>
				</div>
				<form action="mod_drug_pirce" method="post">
					<div class="modal-body set-hight" style="max-height: 450px;">
						<div>
							<div class="add-information">药品编号：</div>
							<input type="text" id="a-number" name="drugInformation.drugNumber"
								readonly="readonly" />
						</div>
						<div>
							<div class="add-information">通用名称：</div>
							<input type="text" id="a-name" readonly="readonly" />
						</div>
						<div>
							<div class="add-information">计费单价：</div>
							<input type="number" min="0.00" max="99999999.99" value="0.00" step="0.01"
								maxlength="10" id="a-fee" name="drugInformation.drugFee" />
						</div>
					</div>
					<div class="modal-footer">
						<button type="submit" class="btn btn-primary">确定</button>
						<button class="btn btn-default" data-dismiss="modal">取消</button>
					</div>
				</form>
			</div>
		</div>
	</div>
	<!-- 	修改价格模态框结束 -->
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

	<script type="text/javascript">
		function setDrugInformation(number,name,fee) {
		$("#a-number").attr("value",number);
		$("#a-name").attr("value",name);
		$("#a-fee").attr("value",fee);
		}	
	</script>
	
</body>
</html>
