<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
     <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
   <%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="database" driver="com.mysql.cj.jdbc.Driver" url="jdbc:mysql://localhost:3306/keerthidb" 
user="root" password="root"></sql:setDataSource>
<sql:update dataSource="${database }" var="output">
update college set name=? where roll="${param.roll}";
<sql:param value="${param.name }"/>
</sql:update>
<c:if test="${output>=1}">
updated successfully
</c:if>
</body>
</html>