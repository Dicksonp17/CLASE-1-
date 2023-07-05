
import java.util.ArrayList;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Dickson Peña
 */
public class Alumno {
    private String nombre;
    private ArrayList<Integer> notas;

    // Constructor
    public Alumno(String nombre) {
        this.nombre = nombre;
        this.notas = new ArrayList<Integer>();
    }

    // Getter y Setter para el nombre
    // ...

    // Getter para las notas
    public ArrayList<Integer> getNotas() {
        return notas;
    }

    // Método para agregar una nota
    public void agregarNota(int nota) {
        notas.add(nota);
    }
}
