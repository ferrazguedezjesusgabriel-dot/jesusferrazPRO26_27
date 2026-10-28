/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javaapplication1;

/**
 *
 * @author Usuario
 */
public class Practica11 {
    
    public static void main(String[] args) {
        
     /*   int x,y;
         x= 3;
        y= 4;
         y *= ++x;
                System.out.println("x=" + x +" y=" + y);
       */         
                //Codigo equivalente
                
                
        
        int x, y;

        x = 3;
        y = 4;

        x = x + 1;
        y = y * x;

        System.out.println("x=" + x + " y=" + y);
    }
}