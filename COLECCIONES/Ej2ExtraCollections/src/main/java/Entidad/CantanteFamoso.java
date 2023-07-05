/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Dickson Peña
 */
public class CantanteFamoso {
    private String nombre; 
    private String DiscoConMasVentas; 

    public CantanteFamoso() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDiscoConMasVentas() {
        return DiscoConMasVentas;
    }

    public void setDiscoConMasVentas(String DiscoConMasVentas) {
        this.DiscoConMasVentas = DiscoConMasVentas;
    }

    @Override
    public String toString() {
        return "{" + "nombre=" + nombre + ", DiscoConMasVentas=" + DiscoConMasVentas + '}';
    }
    
    
    
}
