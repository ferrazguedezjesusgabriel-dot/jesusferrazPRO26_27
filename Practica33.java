/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasdelaptop;

import java.util.Scanner;

/**
 *
 * @author Jesus Ferraz
 */
public class Practica33 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int pinCorrecto = 9898;
        int pin;
        int intentos = 3;
        boolean acertado = false;

        while (intentos > 0 && !acertado) {

            System.out.print("Introduce el PIN: ");
            pin = sc.nextInt();

            if (pin == pinCorrecto) {
                System.out.println("El código es correcto. Bienvenido :D");
                acertado = true;
            } else {
                intentos--;
                System.out.println("PIN incorrecto.");

                if (intentos > 0) {
                    System.out.println("Te quedan " + intentos + " intentos.");
                }
            }
        }
        
    }
    
}
