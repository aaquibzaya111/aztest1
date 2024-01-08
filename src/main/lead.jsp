<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="/call" method="post">
<pre>
	First Name<input type="text" name="firstName"/>
	Last Name<input type="text" name="lastName"/>
	Mobile<input type="tel" name="mobile"/>
	Email<input type="email" name="email"/>
	<input type="submit" value="save"/>
</pre></form>

</body>
</html>