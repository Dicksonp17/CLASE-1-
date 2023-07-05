/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Dickson Peña
 */
public class Mes {
 
    private String [] mes= new String [12]; 
    private int numSecreto; 

    public Mes() {
    }

    public Mes(String[] mes, int numSecreto) {
        this.mes = mes;
        this.numSecreto = numSecreto;
    }

    public String[] getMes() {
        return mes;
    }

    public int getNumSecreto() {
        return numSecreto;
    }

    public void setMes(String[] mes) {
        this.mes = mes;
    }

    public void setNumSecreto(int numSecreto) {
        this.numSecreto = numSecreto;
    }
    
    
}
