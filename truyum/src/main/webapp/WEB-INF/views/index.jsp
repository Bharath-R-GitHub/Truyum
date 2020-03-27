<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Menu Items</title>
<style type="text/css">
table {
	border-collapse: collapse;
	margin: 50px auto;
	text-align: center;
}

body {
	display: flex;
	flex-direction: column;
	justify-content: center;
	min-height: 50vh;
}

h1 {
	color: green;
	text-align: center;
	font-family: cursive;
}

a {
	text-align: center;
}
</style>
</head>
<body>
	<h1>MENU ITEMS</h1>
	<table>
		<tr>
			<th>S.No</th>
			<td></td>
			<th>Name</th>
			<td></td>
			<th>Price</th>
			<td></td>
			<th>Active</th>
			<td></td>
			<th>Category</th>
			<td></td>
			<th>Free Delivery</th>
			<td></td>
			<th>Update</th>
			<td></td>
			<th>Delete</th>
			<td></td>
		</tr>
		<c:forEach var="cart" items="${carts}">
			<c:url var="editLink" value="/edit">
				<c:param name="sno" value="${cart.sno}" />
			</c:url>
			<c:url var="deleteLink" value="/delete/${cart.sno}"></c:url>
			<tr>
				<td>${cart.sno}</td>
				<td></td>
				<td>${cart.name}</td>
				<td></td>
				<td>${cart.price}</td>
				<td></td>
				<td>${cart.active}</td>
				<td></td>
				<td>${cart.category}</td>
				<td></td>
				<td>${cart.freeDelivery}</td>
				<td></td>
				<td><a href="${editLink}">Edit</a></td>
				<td></td>
				<td><a href="${deleteLink}">Delete</a></td>
			</tr>
		</c:forEach>
	</table>
	<a href="/add">Add New Items</a>
</body>
</html>