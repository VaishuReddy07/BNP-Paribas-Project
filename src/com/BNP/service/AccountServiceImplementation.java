package com.BNP.service;


import com.BNP.dto.AccountDto;
import com.BNP.dto.UpdateAccountDto;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class AccountServiceImplementation implements accountService {
    private final List<AccountDto> account = new ArrayList<>();

    @Override
    public AccountDto createAccount(AccountDto accountDto) {
        return null;
    }

    @Override
    public AccountDto updateAccount(UpdateAccountDto accountDto, UUID id) {
        return null;
    }

    @Override
    public AccountDto deleteAccount(UUID id) {
        return null;
    }

    @Override
    public AccountDto getAccount(UUID id) {
        return null;
    }

    @Override
    public List<AccountDto> getAccount() {
        return List.of();
    }
}
