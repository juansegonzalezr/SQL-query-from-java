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
public class Proveedor {
String dbURL = "jdbc:mysql://localhost:3306/ecodosruedasltda";
    String username = "root";
    String password = "1234";
    Connection conn=null;
    
    public Proveedor(){ //Constructor para conexion
        try {
            conn = DriverManager.getConnection(dbURL,username,password);

            if (conn!=null) {
                System.out.println("Está conectado a la tabla PROVEEDOR");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
}
    }

public void mostrarTodo()throws SQLException{

String sql = "SELECT * FROM proveedor";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

while (result.next()){
int prov_id=result.getInt(1);
String prov_nombre=result.getString(2);
String prov_direccion= result.getString(3);
String prov_telefono=result.getString(4);

System.out.println("ID: " +prov_id+ "| Nombre Proveedor: " +prov_nombre+"| Dirección: " +prov_direccion+"| Teléfono: " +prov_telefono);
}
}
    
public void insertar(int prov_id,String prov_nombre,String prov_direccion,String prov_telefono) throws SQLException{

String sql="INSERT INTO proveedor (prov_id,prov_nombre,prov_direccion,prov_telefono) VALUES (?,?,?,?)";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt (1,prov_id);
statement.setString (2,prov_nombre);
statement.setString (3,prov_direccion);
statement.setString (4,prov_telefono);

int rowsInserted = statement.executeUpdate();

if ( rowsInserted>0) {
System . out . println ("Inserción en proveedor exitosa!!!"); 
}
}

public void modificar(String prov_nombre,String prov_direccion,String prov_telefono,int prov_id) throws SQLException{

String sql = "UPDATE proveedor SET prov_nombre=?,prov_direccion=?,prov_telefono=? WHERE prov_id=?";
PreparedStatement statement=conn.prepareStatement(sql);

statement.setString (1,prov_nombre);
statement.setString(2,prov_direccion);
statement.setString (3,prov_telefono);
statement.setInt (4,prov_id);

int rowsUpdated = statement.executeUpdate();

if (rowsUpdated > 0) {
System . out . println ("El registro de proveedor fue modificado exitosamente!!!");
}    
}

public void borrar (int prov_id) throws SQLException{
String sql = "DELETE FROM proveedor WHERE prov_id=?";

PreparedStatement statement=conn.prepareStatement(sql);

statement.setInt (1,prov_id);

int rowsDeleted = statement.executeUpdate();
if (rowsDeleted > 0) {
System.out.println ("Borrado proveedor exitoso!!!");
}
}    
}   
