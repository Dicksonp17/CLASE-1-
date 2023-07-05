/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej10;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej10 {

    public static void main(String[] args) {
        Scanner leer= new Scanner (System.in);
        int num = 0;
        int i=0;
        int j=0;
        for(i=0;i<4;i++){
            System.out.println("Escriba el número");
            num = leer.nextInt();
            if (num<=20&&num>=1){
            for (j=0;j<num;j++){
            System.out.print('*');
            }
            } else {
                System.out.print("El número no está entre 1 y 20");
                System.exit(0);
                            }
        
        }
}
}
