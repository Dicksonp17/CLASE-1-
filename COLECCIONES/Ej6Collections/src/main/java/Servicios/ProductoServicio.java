/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Producto;
import java.util.HashMap;
import java.util.Scanner;

/**
 * *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author Dickson Peña
 */
public class ProductoServicio {
    
    Scanner leer = new Scanner (System.in);
    
    HashMap <String, Integer> Productos = new HashMap();
    
    public Producto CrearProducto (){
              
        int Opcion =0; 
        
        while (Opcion !=2){
            
         Producto p1 = new Producto ();
         
            System.out.println("Introduzca el nombre del producto ");
            
            p1.setNombre(leer.nextLine());
            
            System.out.println("Introduzca el precio del producto ");
            
            p1.setPrecio(leer.nextInt());
            
            Productos.put(p1.getNombre(), p1.getPrecio());
            
            System.out.println("-----------------------------------");
            
            System.out.println("\n¿Desea agregar otro producto?"
                                +"\n1-Si"
                                +"\n2-No");
            Opcion = leer.nextInt(); 
            leer.nextLine(); 
        }
        
        System.out.println(Productos.toString());
        return null;
    }
    
    public void ModificarPrecio (){
       
        System.out.println("Ingresar el producto a modificar");
        String ProdModif = leer.nextLine(); 
        
        if (Productos.containsKey(ProdModif)){
          
            Productos.remove(ProdModif);
            
            System.out.println("Ingrese el nuevo precio");
            int NuevoPrecio= leer.nextInt();
            
            Productos.put(ProdModif, NuevoPrecio); 
            
    } else {
            
            System.out.println("No se encuentra el producto");
        }
        
        System.out.println("\nLa lista actualizada con las modificaciones es "
                           +Productos.toString());
        
        System.out.println("----------------------------------------------");
        
        leer.nextLine(); 
    }
    
    public void EliminarProducto (){
        
         
        System.out.println("Escriba el nombre del producto a eliminar");
        String ProdElim = leer.nextLine(); 
        
        if (Productos.containsKey(ProdElim)){
            
            Productos.remove(ProdElim); 
        } else {
            System.out.println("No se encontró el producto ");
        }
        
        System.out.println("\nLa lista actualizada sin el producto eliminado es "
                          +"\n"+Productos.toString());
        }
    
}
