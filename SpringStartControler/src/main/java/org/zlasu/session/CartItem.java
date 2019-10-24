package org.zlasu.session;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class CartItem {

    private int quantity;
    private Product product;

    public CartItem(int quantity, Product product) {
        this.quantity = quantity;
        this.product = product;
    }
}
