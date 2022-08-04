/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author jgonzalezr
 */
public class Consultas {
String dbURL = "jdbc:mysql://localhost:3306/ecodosruedasltda";
    String username = "root";
    String password = "1234";
    Connection conn=null;
    
    public Consultas(){ //Constructor para conexion
        try {
            conn = DriverManager.getConnection(dbURL,username,password);

            if (conn!=null) {
                System.out.println("Consultas Ok");
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
}
    }

public void Consulta1()throws SQLException{

String sql = "SELECT bici_nombre FROM bicicletas UNION SELECT moto_nombre FROM motocicletas ORDER BY bici_nombre";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

System.out.println("Mostrar el nombre de los fabricantes de todas las bicicletas y motocicletas eléctricas ordenadas alfabéticamente.");

while (result.next()){
String bici_nombre=result.getString(1);

System.out.println("Fabricante: "+bici_nombre);
}
}

public void Consulta2()throws SQLException{

String sql = "select bici_nombre,bici_precioUnd,bici_año from bicicletas where bici_año>=2019 order by bici_nombre";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

System.out.println("Mostrar la información de las bicicletas (fabricante, precio unitario, año) que se han estrenado posteriormente al año 2019, ordenadas por Fabricante.");

while (result.next()){
String bici_nombre=result.getString(1);
int bici_precioUnd= result.getInt(2);
int bici_año=result.getInt(3);

System.out.println("Fabricante: "+bici_nombre+" |Precio: "+bici_precioUnd+" |Año: "+bici_año);
}
}

public void Consulta3()throws SQLException{

String sql = "select moto_nombre from motocicletas where prov_nombre=\"Auteco\"";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

System.out.println("Mostrar los fabricantes de las motocicletas eléctricas donde Auteco les provee el motor.");

while (result.next()){
String moto_nombre=result.getString(1);

System.out.println("Fabricante: "+moto_nombre);
}
}

public void Consulta4()throws SQLException{
System.exit(0);
}

public void Consulta5()throws SQLException{
System.exit(0);
}

public void Consulta6()throws SQLException{

String sql = "select count(bici_id) from bicicletas where bici_año>=2019";
Statement statement=conn.createStatement();
ResultSet result=statement.executeQuery(sql);

System.out.println("Mostrar cuantas bicicletas se han fabricado después del año 2019.");

while (result.next()){
int bici_id=result.getInt(1);

System.out.println("Numero bicicletas: "+bici_id);
}
}
}