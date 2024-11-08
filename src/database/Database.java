package database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/loket_tiket"; // Ganti dengan URL database
    private String username = "root"; // Ganti dengan username database
    private String password = ""; // Ganti dengan password database
    private Connection connection;

    // Constructor untuk membuat koneksi
    public Database() {
        try {
            connection = DriverManager.getConnection(jdbcUrl, username, password);
            System.out.println("Koneksi berhasil!");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    // Method untuk mendapatkan koneksi
    public Connection getConnection() {
        return connection;
    }
}
