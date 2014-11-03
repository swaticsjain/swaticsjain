<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
<%@ taglib uri="http://java.sun.com/jstl/core_rt" prefix="c" %>    
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="createuser">Create a new user</a>

	<hr/>

	<c:if test="${users ne null}">
	
		<c:forEach var="user" items="${users}">
			Hello ${user.firstName} ${user.lastName}
			<br/><br/>	
		</c:forEach>
	
	</c:if>
	<c:if test="{user eq null}">
		No user added...
	</c:if>

</body>
</html>