package com.builder.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import com.builder.*;
/**
 * Servlet implementation class carOrderServlet
 */
@WebServlet("/orderCar")
public class CarOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CarOrderServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at1: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String size = request.getParameter("size");
        String crust = request.getParameter("crust");
        String[] toppings = request.getParameterValues("toppings");

        CarBuilder builder = new ConcreteCarBuilder();
        builder.setSize(size).setCrust(crust);
        for (String topping : toppings) {
            builder.addTopping(topping);
        }
        Car car = builder.build();

        // Forward to a JSP page to display the pizza order summary
        request.setAttribute("car", car);
        RequestDispatcher dispatcher = request.getRequestDispatcher("orderSummary.jsp");
        dispatcher.forward(request, response);
    }

}
