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
public class Practica20 {
    
    public static void main(String[] args) {
        
        System.out.println("Holaa, dime un numero entero: ");
        Scanner sc = new Scanner(System.in);
        
        int nentero = sc.nextInt();
        
        if(nentero % 2 == 0){
            
            System.out.println("El numero es par :D");
            
        } else {
            
            System.out.println("El numero es impar :D");
        }
        
    }
    
}
