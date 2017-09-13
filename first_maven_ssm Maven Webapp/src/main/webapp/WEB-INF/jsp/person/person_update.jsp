<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<h1></h1>
</head>

<body>
	<h1>update person</h1>
	<form action="/first_maven_ssm/person/updateperson" method="post">
			<input type="hidden" id="id" name="id" value="${person.id}"/>
			姓名:
			<input type="text" id="name" name="name" value="${person.name} ">
			<br />
			年龄：
			<input type="text" id="age" name="age" value="${person.age} ">
			<br />
			性别：
			<input type="text" id="sex" name="sex" value="${person.sex} ">
			<br />
			收入：
			<input type="text" id="income" name="income" value="${person.income} ">
			<br />
			<center>
				<input type="submit" value="修改" name="submit" />
				<input type="button" value="取消" name="reset" />
			</center>
		</form>
</body>
</html>
