/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasdelaptop;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Practica40 {
    
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un número entre 0 y 999: ");
        numero = sc.nextInt();

        while (numero < 0 || numero > 999) {
            System.out.println("Número no válido.");

            System.out.print("Introduce otro número entre 0 y 999: ");
            numero = sc.nextInt();
        }

        if (numero < 10) {
            System.out.println("El número tiene 1 cifra.");
        } else if (numero < 100) {
            System.out.println("El número tiene 2 cifras.");
        } else {
            System.out.println("El número tiene 3 cifras.");
        }
        
    }
    
}
