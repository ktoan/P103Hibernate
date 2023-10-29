package com.example.hr.dao.impl;

import com.example.hr.dao.IAdminDAO;
import com.example.hr.entities.AdminBean;
import com.example.hr.utils.HibernateUtils;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import java.util.List;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
public class AdminDAO implements IAdminDAO {
  private EntityManager entityManager;

  @Override
  public boolean isExistsByUsernameAndPassword(String username,
                                               String password) {
    entityManager = HibernateUtils.getEntityManager();
    TypedQuery<Long> query = entityManager.createQuery(
        "SELECT COUNT(m) FROM AdminBean m WHERE m.username LIKE :username AND m.password LIKE :password",
        Long.class);
    query.setParameter("username", username);
    query.setParameter("password", password);
    Long count = query.getSingleResult();
    entityManager.close();
    return count > 0;
  }
}
