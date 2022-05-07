package com.webdesign.bestsell.service;

import com.webdesign.bestsell.domain.Cart;
import com.webdesign.bestsell.domain.Order;
import com.webdesign.bestsell.domain.User;

import java.util.List;

public interface UserService {

    List<User> listUser();

    int signup(User user);

    boolean login(String phone, String pwd);

    List<Cart> getCartByUserId(int userId);

    int deleteItemFromCart(int cartId);

    int addToCart(Cart cart);

    int placeOrder(Order order);

    List<Order> getAllOrderByUserId(int userId);

    User findUserByPhone(String phone);
}
