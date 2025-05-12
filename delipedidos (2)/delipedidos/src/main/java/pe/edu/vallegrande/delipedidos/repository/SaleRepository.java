package pe.edu.vallegrande.delipedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pe.edu.vallegrande.delipedidos.model.Sale;

@Repository
public interface SaleRepository extends JpaRepository<Sale, Integer> {
    // Aquí puedes agregar métodos personalizados si los necesitas, como buscar por fecha o estado
}
