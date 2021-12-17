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
