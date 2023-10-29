package com.example.hr.services.impl;

import com.example.hr.dao.impl.AdminDAO;
import com.example.hr.services.IAdminServices;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public class AdminServices implements IAdminServices {
  private final AdminDAO adminDAO = new AdminDAO();

  @Override
  public String login(String username, String password) {
    boolean isExists =
        adminDAO.isExistsByUsernameAndPassword(username, password);
    return isExists ? "SUCCESS" : "Username or password is invalid!";
  }
}
