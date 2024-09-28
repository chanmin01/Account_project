package com.example.account.repository;

import com.example.account.domain.Account;
import com.example.account.domain.AccountUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface AccountRepository extends JpaRepository<Account, Long> { // entity에 등록된 primary key type, 쿼리를 자동으로 구현
    Optional<Account> findFirstByOrderByIdDesc(); // Ascending order -> 오름차순, Descending order -> 내림차순

    Integer countByAccountUser(AccountUser accountUser);

    Optional<Account> findByAccountNumber(String accountNumber);
}

