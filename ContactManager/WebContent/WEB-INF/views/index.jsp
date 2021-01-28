<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
    
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Contact Manager</title>
</head>
<body>

	<div align="center"> 
		
	<h1>Contact List</h1>
	<h3> <a href="new">New Contact </a></h3>
	
	<table  border="1" cellpadding="5">
		<tr>
			<th>No</th>
			<th>Name</th>
			<th>Email</th>
			<th>Address</th>
			<th>Phone</th>
			<th>Action</th>
			
			
		
		</tr>
		<c:forEach items="${listContact}" var="contact" varStatus="status">
		
			<tr> 
				<td>${status.index+1 }</td>
				<td>${contact.name }</td>
				<td>${contact.email }</td>
				<td>${contact.address }</td>
				<td>${contact.phone }</td>
				
				
			</tr>
		</c:forEach>
	</table>
	</div>
</body>
</html>