package org.zlasu.session;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Random;

@Controller
public class CartController {

    private final Cart cart;
    private final ProduktDao produktDao;

    public CartController(Cart cart, ProduktDao produktDao) {
        this.cart = cart;
        this.produktDao = produktDao;
    }

    @RequestMapping("/addtocart2")
    @ResponseBody
    public String addToCartProduct(@RequestParam long id, @RequestParam int quantity) {
        Product product = produktDao.findOne(id);

        cart.addToCart(new CartItem(quantity, product));

        return "addtocart";
    }

    @RequestMapping("/addtocart")
    @ResponseBody
    public String addToCart() {
        Random rand = new Random();

        Product product = new Product(1l, "okno", 20d);
        CartItem cartItem = new CartItem(1, product);
        cart.addToCart(cartItem);

        return "addtocart";
    }

    @RequestMapping("/cart")
    @ResponseBody
    public void cart() {
        List<CartItem>  itemList = cart.getCartItems();

        for (int i = 0; i < itemList.size(); i++) {
            System.out.println(itemList.get(i).getProduct().getName() + " / " + itemList.get(i).getQuantity());
        }
    }
}
