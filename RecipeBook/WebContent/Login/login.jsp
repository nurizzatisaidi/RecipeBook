<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
<form action ="/RecipeBook/loginController" method="post">
Username <input type = "text" name ="username"/>
Password <input type ="password" name ="password"/>
<input type ="submit" name= "login"/>
</form>

</body>
</html>