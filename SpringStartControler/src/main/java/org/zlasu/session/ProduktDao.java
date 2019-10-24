package org.zlasu.session;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduktDao {

    public List<Product> getList() {
        List<Product> productList = new ArrayList<>();

        productList.add(new Product(1l, "Ogien1", 20d));
        productList.add(new Product(2l, "Ogien2", 20d));
        productList.add(new Product(3l, "Ogien3", 20d));
        productList.add(new Product(4l, "Ogien4", 20d));
        productList.add(new Product(5l, "Ogien5", 20d));
        productList.add(new Product(6l, "Ogien6", 20d));

        return productList;
    }
}
