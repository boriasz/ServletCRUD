<%@page import="com.ServletCRUD.data.runningShoes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>All shoes</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>
<script src="http://code.jquery.com/jquery.js"></script>
			<script src="js/bootstrap.min.js"></script>
<body>
	<jsp:useBean id="storage" class="com.ServletCRUD.dataStorage.DataStorage" scope="application"/>
		<table border="1" style="width:100%">
		<tr>
		<td><% out.println("Brand"); %> </td>
		<td><% out.println("Model"); %> </td>
		<td><% out.println("Foot Type"); %> </td>
		<td><% out.println("Runner's Weight"); %> </td>
		<td><% out.println("Price"); %> </td>
		<td><% out.println("Color"); %> </td>
		</tr>
	<%
		for(runningShoes shoes : storage.getAllShoes()){
			%>
			<tr>
			<% 
			//out.println(shoes.getId()+ "Brand: " +shoes.getBrand()+ "Model: " +shoes.getModel()+ "Foot Type: " +shoes.getFootType()+ "Runner's weight: " +shoes.getRunnersWeight()+ "Price: " +shoes.getPrice()+ "Color" +shoes.getColor());
			%>
			<td> <% out.println(shoes.getBrand()); %> </td>
			<td> <% out.println(shoes.getModel()); %> </td>
			<td> <% out.println(shoes.getFootType()); %> </td>
			<td> <% out.println(shoes.getRunnersWeight()); %> </td>
			<td> <% out.println(shoes.getPrice()); %> </td>
			<td> <% out.println(shoes.getColor()); %> </td>	
			<% 
			String newId = shoes.getId().toString();
			
			
			%>
			<td><a href="Delete.jsp?deletedid=<%=newId%>">Delete</a>
			<a href="Update.jsp?updatedid=<%=newId%>">Update</a></td>
		<%
		}
	
	%>
	 </table>
	
	
	
 
	<a href="index.jsp">Back to menu</a>
</body>
</html>