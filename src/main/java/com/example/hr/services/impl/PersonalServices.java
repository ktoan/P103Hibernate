package com.example.hr.services.impl;

import com.example.hr.dao.impl.PersonalDAO;
import com.example.hr.entities.PersonalBean;
import com.example.hr.services.IPersonalServices;
import java.util.List;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public class PersonalServices implements IPersonalServices {
  private final PersonalDAO personalDAO = new PersonalDAO();

  @Override
  public String createPersonal(PersonalBean personal) {
    try {
      personalDAO.save(personal);
      return "SUCCESS";
    } catch (Exception ex) {
      return ex.getMessage();
    }
  }

  @Override
  public List<PersonalBean> getAllPersonals() {
    return personalDAO.getAllPersonals();
  }

  @Override
  public List<PersonalBean> searchByFirstName(String key) {
    return personalDAO.getByFirstName(key);
  }
}
