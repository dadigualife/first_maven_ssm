<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
</head>

<body>
	<form action="/first_maven_ssm/register" method="post">
			用户名:
			<input type="text" id="" name="username">
			<br />
			密码：
			<input type="text" id="" name="password">
			<br />
			再次输入密码：
			<input type="text" id="" name="secondpassword">
			<br />
			<center>
				<input type="submit" value="注册" name="submit" />
				<input type="button" value="取消" name="reset" />
			</center>
		</form>
</body>
</html>
