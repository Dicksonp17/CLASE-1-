/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Dickson Peña
 */
public class Persona {

    private String nombre;
    private int Edad;
    private int identificacion;
    public Persona(String nombre, int Edad,int identificacion ) {
        this.nombre=nombre;
        this.Edad=Edad;
        this.identificacion=identificacion;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public void setIdentificacion(int identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public int getIdentificacion() {
        return identificacion;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", Edad=" + Edad + ", identificacion=" + identificacion + '}';
    }
    
    
}
