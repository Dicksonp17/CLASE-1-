/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja10;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA10 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int limite, suma = 0, numero;
        System.out.print("Ingrese un valor límite positivo: ");
        limite = scanner.nextInt();
        while (suma <= limite) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();
            suma += numero;
        }
        System.out.println("La suma total es: " + suma);
    }
}

