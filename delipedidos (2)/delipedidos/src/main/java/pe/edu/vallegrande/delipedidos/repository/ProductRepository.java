package pe.edu.vallegrande.delipedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.vallegrande.delipedidos.model.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product, Integer> {
    // Si es necesario, puedes agregar consultas personalizadas aquí
}
