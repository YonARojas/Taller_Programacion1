package pe.edu.vallegrande.delipedidos.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pe.edu.vallegrande.delipedidos.model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    // Aquí puedes agregar métodos personalizados si es necesario, como buscar por nombre o puesto.
}
