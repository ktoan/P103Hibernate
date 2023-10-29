package com.example.hr.dao.impl;

import com.example.hr.dao.IPersonalDAO;
import com.example.hr.entities.PersonalBean;
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
public class PersonalDAO implements IPersonalDAO {
  private EntityManager entityManager;

  @Override
  public void save(PersonalBean personal) {
    entityManager = HibernateUtils.getEntityManager();
    entityManager.getTransaction().begin();
    entityManager.persist(personal);
    entityManager.getTransaction().commit();
  }

  @Override
  public List<PersonalBean> getAllPersonals() {
    entityManager = HibernateUtils.getEntityManager();
    TypedQuery<PersonalBean> query = entityManager.createQuery(
        "SELECT p FROM PersonalBean p",
        PersonalBean.class);
    List<PersonalBean> result = query.getResultList();
    entityManager.close();
    return result;
  }

  @Override
  public List<PersonalBean> getByFirstName(String key) {
    entityManager = HibernateUtils.getEntityManager();
    TypedQuery<PersonalBean> query = entityManager.createQuery(
        "SELECT p FROM PersonalBean p WHERE p.firstName LIKE :key",
        PersonalBean.class);
    query.setParameter("key", "%" + key + "%");
    List<PersonalBean> result = query.getResultList();
    entityManager.close();
    return result;
  }
}
