/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej9;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej9 {

    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        int cont=0;
        int suma=0;
        int num;
        do {
            System.out.println("Ingrese un número");
            num = leer.nextInt();
            cont++; 
            if (num>0){
                suma=num+suma;
            } else if (num<0) {
                suma= suma+0;
                        }
            } while (cont<20&&num != 0);
          System.out.println("La suma es"+suma);      
        }
       
    }
