package pe.edu.vallegrande.delipedidos.service;

import java.util.List;
import java.util.Optional;

import pe.edu.vallegrande.delipedidos.model.Employee;

public interface EmployeeService {
    List<Employee> getAllEmployees();
    Optional<Employee> getEmployeeById(int id);
    Employee saveEmployee(Employee employee);
    void deleteEmployee(int id);
}

