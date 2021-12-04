package com.parkhuiwo0.designpatterns.gofdesignpatterns.structure.adapter.after.security;

public interface UserDetailsService {

    UserDetails loadUser(String username);

}
