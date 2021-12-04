package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.second;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security.UserDetails;

public class AccountUserDetails implements UserDetails {

    private Account account;

    public AccountUserDetails(Account account) {
        this.account = account;
    }

    @Override
    public String getUsername() {
        return account.getName();
    }

    @Override
    public String getPassword() {
        return account.getPassword();
    }
}
