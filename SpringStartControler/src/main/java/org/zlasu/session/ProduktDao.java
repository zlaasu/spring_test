package org.zlasu.session;

import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class ProduktDao {

    private List<Product> list = new ArrayList<>();

    public ProduktDao() {
        this.list.add(new Product(1l, "Ogien1", 20d));
        this.list.add(new Product(2l, "Ogien2", 20d));
        this.list.add(new Product(3l, "Ogien3", 20d));
        this.list.add(new Product(4l, "Ogien4", 20d));
        this.list.add(new Product(5l, "Ogien5", 20d));
        this.list.add(new Product(6l, "Ogien6", 20d));

        this.list = list;
    }

    public List<Product> getList() {
        return this.list;
    }

    public Product findOne(long id) {
        return this.list.stream().filter(s -> s.getId() == id).findFirst().get();
    }
}
