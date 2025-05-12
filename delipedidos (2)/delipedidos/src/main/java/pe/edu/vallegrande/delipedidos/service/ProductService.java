package pe.edu.vallegrande.delipedidos.service;

import java.util.List;

import pe.edu.vallegrande.delipedidos.model.Product;

public interface ProductService {
    List<Product> getAllProducts();
    Product getProductById(Integer id);
    Product saveProduct(Product product);
    void deleteProduct(Integer id);
}
