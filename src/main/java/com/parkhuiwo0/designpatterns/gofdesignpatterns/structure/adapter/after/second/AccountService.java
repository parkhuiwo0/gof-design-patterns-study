package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.second;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security.UserDetails;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security.UserDetailsService;

public class AccountService implements UserDetailsService {

    public Account findAccountByUsername(String username) {
        Account account = new Account();
        account.setName(username);
        account.setPassword(username);
        account.setEmail(username);
        return account;
    }

    public void createNewAccount(Account account) {

    }

    public void updateAccount(Account account) {

    }

    @Override
    public UserDetails loadUser(String username) {
        return findAccountByUsername(username);
    }

}
