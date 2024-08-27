package com.example.accountservice.service.db;

import com.example.accountservice.dao.entity.AccountEntity;
import com.example.accountservice.dao.entity.UserEntity;
import org.apache.catalina.User;

public interface AccountService {

    AccountEntity createAccount(UserEntity user);
}
