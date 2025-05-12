package pe.edu.vallegrande.delipedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import pe.edu.vallegrande.delipedidos.model.Customer;

public interface CustomerRepository extends JpaRepository<Customer, Integer> {}
