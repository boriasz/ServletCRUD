<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css" rel="stylesheet">
</head>
 <script src="http://code.jquery.com/jquery.js"></script>
			<script src="js/bootstrap.min.js"></script>
<body>
	<jsp:useBean id="runningShoes"
		class="com.ServletCRUD.data.runningShoes" scope="request" />
	<jsp:setProperty name="runningShoes" property="*" />
	<jsp:useBean id="storage"
		class="com.ServletCRUD.dataStorage.DataStorage" scope="application" />
	<%
		String idToDelete = request.getParameter("deletedid");
		storage.deleteShoes(idToDelete);
		if (storage.size > 0) {
			response.sendRedirect("showAllShoes.jsp");
		} else {
			response.sendRedirect("index.jsp");
		}
	%>
</body>
</html>