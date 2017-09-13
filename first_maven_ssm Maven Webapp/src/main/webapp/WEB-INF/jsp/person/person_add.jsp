<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>

</head>

<body>
	<h1>add person</h1>
	<form action="/first_maven_ssm/person/addperson" method="post">
			姓名:
			<input type="text" id="name" name="name">
			<br />
			年龄：
			<input type="text" id="age" name="age">
			<br />
			性别：
			<input type="text" id="sex" name="sex">
			<br />
			收入：
			<input type="text" id="income" name="income">
			<br />
			<center>
				<input type="submit" value="提交" name="submit" />
				<input type="button" value="取消" name="reset" />
			</center>
		</form>
</body>
</html>
