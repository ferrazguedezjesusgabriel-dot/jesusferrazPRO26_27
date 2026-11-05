/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.tnumeroelegidot to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Jesús Ferraz
 */
public class Practica22 {
 
    public static void main(String[] args) {
        
          Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un número entero: ");
        int numeroelegido = sc.nextInt();

        // Estructura de control if - else if
        if (numeroelegido < 0) {
            System.out.println(numeroelegido + " es menor de 0");
        } 
        else if (numeroelegido == 0) {
            System.out.println(numeroelegido + " es igual a 0");
        } 
        else if (numeroelegido > 0 && numeroelegido < 10) {
            System.out.println(numeroelegido + " es mayor que 0 y menor que 10");
        } 
        else if (numeroelegido == 10) {
            System.out.println(numeroelegido + " es igual a 10");
        } 
        else if (numeroelegido > 10 && numeroelegido < 20) {
            System.out.println(numeroelegido + " es mayor que 10 y menor que 20");
        } 
        else {
            // Si no cumple ninguna de las anteriores, por descarte es mayor o igual a 20
            System.out.println(numeroelegido + " es mayor o igual a 20");
        }
        
    }
    
}
