/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.HashMap;

/**
 *
 * @author Dickson Peña
 */
public class Producto {
    
    private String nombre; 
    private int precio; 
    private HashMap <String,Integer> Productos = new HashMap(); 

    public Producto() {
    }

    public Producto(String nombre, int precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public HashMap<String, Integer> getProductos() {
        return Productos;
    }

    public void setProductos(HashMap<String, Integer> Productos) {
        this.Productos = Productos;
    }

    @Override
    public String toString() {
        return "Producto{" + "Productos=" + Productos + '}';
    }
 
      
    
}
