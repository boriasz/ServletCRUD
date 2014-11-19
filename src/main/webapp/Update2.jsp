<%@page import="java.util.UUID"%>
<%@page import="java.lang.Integer.*"%> 
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="storage"
		class="com.ServletCRUD.dataStorage.DataStorage" scope="application" />
	<jsp:useBean id="runningShoes"
		class="com.ServletCRUD.data.runningShoes" scope="session" />
	<jsp:useBean id="toEdit"
		class="com.ServletCRUD.data.runningShoes" scope="session" />
	
	<% 
		String brand = request.getParameter("brand");
		String model = request.getParameter("model");
		String footType = request.getParameter("footType");
		String runnersWeight = request.getParameter("runnersWeight");
		int waga = Integer.parseInt(runnersWeight);
		String price = request.getParameter("price");
		float cena = Float.parseFloat(price);
		String color = request.getParameter("color");
		
		String idToUpdate = request.getParameter("id");
		UUID id = UUID.fromString(idToUpdate);
		toEdit.setId(id);
		toEdit.setBrand(brand);
		toEdit.setModel(model);
		toEdit.setFootType(footType);
		toEdit.setRunnersWeight(waga);
		toEdit.setPrice(cena);
		toEdit.setColor(color);
		System.out.print(runningShoes.getPrice());
		storage.updateShoes(toEdit);
		response.sendRedirect("index.jsp");
	%>
</body>
</html>