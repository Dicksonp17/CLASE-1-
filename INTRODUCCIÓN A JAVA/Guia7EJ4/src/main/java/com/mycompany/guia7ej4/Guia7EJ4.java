/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej4;

/**
 *
 * @author Dickson Peña
 */
import java.util.Scanner; 

public class Guia7EJ4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
      
      System.out.println("Ingrese su nombre");
      String nombre=leer.nextLine();
      
      System.out.println("Ingrese su edad");
      int edad = leer.nextInt();
      
        System.out.println("El nombre del usuario es "+nombre);
        System.out.println("La edad del usuario es "+edad);
    }
}
