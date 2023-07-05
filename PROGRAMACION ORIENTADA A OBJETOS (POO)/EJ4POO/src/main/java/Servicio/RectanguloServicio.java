/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidades.Rectangulo;
import java.util.Scanner;
/**
 *
 * @author Dickson Peña
 */
public class RectanguloServicio {
    
    Scanner leer = new Scanner (System.in); 
    
    Rectangulo r1 = new Rectangulo (); 
    
    
    
    public Rectangulo CrearArea(){
        System.out.println("Ingrese base del rectangulo");
        r1.setBase(leer.nextDouble());
        System.out.println("Ingrese la altura del rectangulo");
        r1.setAltura(leer.nextDouble());
        double Area = r1.getBase()*r1.getAltura();
        System.out.println("El área del rectangulo es " + Area);
        return r1;
    }
    
    public Rectangulo CrearPerimetro(){
        
        double Perimetro = (r1.getBase()+r1.getAltura())*2;
        
        System.out.println("El perimetro del rectangulo es "+Perimetro);
        
        return null; 
    }
    
    public Rectangulo CrearRectangulo(){
        
        int a = (int) Math.round(r1.getBase());
        int b = (int)Math.round(r1.getAltura());
        String [][] Matriz = new String [b][a];
        for (int i=0; i<b;i++){
            for (int j=0; j<a;j++){
                if (i==0||i==b-1||j==0||j==a-1){
                    Matriz [i][j]="*";
                } else {
                    Matriz [i][j]= " ";
                }
            }
        }
        
        System.out.println("----------------------------");
        System.out.println("El dibujo del rectangulo es el siguiente");
        for(int i=0;i<b;i++){
            for ( int j=0; j<a; j++){
                System.out.print(Matriz[i][j]);
            }
                System.out.println();
        }
        
        return null;
    }
    
        
}

