/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;
import static javaapplication1.Practica1UT3.mcd;

/**
 *
 * @author Jesús Ferraz
 */
public class Practica2UT3 {
    
    public static int mcm(int num1, int num2) {
        if (num1 == 0 || num2 == 0) {
            return 0;
        }
        
        return Math.abs(num1 * num2) / mcd(num1, num2);
    }

    public static void main(String[] args) {
        Scanner cin = new Scanner(System.in);
        System.out.println("Cálculo de MCM para dos números");
        System.out.print("Número 1: ");
        int num1 = cin.nextInt();
        System.out.print("Número 2: ");
        int num2 = cin.nextInt();

        String solucion = "MCM: " + mcm(num1, num2);
        System.out.println(solucion);
        
        cin.close();
    }
}
    
