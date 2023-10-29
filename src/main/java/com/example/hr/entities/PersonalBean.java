package com.example.hr.entities;

import jakarta.persistence.Basic;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

/**
 * @author ToanNK16
 * @birthdate Sep 2nd 2002
 * @project P103Hibernate
 * @createdAt 10/29/2023
 */
@Entity
@Table(name = "personal", schema = "dbo", catalog = "JWEBP103")
public class PersonalBean {
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Id
  @Column(name = "Id")
  private int id;
  @Basic
  @Column(name = "FirstName")
  private String firstName;
  @Basic
  @Column(name = "LastName")
  private String lastName;
  @Basic
  @Column(name = "Mobile")
  private String mobile;
  @Basic
  @Column(name = "Gender")
  private String gender;
  @Basic
  @Column(name = "Area")
  private String area;
  @Basic
  @Column(name = "Email")
  private String email;
  @Basic
  @Column(name = "Hobbies")
  private String hobbies;
  @Basic
  @Column(name = "Description")
  private String description;

  public int getId() {
    return id;
  }

  public void setId(int id) {
    this.id = id;
  }

  public String getFirstName() {
    return firstName;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public String getArea() {
    return area;
  }

  public void setArea(String area) {
    this.area = area;
  }

  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public String getHobbies() {
    return hobbies;
  }

  public void setHobbies(String hobbies) {
    this.hobbies = hobbies;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }

    PersonalBean that = (PersonalBean) o;

    if (id != that.id) {
      return false;
    }
    if (firstName != null ? !firstName.equals(that.firstName) :
        that.firstName != null) {
      return false;
    }
    if (lastName != null ? !lastName.equals(that.lastName) :
        that.lastName != null) {
      return false;
    }
    if (mobile != null ? !mobile.equals(that.mobile) : that.mobile != null) {
      return false;
    }
    if (gender != null ? !gender.equals(that.gender) : that.gender != null) {
      return false;
    }
    if (area != null ? !area.equals(that.area) : that.area != null) {
      return false;
    }
    if (email != null ? !email.equals(that.email) : that.email != null) {
      return false;
    }
    if (hobbies != null ? !hobbies.equals(that.hobbies) :
        that.hobbies != null) {
      return false;
    }
    if (description != null ? !description.equals(that.description) :
        that.description != null) {
      return false;
    }

    return true;
  }

  @Override
  public int hashCode() {
    int result = id;
    result = 31 * result + (firstName != null ? firstName.hashCode() : 0);
    result = 31 * result + (lastName != null ? lastName.hashCode() : 0);
    result = 31 * result + (mobile != null ? mobile.hashCode() : 0);
    result = 31 * result + (gender != null ? gender.hashCode() : 0);
    result = 31 * result + (area != null ? area.hashCode() : 0);
    result = 31 * result + (email != null ? email.hashCode() : 0);
    result = 31 * result + (hobbies != null ? hobbies.hashCode() : 0);
    result = 31 * result + (description != null ? description.hashCode() : 0);
    return result;
  }
}
