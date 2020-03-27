<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="f" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Update</title>
<style type="text/css">
h1 {
	text-align: center;
	color: green;
	font-family: cursive;
}
</style>
</head>
<body>
	<h1>UPDATION FORM</h1>
	<f:form action="update" method="GET" modelAttribute="cart">
		<center>
			<table>
				<tr>
					<td>S.NO</td>
					<td><f:input path="sno" /></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><f:input path="name" /></td>
				</tr>
				<tr>
					<td>Price</td>
					<td><f:input path="price" /></td>
				</tr>
				<tr>
					<td>Active</td>
					<td><f:input path="active" /></td>
				</tr>
				<tr>
					<td>Category</td>
					<td><f:input path="category" /></td>
				</tr>
				<tr>
					<td>Free Delivery</td>
					<td><f:input path="freeDelivery" /></td>
				</tr>
			</table>
		</center>
		<br>
		<center>
			<input type="submit" value="Update" />
		</center>
	</f:form>
</body>
</html>