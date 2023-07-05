/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja12;
import java.util.Scanner;

public class Guia7EjA12{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int correctas = 0;
        int incorrectas = 0;
        while (true) {
            System.out.print("Ingrese una cadena: ");
            String cadena = scanner.nextLine();
            if (cadena.equals("&&&&&")) {
                break;
            }
            if (cadena.length() != 5 || cadena.charAt(0) != 'X' || cadena.charAt(4) != 'O') {
                incorrectas++;
            } else {
                correctas++;
            }
 
       }
        System.out.println("Lecturas correctas: " + correctas);
        System.out.println("Lecturas incorrectas: " + incorrectas);
    }
}




