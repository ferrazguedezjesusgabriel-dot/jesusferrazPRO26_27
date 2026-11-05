/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendeprogramas;

import java.util.Scanner;

/**
 *
 * @author Jesus Ferraz
 */
public class Practica28 {
 
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int num;
        int sumaPositivos = 0;
        int sumaNegativos = 0;

        System.out.println("Introduce un numero entero (0 para terminar):");
        num = sc.nextInt();

        while (num != 0) {

            if (num > 0) {
                sumaPositivos = sumaPositivos + num;
            } else {
                sumaNegativos = sumaNegativos + num;
            }

            System.out.println("Introduce otro numero (0 para terminar):");
            num = sc.nextInt();
        }

        System.out.println("La suma de los numeros positivos es: " + sumaPositivos);
        System.out.println("La suma de los numeros negativos es: " + sumaNegativos);
        
    }
    
}
