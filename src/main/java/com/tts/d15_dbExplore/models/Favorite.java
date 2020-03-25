package com.tts.d15_dbExplore.models;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.hibernate.annotations.CreationTimestamp;

@Entity
public class Favorite {

  @Id
  @GeneratedValue(strategy=GenerationType.AUTO)
  @Column(name="book_id")
  private Long bookId;
  
  private String title;
  private String author;
  private Date published;
  
  @Column
  @CreationTimestamp
  private Date createdAt;

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
    return bookId;
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

  @Override
  public String toString() {
    return "Favorite [id=" + bookId + ", title=" + title
        + ", author=" + author + ", published=" + published
        + ", createdAt=" + createdAt + "]";
  }
  
}
