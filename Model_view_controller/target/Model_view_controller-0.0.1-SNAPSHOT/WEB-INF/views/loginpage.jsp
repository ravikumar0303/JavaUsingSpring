<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body> 
<br></br>
<table border="2">
     ${msg}
<form action="validate" method="post">

  <label > 
   Uname:<input type="text" name="uname" id="uname"> &nbsp; &nbsp;&nbsp; &nbsp;
   Password:<input type="password" name="passwd" id="passwd">   
  </label>
    <button type="submit" name="btn" id="btn" value="login">Login</button>

</form>
</table>
</body>
</html>