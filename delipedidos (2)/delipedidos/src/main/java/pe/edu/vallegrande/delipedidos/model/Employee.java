package pe.edu.vallegrande.delipedidos.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

import java.util.List;

@Entity
@Table(name = "Employee")  // Asegúrate de que el nombre de la tabla esté en mayúsculas, como en la base de datos
public class Employee {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Employee")  // Coincide con el nombre exacto de la columna en la base de datos
    private int idEmployee;

    @Column(name = "Name", nullable = false, length = 50)  // Coincide con el nombre exacto de la columna en la base de datos
    private String name;

    @Column(name = "Surname", nullable = false, length = 50)  // Coincide con el nombre exacto de la columna en la base de datos
    private String surname;

    @Column(name = "Post", nullable = false, length = 50)  // Coincide con el nombre exacto de la columna en la base de datos
    private String post;

    @Column(name = "Phone", nullable = false, length = 9)  // Coincide con el nombre exacto de la columna en la base de datos
    private String phone;

    @Column(name = "Status", nullable = false, length = 1)  // Coincide con el nombre exacto de la columna en la base de datos
    private String status;

    @OneToMany(mappedBy = "employee", fetch = FetchType.LAZY)  // Relación con las ventas
    private List<Sale> sales;

    // Constructor vacío
    public Employee() {}

    // Constructor con parámetros
    public Employee(String name, String surname, String post, String phone, String status) {
        this.name = name;
        this.surname = surname;
        this.post = post;
        this.phone = phone;
        this.status = status;
    }

    // Getters y Setters
    public int getIdEmployee() {
        return idEmployee;
    }

    public void setIdEmployee(int idEmployee) {
        this.idEmployee = idEmployee;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<Sale> getSales() {
        return sales;
    }

    public void setSales(List<Sale> sales) {
        this.sales = sales;
    }
}
