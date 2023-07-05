/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7ej13;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej13 {

    public static void main(String[] args) {
        Scanner leer=new Scanner (System.in);
        System.out.println("Registre la cantidad de nombres que va a ingresar");
        int n=leer.nextInt();
        leer.nextLine();
        String [] vector = new String [n];
        for (int i=0;i<vector.length;i++){
            System.out.println("Ingrese el nombre del estudiante"+(i+1));
            vector[i]=leer.nextLine();
        }
        for (String vector1 : vector) {
            System.out.print("[" + vector1 + "]");
        }
        
    }
}
