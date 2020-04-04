<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product Form</title>
</head>
<body>
<form:form action="saveProduct" modelAttribute="product" method="post">
<form:hidden path="productId"/>
<table>
<tr>
<td><label>Product Name:</label></td>
<td><form:input path="productName"></form:input></td>
</tr>

<tr>
<td><label>Date Of Manufacture:</label></td>
<td><form:input path="dom"></form:input></td>
</tr>

<tr>
<td><label>Price:</label></td>
<td><form:input path="price"></form:input></td>
</tr>

<tr>
<td><label></label></td>
<td><input type="submit" value="Save" class="save"></td>
</tr>
</table>
</form:form>
<p>
<a href="${pageContext.request.contextPath}/product/listproduct">Back</a>
</p>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</body>
</html>