package com.nahian.bootme.Model;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;


import java.util.Arrays;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class MyUserDetails implements UserDetails {
    private String userName;
    private String password;
    private List<GrantedAuthority> authorities;
    private boolean active;
    public MyUserDetails(Users users){
       this.userName=users.getUserName();
       this.password=users.getPassword();
       this.active=users.isActive();
       this.authorities=Arrays.stream(users.getRoles().split(","))
                        .map(SimpleGrantedAuthority::new)
                         .collect(Collectors.toList());
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return userName;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return active;
    }
}
