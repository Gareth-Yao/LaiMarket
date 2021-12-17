package com.laioffer.laimarket.service;

import com.laioffer.laimarket.dao.UserDao;
import com.laioffer.laimarket.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * com.laioffer.laimarket.service
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/16
 * <p>Description: </p>
 */

@Service
public class UserService {
    @Autowired
    private UserDao userDao;

    public void signUp(User user) {
        userDao.signUp(user);
    }

    public User getUser(String email) {
        return userDao.getUser(email);
    }

}
