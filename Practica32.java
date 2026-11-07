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
public class Practica32 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int numero1 = sc.nextInt();

        System.out.print("Introduce el segundo número: ");
        int numero2 = sc.nextInt();

        int inicio = Math.min(numero1, numero2);
        int fin = Math.max(numero1, numero2);

        int suma = 0;

        for (int i = inicio; i <= fin; i++) {
            suma = suma + i;
        }

        System.out.println("La suma de los números es: " + suma);
        
    }
    
}
