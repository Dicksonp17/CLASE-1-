/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej1extracollections;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *Diseñar un programa que lea una serie de valores numéricos 
 * enteros desde el teclado y los guarde en un ArrayList de 
 * tipo Integer. La lectura de números termina cuando se 
introduzca el valor -99. Este valor no se guarda en el ArrayList.
* A continuación, el programa mostrará por pantalla el número de
* valores que se han leído, su suma y su media (promedio).
 * @author Dickson Peña
 */
public class EJ1EXTRACollections {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in); 
        ArrayList <Integer> numeros = new ArrayList(); 
        NumeroServicio s = new NumeroServicio(); 
        
        int Opcion=0;  
        while (Opcion !=2){
            
        System.out.println("Escriba un valor numérico");
        int num = leer.nextInt(); 
        
        if (num ==-99){
            break; 
        } else {
            numeros.add(num); 
        }
        
            System.out.println("\n¿Desea ingresar otro número?"
                               +"\n1-Si"
                               +"\n2-No");
            Opcion = leer.nextInt(); 
            leer.nextLine(); 
        }
        
        System.out.println("\nEl arreglo de números es "
                            +numeros.toString());
        
        System.out.println("---------------------------------");
       
        s.Suma(numeros);
   }
}
