package org.zlasu.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Random;

@Controller
public class CartController {

    private final Cart cart;

    public CartController(Cart cart) {
        this.cart = cart;
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addToCart() {
        Random rand = new Random();

        Product product = new Product("okno", 20d);
        CartItem cartItem = new CartItem(1, product);
        cart.addToCart(cartItem);

        return "addtocart";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public void cart() {
        cart.getCartItems().forEach(System.out::println);
    }
}
