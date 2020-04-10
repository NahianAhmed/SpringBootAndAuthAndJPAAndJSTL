package com.nahian.bootme.Service;

import com.nahian.bootme.Model.Users;
import com.nahian.bootme.Repository.AuthRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AuthService {
    @Autowired
    private AuthRepository authRepository;
    public void saveuser(Users users){
        authRepository.save(users);
    }
}
