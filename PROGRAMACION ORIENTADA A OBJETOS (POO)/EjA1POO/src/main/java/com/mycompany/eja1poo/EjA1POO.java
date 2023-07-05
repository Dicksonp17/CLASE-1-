/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.eja1poo;

import Entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author Dickson Peña
 */
public class EjA1POO {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner (System.in);
        System.out.println("Ingrese el ISBN");
        int ISBN = leer.nextInt();
        leer.nextLine();
        System.out.println("Ingrese el título");
        String titulo = leer.nextLine();
        System.out.println("Ingrese el autor");
        String autor = leer.nextLine();
        System.out.println("Ingrese el número de pagina");
        int num_pag = leer.nextInt();
        
      Libro l1= new Libro(ISBN,titulo, autor, num_pag); 
      
        System.out.println("El ISBN es "+l1.getISBN());
        System.out.println("El titulo es "+l1.getTitulo());
        System.out.println("El autor es "+l1.getAutor());
        System.out.println("El número de pagina es "+l1.getNum_pag());
    }
}
