package com.nahian.bootme.RestController;


import com.nahian.bootme.Model.User;
import com.nahian.bootme.Service.UserServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import javax.servlet.http.HttpServletRequest;
import java.util.Collection;
import java.util.Map;

@RestController
public class HomeController {


// only return json
    @PostMapping("/user-json")
    public Map<String, String[]> user(HttpServletRequest request){
         return request.getParameterMap();
    }
    @Autowired
    private UserServices US;
    @PostMapping("/save-user")
    public void SaveUser(@ModelAttribute User userdata){
        US.saveuser(userdata);
    }

    @GetMapping("/all-user")
    public Collection<User> SaveUser(){
       return  US.alluser();
    }
}
