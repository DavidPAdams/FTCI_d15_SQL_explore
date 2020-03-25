package com.tts.d15_dbExplore.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

@Entity
public class User {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="user_id")
  private Long id;
  
  private String firstName;
  private String lastName;
  private Integer age;
  
  @Column
  @CreationTimestamp
  private Date createdAt;
  
  @Column
  @UpdateTimestamp
  private Date updatedAt;

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
    return id;
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

  public Date getUpdatedAt() {
    return updatedAt;
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

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "User [id=" + id + ", firstName=" + firstName
        + ", lastName=" + lastName + ", age=" + age
        + ", createdAt=" + createdAt + ", updatedAt="
        + updatedAt + "]";
  }
  
}
