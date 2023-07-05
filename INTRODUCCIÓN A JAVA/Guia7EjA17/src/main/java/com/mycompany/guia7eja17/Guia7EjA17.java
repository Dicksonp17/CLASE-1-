/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja17;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA17 {

    public static void main(String[] args) {
        Scanner leer= new Scanner(System.in);
        System.out.println("Inserte el tamaño del vector");
        int n=leer.nextInt();
        int[]vector=new int [n];
        int cont1=0;
        int cont2=0;
        int cont3=0;
        int cont4=0;
        int cont5=0;
                
        for (int i=0;i<n;i++){  
            System.out.println("Ingrese el valor #"+(i+1));
            int num=leer.nextInt();
            vector[i]=num;
        }
        for (int vector1:vector){
           System.out.print("[" + vector1 + "]");
        }
         System.out.println(' ');
         System.out.println("___________________\n");
          
        for (int i=0;i<vector.length;i++){
            String numero=String.valueOf(vector[i]);
            int longitud=numero.length();
            if (longitud==1){
                cont1++;
            }
            else if (longitud==2){
                cont2++;
        }
            else if (longitud==3){
                cont3++;
        }
            else if (longitud==4){
                cont4++;
        }
            else if (longitud==5){
                cont5++;
        }
        }
        System.out.println("La cantidad de digitos de una cifra son "+cont1);
        System.out.println("La cantidad de digitos de dos cifras son "+cont2);
        System.out.println("La cantidad de digitos de tres cifras son "+cont3);
        System.out.println("La cantidad de digitos de cuatro cifras son "+cont4);
        System.out.println("La cantidad de digitos de cinco cifras son "+cont5);
    }
}