package com.nahian.bootme.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.view.RedirectView;

@Controller
@SessionAttributes("namex")
public class Home {
    @GetMapping(value = "/")
    public String index(ModelMap modelMap){
        modelMap.addAttribute("content","pages/index.jsp");
        return "jsp/home_layout";
    }
    @GetMapping(value = "/about")
    public String about(ModelMap modelMap){
        modelMap.addAttribute("content","pages/about.jsp");
        return "jsp/home_layout";
    }

    @GetMapping(value = "/user")
    public String user(ModelMap modelMap){
        modelMap.addAttribute("content","pages/user.jsp");
        return "jsp/home_layout";
    }

    @GetMapping(value = "/user/a-user")
    public String Testuser(ModelMap modelMap){

        modelMap.addAttribute("content","pages/testuser.jsp");
        return "jsp/home_layout";
    }

    @GetMapping(value = "/admin")
    public String admin(ModelMap modelMap){
        modelMap.put("namex","ADMINX");
        modelMap.addAttribute("content","pages/admin.jsp");
        return "jsp/home_layout";
    }
    @GetMapping("/clean")
    public RedirectView SessionClean(SessionStatus status){
        status.setComplete();
        return new RedirectView("/user/a-user");
    }

}
