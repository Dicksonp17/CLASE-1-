/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Matematica;
import java.util.Scanner;

/**
 *
 * @author Dickson Peña
 */
public class ServicioMatematica {
    
    Scanner leer = new Scanner (System.in); 
    Matematica num = new Matematica ();
    public Matematica numeros (){
      
     num.setNumero1((Double)(Math.random()*10+1));
     num.setNumero2((Double)(Math.random()*10+1));
        System.out.println(" "+num.getNumero1());
        System.out.println(" "+num.getNumero2());
    return num; 
    }
    
    public double devolverMayor(){
        
        double mayor = Math.max(num.getNumero1(),num.getNumero2());
        System.out.println("El numero mayor es "+mayor);
        if (mayor==num.getNumero2()){
            System.out.println("El numero 2 es el mayor ");
        }else{
            System.out.println("------------------");
            System.out.println("El numero 1 es el mayor");
        }
        return mayor;
}

    public double calcularPotencia(){
        double menor =Math.min(num.getNumero1(), num.getNumero2());
        double potencia;
        double mayor;
        mayor = devolverMayor();
        potencia = Math.pow(Math.round(mayor), Math.round(menor));
        System.out.println("La potencia del numero mayor es "+potencia);
        return menor;
        
    }

    public double calcularRaiz(){
        double raiz = Math.sqrt(Math.abs(Math.round(calcularPotencia())));
        System.out.println("La raiz es "+raiz);
        return raiz;
    }
    }
    

