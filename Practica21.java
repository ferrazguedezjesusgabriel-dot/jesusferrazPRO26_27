/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica21 {
    
    public static void main(String[] args) {
        
        System.out.println("Holaa dame el numero a comparar: ");
        Scanner sc = new Scanner(System.in);
        
        int numeroelegido = sc.nextInt();
        
        if(numeroelegido % 3 == 0 && numeroelegido % 5 == 0) {
            
            System.out.println("El numero elegido es multiplo de 3 y 5 :D");
            
        } else if(numeroelegido % 3 != 0 && numeroelegido % 5 != 0) {
            
            System.out.println("El numero no es multiplo de ninguno de los 2 :(");
            
        } else if(numeroelegido % 3 != 0 && numeroelegido % 5 == 0) {
            
            System.out.println("El numero no es multiplo de 3 :( , pero si del 5 :D");
            
        } else if(numeroelegido % 3 == 0 && numeroelegido % 5 != 0) {
            
            System.out.println("El numero es multiplo de 3 :D , pero no del 5 :(");
            
        } else {
            
            System.out.println("Invalido. Por favor introduzca numeros enteros.");
            
        }
        
    }
    
}
