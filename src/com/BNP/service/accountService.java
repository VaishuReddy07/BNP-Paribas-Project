package com.BNP.service;

import com.BNP.dto.AccountDto;
import com.BNP.dto.UpdateAccountDto;

import java.util.List;
import java.util.UUID;

public interface accountService {
    public AccountDto createAccount(AccountDto accountDto);
    public AccountDto updateAccount(UpdateAccountDto accountDto, UUID id);
    public AccountDto deleteAccount(UUID id);
    public AccountDto getAccount(UUID id);
    public List<AccountDto> getAccount();
    }

