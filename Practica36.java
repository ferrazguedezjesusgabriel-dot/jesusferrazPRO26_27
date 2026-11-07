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
public class Practica36 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        Random rnd = new Random();

        int dado1, dado2, dado3;
        int sumaTirada;
        int acumulado = 0;
        int tiradas = 0;

        char opcion = ' ';

        while (opcion != 'f' && opcion != 'F') {

            dado1 = rnd.nextInt(6) + 1;
            dado2 = rnd.nextInt(6) + 1;
            dado3 = rnd.nextInt(6) + 1;

            sumaTirada = dado1 + dado2 + dado3;

            acumulado = acumulado + sumaTirada;
            tiradas++;

            System.out.println("Dado 1: " + dado1);
            System.out.println("Dado 2: " + dado2);
            System.out.println("Dado 3: " + dado3);

            System.out.println("Suma de esta tirada: " + sumaTirada);

            System.out.println("Pulsa F para finalizar o cualquier otra tecla para continuar:");
            opcion = sc.next().charAt(0);
        }

        System.out.println("----- RESULTADO FINAL -----");
        System.out.println("Puntos acumulados: " + acumulado);
        System.out.println("Número de tiradas: " + tiradas);
        
    }
}
