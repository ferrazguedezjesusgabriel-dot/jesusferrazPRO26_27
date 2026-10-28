/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

import java.util.Scanner;

/**
 *
 * @author Usuario
 */
public class Practica13 {
    
    public static void main(String[] args) {
        
        Scanner cin = new Scanner(System.in);

        System.out.println("Introduzca un número mayor que 5 ");
        int numero = cin.nextInt();

        boolean comparaCon5;
        comparaCon5 = numero > 5;

        System.out.println("Es " + comparaCon5 +
                " que el número sea mayor que 5");

        cin.close();
        
        //Si pongo un numero menor al 5 me dirá que es falso, de lo contrario será true.
    }
}

