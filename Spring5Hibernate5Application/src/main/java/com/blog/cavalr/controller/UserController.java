package com.blog.cavalr.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.blog.cavalr.entity.User;
import com.blog.cavalr.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping(value = "list.do")
    public String showUserList(Model model) {
    	 List<User> users = userService.getAllUserList();
        model.addAttribute("users", users);
        return "list";
    }
    
    @RequestMapping("/registerUser")
    public String registerUser(HttpServletRequest request) {
    	// wwe will create a  codee to ger request paramter
    	// create an object user
    	String uname = request.getParameter("uname");
    	User user = new User();
    	user.setUserName(uname);    	
    	userService.saveUser(user);
        return "list";
    }
}
