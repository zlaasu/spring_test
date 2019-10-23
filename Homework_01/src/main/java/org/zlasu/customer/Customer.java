package org.zlasu.customer;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Customer {

    private int id;
    private String firstName;
    private String lastName;

    public Customer() {
    }

    public Customer(int id, String firstName, String lastName) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
    }
}
