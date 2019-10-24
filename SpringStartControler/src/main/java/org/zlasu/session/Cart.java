package org.zlasu.session;


import lombok.Getter;
import lombok.Setter;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.stereotype.Component;
import org.springframework.web.context.WebApplicationContext;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@Component
@Scope(value = WebApplicationContext.SCOPE_SESSION, proxyMode = ScopedProxyMode.TARGET_CLASS)
public class Cart {

    private List<CartItem> cartItems = new ArrayList<>();
    private final ProduktDao produktDao;

    public Cart(ProduktDao produktDao) {
        this.produktDao = produktDao;
    }

    public void addToCart(CartItem cartItem) {
        CartItem item = findProduct(cartItem.getProduct().getId());

        if (item == null) {
            this.cartItems.add(cartItem);
        } else {
            item.setQuantity(item.getQuantity() + cartItem.getQuantity());
        }
    }

    public void addProductToCart(int quantity, Product product) {
        this.addToCart(new CartItem(quantity, product));
    }

    public CartItem findProduct(long id) {
        for (int i = 0; i < cartItems.size(); i++) {
            if (cartItems.get(i).getProduct().getId() == id) {
                return cartItems.get(i);
            }
        }

        return null;
    }
}
