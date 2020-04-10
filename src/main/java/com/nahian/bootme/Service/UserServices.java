package com.nahian.bootme.Service;

import com.nahian.bootme.Model.User;
import com.nahian.bootme.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class UserServices {
    @Autowired
   private UserRepository ur;
    public Collection<User> alluser(){
        return (Collection<User>) ur.findAll();
    }
    public void saveuser(User user){
        ur.save(user);
    }
}
