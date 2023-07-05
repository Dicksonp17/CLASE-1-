/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej6collections;

import Servicios.ProductoServicio;

/**
 *Se necesita una aplicación para una tienda en la cual queremos almacenar los distintos
productos que venderemos y el precio que tendrán. Además, se necesita que la 
aplicación cuente con las funciones básicas. 
Estas las realizaremos en el servicio. Como, introducir un elemento, modificar su precio, 
eliminar un producto y mostrar los productos que tenemos con su precio (Utilizar 
Hashmap). El HashMap tendrá de llave el nombre del producto y de valor el precio. 
Realizar un menú para lograr todas las acciones previamente mencionadas.
 * @author Dickson Peña
 */
public class Ej6Collections {
 
    public static void main(String[] args) {
        ProductoServicio s1 = new ProductoServicio (); 
        
        s1.CrearProducto(); 
        s1.ModificarPrecio();
        s1.EliminarProducto();
    }
}
