<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>New/Edit Contact</title>
</head>
<body>
	<div align="center">
		<h1>New/Edit Contact</h1>
		<form:form action="save" method="post"  modelAttribute="contact">
		
		<table cellpadding="5">	
			<tr>
				<td>Name:</td>
				<td><form:input path="name" /></td>
			</tr>
			
				
			<tr>
				<td>Email:</td>
				<td><form:input path="email" /></td>
			</tr>
			
			
				
			<tr>
				<td>Address:</td>
				<td><form:input path="address" /></td>
			</tr>
			
			
				
			<tr>
				<td>Phone:</td>
				<td><form:input path="phone" /></td>
			</tr>
			 
			<tr>
				<td colspan="2" align="center"><input type="submit" value="Save"/></td>
			</tr>
			
		</table>
		
			
			
		</form:form>
	
	</div>

	
</body>
</html>