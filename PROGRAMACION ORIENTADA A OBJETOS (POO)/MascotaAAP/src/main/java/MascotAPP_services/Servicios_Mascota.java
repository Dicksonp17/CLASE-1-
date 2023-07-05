/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MascotAPP_services;

import MascotaAAP.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author Dickson Peña
 */
public class Servicios_Mascota {
    
    private Scanner leer = new Scanner (System.in);
    
    public Mascota CrearMascota(){
        
        System.out.println("Introduzca el nombre");
        String nombre = leer.nextLine();
        
        System.out.println("Introduzca el apodo");
        String apodo = leer.nextLine();
        
        System.out.println("Introduzca el tipo");
        String tipo = leer.nextLine();
        
        Mascota m =new Mascota (nombre, apodo, tipo); 
        return m;
    }
}
