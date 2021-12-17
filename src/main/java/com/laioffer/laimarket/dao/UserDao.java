package com.laioffer.laimarket.dao;

import com.laioffer.laimarket.entity.User;
import org.springframework.stereotype.Repository;

/**
 * com.laioffer.laimarket.dao
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/16
 * <p>Description: </p>
 */

@Repository
public class UserDao {
    public void signUp(User user) {

    }

    public User getUser(String email) {
        return new User();
    }
}
