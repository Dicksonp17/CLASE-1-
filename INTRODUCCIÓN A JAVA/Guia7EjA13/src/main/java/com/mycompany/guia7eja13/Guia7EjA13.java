/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja13;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA13 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Indique el tamaño de la matriz");
        int n = leer.nextInt();
        char [][] matriz =new char [n][n];
        for (int i=0;i<n;i++){
            for (int j=0; j<n;j++){
                if (i==0 || i==n-1||j==0 || j==n-1){
                    matriz[i][j]='*';
                }
                else {
                     matriz[i][j]=' ';
                }
            }
        }
        
        for (int i=0;i<n; i++){
            for (int j=0; j<n; j++){
                System.out.print(matriz [i][j]);
            }
            System.out.println();
        }
    }
}

