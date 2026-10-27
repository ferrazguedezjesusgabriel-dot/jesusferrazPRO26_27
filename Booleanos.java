/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendeprogramas;

import java.util.Scanner;

/**
 *
 * @author alumno
 */
public class Booleansetc27102026 {
    
    public static void main(String[] args) {
        
     /*   boolean dosIgualAtres = 2 == 3;
        boolean otraComparacion = 2 ==2;
        System.out.println(dosIgualAtres);
        System.out.println(otraComparacion);
        int a = 5;
        boolean comparacionDistintoDe= a != 5;
        System.out.println("Es a distinto de 5? " + comparacionDistintoDe);
        
        boolean EsAMayorQue4 = a > 4;
        
        System.out.println("a es mayor que 4? " + EsAMayorQue4);
        
        boolean esAMenorOIgualQue7 = a <= 7;
        System.out.println("Es A menor o igual que 7? "+ esAMenorOIgualQue7);
        
        boolean esAMayorOIgualQue8 = a >= 8;
        System.out.println("Es a mayor o igual que 8 ? "+ esAMayorOIgualQue8);
        
        */
     
        //El programa pide el usuario su edad y se le muestra mensaje:
        //"es adulto" o "no es adulto"
        
        System.out.println("Holaa dame tu edad");
         Scanner sc = new Scanner(System.in);
         
         int edad = sc.nextInt();
         
         String esono = ( edad > 18)? "Eres mayor de edad" : "NO eres mayor de edad";
         
         System.out.println(esono);
        
        
        
    }
    
}
