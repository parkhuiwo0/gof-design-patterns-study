package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter._01_before.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
