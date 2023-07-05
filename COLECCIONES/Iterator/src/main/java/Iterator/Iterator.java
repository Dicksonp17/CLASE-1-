/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package Iterator;
import Entidad.Libro;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;
/**
 *
 * @author Dickson Peña
 */
public class Iterator {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner ( System.in); 
        
        Libro libro1 = new Libro ("Rayuela"); 
        Libro libro2 = new Libro ("Cien años de soledad"); 
        Libro libro3 = new Libro ("Fact"); 
      
        ArrayList<Libro> Libreria = new ArrayList<>(); 
        
        Libreria.add(libro1);
        Libreria.add(libro2);
        Libreria.add(libro3);
        
        Iterator <Libro>ite = (Iterator) Libreria.iterator();
        
        for (Libro libros: Libreria){
            System.out.println(libro1);
        }
        while (ite.hasNext()){
            
            if(ite.next().equals("Cielo")){
                ite.remove(); 
            }
        }
        
        System.out.println("///");
        for (int i=0;i< Libreria.size();i++){
            System.out.println(Libreria.get(i));
        }
    }
}


