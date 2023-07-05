/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Raices;

/**
 *
 * @author Dickson Peña
 */
public class ServicioRaices {
    
    Scanner leer = new Scanner (System.in);
    
    Raices raiz = new Raices();
    
    
     public Raices crearRaiz(){
          
          System.out.println("Ingrese el valor de a ");
          raiz.setA(leer.nextDouble());
           System.out.println("Ingrese el valor de b ");
          raiz.setB(leer.nextDouble());
           System.out.println("Ingrese el valor de c ");
          raiz.setC(leer.nextDouble());
      }
    
    public double getDiscriminante(){
        
        double discriminante; 
        
        discriminante = (raiz.getB()*raiz.getB())- 4*raiz.getB()*raiz.getC();
        
        System.out.println(discriminante);
        
        return discriminante; 
    }
    
    public boolean tieneRaices(){
        if (getDiscriminante()==0){
            return true;
        } else{
            return false; 
        }
        
    }
    
    public void obtenerRaices(){
        
        if (tieneRaices())
        
    }
}
