<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<a href="/users">All users</a>

	<hr/>
	
	<form method="post" action="saveuser">
	
		Username : <input type="text" name="userName"/><br/><br/>
	
		First name : <input type="text" name="firstName"/><br/><br/>
		
		Last name : <input type="text" name="lastName"/><br/><br/>
		
		Password : <input type="password" name="password"/><br/><br/>

		Gender : <label><input type="radio" name="gender" value="male" checked="checked"/>Male</label> &nbsp;&nbsp; <label><input type="radio" name="gender" value="female"/>Female</label><br/><br/>
		
		Date of birth : <input type="text" name="dateOfBirth"/> ( mm/dd/yyyy ) <br/><br/>
	
		<input type="submit" value=" Create User "/>
	
	</form>

</body>
</html>