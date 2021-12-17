package com.laioffer.laimarket.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Objects;

/**
 * com.laioffer.laimarket.entity
 *
 * @author Gareth Yao
 * @User y1997
 * @date 2021/12/16
 * <p>Description: </p>
 */

@Entity
@Table(name="cartitem")
public class CartItem {
    private static final long serialVersionUID = -2455760938054036364L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    @ManyToOne
    private ListingItem listingItem;

    public ListingItem getListingItem() {
        return listingItem;
    }

    public void setListingItem(ListingItem listingItem) {
        this.listingItem = listingItem;
    }

    @ManyToOne
    @JsonIgnore
    private Cart cart;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ListingItem getMenuItem() {
        return listingItem;
    }

    public void setMenuItem(ListingItem menuItem) {
        this.listingItem = menuItem;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }
}


