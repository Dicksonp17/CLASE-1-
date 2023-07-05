/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejercicio9poo;

import Entidad.Matematica;
import Servicio.ServicioMatematica;

/**
 *
 * @author Dickson Peña
 */
public class Ejercicio9POO {

    public static void main(String[] args) {
        
        ServicioMatematica sn = new ServicioMatematica();
        Matematica matematica1=sn.numeros();
        sn.devolverMayor();
        System.out.println("______________________");
        sn.calcularPotencia();
        System.out.println("______________________");
        sn.calcularRaiz();
    }
}
