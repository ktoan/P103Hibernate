package com.example.hr.utils;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public class HibernateUtils {
  private static final EntityManagerFactory entityManagerFactory;

  static {
    try {
      entityManagerFactory = Persistence.createEntityManagerFactory("hr");
    } catch (Exception ex) {
      throw new ExceptionInInitializerError(
          "Error creating EntityManagerFactory: " + ex);
    }
  }

  public static EntityManager getEntityManager() {
    return entityManagerFactory.createEntityManager();
  }
}
