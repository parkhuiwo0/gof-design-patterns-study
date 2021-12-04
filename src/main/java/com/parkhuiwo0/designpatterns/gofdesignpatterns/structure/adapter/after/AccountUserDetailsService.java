package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after;

import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security.UserDetails;
import com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security.UserDetailsService;

/**
 * 간단하게 별도의 클래스로 어댑터를 만든다.
 * 여기서 Adaptee에 해당하는 클래스를 사용하는 것이다.
 */
public class AccountUserDetailsService implements UserDetailsService {

    AccountService accountService;

    public AccountUserDetailsService(AccountService accountService) {
        this.accountService = accountService;
    }

    @Override
    public UserDetails loadUser(String username) {
        Account accountByUsername = accountService.findAccountByUsername(username);

        return new AccountUserDetails(accountByUsername);
    }
}
