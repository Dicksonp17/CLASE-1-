/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej6;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej6 {

    public static void main(String[] args) {
     Scanner leer =new Scanner (System.in);
        System.out.println("Ingrese el primer número entero");
        int num_1=leer.nextInt();
        System.out.println("Ingrese el segundo número entero");  
        int num_2=leer.nextInt();
        if (num_1>25&&num_2>25){
            System.out.println("Ambos números son mayores que 25"); 
        } else if (num_1 > 25){
              System.out.println("El primer número es mayor que 25"); 
        } else if (num_2>25) {
                       System.out.println("El segundo número es mayor que 25");
        } else {
                         System.out.println("Ningún número es mayor que 25");
                    }
                  
                    }
        }
