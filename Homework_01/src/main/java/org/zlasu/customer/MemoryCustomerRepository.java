package org.zlasu.customer;

import java.util.ArrayList;
import java.util.List;

public class MemoryCustomerRepository implements CustomerRepository {

    private final CustomerLogger customerLogger;
    List<Customer> list = new ArrayList<>();

    public MemoryCustomerRepository(CustomerLogger customerLogger) {
        this.customerLogger = customerLogger;
    }

    @Override
    public void addCustomer(Customer customer) {
        customerLogger.log();
        list.add(customer);
    }

    @Override
    public void removeCustomer(Customer customer) {
        customerLogger.log();
        list.remove(customer);
    }

    @Override
    public List<Customer> findAll() {
        customerLogger.log();
        return this.list;
    }
}
