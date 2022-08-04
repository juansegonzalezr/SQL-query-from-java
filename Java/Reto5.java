/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reto5;

import java.sql.SQLException;
import java.util.Scanner;

/**
 *
 * @author jgonzalezr - Nombre: Juan Sebastian Gonzalez Romero. CC: 1013604510.
 */
public class Reto5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws SQLException {
        // TODO code application logic here
        Scanner sc=new Scanner(System.in);
        Bicicletas bici=new Bicicletas();
        Motocicletas moto=new Motocicletas();
        Proveedor prov=new Proveedor();
        Consultas consulta=new Consultas();
        
        int selecTabla=0;
        int operacion=0;
        int menuConsulta=0;
        
       
        System.out.println("Ingrese el numero de la tabla que quiere manipular. \n1. Bicicletas. \n2. Motocicletas. \n3. Proveedor. \n4. Consultas Reto 4. \n5. Salir. ");
        selecTabla = Integer.parseInt(sc.nextLine());
        
        //TABLA BIBIBLETAS
        while (selecTabla==1){
        
            System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
            operacion = Integer.parseInt(sc.nextLine());
        
            while (operacion == 1) { //consultar
                bici.mostrarTodo();

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 2) { //insertar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese ID(enter),\nIngrese Fabricante(enter),\nIngrese PrecioUnidad(enter),\nIngrese Año(enter): ");
                bici.insertar(Integer.parseInt(sc.nextLine()), String.valueOf(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 3) { //modificar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese Fabricante(enter),\nIngrese PrecioUnidad(enter),\nIngrese Año(enter),\nIngrese ID que desea modificar(enter): ");
                bici.modificar(String.valueOf(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 4) { //eliminar

                System.out.println("Por favor ingrese el ID de la bibicleta que quiere eliminar: ");
                bici.borrar(Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 5) { //salir
                System.exit(0);
        }
        
    }
        //TABLA MOTOCICLETAS
        while (selecTabla==2){ 
            
            System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
            operacion = Integer.parseInt(sc.nextLine());
        
            while (operacion == 1) { //consultar
                moto.mostrarTodo();

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 2) { //insertar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese ID(enter),\nIngrese Fabricante(enter),\nIngrese Precio Unidad(enter),\nIngrese Autonomía(enter): ");
                moto.insertar(Integer.parseInt(sc.nextLine()), String.valueOf(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 3) { //modificar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese Fabricante(enter),\nIngrese Precio Unidad(enter),\nIngrese Autonomia(enter),\nIngrese ID que desea modificar(enter): ");
                moto.modificar(String.valueOf(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()), Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 4) { //eliminar

                System.out.println("Por favor ingrese el ID de la moto que quiere eliminar: ");
                moto.borrar(Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 5) { //salir
                System.exit(0);
        }
            
}
        //TABLA PROVEEDOR
        while (selecTabla==3){
            
            System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
            operacion = Integer.parseInt(sc.nextLine());
        
            while (operacion == 1) { //consultar
                prov.mostrarTodo();

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 2) { //insertar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese ID(enter),\nIngrese Nombre Proveedor(enter),\nIngrese Dirección(enter),\nIngrese Teléfono(enter): ");
                prov.insertar(Integer.parseInt(sc.nextLine()),String.valueOf(sc.nextLine()),String.valueOf(sc.nextLine()),String.valueOf(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 3) { //modificar

                System.out.println("Por favor siga la siguiente estructura:\nIngrese Nombre Proveedor(enter),\nIngrese Dirección(enter),\nIngrese Teléfono(enter),\nIngrese ID que desea modificar(enter): ");
                prov.modificar(String.valueOf(sc.nextLine()),String.valueOf(sc.nextLine()),String.valueOf(sc.nextLine()), Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 4) { //eliminar

                System.out.println("Por favor ingrese el ID del proveedor que quiere eliminar: ");
                prov.borrar(Integer.parseInt(sc.nextLine()));

                System.out.println("________________________________\n");
                System.out.println("Ingrese: \n1. Para consultar registro. \n2. Para insertar registro. \n3. Para actualizar registro. \n4. Para eliminar registro. \n5. Para salir. ");
                operacion = Integer.parseInt(sc.nextLine());
            }

            while (operacion == 5) { //salir
                System.exit(0);
        }
}
        //CONSULTAS RETO 4
        while (selecTabla==4){
            
            System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
            menuConsulta = Integer.parseInt(sc.nextLine());
            
            while (menuConsulta==1){//consulta1
                consulta.Consulta1();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }

            while (menuConsulta==2){ //consulta2
                consulta.Consulta2();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }            
           
            while (menuConsulta==3){ //consulta3
                consulta.Consulta3();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }                

            while (menuConsulta==4){ //consulta4
                consulta.Consulta4();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }                

            while (menuConsulta==5){ //consulta5
                consulta.Consulta5();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }                

            while (menuConsulta==6){ //consulta6
                consulta.Consulta6();
                
                System.out.println("________________________________\n");
                System.out.println("Para ver las consultas del reto 4 Ingrese: \n1. Consulta 1. \n2. Consulta 2. \n3. Consulta 3. \n4. Consulta 4 (No es posible, falta tabla intenciones). \n5. Consulta 5 (No es posible, falta tabla clientes). \n6. Consulta 6. \n7. Para Salir. ");
                menuConsulta = Integer.parseInt(sc.nextLine());            
            }                
           
            while (menuConsulta == 7) { //salir
                System.exit(0);
            }
        
        //SALIR
        while (selecTabla==5){
            System.exit(0);
            }
        
    }
}
    }
