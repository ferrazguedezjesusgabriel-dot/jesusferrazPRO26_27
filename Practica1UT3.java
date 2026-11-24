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

/*Crear un programa para calcular el máximo común divisor ( mcd ) de dos
números enteros recibidos por teclado. Se deberá crear un método llamado mcd que recibe
los dos números y devuelve el máximo común divisor. El método main del programa es: */

public class Practica1UT3 {
    
   public static int mcd(int num1, int num2) {
        while (num2 != 0) {
            int temp = num2;
            num2 = num1 % num2;
            num1 = temp;
    }
        
        return Math.abs(num1);
    }
   
    public static void main(String[] args) {
        
    Scanner cin = new Scanner(System.in);
    System.out.println("Cálculo de MCD para dos números");
    System.out.print("Número 1: ");
    int num1 = cin.nextInt();
    System.out.print("Número 2: ");
    int num2 = cin.nextInt();

    String solucion = "MCD: " + mcd(num1,num2);
    System.out.println(solucion);

 }

}
