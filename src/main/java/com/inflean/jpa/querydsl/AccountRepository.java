package com.inflean.jpa.querydsl;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

public interface AccountRepository extends JpaRepository<Account, Long>, QuerydslPredicateExecutor<Account> {
  // exends QuerydslPredicateExecutor 를 해야 findOne, findAll 등을 사용할 수 있다.

}
