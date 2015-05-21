<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
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

<title>My JSP 'index.jsp' starting page</title>
<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/fullcalendar.css" />
<link rel="stylesheet" href="css/matrix-style.css" />
<link rel="stylesheet" href="css/matrix-media.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />
<link rel="stylesheet" href="css/jquery.gritter.css" />

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
					<li><a href="login.jsp"><i class="icon-key"></i> Log Out</a></li>
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
			<li class=""><a title="" href="login.jsp"><i
					class="icon icon-share-alt"></i> <span class="text">Logout</span></a></li>
		</ul>
	</div>
	<!--close-top-Header-menu-->
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
		<a href="#" class="visible-phone"><i class="icon icon-home"></i>
			主页</a>
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
				</ul>
			</li>
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
				</ul>
				
			</li>
			<li class="submenu"><a href="#"><i
					class="icon icon-tint"></i>
					<span>用户角色管理</span> <span class="label label-important">2</span></a>
				<ul>
					<!--/OCsys/jsp/base-information/drug_information.jsp -->
					<li><a href="">个人信息管理</a></li>
					<li><a href="">用户信息管理</a></li>
				</ul>
			</li>	
<!-- 			<li class="submenu"><a href="#"><li><i -->
<!-- 					class="icon icon-tint"> -->
<!-- 				<a href="operator-information.html"></i> <span>操作员信息管理</span></a></li> -->

		</ul>
	</div>
	<!--sidebar-menu-->

	<!--main-container-part-->
	<div id="content">
		<!--breadcrumbs-->
		<div id="content-header">
			<div id="breadcrumb">
				<a href="index.jsp" title="返回主页" class="tip-bottom"><i
					class="icon-home"></i> 主页</a>
			</div>
		</div>
		<!--End-breadcrumbs-->

		<!--Action boxes-->
		<div class="container-fluid">
			<div class="quick-actions_homepage">
				<ul class="quick-actions">
					<li class="bg_lb span2"><a href="show_drug_information"><i
							class="icon-dashboard"></i><span class="label label-important">20</span>
							药品信息管理
					</a></li>
					<li class="bg_lg span2"><a href="show_checkitem_information">
							<i class="icon-signal"></i> 检查项信息管理
					</a></li>
					<li class="bg_ly span2"><a href="jsp/charge-management/manage_registration.jsp"> <i
							class="icon-inbox"></i>办理挂号<span class="label label-success">101</span>
					</a></li>
					<li class="bg_lr span2"><a href="show_registration_information"> <i
							class="icon-th"></i> 诊疗结算
					</a></li>
					<li class="bg_ls span2"><a href="show_bills_information"> <i
							class="icon-fullscreen"></i> 诊疗退费
					</a></li>
					<li class="bg_lo span2"><a href="settle_account"> <i
							class="icon-th-list"></i> 收费日结
					</a></li>
					<li class="bg_lo span2"><a href="show_drug"> <i
							class="icon-tint"></i> 药品信息统计
					</a></li>
					<li class="bg_ls span2"><a href="show_checkitem"> <i
							class="icon-pencil"></i>检查项信息统计
					</a></li>
					<li class="bg_lb span2"><a href="show_registration"> <i
							class="icon-calendar"></i> 挂号单信息统计
					</a></li>
					<li class="bg_lg span2"><a href=""> <i
							class="icon-edit"></i> 账单信息统计
					</a></li>
					<li class="bg_ly span2"><a href=""> <i
							class="icon-info-sign"></i> 登入登出统计
					</a></li>
					<li class="bg_lr span2"><a href=""> <i
							class="icon-pencil"></i>检查项信息统计
					</a></li>
				</ul>
			</div>
			<!--End-Action boxes-->

			<!--Chart-box-->
			<!-- 			<div class="row-fluid"> -->
			<!-- 				<div class="widget-box"> -->
			<!-- 					<div class="widget-title bg_lg"> -->
			<!-- 						<span class="icon"><i class="icon-signal"></i></span> -->
			<!-- 						<h5>Site Analytics</h5> -->
			<!-- 					</div> -->
			<!-- 					<div class="widget-content"> -->
			<!-- 						<div class="row-fluid"> -->
			<!-- 							<div class="span9"> -->
			<!-- 								<div class="chart"></div> -->
			<!-- 							</div> -->
			<!-- 							<div class="span3"> -->
			<!-- 								<ul class="site-stats"> -->
			<!-- 									<li class="bg_lh"><i class="icon-user"></i> <strong>2540</strong> -->
			<!-- 										<small>Total Users</small></li> -->
			<!-- 									<li class="bg_lh"><i class="icon-plus"></i> <strong>120</strong> -->
			<!-- 										<small>New Users </small></li> -->
			<!-- 									<li class="bg_lh"><i class="icon-shopping-cart"></i> <strong>656</strong> -->
			<!-- 										<small>Total Shop</small></li> -->
			<!-- 									<li class="bg_lh"><i class="icon-tag"></i> <strong>9540</strong> -->
			<!-- 										<small>Total Orders</small></li> -->
			<!-- 									<li class="bg_lh"><i class="icon-repeat"></i> <strong>10</strong> -->
			<!-- 										<small>Pending Orders</small></li> -->
			<!-- 									<li class="bg_lh"><i class="icon-globe"></i> <strong>8540</strong> -->
			<!-- 										<small>Online Orders</small></li> -->
			<!-- 								</ul> -->
			<!-- 							</div> -->
			<!-- 						</div> -->
			<!-- 					</div> -->
			<!-- 				</div> -->
			<!-- 			</div> -->
			<!--End-Chart-box-->

			<hr />
		</div>
	</div>

	<!--end-main-container-part-->

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
	<script src="js/matrix.js"></script>
	<script src="js/jquery.dataTables.min.js"></script>
	<script src="js/matrix.tables.js"></script>

	<script src="js/excanvas.min.js"></script>
	<script src="js/jquery.flot.min.js"></script>
	<script src="js/jquery.flot.resize.min.js"></script>
	<script src="js/jquery.peity.min.js"></script>
	<script src="js/fullcalendar.min.js"></script>
	<script src="js/matrix.dashboard.js"></script>
	<script src="js/jquery.gritter.min.js"></script>
	<script src="js/matrix.chat.js"></script>
	<script src="js/jquery.validate.js"></script>
	<script src="js/matrix.form_validation.js"></script>
	<script src="js/jquery.wizard.js"></script>
	<script src="js/matrix.popover.js"></script>

	<!--<script src="js/matrix.interface.js"></script>-->

	<script type="text/javascript">
		// This function is called from the pop-up menus to transfer to
		// a different page. Ignore if the value returned is a null string:
		function goPage(newURL) {

			// if url is empty, skip the menu dividers and reset the menu selection to default
			if (newURL != "") {

				// if url is "-", it is this page -- reset the menu:
				if (newURL == "-") {
					resetMenu();
				}
				// else, send page to designated URL            
				else {
					document.location.href = newURL;
				}
			}
		}

		// resets the menu selection upon entry to this page:
		function resetMenu() {
			document.gomenu.selector.selectedIndex = 2;
		}
	</script>

</body>
</html>
