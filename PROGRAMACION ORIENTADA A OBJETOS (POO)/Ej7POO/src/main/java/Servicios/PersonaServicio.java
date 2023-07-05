/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Persona;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class PersonaServicio {
    
    Scanner leer = new Scanner ( System.in);
    Persona p1 = new Persona(); 
    
    public Persona CrearPersona(){
        leer.nextLine();
        System.out.println("Ingrese el nombre de la persona");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese la edad de la persona");
        p1.setEdad(leer.nextInt());
        leer.nextLine();
        System.out.println("Ingrese el sexo de la persona");
        p1.setSexo(leer.nextLine());
        while (!p1.getSexo().equals("H")&&!p1.getSexo().equals("M")&&!p1.getSexo().equals("O")){
            System.out.println("Incorrecto, ingrese nuevamente el sexo (H,M u O)");
            p1.setSexo(leer.nextLine());
        }
        System.out.println("Ingrese el peso de la persona");
        p1.setPeso(leer.nextDouble());
        System.out.println("Ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());
        
        return p1; 
    }

    public double CalcularIMC (){
        double IMC = p1.getPeso()/(p1.getAltura()*p1.getAltura());
        int bin; 
        if (IMC <20){
           bin = -1;
            System.out.println("La persona tiene un IMC = "+IMC +"por lo que está baja de peso");
        } else if (IMC >=20 && IMC <=25){
           bin =0; 
           System.out.println("La persona tiene un IMC = "+IMC +"por lo que está normal de peso");
        } else {
           bin =1;
           System.out.println("La persona tiene un IMC = "+IMC +"por lo que está con sobrepeso");
        }
        
        return bin;  
    }
    
    public int MayordeEdad(){
        
        int edad= p1.getEdad(); 
        int my; 
        if (edad >=18){
            
            System.out.println("La persona es mayor de edad ");
            my = 1; 
        }
        else {
            System.out.println("La persona es menor de edad ");
            my = 0; 
        }
        
        return my; 
    }
}
