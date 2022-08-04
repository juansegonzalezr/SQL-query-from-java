/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jgonzalezr
 */
public class Bicicletas {
String dbURL = "jdbc:mysql://localhost:3306/ecodosruedasltda";
    String username = "root";
    String password = "1234";
    Connection conn=null;
    
    public Bicicletas(){ //Constructor para conexion
        try {
            conn = DriverManager.getConnection(dbURL,username,password);

            if (conn!=null) {
                System.out.println("Está conectado a la tabla BICICLETAS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
}
    }

public void mostrarTodo()throws SQLException{

String sql = "SELECT * FROM bicicletas";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

while (result.next()){
int bici_id=result.getInt(1);
String bici_nombre=result.getString(2);
int bici_precioUnd= result.getInt(3);
int bici_año=result.getInt(4);

System.out.println("ID: " +bici_id+ "| Fabricante Bici: " +bici_nombre+"| Precio: " +bici_precioUnd+"| Año: " +bici_año);
}  
}
    
public void insertar(int bici_id,String bici_nombre,int bici_precioUnd,int bici_año) throws SQLException{

String sql="INSERT INTO bicicletas (bici_id,bici_nombre,bici_precioUnd,bici_año) VALUES (?,?,?,?)";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt (1,bici_id);
statement.setString (2,bici_nombre);
statement.setInt (3,bici_precioUnd);
statement.setInt (4,bici_año);

int rowsInserted = statement.executeUpdate();

if ( rowsInserted>0) {
System . out . println ("Inserción en bicicleta exitosa!!!"); 
}
}

public void modificar(String bici_nombre,int bici_precioUnd,int bici_año,int bici_id) throws SQLException{

String sql = "UPDATE bicicletas SET bici_nombre=?,bici_precioUnd=?,bici_año=? WHERE bici_id=?";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setString (1,bici_nombre);
statement.setInt (2,bici_precioUnd);
statement.setInt (3,bici_año);
statement.setInt (4,bici_id);

int rowsUpdated = statement.executeUpdate();

if (rowsUpdated > 0) {
System . out . println ("El registro de bicicleta fue modificado exitosamente!!!");
}    
}

public void borrar (int bici_id) throws SQLException{
String sql = "DELETE FROM bicicletas WHERE bici_id=?";

PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt (1,bici_id);

int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
System.out.println ("Borrado bicicleta exitoso!!!");
}
}    
}
