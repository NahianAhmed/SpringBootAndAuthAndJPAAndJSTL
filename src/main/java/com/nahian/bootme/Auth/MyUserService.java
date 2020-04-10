package com.nahian.bootme.Auth;

import com.nahian.bootme.Model.MyUserDetails;
import com.nahian.bootme.Model.Users;
import com.nahian.bootme.Repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class MyUserService implements UserDetailsService {
    @Autowired
    AuthRepository authRepository;

    @Override
    public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
        Optional<Users> users = authRepository.findByUserName(userName);
        users.orElseThrow(()-> new UsernameNotFoundException("Not Found "+userName ));
       return users.map(MyUserDetails::new).get();
    }
}
