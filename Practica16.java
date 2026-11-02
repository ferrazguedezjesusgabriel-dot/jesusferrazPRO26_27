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
public class Practica16 {
    
    public static void main(String[] args) {
        
        System.out.println("Introduce los metros de la base: ");
        Scanner sc = new Scanner(System.in);
        
        int base = sc.nextInt();
        
        System.out.println("Introduce los metros de la altura: ");
        int altura = sc.nextInt();
        
        double areametroscuadrados = base * altura;
        
        double areacentimetroscuadrados = areametroscuadrados * 10.000;
        
        System.out.println("Tu finca mide "+ areametroscuadrados + " metros cuadrados, mientras que en centimetros cuadrados mide: " + areacentimetroscuadrados);
        
        
        
    }
    
}
