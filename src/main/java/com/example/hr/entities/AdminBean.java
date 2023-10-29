package com.example.hr.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
@Entity
@Table(name = "admin", schema = "dbo", catalog = "JWEBP103")
public class AdminBean {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "Username")
  private String username;
  @Basic
  @Column(name = "Password")
  private String password;

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    AdminBean adminBean = (AdminBean) o;

    if (username != null ? !username.equals(adminBean.username) :
        adminBean.username != null) {
      return false;
    }
    if (password != null ? !password.equals(adminBean.password) :
        adminBean.password != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = username != null ? username.hashCode() : 0;
    result = 31 * result + (password != null ? password.hashCode() : 0);
    return result;
  }
}
