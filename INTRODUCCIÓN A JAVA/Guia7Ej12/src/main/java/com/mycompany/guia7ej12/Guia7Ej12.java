/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej12;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej12 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        int num_1=leer.nextInt();
        System.out.println("Ingrese el segundo número");
        int num_2=leer.nextInt();
        
        EsMultiplo(num_1,num_2);
    }
    public static void EsMultiplo(int num_1,int num_2){
        if (num_1%num_2==0){
            System.out.print("Los números son múltiplos");
        }
        else{
            System.out.print("Los números no son múltiplos");
        }
    }
}


