<%@page import="com.ServletCRUD.data.runningShoes"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="//netdna.bootstrapcdn.com/bootstrap/3.0.0/css/bootstrap.min.css"
	rel="stylesheet">
</head>
<script src="http://code.jquery.com/jquery.js"></script>
<script src="js/bootstrap.min.js"></script>
<body>

	<jsp:useBean id="storage"
		class="com.ServletCRUD.dataStorage.DataStorage" scope="application" />
	<jsp:useBean id="runningShoes"
		class="com.ServletCRUD.data.runningShoes" scope="session" />
	<jsp:useBean id="toEdit" class="com.ServletCRUD.data.runningShoes"
		scope="session" />
	<jsp:setProperty name="runningShoes" property="*" />
	<%
		runningShoes newShoes = new runningShoes();

		String idToUpdate = request.getParameter("updatedid");
		for (runningShoes shoes : storage.getAllShoes()) {
			if ((shoes.getId().toString()).equals(idToUpdate)) {
				newShoes = shoes;

			}

		}
		toEdit = newShoes;
		String newId = toEdit.getId().toString();
	%>


	<form action="Update2.jsp?">
		ID: <input type="text" name="id" value="<%=toEdit.getId()%>"
			readonly /><br /> Brand :<input type="text" name="brand"
			value="<%=toEdit.getBrand()%>" /><br /> Model :<input
			type="text" name="model" value="<%=toEdit.getModel()%>" /><br />
		Foot Type: <select name="footType">
			<option value="Pronation"
				<%=toEdit.getFootType().equals("Pronation") ? "selected='selected'"
					: ""%>>Pronation</option>
			<option value="Neutral"
				<%=toEdit.getFootType().equals("Neutral") ? "selected='selected'"
					: ""%>>Neutral</option>
			<option value="Supination"
				<%=toEdit.getFootType().equals("Supination") ? "selected='selected'"
					: ""%>>Supination</option>
		</select> Foot Type: <select name="runnersWeight">
			<option value="60"
				<%=toEdit.getRunnersWeight() == 60 ? "selected'selected'"
					: ""%>>60</option>
			<option value="70"
				<%=toEdit.getRunnersWeight() == 70 ? "selected'selected'"
					: ""%>>70</option>
			<option value="80"
				<%=toEdit.getRunnersWeight() == 80 ? "selected'selected'"
					: ""%>>80</option>
			<option value="90"
				<%=toEdit.getRunnersWeight() == 90 ? "selected'selected'"
					: ""%>>80+</option>
		</select> Price :<input type="text" name="price"
			value="<%=toEdit.getPrice()%>" /><br /> Color :<input
			type="text" name="color" value="<%=toEdit.getColor()%>" /><br />

		<input type="submit" value=" OK ">
	</form>
</body>
</html>