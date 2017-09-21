<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="utf-8"> 
	<title></title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<h1>update person</h1>
	<form class="form-horizontal" role="form" action="/first_maven_ssm/person/updateperson" method="post">


	<div class="form-group">
		<div class="col-sm-10">
			<input type="hidden" class="form-control" id="id" name="id" value="${person.id}"
				   placeholder="请输入姓名">
		</div>
	</div>


	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">姓名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="name" name="name" value="${person.name}"
				   >
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">年龄</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="age" name="age" value="${person.age}"
				   >
		</div>
	</div>


	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">性别</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="sex" name="sex" value="${person.sex}"
				   >
		</div>
	</div>

	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">收入</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="income" name="income" value="${person.income}"
				   >
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">修改</button>
		</div>
	</div>
</form>
</body>
</html>
