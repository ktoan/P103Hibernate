package com.example.hr.dao;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public interface IAdminDAO {
  boolean isExistsByUsernameAndPassword(String username, String password);
}
