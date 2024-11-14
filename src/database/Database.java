package database;

import java.sql.*;
//ay mencoba
public class Database {
    private String jdbcUrl = "jdbc:mysql://localhost:3306/loket_tiket"; // Ganti dengan URL database
    private String username = "root"; // Ganti dengan username database
    private String password = ""; // Ganti dengan password database
    public static Connection com;
    public static Statement stm;

    // Constructor untuk membuat koneksi
    public Database() {
        try {
            String url = "jdbc:mysql://localhost:3306/loket_tiket";
            String user = "root";
            String pass = "";
            Class.forName("com.mysql.cj.jdbc.Driver");
            com =DriverManager.getConnection(url,user,pass);
            stm =com.createStatement();
            System.out.println("Koneksi berhasil");
        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Koneksi gagal " +e.getMessage());
        }
    }

}
