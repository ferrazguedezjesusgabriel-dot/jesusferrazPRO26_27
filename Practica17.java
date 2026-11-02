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
public class Practica17 {
    
    public static void main(String[] args) {
        
        System.out.println("Holaa dame el precio del producto: ");
        Scanner sc = new Scanner(System.in);
        
        double preciosinIGIC = sc.nextDouble();
        
        double impuesto = preciosinIGIC * 0.07;
        
        double productoconigic = preciosinIGIC + impuesto;
        
        System.out.println("Los impuestos aplicados gracias al IGIC son "+ impuesto);
        System.out.println("Sin embargo, el precio final del producto con el IGIC es: "+ productoconigic);
        
    }
}
