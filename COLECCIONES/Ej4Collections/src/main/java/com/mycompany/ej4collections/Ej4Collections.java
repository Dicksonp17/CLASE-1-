/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ej4collections;

import Entidad.Pelicula;
import Servicios.PeliculaServicio;
import Utilities.Comparadores;
import java.util.ArrayList;
import java.util.Collections;


/**
 *
 * @author Dickson Peña
 */
public class Ej4Collections {

    
    public static void main(String[] args) {
        ArrayList <Pelicula> cartelera = new ArrayList ();
        PeliculaServicio s1 = new PeliculaServicio(); 
        s1.CrearPeli();
        s1.mostrarPeli();
        s1.OrdenMayor1Hora();
    }
}
