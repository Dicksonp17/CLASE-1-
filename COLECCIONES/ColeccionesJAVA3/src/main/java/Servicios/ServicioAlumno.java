/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidad.Alumno;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 **Crear una clase llamada Alumno que mantenga información sobre las notas 
 * de distintos alumnos. La clase Alumno tendrá como atributos, su nombre 
 * y una lista de tipo Integer con sus 3 notas. 
En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. 
* Se pide toda la información al usuario y ese Alumno se guarda en una lista
* de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno: 
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular
* su nota final y se lo busca en la lista de Alumnos. Si está en la lista,
* se llama al método. Dentro del método se usará la lista notas para calcular
* el promedio final de alumno. Siendo este promedio final, devuelto por el 
* método y mostrado en el main.
 * @author Dickson Peña
 */

public class ServicioAlumno {
    
    Scanner leer = new Scanner (System.in); 
    public Alumno CrearAlumno (){
        
        ArrayList <Alumno> alum = new ArrayList(); 
        int opcion =0;
           while (opcion!=2){ 
            Alumno estudiante = new Alumno (); 
            
            ArrayList <Integer> notas = new ArrayList (); 
            System.out.println("Ingresa el nombre del estudiante");
            estudiante.setNombre(leer.nextLine());
            
            for (int i = 0; i <3; i++) {
                
                System.out.println("Ingrese la nota "+ (i+1));
                int notaAlum = leer.nextInt(); 
                notas.add(notaAlum); 
            }
            
            estudiante.setNotas(notas);
            alum.add(estudiante); 
            
            System.out.println("\n¿Quiere agregar otro alumno?"
                               +"\n1-Si" + "\n2-No");
            
            opcion = leer.nextInt(); 
            
            System.out.println(estudiante);
            leer.nextLine(); 
            }
          
        return alum;
         }
 
            
       
       public double notaFinal(){
       
           System.out.println("Ingrese el nombre del alumno a buscar");
           String nombreBus = leer.nextLine(); 
           
           for (Alumno aux: )
           
           
    }
} 
    

    