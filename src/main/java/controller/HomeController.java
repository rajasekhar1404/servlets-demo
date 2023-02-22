package controller;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.io.PrintWriter;

public class HomeController extends HttpServlet {

    @Override
    public void service(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException {
        String name = request.getParameter("name");

//        to Print on the document
//        PrintWriter out = response.getWriter();
//        out.println("hello " + name + "!...");

//        to Redirect the request to another pages.
//        response.sendRedirect("home.jsp");

//        forwarding the request to home.jsp by adding attributes to the request.
        RequestDispatcher dispatcher = request.getRequestDispatcher("home.jsp");
        request.setAttribute("name", name);
        dispatcher.forward(request, response);
    }
}
