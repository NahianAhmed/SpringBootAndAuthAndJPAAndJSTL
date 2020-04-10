package com.nahian.bootme.Controller;
import com.nahian.bootme.Model.Users;
import com.nahian.bootme.Service.AuthService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;
import org.springframework.web.servlet.view.RedirectView;

@Controller
public class Admin {
    @GetMapping("admin/add-user")
    public String NewUser(ModelMap modelMap){
        modelMap.addAttribute("content","pages/newuser.jsp");
        return "jsp/home_layout";
    }
    @Autowired
    private AuthService authService;
    @PostMapping("/admin/save-user")
    public RedirectView SaveUser(@ModelAttribute Users users, RedirectAttributes attributes){
        authService.saveuser(users);
       // attributes.addAttribute("data","User Created");
        attributes.addFlashAttribute("flash","User Added");
        return new RedirectView("/admin/add-user");

    }
}

