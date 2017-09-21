<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<meta charset="utf-8">

<!-- 包含头部信息用于适应不同设备 -->
<meta name="viewport" content="width=device-width, initial-scale=1">
<!-- 包含 bootstrap 样式表 -->
<link rel="stylesheet"
	href="https://apps.bdimg.com/libs/bootstrap/3.2.0/css/bootstrap.min.css">
<h1>欢迎,${username }</h1>
</head>



<body>
	<h1>Person List</h1>
	<div class="container">
		<form name="personlist" action="/first_maven_ssm/person/deleteperson"
			method="post">


			<div class="table-responsive">
				<table class="table table-striped table-bordered table-hover">
					<thead>
						<tr>
							<td></td>
							<td>ID</td>
							<td>name</td>
							<td>age</td>
							<td>sex</td>
							<td>income</td>
							<td></td>
						</tr>
					</thead>
					<tbody>
						<c:forEach items="${personlist }" var="person">
							<tr>
								<td><input type="radio" name="ids" value="${person.id}">
								</td>

								<td>${person.id }</td>


								<td>${person.name }</td>
								<td>${person.age }</td>




								<td>${person.sex}</td>


								<td>${person.income }</td>
								<td><a
									href="/first_maven_ssm/person/initupdateperson?id=${person.id}">
										更新 </a></td>
							</tr>
						</c:forEach>
					</tbody>
				</table>

				<center>
					<input type="submit" value="删除项目" class="btn btn-default btn-lg">
					 <input type="button" value="新建项目" class="btn btn-default btn-lg" 
						onclick="location='/first_maven_ssm/person/initaddperson'">
				</center>
			</div>
		</form>

	</div>

	<!-- JavaScript 放置在文档最后面可以使页面加载速度更快 -->
	<!-- 可选: 包含 jQuery 库 -->
	<script
		src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>
	<!-- 可选: 合并了 Bootstrap JavaScript 插件 -->
	<script
		src="https://apps.bdimg.com/libs/bootstrap/3.2.0/js/bootstrap.min.js"></script>
	<script language="javascript">
window.onload = function() {

	if ('${insert}' == 'success') {
		alert("新增人员信息成功!");
	}

	if ('${insert}' == 'error') {
		alert("新增人员信息失败!");
	}

	if ('${update}' == 'success') {
		alert("修改人员信息成功!");
	}

	if ('${update}' == 'error') {
		alert("修改人员信息失败!");
	}

	if ('${delete}' == 'success') {
		alert("删除人员信息成功!");
	}

	if ('${delete}' == 'error') {
		alert("删除人员信息失败!");
	}
};
</script>
</body>
</html>
