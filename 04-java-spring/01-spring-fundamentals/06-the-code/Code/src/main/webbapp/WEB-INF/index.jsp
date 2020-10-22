<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix = "c" uri = "http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Code</title>
<link rel="stylesheet" href="css/main.css">
</head>
<body>
	<h3>What is the code?</h3>
	<form action= "/attempt"method="post">
	<span><c:out value="${error}"></c:out></span>
	<input type="text" name="guess" placeholder="">
	<button>Try Code</button>
	</form>
</body>
</html>