package com.dav.dbExploring.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="user_id")
  private Long userId;
  
  private String firstName;
  private String lastName;
  private Integer age;
  
  @CreationTimestamp
  private Date createdAt;

  public User() {}

  public User(String firstName, String lastName,
      Integer age) {
    this.firstName = firstName;
    this.lastName = lastName;
    this.age = age;
  }

  public User(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  public Long getId() {
    return userId;
  }

  public String getFirstName() {
    return firstName;
  }

  public String getLastName() {
    return lastName;
  }

  public Integer getAge() {
    return age;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public void setFirstName(String firstName) {
    this.firstName = firstName;
  }

  public void setLastName(String lastName) {
    this.lastName = lastName;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  @Override
  public String toString() {
    return "User [id=" + userId + ", firstName=" + firstName
        + ", lastName=" + lastName + ", age=" + age
        + ", createdAt=" + createdAt + "]";
  }
  
}
