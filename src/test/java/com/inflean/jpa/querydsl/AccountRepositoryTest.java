package com.inflean.jpa.querydsl;

import com.querydsl.core.types.Predicate;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

//import static org.assertj.core.api.Assertions.assertThat;


import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

@RunWith(SpringRunner.class)
@DataJpaTest
public class AccountRepositoryTest {


  @Autowired
  AccountRepository accountRepository;

  @Test
  public void crud() {
    // querydsl 의 predicate 를 사용하여 조건을 설정
    Predicate predicate = QAccount.account.firstname.containsIgnoreCase("windjay")
            .and(QAccount.account.lastename.startsWith("Choi"));

    Optional<Account> one = accountRepository.findOne(predicate);
    assertThat(one).isEmpty();

  }
}