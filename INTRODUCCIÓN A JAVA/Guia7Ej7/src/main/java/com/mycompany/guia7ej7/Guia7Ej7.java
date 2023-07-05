/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej7;
import java.util.Scanner; 
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej7 {

    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in); 
       System.out.println("Ingrese el tipo de motor que desea consultar");
       int Tmotor=leer.nextInt();
       switch (Tmotor){
           case 1: 
             System.out.println("La bomba es una bomba de agua");  
             break; 
           case 2: 
             System.out.println("La bomba es una bomba de gasolina");  
             break; 
           case 3: 
             System.out.println("La bomba es una bomba de hormigón");
             break; 
           case 4: 
             System.out.println("La bomba es una bomba de pasta alimenticia");
             break; 
           default: 
             System.out.println("No existe un valor válido para tipo de bomba");  
       }
    }
}
