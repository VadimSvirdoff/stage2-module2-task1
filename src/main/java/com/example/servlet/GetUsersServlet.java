package com.example.servlet;

import com.example.User;
import com.example.Warehouse;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Set;

@WebServlet("/users")
public class GetUsersServlet extends HttpServlet {
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Warehouse warehouse = Warehouse.getInstance();
        Set<User> users = warehouse.getUsers();
        request.setAttribute("users", users);
        RequestDispatcher dispatcher = request.getRequestDispatcher("/users");
        dispatcher.forward(request, response);
    }
}
