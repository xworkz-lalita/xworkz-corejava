<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Registration for majatalkies</h1>
${message}
<form action="register" method="post">
<pre>
Name<input type="text" name="name" />
Hobbies<input type="text" name="hobbies" />
Location<input type="text" name="location" />
Email<input type="text" name="email" />
<input type="submit" value="send"/>
</pre>
</form>
</body>
</html>