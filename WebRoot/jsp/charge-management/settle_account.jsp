<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix='fmt' uri="http://java.sun.com/jsp/jstl/fmt"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
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

<title>My JSP 'settle_account.html.jsp' starting page</title>

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

<style type="text/css">
.displayinline div {
	float: left;
	display: inline;
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
		<li><a href="index.jsp"><i class="icon icon-home"></i> <span>欢迎使用本系统</span></a>
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
				<li><a href="show_registration_information">诊疗结算</a></li>
				<li><a href="show_bills_information">诊疗退费</a></li>
				<li class="active"><a href="settle_account">收费日结</a></li>
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
<div id="content">
	<div id="content-header">
		<div id="breadcrumb">
			<a href="index.html" title="返回主页" class="tip-bottom"><i
				class="icon-home"></i> 主页</a> <a href="">划价收费管理</a> <a href="#"
				class="current">收费日结</a>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="displayinline" style="padding-left: 20px">
					<div style="font-size: 15px;font-weight: bold;">
						<div>今天总计：</div>
						<div>
							已结算记录<<b style="color: red">${chargeRecords}</b>>条，
						</div>
						<div>
							已退款记录<<b style="color: red">${refundRecords}</b>>条，
						</div>
						<div>
							经手金额<<b id="actual-charge" style="color: red">0.00</b>>元，
						</div>
						<input id="actual-charge-value" type="hidden"
							value="${actualCharge}" />
						<div>
							收入金额<<b id="should-charge" style="color: red">0.00</b>>元，
						</div>
						<input id="should-charge-value" type="hidden"
							value="${shouldCharge}" />
						<div>
							找零金额<<b id="odd-charge" style="color: red">0.00</b>>元，
						</div>
						<input id="odd-charge-value" type="hidden" value="${oddCharge}" />
						<div>
							退款金额<<b id="refund-charge" style="color: red">0.00</b>>元。
						</div>
						<input id="refund-charge-value" type="hidden"
							value="${refundCharge}" />
					</div>
				</div>
			</div>
		</div>
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
						<h5>收费日结记录表</h5>
						<span class="label label-info">Featured</span>
					</div>
					<div class="widget-content ">
						<table class="table table-bordered table-striped with-check data-table">
							<thead>
								<tr>
									<th><input type="checkbox" id="title-table-checkbox"
											name="title-table-checkbox" /></th>
									<th>序号</th>
									<th>发票编号</th>
									<th>姓名</th>
									<th>就诊号码</th>
									<!-- <th>患者类型</th> -->
									<th>实际费用</th>
									<th>付款时间</th>
									<th>退款时间</th>
									<th>状态</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<c:forEach items="${opiInformationList}" var="opiInformation"
									varStatus="varInt">
									<tr>
									<td><input type="checkbox" /></td>
									<th>${varInt.count}</th>
									<td>${opiInformation.billNumber}</td>
									<td>${opiInformation.patientName}</td>
									<td>${opiInformation.registrationNumber}</td>
									<td><input id="should-charge-${varInt.count}"
										type="hidden" value="${opiInformation.shouldCharge}">${opiInformation.shouldCharge}</td>
									<!-- <input id="actual-charge-${varInt.count}" type="hidden" value="${opiInformation.actualCharge}"> -->
									<!-- <input id="odd-charge-${varInt.count}" type="hidden" value="${opiInformation.oddChange}"> -->
									<td><fmt:formatDate value="${opiInformation.paymentTime}"
											pattern="yyyy-MM-dd HH:mm:ss" /></td>
									<td><fmt:formatDate value="${opiInformation.refundTime}"
											pattern="yyyy-MM-dd HH:mm:ss" /></td>
									<!-- <td>${opiInformation.paymentTime}</td> -->
									<!-- <td>${opiInformation.refundTime}</td> -->
									<c:choose>
										<c:when test="${opiInformation.billStatus eq '1'}">
											<td><span class="badge badge-success">已结算</span></td>
										
										</c:when>
										<c:otherwise>
											<td><span class="badge badge-inverse">已退款</span></td>
											
										</c:otherwise>
									</c:choose>
									<td class="taskOptions"><a
												href="browse_bills_information?opiInformation.registrationNumber=${opiInformation.registrationNumber}&opiInformation.billNumber=${opiInformation.billNumber}&type=1"
												class="tip-top" data-original-title="查看详情"><i
													class="icon-zoom-in" style="color: #5bb75b;"></i> </a></td>
								</tr>
								</c:forEach>
								<!-- <tr> -->
								<!-- <th><input type="checkbox" id="title-table-checkbox" -->
								<!-- name="title-table-checkbox" /></th> -->
								<!-- <th>1</th> -->
								<!-- <td>OPI2015516142213</td> -->
								<!-- <td>吴广德</td> -->
								<!-- <td>2015516142258</td> -->
								<!-- <td>19.50</td> -->
								<!-- <td>2015-05-16 14:23:26</td> -->
								<!-- <td>2015-05-16 14:23:36</td> -->
								<!-- <td><span class="badge badge-success">已退款</span></td> -->
								<!-- <td class="taskOptions"><a href="browse_bills_information?opiInformation.registrationNumber=${opiInformation.registrationNumber}&type=1" class="tip-top" -->
								<!-- data-original-title="查看详情"><i class="icon-zoom-in" -->
								<!-- style="color: #5bb75b;"></i> -->
								<!-- </a></td> -->
								<!-- </tr> -->
							</tbody>
						</table>
					</div>
				</div>
				<!--
              	作者：515898710@qq.com
              	时间：2014-12-31
              	描述：表格结束
              -->
			</div>
		</div>
	</div>
</div>
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
	window.onload = function() {
		$("#actual-charge").html(
				formatNumber($("#actual-charge-value").val(), 2));
		$("#should-charge").html(
				formatNumber($("#should-charge-value").val(), 2));
		$("#odd-charge")
				.html(formatNumber($("#odd-charge-value").val(), 2));
		$("#refund-charge").html(
				formatNumber($("#refund-charge-value").val(), 2));
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
