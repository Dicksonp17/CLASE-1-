/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia7eja11;
 import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7EjA11 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num1, num2, opcion;
        do {
            System.out.println("MENU");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");
            System.out.print("Elija opción: ");
            opcion = scanner.nextInt();
            switch (opcion) {
                case 1:
                    num1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    num2 = pedirNumero(scanner, "Ingrese el segundo número: ");
                    System.out.println("El resultado es: " + (num1 + num2));
                    break;
                case 2:
                    num1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    num2 = pedirNumero(scanner, "Ingrese el segundo número: ");
                    System.out.println("El resultado es: " + (num1 - num2));
                    break;
                case 3:
                    num1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    num2 = pedirNumero(scanner, "Ingrese el segundo número: ");
                    System.out.println("El resultado es: " + (num1 * num2));
                    break;
                case 4:
                    num1 = pedirNumero(scanner, "Ingrese el primer número: ");
                    num2 = pedirNumero(scanner, "Ingrese el segundo número: ");
                    if (num2 == 0) {
                        System.out.println("Error: no se puede dividir por cero");
                    } else {
                        System.out.println("El resultado es: " + ((double) num1 / num2));
                    }
                    break;
                case 5:
                    char confirmacion;
                    do {
                        System.out.print("¿Está seguro que desea salir del programa (S/N)? ");
                        confirmacion = scanner.next().charAt(0);
                    } while (confirmacion != 'S' && confirmacion != 'N');
                    if (confirmacion == 'S') {
                        System.out.println("¡Hasta luego!");
                        System.exit(0);
                    }
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (true);
    }
    
    private static int pedirNumero(Scanner scanner, String mensaje) {
        int num;
        do {
            System.out.print(mensaje);
            num = scanner.nextInt();
        } while (num < 0);
        return num;
    }
}
     
