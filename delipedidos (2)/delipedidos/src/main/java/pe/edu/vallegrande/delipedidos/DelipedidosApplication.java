package pe.edu.vallegrande.delipedidos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

@SpringBootApplication
public class DelipedidosApplication implements CommandLineRunner {

    @Autowired
    private DataSource dataSource;

    public static void main(String[] args) {
        SpringApplication.run(DelipedidosApplication.class, args);
    }

    @Override
    public void run(String... args) throws SQLException {
        try (Connection connection = dataSource.getConnection()) {
            if (connection != null) {
                System.out.println("¡Conexión con la base de datos exitosa!");
            }
        } catch (SQLException e) {
            System.out.println("No se pudo conectar con la base de datos.");
            e.printStackTrace();
        }
    }
}
