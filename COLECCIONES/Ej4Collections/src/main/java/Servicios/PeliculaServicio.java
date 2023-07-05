/*


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidad.Pelicula;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
/**
/**
 *Tendremos una clase Pelicula con el título, director y duración de la película (en horas). 
Implemente las clases y métodos necesarios para esta situación, teniendo en cuenta lo 
que se pide a continuación:
En el servicio deberemos tener un bucle que crea un objeto Pelicula pidiéndole al usuario 
todos sus datos y guardándolos en el objeto Pelicula.
Después, esa Pelicula se guarda una lista de Peliculas y se le pregunta al usuario si quiere 
crear otra Pelicula o no.
Después de ese bucle realizaremos las siguientes acciones: 
• Mostrar en pantalla todas las películas.
• Mostrar en pantalla todas las películas con una duración mayor a 1 hora.
• Ordenar las películas de acuerdo a su duración (de mayor a menor) y mostrarlo en
pantalla.
• Ordenar las películas de acuerdo a su duración (de menor a mayor) y mostrarlo en
pantalla.
• Ordenar las películas por título, alfabéticamente y mostrarlo en pantalla.
• Ordenar las películas por director, alfabéticamente y mostrarlo en pantalla
 * @author Dickson Peña
 */
public class PeliculaServicio {
    
    Scanner leer = new Scanner (System.in);
    List <Pelicula> cartelera = new ArrayList(); 
    String respuesta = "";
    public Pelicula CrearPeli(){
        
        
        boolean CrearPeli=true;
        while(CrearPeli){
        Pelicula pelicula = new Pelicula ();
        System.out.println("Titulo de la pelicula");
        pelicula.setTitulo(leer.nextLine());
        
        System.out.println("Director de la pelicula");
        pelicula.setDirector(leer.nextLine());
        
        System.out.println("Duracion de la pelicula en horas");
        pelicula.setDuracion(leer.nextDouble());
        
        cartelera.add(pelicula); 
        
         leer.nextLine();
         System.out.println("Desea añadir otra pelicula a la lista");
         respuesta = leer.nextLine();
         
         if(respuesta.equalsIgnoreCase("n")){
             CrearPeli=false; 
         }
         }
        return null;
 }
      
        public void mostrarPeli(){
            System.out.println("\nLas peliculas en carteleras son" );
            for (Pelicula pelicula: cartelera){
            System.out.println(pelicula);
            }
            System.out.println("------------------------------------");
        }
        
       public void OrdenMayor1Hora (){
           
           if ( )
           }
       }

    
    
}

