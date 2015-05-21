<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<base href="<%=basePath%>">

<title>My JSP 'error.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />

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
					<li><a href="login.html"><i class="icon-key"></i> Log Out</a></li>
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
		<a href="#" class="visible-phone"><i class="icon icon-info-sign"></i>
			错误</a>
		<ul>
			<li class="active"><a href="index.jsp"><i
					class="icon icon-home"></i> <span>欢迎使用本系统</span></a></li>
			<!--
                	作者：515898710@QQ.COM
                	时间：2014-12-30
                	描述：修改菜单
                -->
			<li class="submenu"><a href="#"><i class="icon icon-th-list"></i>
					<span>基础信息管理</span> <span class="label label-important">2</span></a>
				<ul>
					<!-- 				/OCsys/jsp/base-information/drug_information.jsp -->
					<li><a href="show_drug_information">药品信息管理</a></li>
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
					<li><a href="invoice.html">账单信息统计</a></li>
					<li><a href="chat.html">登入登出统计</a></li>
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
				<a href="#" title="返回主页" class="tip-bottom"><i
					class="icon-home"></i> 主页</a> <a href="#">错误信息</a> <a
					href="#" class="current">404</a>
			</div>
			<h1>404 错误</h1>
		</div>
		<div class="container-fluid">
			<div class="row-fluid">
				<div class="span12">
					<div class="widget-box">
						<div class="widget-title">
							<span class="icon"> <i class="icon-info-sign"></i>
							</span>
							<h5>404 错误</h5>
						</div>
						<div class="widget-content">
							<div class="error_ex">
								<h1>404</h1>
								<h3>噢，你迷路了吗？</h3>
								<p>没有找到你所需要的页面。</p>
								<a class="btn btn-warning btn-big" href="index.jsp">返回主页</a>
							</div>
						</div>
					</div>
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
	<script src="js/maruti.html"></script>
</body>
</html>
