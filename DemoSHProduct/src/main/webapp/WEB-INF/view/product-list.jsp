<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Product List</title>
</head>
<body>
Products available
<br><br>
<c:forEach var="tempProduct" items="${products}">
<c:url var="updateLink" value="/product/showFormForUpdate">
<c:param name="productId" value="${tempProduct.productId}"></c:param></c:url>
<c:url var="deleteLink" value="/product/delete">
<c:param name="productId" value="${tempProduct.productId}"></c:param></c:url>
${tempProduct.productName}
${tempProduct.dom}
${tempProduct.price}
<a href="${updateLink}">update</a>
<a href="${deleteLink}">delete</a>
<br><br>
</c:forEach>
<br><br>
<input type="button" value="Add Product" onclick="window.location.href='showFormForAdd';return false;" class="add-button"/>
<link type="text/css" rel="stylesheet" href="${pageContext.request.contextPath}/resources/css/style.css">
</body>
</html>