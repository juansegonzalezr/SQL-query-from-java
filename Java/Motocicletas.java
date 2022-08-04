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
public class Motocicletas {
String dbURL = "jdbc:mysql://localhost:3306/ecodosruedasltda";
    String username = "root";
    String password = "1234";
    Connection conn=null;
    
    public Motocicletas(){ //Constructor para conexion
        try {
            conn = DriverManager.getConnection(dbURL,username,password);

            if (conn!=null) {
                System.out.println("Está conectado a la tabla MOTOCICLETAS");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
}
    }

public void mostrarTodo()throws SQLException{

String sql = "SELECT * FROM motocicletas";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

while (result.next()){
int moto_id=result.getInt(1);
String moto_nombre=result.getString(2);
int moto_precioUnd= result.getInt(3);
int moto_autonomia=result.getInt(4);
int prov_nombre=result.getInt(4);

System.out.println("ID: " +moto_id+ "| Fabricante Moto: " +moto_nombre+"| Precio: " +moto_precioUnd+"| Autonomía: " +moto_autonomia+"| Proveedor: " +prov_nombre);
}   
}
    
public void insertar(int moto_id,String moto_nombre,int moto_precioUnd,int moto_autonomia) throws SQLException{

String sql="INSERT INTO motocicletas (moto_id,moto_nombre,moto_precioUnd,moto_autonomia) VALUES (?,?,?,?)";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt (1,moto_id);
statement.setString (2,moto_nombre);
statement.setInt (3,moto_precioUnd);
statement.setInt (4,moto_autonomia);

int rowsInserted = statement.executeUpdate();

if ( rowsInserted>0) {
System.out.println("Inserción en motocicleta exitosa!!!"); 
}
}

public void modificar(String moto_nombre,int moto_precioUnd,int moto_autonomia,int moto_id) throws SQLException{

String sql = "UPDATE motocicletas SET moto_nombre=?,moto_precioUnd=?,moto_autonomia=? WHERE moto_id=?";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setString (1,moto_nombre);
statement.setInt (2,moto_precioUnd);
statement.setInt (3,moto_autonomia);
statement.setInt (4,moto_id);

int rowsUpdated = statement.executeUpdate();

if (rowsUpdated > 0) {
System.out.println ("El registro de motocicleta fue modificado exitosamente!!!");
}    
}

public void borrar (int moto_id) throws SQLException{
String sql = "DELETE FROM motocicletas WHERE moto_id=?";

PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt(1,moto_id);

int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
System.out.println ("Borrado motocicleta exitoso!!!");
}
}    
}
