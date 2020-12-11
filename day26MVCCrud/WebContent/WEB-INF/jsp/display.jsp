<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
   <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<c:forEach items="${li}" var="l">
<c:out value="${l.sid }"/> 
<c:out value="${l.sname }"/>
<c:out value="${l.sadd }"/><a href="./delete?sid=${l.sid }">del</a> <a href="">edit</a><br>
</c:forEach>
</body>
</html>