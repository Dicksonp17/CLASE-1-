/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej2extracollections;

import Entidad.CantanteFamoso;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 * @author Dickson Peña
 */
public class Ej2ExtraCollections {

    public static void main(String[] args) {
            
            Scanner leer = new Scanner (System.in);
            ArrayList <CantanteFamoso> Lista = new ArrayList();
            
            for (int i =0; i<=5; i++){
                
                CantanteFamoso c1 = new CantanteFamoso (); 
                System.out.println("Ingrese el nombre del cantante");
                c1.setNombre(leer.nextLine());
                
                System.out.println("Ingrese el disco más vendido del cantante");
                c1.setDiscoConMasVentas(leer.nextLine());
                
                Lista.add(c1);
        }
            System.out.println("\nLa lista de cantantes famosos es " 
                               +Lista.toString());
            
            System.out.println("-----------------------------------");
            
             int Opcion =0; 
        
        while (Opcion !=4){
            
            System.out.println("\nIngrese alguna de las siguientes opciones "
            +"\n1-Agregar un cantante más"
            +"\n2- Mostrar todos los cantantes"
            +"\n3- Eliminar a un cantante"
            +"\n4-Salir");
            
            Opcion = leer.nextInt(); 
            
            leer.nextLine(); 
            
            switch (Opcion){
                case 1: 
                    CantanteFamoso c1 = new CantanteFamoso ();
                    System.out.println("Ingrese al artista nuevo");
                    c1.setNombre(leer.nextLine());
                    System.out.println("Ingrese la discografia más vendida del cantante");
                    c1.setDiscoConMasVentas(leer.nextLine());
                    Lista.add(c1);
                    System.out.println("La lista modificada es "+Lista.toString());
                    break; 
                    
                case 2: 
                    
                    System.out.println("La lista de los cantantes es "+Lista.toString());
                    break;
                
                case 3: 
                    System.out.println("Ingresa el cantante que desea eliminar");
                    String CantElim = leer.nextLine(); 
                    
                    Iterator<CantanteFamoso> it = Lista.iterator(); 
                    
                    while (it.hasNext()){
                        if (it.next().getNombre().equals(CantElim)){
                            it.remove();
                        }
                    }
                    System.out.println("La lista modificada es "+Lista.toString());
                    break; 
                    
                case 4:
                    System.out.println("La lista final es "+Lista.toString());
                    break;
                   
                    }
        }
        }
    
    }
