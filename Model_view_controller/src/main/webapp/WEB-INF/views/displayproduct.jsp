<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	import="java.util.List,com.IET.beans.Product" pageEncoding="ISO-8859-1"%>

<%@taglib prefix="c" uri="http://java.sun.com/jstl/core_rt"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head><br><br><br>
<h1 align="center">Your Product List !!!</h1>
<body>
<table align="center" border="1">
  <!--  <tr>
      <th>Product pid</th>
   	  <th>Product name</th>
   	  <th>Product Qty</th>
   	  <th>Product price</th>
   	  
   </tr> -->
<c:forEach var="prod" items="${plist}">
    <tr>
      <td>${prod.pid}</td>
      <td>${prod.pname}</td>
      <td>${prod.qty}</td>
      <td>${prod.price}</td>
      <td>
         <a href="edit/${prod.pid}">edit </a>/
		<a href="delete/${prod.pid}">delete </a>
      </td>
    </tr>
 
 </c:forEach>
 </table><br>
<div align="center">
<b> <a href="addnewproduct">Add new product</a>&nbsp;&nbsp;&nbsp;&nbsp;
 <br><br>
 <b><a href="logout">logout</a>
</body>
</html>