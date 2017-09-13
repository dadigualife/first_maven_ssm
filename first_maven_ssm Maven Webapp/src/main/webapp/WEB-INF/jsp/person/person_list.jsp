<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
<head>
<title></title>
<h1>欢迎,${username }</h1>
</head>

<body>
	<h1>
			Person List
		</h1>
		<form name="personlist" action="/first_maven_ssm/person/deleteperson" method="post">
			<table width="90%" border="1">
				<tr>
					<td>
					</td>
					<td>
						ID
					</td>
					<td>
						name
					</td>
					<td>
						age
					</td>
					<td>
						sex
					</td>
					<td>
						income
					</td>
					<td>
		
					</td>
				</tr>

				<c:forEach items="${personlist }" var="person">
					<tr>
						<td>
							<input type="radio" name="ids" value="${person.id}">
						</td>

						<td>
							${person.id }
						</td>


						<td>
							${person.name }
						</td>
						<td>
							${person.age }
						</td>
						
						
						
						
						<td>${person.sex}</td>
						

						<td>
							${person.income }
						</td>
						<td>
							<a href="/first_maven_ssm/person/initupdateperson?id=${person.id}"> 更新 </a>
						</td>
					</tr>
				</c:forEach>

			</table>

			<center>
				<input type="submit" value="删除项目">
				<input type="button" value="新建项目"
					onclick="location='/first_maven_ssm/person/initaddperson'">
			</center>
		</form>
</body>
</html>
