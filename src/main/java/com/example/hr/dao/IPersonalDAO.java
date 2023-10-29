package com.example.hr.dao;

import com.example.hr.entities.PersonalBean;
import java.util.List;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public interface IPersonalDAO {
  void save(PersonalBean personal);
  List<PersonalBean> getAllPersonals();
  List<PersonalBean> getByFirstName(String key);
}
