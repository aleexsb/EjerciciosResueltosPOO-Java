package com.objetos.fBaseDeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DemoBase {

    static final String BD_Conexion = "jdbc:mysql://localhost:3306/";
    static final String Usuario_BD = "root";
    static final String Contrasena_BD = "root";

    public static void main( String[] args ){

        try(Connection con = DriverManager.getConnection(BD_Conexion, Usuario_BD, Contrasena_BD);
        Statement stmt = con.createStatement()){
            //String query = "CREATE DATABASE salarios";
            //stmt.executeUpdate(query);
            //String query= "CREATE TABLE salarios.sueldo(id_sueldos int (9) PRIMARY KEY AUTO_INCREMENT ,sueldoneto int(9), sueldobruto int(9))";
            //stmt.executeUpdate(query);
            String query = "INSERT INTO salarios.sueldo(sueldoneto, sueldobruto) VALUES(100000, 80000)";
            stmt.executeUpdate(query);
            System.out.println("Persistio en base de datos.");
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
    
}
