<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<link rel="stylesheet" href="style.css">
<meta charset="ISO-8859-1">
<title>Home</title>
</head>
<body>

	<h1>Short List of Inventors</h1>

	<div class="container">
		<table align ="center" border = "1">

			<tr>

				<th align = "center">Inventors</th>
			</tr>
			<ol>
				<c:forEach var="tinylist" items="${tinylist }">
					<tr>
						<td>${tinylist }</td>
			</ol>
			</tr>
			</c:forEach>
		</table>
	</div>

</body>
</html>