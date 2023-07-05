/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author Dickson Peña
 */
public class ServicioArreglo {
    Arreglo arreglo1 =new Arreglo(); 
    
    public Arreglo llenarMatriz(){
        int matriz1 [][]= new int [5][10];
        for ( int i=0; i<5;i++){
            for (int j=0; j<10;j++){
                matriz1[i][j]=(int)(Math.random()*10);
            }
        }
        arreglo1.setArregloA(matriz1);
       return arreglo1;
 
}
    
    
}