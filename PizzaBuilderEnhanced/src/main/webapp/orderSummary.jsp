<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="com.builder.Car" %>
<!DOCTYPE html>
<html>
<head>
<title>Order Summary</title>
<link rel="stylesheet"
	href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
	<div class="container mt-5">
		<h2>Car Order Summary</h2>
		<p>
			<strong>Car Type:</strong> ${car.size}
		</p>
		<p>
			<strong>Transmission:</strong> ${car.crust}
		</p>
		<p>
			<strong>Seats:</strong>
		</p>
		<ul>
			<%
    Car car = (Car) request.getAttribute("car");
    if (car != null && car.getToppings() != null) {
        for(String topping : car.getToppings()) {
%>
			<li><%= topping %></li>
			<%
        }
    }
%>
		</ul>
		<a href="orderCar.jsp" class="btn btn-primary">Order Another
			Car</a>
	</div>
</body>
</html>