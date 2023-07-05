/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej5;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 *
 */
public class Guia7Ej5 {

   public static void main(String[] args) { 
 Scanner leer = new Scanner(System.in); 
  System.out.println("Ingresa tu nombre");
 String nombre = leer.nextLine();
  System.out.println("Ingresa tu edad");
 int edad = leer.nextInt();
  System.out.println("El nombre del usuario es "+nombre);
  System.out.println("La edad del usuario es "+edad);
 }
}

