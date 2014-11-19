<%@page import="com.ServletCRUD.data.runningShoes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="storage" class="com.ServletCRUD.dataStorage.DataStorage" scope="application"/>
<jsp:useBean id="shoe" class="com.ServletCRUD.data.runningShoes" scope="session" />



<form action="showShoe.jsp">

  Brand :<input type="text" name="brand" value="${runningShoes.brand}" /><br />
  Model :<input type="text"  name="model" value="${runningShoes.model}" /><br />
  Foot Type: <select name="footType">
  <option value="Pronation" ${runningShoes.footType == 'Pronation' ? 'selected' : ''}>Pronation</option> 
  <option value="Neutral" ${runningShoes.footType == 'Neutral' ? 'selected' : ''}>Neutral</option>
  <option value="Supination"${runningShoes.footType == 'Supination' ? 'selected' : ''}>Supination</option>
  </select>
  Foot Type: <select name="runnersWeight">
  <option value="60"${runningShoes.runnersWeight == '60' ? 'selected' : ''}>60</option> 
  <option value="70"${runningShoes.runnersWeight == '70' ? 'selected' : ''}>70</option>
  <option value="80"${runningShoes.runnersWeight == '80' ? 'selected' : ''}>80</option>
  <option value="90"${runningShoes.runnersWeight == '90' ? 'selected' : ''}>80+</option>
  </select>
  Price :<input type="text"  name="price" value="${runningShoes.price}" /><br />
  Color :<input type="text"  name="color" value="${runningShoes.color}" /><br />
  <input type="submit" value=" OK ">
  	
  
  
</form>
	<a href="index.jsp">Back to menu</a>
</body>
</html>