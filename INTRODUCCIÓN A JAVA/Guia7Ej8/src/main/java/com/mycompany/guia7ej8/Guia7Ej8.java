/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej8;
import java.util.Scanner; 
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej8 {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese su nota");
        Double nota= leer.nextDouble();
        
        while (nota>=0&&nota<=10){
           System.out.println("La nota se encuentra entre 0 y 10");
           System.out.println("Ingrese otra nota");
           nota=leer.nextDouble();
        }
        System.out.println("La nota no se encuentra comprendida entre 0 y 10");
    }
}
