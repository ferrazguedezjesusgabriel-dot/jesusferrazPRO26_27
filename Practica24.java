/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Jesús Ferraz
 */
public class Practica24 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        System.out.println("Introduce tu idioma preferido (c: castellano, i: inglés o f: francés): ");
  
        char opcion = sc.next().charAt(0);

  
        if (opcion == 'c' || opcion == 'C') {
            System.out.println("Buenos días");
        } 
        else if (opcion == 'i' || opcion == 'I') {
            System.out.println("Good morning");
        } 
        else if (opcion == 'f' || opcion == 'F') {
            System.out.println("Bonjour");
        } 
        else {
            System.out.println("no entiendo tu idioma");
        }

        
    }
    
}
