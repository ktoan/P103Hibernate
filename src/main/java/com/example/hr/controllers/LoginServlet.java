package com.example.hr.controllers;

import com.example.hr.services.impl.AdminServices;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
@WebServlet(value = "/login")
public class LoginServlet extends HttpServlet {
  private final AdminServices adminServices = new AdminServices();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String username = req.getParameter("username");
    String password = req.getParameter("password");

    String loginStatus = adminServices.login(username, password);

    if ("SUCCESS".equals(loginStatus)) {
      HttpSession session = req.getSession();
      session.setAttribute("username", username);
      resp.sendRedirect("/");
    } else {
      req.setAttribute("ErrorMessage", loginStatus);
      req.getRequestDispatcher("/views/login.jsp").forward(req, resp);
    }
  }
}
