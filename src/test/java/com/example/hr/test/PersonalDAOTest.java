package com.example.hr.test;

import static org.junit.jupiter.api.Assertions.*;
import com.example.hr.dao.impl.AdminDAO;
import com.example.hr.dao.impl.PersonalDAO;
import com.example.hr.entities.PersonalBean;
import org.junit.jupiter.api.Test;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
class PersonalDAOTest {
  private final PersonalDAO personalDAO = new PersonalDAO();

  @Test
  void savePersonal() {
    PersonalBean personalBean = new PersonalBean();
    personalBean.setFirstName("Toan");
    personalBean.setLastName("Nguyen");
    personalBean.setEmail("nktoanwork@gmail.com");
    personalBean.setHobbies("Swimming");
    personalBean.setArea("Europe");
    personalBean.setGender("Male");
    personalBean.setDescription("Hello, my name is Toan!");

    personalDAO.save(personalBean);
  }

  @Test
  void getAllPersonals() {
    System.out.println(new AdminDAO().isExistsByUsernameAndPassword("nktoan", "123123"));
  }
}