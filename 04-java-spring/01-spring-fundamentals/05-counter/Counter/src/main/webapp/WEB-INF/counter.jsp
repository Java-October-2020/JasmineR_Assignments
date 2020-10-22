<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Counter</title>
</head>
<body>
	<h1>You Have Visited My Page <c:out value ="${ count }"/> Times </h1>
	<a href = "/">Want to Try Again?</a>
	<a href = "/reset"><Button>Reset Session</Button></a>
</body>
</html>