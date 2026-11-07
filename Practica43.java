/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasdelaptop;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Practica43 {
 
    public static void main(String[] args) {
        
         Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int secreto = rnd.nextInt(99) + 1;
        int numero;
        int intentos = 0;

        System.out.print("Adivina el número secreto (entre 1 y 99): ");
        numero = sc.nextInt();

        while (numero != secreto) {

            intentos++;

            if (numero < secreto) {
                System.out.println("El número secreto es mayor.");
            } else {
                System.out.println("El número secreto es menor.");
            }

            System.out.print("Prueba otra vez: ");
            numero = sc.nextInt();
        }

        intentos++;

        System.out.println("¡Correcto! Has acertado el número secreto.");
        System.out.println("Número de intentos: " + intentos);
        
    }
    
}
