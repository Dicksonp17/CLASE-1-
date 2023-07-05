/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja18;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA18 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Ingrese el tamaño de su matriz");
        int n= leer.nextInt();
        int [][] matriz =new int [n][n];
        int [][] trans=new int [n][n];
        for (int i=0;i<n;i++){
            for (int j=0; j<n; j++){
                System.out.println("Ingrese el valor");
                int num=leer.nextInt();
                matriz [i][j]=num;
            }
         for ( i=0;i<n;i++){
            for (int j=0; j<n; j++){
               trans [i][j]= matriz [j][i];
            }
        }
         
            for ( i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("["+matriz[i][j]+"]");
            }
             System.out.println("");
                    }
        for (i=0;i<n;i++){
            for (int j=0;j<n;j++){
                System.out.print("["+trans[i][j]+"]");
            }
             System.out.println("");
                    }
}
 
    }
}