package com.omer.accounts.service.impl;

import com.omer.accounts.dto.CustomerDto;
import com.omer.accounts.repository.AccountsRepository;
import com.omer.accounts.repository.CustomerRepository;
import com.omer.accounts.service.IAccountsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class AccountServiceImpl implements IAccountsService {

    private AccountsRepository accountsRepository;
    private CustomerRepository customerRepository;

    @Override
    public void createAccount(CustomerDto customerDto) {

    }
}
