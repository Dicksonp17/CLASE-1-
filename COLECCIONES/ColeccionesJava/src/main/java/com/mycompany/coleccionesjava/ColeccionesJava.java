/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.coleccionesjava;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Diseñar un programa que lea y guarde razas de perros en un ArrayList de tipo
String. El programa pedirá una raza de perro en un bucle, el mismo se guardará
en la lista y después se le preguntará al usuario si quiere guardar otro perro o si
quiere salir. Si decide salir, se mostrará todos los perros guardados en el ArrayList
 * @author Dickson Peña
 */
public class ColeccionesJava {

    public static void main(String[] args) {
       
     //use.Delimiter ("\n") es para que se guarden las razas con dos palabras
     Scanner leer = new Scanner (System.in).useDelimiter("\n"); 
     ArrayList<String> razas = new ArrayList<>();
     
    
     int opcion =0; 
     while (opcion!=2){
         
         System.out.print("\nIngrese una opción:"
                             + "\n1- para ingresar una raza"
                             + "\n2- para salir"
                             + "\n3- para buscar una raza y eliminar de la lista");
         
         opcion = leer.nextInt(); 
         
         switch (opcion){
             case 1: 
                 System.out.println("Ingrese una raza de perro");
                 String perro = leer.next(); 
                 razas.add(perro);
                 break; 
             case 2: 
                 System.out.println("Salir, hasta luego");
                 for (String raza: razas){
                     System.out.println(raza);
                 }
                 Collections.sort(razas);
                 break;
                
             case 3: 
                  //Continuando el ejercicio anterior, después de mostrar los perros, al usuario se le
                 //pedirá un perro y se recorrerá la lista con un Iterator, se buscará el perro en la lista. 
                 //Si el perro está en la lista, se eliminará el perro que ingresó el usuario y se mostrará
                 //la lista ordenada. Si el perro no se encuentra en la lista, se le informará al usuario
                 //y se mostrará la lista ordenada.
                 
                 System.out.println("Cual raza desea eliminar de la lista");
                 
                 Iterator <String> it = razas.iterator(); 
                 
                 String buscar =leer.next(); 
                 while (it.hasNext()){
             
                     
                     if (buscar.equalsIgnoreCase(it.next())){
                         it.remove();
                         System.out.println("-------------------------");
                     
                     } else{
                         System.out.println("No se encontró la raza");
                         
                     }
                 }
                 Collections.sort(razas);
                System.out.println("\n-------------------------------"
                                   + "\nLista de razas después de eliminar:");
                for (String raza : razas) {
                System.out.println(raza);
                 }
                 break; 
         }
     }
    }
}
