package pe.edu.vallegrande.delipedidos.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.edu.vallegrande.delipedidos.model.Sale;
import pe.edu.vallegrande.delipedidos.repository.SaleRepository;
import pe.edu.vallegrande.delipedidos.service.SaleService;

import java.util.List;
import java.util.Optional;

@Service
public class SaleServiceImpl implements SaleService {

    private final SaleRepository saleRepository;

    @Autowired
    public SaleServiceImpl(SaleRepository saleRepository) {
        this.saleRepository = saleRepository;
    }

    @Override
    public List<Sale> getAllSales() {
        return saleRepository.findAll();
    }

    @Override
    public Optional<Sale> getSaleById(int id) {
        return saleRepository.findById(id);
    }

    @Override
    public Sale saveSale(Sale sale) {
        return saleRepository.save(sale);
    }

    @Override
    public void deleteSale(int id) {
        saleRepository.deleteById(id);
    }
}

