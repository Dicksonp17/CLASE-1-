/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja1;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA1 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.println("Escriba el primer número");
        int num_1=leer.nextInt();
        System.out.println("Escriba el segundo número");
        int num_2=leer.nextInt();
        int Suma = num_1+num_2;
        System.out.println("El resultado de la suma es "+Suma);
        
    }
}
