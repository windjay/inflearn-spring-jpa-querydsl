package com.inflean.jpa.querydsl.book;

public class BookStore {
  private int id;
  private String storeName;

  public int getId() {
    return id;
  }



  public void setId(int id) {
    this.id = id;
  }

  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }
}
