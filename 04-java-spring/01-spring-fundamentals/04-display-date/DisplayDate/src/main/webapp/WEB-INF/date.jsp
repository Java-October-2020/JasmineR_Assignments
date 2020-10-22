<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Time and Date</title>
<link rel ="stylesheet" href="css/main.css">
</head>
<body onload="alertPage('<c:out value="${dt}"/>')">
	<h1 class=<c:out value="${ dt }"/>><c:out value="${ dtFormat }"/></h1>
		<script defer type="text/javascript" src="js/main.js"></script>
</body>
</html>