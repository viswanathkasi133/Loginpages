package com.tap.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

@WebServlet("/loginpage")
public class Main extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String email = req.getParameter("email");
        String password = req.getParameter("pass");
        
        Connection connection = null;
        PreparedStatement statement = null;
        ResultSet resultSet = null;
        
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/jsp", "root", "964018");
            statement = connection.prepareStatement("SELECT Email FROM login WHERE Email=? AND Password=?");
            statement.setString(1, email);
            statement.setString(2, password);
            resultSet = statement.executeQuery();

            if (resultSet.next()) {
                RequestDispatcher rd = req.getRequestDispatcher("welcome.jsp");
                rd.forward(req, resp);
            } else {
                PrintWriter out = resp.getWriter();
                out.println("<font color=red size=18> Login Failed !! <br>");
                out.println("<a href=login.jsp> Try Again!</a>");
            }
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
            req.setAttribute("error", e.getMessage());
            req.getRequestDispatcher("error.jsp").forward(req, resp);
        } finally {
            try {
                if (resultSet != null) resultSet.close();
                if (statement != null) statement.close();
                if (connection != null) connection.close();
            } catch (SQLException e) {
                e.printStackTrace(); 
            }
        }
    }
}



