package pe.edu.vallegrande.delipedidos.service;

import pe.edu.vallegrande.delipedidos.model.Customer;
import java.util.List;
import java.util.Optional;

public interface CustomerService {

    List<Customer> getAllCustomers();

    Optional<Customer> getCustomerById(Integer id);  // <- Cambiado a Integer

    Customer saveCustomer(Customer customer);

    void deleteCustomer(Integer id);  // <- Cambiado a Integer
}

