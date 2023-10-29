package com.example.hr.services;

import com.example.hr.entities.PersonalBean;
import java.util.List;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public interface IPersonalServices {
  String createPersonal(PersonalBean personal);
  List<PersonalBean> getAllPersonals();
  List<PersonalBean> searchByFirstName(String key);
}
