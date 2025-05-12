package pe.edu.vallegrande.delipedidos.model;

import jakarta.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDate;

@Entity
@Table(name = "Sales")
public class Sale {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_Sale")
    private int idSale;

    @Column(name = "sale_date", nullable = false)
    private LocalDate saleDate;

    @Column(name = "Total_Amount", nullable = false, precision = 10, scale = 2)
    private BigDecimal totalAmount;

    @Column(name = "Status", nullable = false, length = 1)
    private String status;

    // Relación con Employee
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Employee_id_Employee", nullable = false)
    private Employee employee;

    // Relación con Customer
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "Customer_id_Client", nullable = false)
    private Customer customer;

    // Constructores
    public Sale() {}

    public Sale(LocalDate saleDate, BigDecimal totalAmount, String status, Employee employee, Customer customer) {
        this.saleDate = saleDate;
        this.totalAmount = totalAmount;
        this.status = status;
        this.employee = employee;
        this.customer = customer;
    }

    // Getters y setters

    public int getIdSale() {
        return idSale;
    }

    public void setIdSale(int idSale) {
        this.idSale = idSale;
    }

    public LocalDate getSaleDate() {
        return saleDate;
    }

    public void setSaleDate(LocalDate saleDate) {
        this.saleDate = saleDate;
    }

    public BigDecimal getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(BigDecimal totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }
}
