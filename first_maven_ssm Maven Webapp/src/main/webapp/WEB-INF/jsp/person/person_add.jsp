<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
	<meta charset="utf-8"> 
	<title>Bootstrap </title>
	<link rel="stylesheet" href="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/css/bootstrap.min.css">  
	<script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<script src="http://cdn.static.runoob.com/libs/bootstrap/3.3.7/js/bootstrap.min.js"></script>
</head>

<body>
	<h1>add person</h1>
	<form class="form-horizontal" role="form" action="/first_maven_ssm/person/addperson" method="post">
	<div class="form-group">
		<label for="firstname" class="col-sm-2 control-label">姓名</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="name" name="name"
				   placeholder="请输入姓名">
		</div>
	</div>
	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">年龄</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="age" name="age"
				   placeholder="请输入年龄">
		</div>
	</div>


	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">性别</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="sex" name="sex"
				   placeholder="请输入性别">
		</div>
	</div>

	<div class="form-group">
		<label for="lastname" class="col-sm-2 control-label">收入</label>
		<div class="col-sm-10">
			<input type="text" class="form-control" id="income" name="income"
				   placeholder="请输入收入">
		</div>
	</div>
	
	<div class="form-group">
		<div class="col-sm-offset-2 col-sm-10">
			<button type="submit" class="btn btn-default">新增</button>
		</div>
	</div>
</form>
</body>
</html>
