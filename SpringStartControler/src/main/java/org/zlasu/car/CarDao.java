package org.zlasu.car;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CarDao {

    public List<Car> getCars() {
        List<Car> list = new ArrayList<>();
        list.add(new Car (1, 210, "Passat1"));
        list.add(new Car (2, 220, "Passat2"));
        list.add(new Car (3, 230, "Passat3"));
        list.add(new Car (4, 240, "Passat4"));
        list.add(new Car (5, 250, "Passat5"));
        list.add(new Car (6, 260, "Passat6"));
        list.add(new Car (7, 270, "Passat7"));

        return list;
    }
}
