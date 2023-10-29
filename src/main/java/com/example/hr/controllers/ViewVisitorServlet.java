package com.example.hr.controllers;

import com.example.hr.entities.PersonalBean;
import com.example.hr.services.impl.PersonalServices;
import java.io.IOException;
import java.util.List;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
@WebServlet(value = "/")
public class ViewVisitorServlet extends HttpServlet {
  private final PersonalServices personalServices = new PersonalServices();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String key = req.getParameter("key");
    List<PersonalBean> personals = null;
    if (key == null) {
      personals = personalServices.getAllPersonals();
    } else {
      personals = personalServices.searchByFirstName(key);
    }
    req.setAttribute("personals", personals);
    req.getRequestDispatcher("/views/home.jsp").forward(req, resp);
  }
}
