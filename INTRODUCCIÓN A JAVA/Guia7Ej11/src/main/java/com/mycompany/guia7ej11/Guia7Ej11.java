/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
//Escribir un programa que procese una secuencia de caracteres ingresada por teclado y terminada 
//en punto, y luego codifique la palabra o frase ingresada de la siguiente manera: cada vocal se 
//reemplaza por el carácter que se indica en la tabla y el resto de los caracteres (incluyendo a las 
//vocales acentuadas) se mantienen sin cambios.

package com.mycompany.guia7ej11;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Guia7Ej11 {
    public static void main(String[] args) {
        Scanner leer=new Scanner(System.in);
        System.out.print("Ingrese la frase con punto al final");
        String frase = leer.nextLine();
        int i=0;
        char letra;
        String frase_nueva="";
        for(i=0;i<frase.length();i++){
            letra=frase.charAt(i);
         //CharAt permite descomponer la variable frase en el caracter en la posición i
           if (Vocal(letra)){
               switch (letra){
                   case 'a':
                    // el simbolo += significa que a la variable frase_nueva 
                       frase_nueva+='@';
                       break; 
                   case 'e': 
                       frase_nueva+='#';
                       break;
                   case 'i':
                       frase_nueva+='$';
                       break;
                   case 'o':
                       frase_nueva+='%';
                       break;
                   case 'u':
                       frase_nueva+='*';
                       break;    
               }     
           }else { 
                       frase_nueva+=letra;  
               }
     
    }
        System.out.println("La frase nueva es "+frase_nueva);
} 
  private static boolean Vocal (char letra){
      //Character.toLowerCase es una función que permite no discriminar entre mayúsculas y minúsculas de una frase 
      //Para Java las mayusculas y minusculas de una misma letra no son iguales
  letra=Character.toLowerCase(letra);
  return letra =='a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u';
}
}
