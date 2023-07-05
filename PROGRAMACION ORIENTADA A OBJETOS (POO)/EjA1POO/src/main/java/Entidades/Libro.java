/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidades;
import java.util.Scanner; 
/**
 *
 * @author Dickson Peña
 */
public class Libro {
    
    int ISBN;
    String titulo;
    String autor; 
    int num_pag; 

    public Libro() {
    }

    public Libro(int ISBN, String titulo, String autor, int num_pag) {
        this.ISBN = ISBN;
        this.titulo = titulo;
        this.autor = autor;
        this.num_pag = num_pag;
    }

    public int getISBN() {
        return ISBN;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNum_pag() {
        return num_pag;
    }
    
   
    
}
