/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej7poo;
import Entidades.Persona;
import Servicios.PersonaServicio;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class Ej7POO {

    public static void main(String[] args) {
       
        Scanner leer = new Scanner (System.in);
        PersonaServicio s1 = new PersonaServicio(); 
        
        Persona p1,p2,p3,p4; 
        
       p1 = s1.CrearPersona();
       double imcP1= s1.CalcularIMC();
       int myp1=s1.MayordeEdad();
       System.out.println("-----------------------------------------");
            
       p2= s1.CrearPersona();
       double imcP2 =s1.CalcularIMC();
       int myp2=s1.MayordeEdad();
       System.out.println("-----------------------------------------");

       p3= s1.CrearPersona();
       double imcP3= s1.CalcularIMC();
       int myp3 =s1.MayordeEdad();
       System.out.println("-----------------------------------------");
       
       p4= s1.CrearPersona();
       double imcP4= s1.CalcularIMC();
       int myp4 =s1.MayordeEdad();  
       System.out.println("-----------------------------------------");
       
       double porcentBajoPeso=0; 
       double porcentIdealPeso=0; 
       double porcentSobrePeso=0; 
       double mayorEdad=0; 
       double menorEdad=0; 
          if (imcP1==-1){
              porcentBajoPeso++; 
          } else if (imcP1==0){
              porcentIdealPeso++;
          } else { 
              porcentSobrePeso++; 
          }
          
          if (imcP2==-1){
              porcentBajoPeso++; 
          } else if (imcP2==0){
              porcentIdealPeso++;
          } else { 
              porcentSobrePeso++; 
          }
          
          if (imcP3==-1){
              porcentBajoPeso++; 
          } else if (imcP3==0){
              porcentIdealPeso++;
          } else { 
              porcentSobrePeso++; 
          }
          
          if (imcP4==-1){
              porcentBajoPeso++; 
          } else if (imcP4==0){
              porcentIdealPeso++;
          } else { 
              porcentSobrePeso++; 
          }
          
          if (myp1==0){
              
              menorEdad++; 
          } else {
              mayorEdad++; 
          }
          
          if (myp2==0){
              
              menorEdad++; 
          } else {
              mayorEdad++; 
          }
          
          if (myp3==0){
              
              menorEdad++; 
          } else {
              mayorEdad++; 
          }
          
          if (myp4==0){
              
              menorEdad++; 
          } else {
              mayorEdad++; 
          }
          int TotalPersonas=4; 
          porcentBajoPeso = porcentBajoPeso/TotalPersonas*100; 
          System.out.println("El procentaje de personas bajas de peso es "+porcentBajoPeso);
          
          porcentIdealPeso = porcentIdealPeso/TotalPersonas*100;
          System.out.println("El procentaje de personas con peso ideal es "+porcentIdealPeso);
          
          porcentSobrePeso = porcentSobrePeso/TotalPersonas*100;
          System.out.println("El procentaje de personas con peso ideal es "+porcentSobrePeso);
          
          mayorEdad= mayorEdad/TotalPersonas*100; 
          System.out.println("El procentaje de personas mayores de edad es "+mayorEdad);
          
          menorEdad = menorEdad/TotalPersonas*100; 
          System.out.println("El procentaje de personas menores de edad es "+menorEdad);
    }
    
 
}

