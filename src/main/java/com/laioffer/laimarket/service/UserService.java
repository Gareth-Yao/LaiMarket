package com.laioffer.laimarket.service;

import com.laioffer.laimarket.dao.UserDao;
import com.laioffer.laimarket.entity.Cart;
import com.laioffer.laimarket.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

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
        Cart cart = new Cart();
        cart.setCartName("Default");
        Map<String, Cart> cartList = new HashMap<>();
        cartList.put("Default", cart);
        user.setCartList(cartList);
        user.setEnabled(true);
        userDao.signUp(user);
    }

    public User getUser(String email) {
        return userDao.getUser(email);
    }

}
