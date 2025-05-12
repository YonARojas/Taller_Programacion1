package pe.edu.vallegrande.delipedidos.service;

import pe.edu.vallegrande.delipedidos.model.Sale;

import java.util.List;
import java.util.Optional;

public interface SaleService {
    List<Sale> getAllSales();
    Optional<Sale> getSaleById(int id);
    Sale saveSale(Sale sale);
    void deleteSale(int id);
}
