/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ej1extracollections;

import java.util.ArrayList;

/**
 *
 * @author Dickson Peña
 */
public class NumeroServicio {
    
    public void Suma (ArrayList <Integer> numeros){
        
        int suma =0; 
        double promedio =0; 
        
        for (Integer numero : numeros) {
            
            suma = suma +numero; 
        }
            
        promedio = suma/(numeros.size()); 
        
        System.out.println("El valor de la suma es "+suma);
        System.out.println("El valor del promedio es " + promedio);
        }
        
    }
