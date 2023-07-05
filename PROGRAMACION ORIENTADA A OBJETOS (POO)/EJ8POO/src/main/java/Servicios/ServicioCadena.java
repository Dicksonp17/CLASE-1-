/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;
import Entidades.Cadena;
import java.util.Scanner; 
/**
 *
 * @author Dickson Peña
 */

//Realizar una clase llamada Cadena que tenga como atributos una frase (de tipo de 
//String) y su longitud. En el main se creará el objeto y se le pedirá al usuario que ingrese// 
//una frase que puede ser una palabra o varias palabras separadas por un espacio en 
//blanco y a través de los métodos set, se guardará la frase y la longitud de manera 
//automática según la longitud de la frase ingresada. Deberá además implementar los 
//siguientes métodos:

public class ServicioCadena {
    
    Scanner leer = new Scanner ( System.in); 
    Cadena f1 = new Cadena (); 
  
    public String mostrarVocales(){
    // Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la 
    //frase ingresada. 
    
        System.out.println("Ingrese la frase o palabra");
        String palabra = leer.nextLine(); 
        int longitud = palabra.length(); 
        
        
    }
}
