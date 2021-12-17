package com.laioffer.laimarket.entity;

import javax.persistence.*;
import java.util.List;

/**
 * com.laioffer.laimarket.entity
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/16
 * <p>Description: </p>
 */

@Entity
@Table(name="cart")
public class Cart {
    private static final long serialVersionUID = 8436097833452420298L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int cartId;

    private String cartName;


    public int getCartId() {
        return cartId;
    }

    public void setCartId(int cartId) {
        this.cartId = cartId;
    }

    public String getCartName() {
        return cartName;
    }

    public void setCartName(String cartName) {
        this.cartName = cartName;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<CartItem> getCartItemList() {
        return cartItemList;
    }

    public void setCartItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }

    @ManyToOne
    private User user;

    @OneToMany(mappedBy = "cart", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<CartItem> cartItemList;

    public List<CartItem> getOrderItemList() {
        return cartItemList;
    }

    public void setOrderItemList(List<CartItem> cartItemList) {
        this.cartItemList = cartItemList;
    }


}
