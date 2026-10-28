
package com.hotel.service;

import com.hotel.model.Customer;
import java.util.ArrayList;

public class CustomerService {
    private ArrayList<Customer> customerList = new ArrayList<>();

    public void addCustomer(Customer customer) {
        customerList.add(customer);
        System.out.println("Customer Added sucsesfully");

    }

    public void showAllCustomers() {
        if (customerList.isEmpty()) {
            System.out.println("Noo Customer Found");
            return;
        }
        for (Customer customer : customerList) {
            customer.displayCustomer();
            System.out.println("-------------");

        }

    }

    public Customer findByCustomerId(int customerId) {
        for (Customer customer : customerList) {
            if (customer.getCustomerId() == customerId) {
                return customer;
            }
        }
        return null;
    }

  
    

    
   
}
