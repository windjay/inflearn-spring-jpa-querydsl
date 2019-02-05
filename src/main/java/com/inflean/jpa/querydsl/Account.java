package com.inflean.jpa.querydsl;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Account {

  @Id @GeneratedValue
  private Long id;

  private String username;

  private String firstname;

  private String lastename;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getUsername() {
    return username;
  }

  public void setUsername(String username) {
    this.username = username;
  }

  public String getFirstname() {
    return firstname;
  }

  public void setFirstname(String firstname) {
    this.firstname = firstname;
  }

  public String getLastename() {
    return lastename;
  }

  public void setLastename(String lastename) {
    this.lastename = lastename;
  }
}
