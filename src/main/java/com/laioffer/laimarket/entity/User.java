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
@Table(name = "user")
public class User {
    private static final long serialVersionUID = 2652327633296064143L;
    @Id
    private String email;
    private String password;
    private boolean enabled;
    private boolean is_active_buyer;
    private boolean is_active_seller;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch=FetchType.EAGER)
    private List<Cart> cartList;

    @OneToMany(mappedBy = "user", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    private List<ListingItem> listingItemsList;

    public List<ListingItem> getListingItemsList() {
        return listingItemsList;
    }

    public void setListingItemsList(List<ListingItem> listingItemsList) {
        this.listingItemsList = listingItemsList;
    }

    public List<Cart> getCartList() {
        return cartList;
    }

    public void setCartList(List<Cart> cartList) {
        this.cartList = cartList;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public boolean isEnabled() {
        return enabled;
    }

    public void setEnabled(boolean enabled) {
        this.enabled = enabled;
    }

    public boolean isIs_active_buyer() {
        return is_active_buyer;
    }

    public void setIs_active_buyer(boolean is_active_buyer) {
        this.is_active_buyer = is_active_buyer;
    }

    public boolean isIs_active_seller() {
        return is_active_seller;
    }

    public void setIs_active_seller(boolean is_active_seller) {
        this.is_active_seller = is_active_seller;
    }
}
