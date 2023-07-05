/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;

/**
 *
 * @author Dickson Peña
 */
public class Palabra {
   int n; 
   String palabraStr;
   String [] Palabra = new String [n];
   int NroIntentos; 
   String letrasEncontradas;

    public Palabra() {
    }

    public Palabra(int n, String palabraStr, int NroIntentos, String letrasEncontradas) {
        this.n = n;
        this.palabraStr = palabraStr;
        this.NroIntentos = NroIntentos;
        this.letrasEncontradas = letrasEncontradas;
    }
  
    public int getN() {
        return n;
    }

    public String getPalabraStr() {
        return palabraStr;
    }

    
    
    public String[] getPalabra() {
        return Palabra;
    }

    public int getNroIntentos() {
        return NroIntentos;
    }

    public String getLetrasEncontradas() {
        return letrasEncontradas;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setPalabraStr(String palabraStr) {
        this.palabraStr = palabraStr;
    }

    
    public void setPalabra(String[] Palabra) {
        this.Palabra = Palabra;
    }

    public void setNroIntentos(int NroIntentos) {
        this.NroIntentos = NroIntentos;
    }

    public void setLetrasEncontradas(String letrasEncontradas) {
        this.letrasEncontradas = letrasEncontradas;
    }

    @Override
    public String toString() {
        return "Palabra{" + "n=" + n + ", Palabra=" + Palabra + ", NroIntentos=" + NroIntentos + ", letrasEncontradas=" + letrasEncontradas + '}';
    }
   
   
    
   
    
}
