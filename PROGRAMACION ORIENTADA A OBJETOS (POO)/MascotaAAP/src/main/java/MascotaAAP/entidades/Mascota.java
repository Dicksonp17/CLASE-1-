/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package MascotaAAP.entidades;

/**
 *
 * @author Dickson Peña
 */
public class Mascota {
    
    private String nombre; 
    private String apodo; 
    private String tipo; 
    private String color; 
    private int edad; 
    private boolean cola; 
    private String raza;
    private int energia;
    
    public Mascota (String nombre, String apodo, String tipo){
        this.nombre = nombre;
        this.apodo = apodo;
        this.edad = edad;
        if (tipo.equals("Perro") || tipo.equals("Gato") || tipo.equals("Conejo")) {
            this.tipo = tipo;
        }
        this.energia = 1000;
    }

    public Mascota() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public String getColor() {
        return color;
    }

    public int getEdad() {
        return edad;
    }

    public boolean isCola() {
        return cola;
    }

    public String getRaza() {
        return raza;
    }

    /**
     // Función destinada a energia (introducir /** enter para que muestre los parámetros)
     * @param energiaRestar
     * @return 
     */
    public int pasear(int energiaRestar){
        energia=energia-energiaRestar;
        return energia;
    }
    /**
     //Función destinada a pasear por vueltas
     * @param energiaRestar
     * @param vueltas
     * @return 
     */
        public int pasear(int energiaRestar, int vueltas){
            for (int i=0;i<vueltas; i++){
        energia=energia-energiaRestar;           
            }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
    
    
    
    }
