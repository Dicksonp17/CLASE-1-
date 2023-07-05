/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Utilities;

import Entidad.Pelicula;
import java.util.Comparator;

/**
 *
 * @author Dickson Peña
 */
public class Comparadores {
    
    public static Comparator <Pelicula> OrdenarMas1Hora = new Comparator <Pelicula> (){
        @Override
        public int compare(Pelicula o1, Pelicula o2) {
            return o2.getDuracion().compareTo(o1.getDuracion());
        }
       
};
            }
