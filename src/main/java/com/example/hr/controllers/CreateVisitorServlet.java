package com.example.hr.controllers;

import com.example.hr.entities.PersonalBean;
import com.example.hr.services.impl.PersonalServices;
import java.io.IOException;
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
@WebServlet(value = "/create-visitor")
public class CreateVisitorServlet extends HttpServlet {
  private final PersonalServices personalServices = new PersonalServices();

  @Override
  protected void doGet(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    req.getRequestDispatcher("/views/create.jsp").forward(req, resp);
  }

  @Override
  protected void doPost(HttpServletRequest req, HttpServletResponse resp)
      throws ServletException, IOException {
    String firstName = req.getParameter("firstName");
    String lastName = req.getParameter("lastName");
    String gender = req.getParameter("gender");
    String phone = req.getParameter("phone");
    String email = req.getParameter("email");
    String description = req.getParameter("description");
    String area = req.getParameter("area");
    String hobbies = req.getParameter("hobbies");

    PersonalBean personalBean = new PersonalBean();
    personalBean.setFirstName(firstName);
    personalBean.setLastName(lastName);
    personalBean.setGender(gender);
    personalBean.setMobile(phone);
    personalBean.setEmail(email);
    personalBean.setDescription(description);
    personalBean.setArea(area);
    personalBean.setHobbies(hobbies);

    String personalCreatedStatus =
        personalServices.createPersonal(personalBean);

    resp.setContentType("text/plain");
    resp.getWriter().write(personalCreatedStatus);
  }
}
