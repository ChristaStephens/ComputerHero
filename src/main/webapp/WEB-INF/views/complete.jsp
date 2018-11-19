<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<h1>Complete List of Inventors</h1>
	<div class="container">
	<table align ="center" border = "1">
		
			<tr>
			
				<th align ="center">Inventors</th>
			</tr>
			<ol>
<c:forEach var="completelist" items="${completelist }">
			<tr>
				<td>${completelist }</td>
				</ol>
			</tr>
			</c:forEach>
		</table>
	</div>
</body>
</html>