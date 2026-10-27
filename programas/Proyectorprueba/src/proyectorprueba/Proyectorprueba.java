/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proyectorprueba;

import java.util.Scanner;

/**
 *
 * @author Jesús Ferraz Guédez
 */
public class Proyectorprueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        System.out.println("Dame 2 numeros");
        
        System.out.println("Primer numero: ");
        Scanner sc = new Scanner(System.in);
        int primerNumero = sc.nextInt();
        System.out.println("Segundo numero: ");
        int segundoNumero = sc.nextInt();
                
        int suma = primerNumero + segundoNumero;
        
         int multiplicacion = segundoNumero * primerNumero;
        
        System.out.println("El resultado de la primera operacion (suma) es: "+ suma);
        System.out.println("El resultado de la segunda operacion (multiplicacion) es: "+ multiplicacion);
        
        
        
        
    }
    
}
