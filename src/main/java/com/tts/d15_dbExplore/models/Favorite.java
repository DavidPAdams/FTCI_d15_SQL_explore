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
public class Favorite {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="book_id")
  private Long id;
  
  private String title;
  private String author;
  private Date published;
  
  @Column
  @CreationTimestamp
  private Date createdAt;
  
  @Column
  @UpdateTimestamp
  private Date updatedAt;

  public Favorite() {}

  public Favorite(String title, String author,
      Date published) {
    this.title = title;
    this.author = author;
    this.published = published;
  }

  public Favorite(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public Long getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }

  public Date getPublished() {
    return published;
  }

  public Date getCreatedAt() {
    return createdAt;
  }

  public Date getUpdatedAt() {
    return updatedAt;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public void setAuthor(String author) {
    this.author = author;
  }

  public void setPublished(Date published) {
    this.published = published;
  }

  public void setCreatedAt(Date createdAt) {
    this.createdAt = createdAt;
  }

  public void setUpdatedAt(Date updatedAt) {
    this.updatedAt = updatedAt;
  }

  @Override
  public String toString() {
    return "Favorite [id=" + id + ", title=" + title
        + ", author=" + author + ", published=" + published
        + ", createdAt=" + createdAt + ", updatedAt="
        + updatedAt + "]";
  }
  
}
