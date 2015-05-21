<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
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

<title>My JSP 'login.jsp' starting page</title>

<meta http-equiv="pragma" content="no-cache">
<meta http-equiv="cache-control" content="no-cache">
<meta http-equiv="expires" content="0">
<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
<meta http-equiv="description" content="This is my page">

<link rel="stylesheet" href="css/bootstrap.min.css" />
<link rel="stylesheet" href="css/bootstrap-responsive.min.css" />
<link rel="stylesheet" href="css/matrix-login.css" />
<link href="font-awesome/css/font-awesome.css" rel="stylesheet" />

</head>

<body>
	<div id="loginbox">
		<form id="loginform" action="login" class="form-vertical" method="post">
			<div class="control-group normal_text">
				<h3>
					<img src="img/logo.png" alt="Logo" />
				</h3>
			</div>
			<s:fielderror></s:fielderror>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lb"><i class="icon-credit-card"></i></span><input
							type="text" placeholder="工作证号" required="required" name="loginDTO.number"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_lg"><i class="icon-user"></i></span><input
							type="text" placeholder="用户名" required="required" name="loginDTO.username"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<span class="add-on bg_ly"><i class="icon-lock"></i></span><input
							type="password" placeholder="密码" required="required" name="loginDTO.password"/>
					</div>
				</div>
			</div>
			<div class="control-group">
				<div class="controls">
					<div class="main_input_box">
						<input type="text" placeholder="验证码" required="required" name="loginDTO.code"/>
						<img src="SecurityCodeImageAction" id="code" alt="看不清，换一张" />
					</div>
				</div>
			</div>
			<div class="form-actions">
				<!-- href="" -->
				<span class="pull-left"><a class="flip-link btn btn-info"
					id="to-recover">忘记密码？</a></span> <span class="pull-right"><button
					type="submit" class="btn btn-success" /> 登录</button></span>
			</div>
		</form>
		<form id="recoverform" action="" class="form-vertical">
			<!--<p class="normal_text">Enter your e-mail address below and we will send you instructions how to recover a password.</p>-->
			<p class="normal_text">请输入你的邮箱地址，我们将尽快处理。</p>
			<div class="controls">
				<div class="main_input_box">
					<span class="add-on bg_lo"><i class="icon-envelope"></i></span><input
						type="text" placeholder="邮箱地址" required="required"/>
				</div>
			</div>

			<div class="form-actions">
				<!-- href="" -->
				<span class="pull-left"><a class="flip-link btn btn-success"
					id="to-login">&laquo; 返回登陆</a></span> <span class="pull-right"><button
					class="btn btn-info" />确认</button></span>
			</div>
		</form>
	</div>

	<script src="js/jquery.min.js"></script>
	<script src="js/matrix.login.js"></script>
	<script type="text/javascript">
	$(function () {  
	    //点击图片更换验证码
	    $("#code").click(function(){
	        $(this).attr("src","SecurityCodeImageAction?timestamp="+new Date().getTime());
	    });
	});
	</script>
</body>
</html>
