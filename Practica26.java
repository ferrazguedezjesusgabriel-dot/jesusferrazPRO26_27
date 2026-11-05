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
public class Practica26 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce un día de la semana (1-5 de Lunes a Viernes): ");
        int dia = sc.nextInt();

        // Estructura de control switch tradicional
        switch (dia) {
            case 1:
                System.out.println("El lunes a primera hora toca: Base de datos");
                break;
            case 2:
                System.out.println("El martes a primera hora toca: Lenguaje de Marcas");
                break;
            case 3:
                System.out.println("El miércoles a primera hora toca: Base de datos");
                break;
            case 4:
                System.out.println("El jueves a primera hora toca: Sistemas Informaticos");
                break;
            case 5:
                System.out.println("El viernes a primera hora toca: Ingles");
                break;
            default:
                System.out.println("Día incorrecto. Por favor, introduce un número del 1 al 5.");
        }
        
    }
    
}
