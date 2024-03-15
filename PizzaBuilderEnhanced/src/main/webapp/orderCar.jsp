<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Car Order</title>
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css">
</head>
<body>
    <div class="container mt-5">
        <h2>Order Your Car</h2>
        <form action="orderCar" method="post">
            <div class="form-group">
                <label for="size">Car Type:</label>
                <select class="form-control" id="size" name="size">
                    <option>CITY_CAR</option>
                    <option>SPORTS_CAR</option>
                    <option>SUV</option>
                </select>
            </div>
            <div class="form-group">
                <label for="crust">Transmission:</label>
                <select class="form-control" id="crust" name="crust">
                    <option>SINGLE_SPEED</option>
                    <option>MANUAL</option>
                    <option>AUTOMATIC</option>
                    <option>SEMI_AUTOMATIC</option>
                </select>
            </div>
            <div class="form-group">
                <label>Seats:</label><br>
                <input type="checkbox" name="toppings" value="Four"> Four<br>
                <input type="checkbox" name="toppings" value="Eight"> Eight<br>
                <input type="checkbox" name="toppings" value="Twelve"> Twelve<br>
            </div>
            <button type="submit" class="btn btn-primary">Submit</button>
        </form>
    </div>
</body>
</html>