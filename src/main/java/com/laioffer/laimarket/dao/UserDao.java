package com.laioffer.laimarket.dao;

import com.laioffer.laimarket.entity.Authorities;
import com.laioffer.laimarket.entity.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
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
    @Autowired
    private SessionFactory sessionFactory;

    public void signUp(User user) {
        Authorities authorities = new Authorities();
        authorities.setAuthorities("ROLE_USER");
        authorities.setEmail(user.getEmail());
        Session session = null;
        try {
            session = sessionFactory.openSession();
            session.beginTransaction();
            session.save(authorities);
            session.save(user);
            session.getTransaction().commit();
        } catch (Exception ex) {
            ex.printStackTrace();
            if(session != null) session.getTransaction().rollback();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }

    public User getUser(String email) {
        User user = null;
        try(Session session = sessionFactory.openSession()) {
            user = session.get(User.class, email);
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        return user;
    }
}
