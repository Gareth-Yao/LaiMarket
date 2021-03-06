package com.laioffer.laimarket.controller;

import com.laioffer.laimarket.entity.User;
import com.laioffer.laimarket.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;

/**
 * com.laioffer.laimarket.controller
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/16
 * <p>Description: </p>
 */
@Controller
public class SignUpController {
    @Autowired
    private UserService userService;

    @RequestMapping(value="/signup", method = RequestMethod.POST)
    @ResponseStatus(value= HttpStatus.CREATED)
    public void signUp(@RequestBody User user) {
        userService.signUp(user);
    }
}
