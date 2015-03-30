package main.net.spring.controller;

import main.net.spring.dao.UserDAO;
import main.net.spring.model.User;
import main.net.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.List;

/**
 * Created by thangnguyen on 3/30/15.
 */
@Controller
public class HomeController {

    @Autowired
    private UserDAO userDAO;

    @Autowired
    private UserService userService;

    @RequestMapping("/")
    public ModelAndView handleRequest() throws Exception {
        //List<User> listUsers = userDAO.list();
        List<User> listUsers = userService.list();
        ModelAndView model = new ModelAndView("userLists");
        model.addObject("userList", listUsers);
        return model;
    }

}
