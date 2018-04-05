<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>start page</title>
</head>
<body>
	Hello User!!!
	<form action="MainServlet" method="post">
		<p><input type="hidden" name="action" value="show_cars"/></p>
		<p ><input type="submit" value="Show cars list"/>
	</form>
</body>
</html>