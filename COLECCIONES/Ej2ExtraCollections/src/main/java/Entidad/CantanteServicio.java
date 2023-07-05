/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.ArrayList;
import java.util.Scanner;

/**
 **Crear una clase llamada CantanteFamoso. Esta clase guardará cantantes famosos y 
tendrá como atributos el nombre y discoConMasVentas. 
Se debe, además, en el main, crear una lista de tipo CantanteFamoso y agregar 5 objetos 
de tipo CantanteFamoso a la lista. Luego, se debe mostrar los nombres de cada cantante 
y su disco con más ventas por pantalla.
Una vez agregado los 5, en otro bucle, crear un menú que le de la opción al usuario de 
agregar un cantante más, mostrar todos los cantantes, eliminar un cantante que el usuario 
elija o de salir del programa. Al final se deberá mostrar la lista con todos los cambios
 * @author Dickson Peña
 */
public class CantanteServicio {
  
    public void ModificarEliminar(){
     
        
        Scanner leer = new Scanner (System.in); 
        
        ArrayList<CantanteFamoso>Lista = new ArrayList();
        int Opcion =0; 
        
        while (Opcion !=4){
            
            System.out.println("\nIngrese alguna de las siguientes opciones "
            +"\n1-Agregar un cantante más"
            +"\n2- Mostrar todos los cantantes"
            +"\n3- Eliminar a un cantante"
            +"\n4-Salir");
            
            Opcion = leer.nextInt(); 
            
            switch (Opcion){
                case 1: 
                    System.out.println("Ingrese al artista nuevo");
                    
            }
        }
    }
    
}
