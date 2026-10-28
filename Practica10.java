/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Practica10 {
    
    public static void main(String[] args) {
        
 int x,y;
 x=3;
 y=++x;
 System.out.println("Resultado con prefijo: x = " + x + " y = " + y);
 x=3;
 y=x++;
 System.out.println("Resultado con postfijo: x = " + x + " y = " + y);
 
 // En los valores x e y, sale 4 y 3, sin embargo al usar y=x++ se cambia.
 
    }
}
