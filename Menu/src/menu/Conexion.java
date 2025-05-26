/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package menu;

public class Conexion {
    private static final String URL = "jdbc:mysql://127.0.0.1:3306/escuela-taller";
    private static final String USER = "root";
    private static final String PASSWORD = "Alejandro1109663189"; 

    public static Connection getConnection() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println(" Conexión establecida con éxito");
        } catch (ClassNotFoundException e) {
            System.err.println("Error: Driver no encontrado");
            e.printStackTrace();
        } catch (SQLException e) {
            System.err.println("Error de conexión a la base de datos");
            e.printStackTrace();
        }
        return conn;
    }
}
