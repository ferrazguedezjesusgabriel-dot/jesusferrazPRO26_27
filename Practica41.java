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
public class Practica41 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        String texto;
        String invertido = "";

        System.out.print("Introduce una cadena de texto: ");
        texto = teclado.nextLine();

        for (int i = texto.length() - 1; i >= 0; i--) {
            invertido = invertido + texto.substring(i, i + 1);
        }

        System.out.println("El texto al revés es: " + invertido);
    }
    
}
