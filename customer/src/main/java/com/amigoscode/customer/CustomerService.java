package com.amigoscode.customer;

import org.springframework.stereotype.Service;

@Service
public class CustomerService {

    private final CustomerRepository customerRepository;

    public CustomerService(CustomerRepository customerRepository) {
        this.customerRepository = customerRepository;
    }

    public void registerCustomer(CustomerRegistrationRequest request) {
        Customer customer = Customer.builder()
                .firstName(request.firstName())
                .lastName(request.lastName())
                .email(request.email())
                .build();

        System.out.println(customer);
        customerRepository.save(customer);
    }

//    public void isEmailValid(Customer customer) {
//        customerRepository.findCustomerByEmail(customer.getEmail());
//    }
}
