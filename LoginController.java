package com.login;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.login.service.LoginService;
import com.login.service.UserDetails;

@Controller
public class LoginController extends UserDetails {

    @RequestMapping("/login")
    public ModelAndView checkUser(HttpServletRequest req, HttpServletResponse res) {
        ModelAndView mv = new ModelAndView();
        userName = req.getParameter(userName);
        pass = req.getParameter(pass);

        if (new LoginService() != null)
        {
            mv.setViewName("success.jsp");
        } 
        else 
        {
            mv.setViewName("index.xhtml");
        }
        return mv;
    }
}
