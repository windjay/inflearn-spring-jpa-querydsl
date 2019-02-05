package com.inflean.jpa.querydsl.book;

import static org.assertj.core.api.Assertions.*;
import org.junit.Test;

//import static org.junit.Assert.*;

public class BookStoreTest {

  @Test
  public void test() {
    BookStore bookStore = new BookStore();
    bookStore.setStoreName("myname");
    bookStore.setId(5);

    assertThat(bookStore.getStoreName()).isEqualTo("myname");
    assertThat(bookStore.getId()).isEqualTo(5);

  }

  @Test
  public void testA() {
    System.out.println("I am A");
  }

  @Test
  public void testB() {
    System.out.println("I am B");
  }

  @Test
  public void testC() {
    System.out.println("I am C");
  }



}