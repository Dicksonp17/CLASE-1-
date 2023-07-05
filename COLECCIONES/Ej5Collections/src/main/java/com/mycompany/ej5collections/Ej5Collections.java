/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej5collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

/**
 *Se requiere un programa que lea y guarde países, y para evitar que se ingresen repetidos
usaremos un conjunto. El programa pedirá un país en un bucle, se guardará el país en el
conjunto y después se le preguntará al usuario si quiere guardar otro país o si quiere salir,
si decide salir, se mostrará todos los países guardados en el conjunto. (Recordemos hacer
los servicios en la clase correspondiente)
Después deberemos mostrar el conjunto ordenado alfabéticamente: para esto recordar
cómo se ordena un conjunto.
Por último, al usuario se le pedirá un país y se recorrerá el conjunto con un Iterator, se 
buscará el país en el conjunto y si está en el conjunto se eliminará el país que ingresó el
usuario y se mostrará el conjunto. Si el país no se encuentra en el conjunto se le informará 
al usuario.
 * @author Dickson Peña
 */
public class Ej5Collections {

    public static void main(String[] args) {
        
        HashSet <String> Paises = new HashSet (); 
        Scanner leer = new Scanner (System.in);
        int Opcion=0; 
        while(Opcion != 2){
        
        System.out.println("Ingrese un país ");
        String pais = leer.nextLine();
        
        Paises.add(pais); 
        
        System.out.println("\n¿Desea ingresar otro país?"
                             + "\n1-Si"
                             + "\n2-No");
        
        Opcion = leer.nextInt();
        leer.nextLine();
    }
        System.out.println("Los países guardados son "+Paises.toString());
        System.out.println("---------------------------------------------");
        
        ArrayList <String> PaisesLista = new ArrayList (Paises);
        System.out.println("El conjunto de paises ordenados alfabeticamente es ");
        Collections.sort(PaisesLista);
        System.out.println(PaisesLista);
        
        System.out.println("-----------------------------------------------------");
        
        System.out.println("Ingrese el país que desea eliminar");
        String paisElim = leer.nextLine();
        
        Iterator <String> it = PaisesLista.iterator(); 
        
        while (it.hasNext()){
            if (it.next().equalsIgnoreCase(paisElim)){
                it.remove();
            }else{
                System.out.println("El país no se encuentra en el conjunto");
            }
        }
        
        System.out.println("-----------------------------------------------------");
        System.out.println("La lista actualizada de paises es ");
        
        for (String aux: PaisesLista){
            System.out.println(aux);
        }
        
        
    }
    
   
        
        
              
}

