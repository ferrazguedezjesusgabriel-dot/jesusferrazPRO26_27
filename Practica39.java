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
public class Practica39 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

        System.out.print("Introduce un número entre 10 y 99: ");
        numero = sc.nextInt();

        while (numero < 10 || numero > 99) {
            System.out.println("Número no válido.");

            System.out.print("Introduce otro número entre 10 y 99: ");
            numero = sc.nextInt();
        }

        int decenas = numero / 10;
        int unidades = numero % 10;

        int invertido = (unidades * 10) + decenas; //CODIGO APORTADO POR IA, NO SE COMO HACERLO

        System.out.println("El número invertido es: " + invertido);
        
    }
}
