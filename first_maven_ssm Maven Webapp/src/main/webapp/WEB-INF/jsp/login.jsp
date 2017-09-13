<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
</head>

<body>
	<form action="login" method="post">
   		用户名：<input name="username" type="text"><br/>
   		密码&nbsp;&nbsp;：<input name="password" type="password"><br/><br/>
   		<input name=“login” type="submit" value="登陆">
   		&nbsp;&nbsp;
  		<input name=“register”  value="注册" type="button" onclick="location='/first_maven_ssm/initregister'">
   </form>
</body>
</html>
