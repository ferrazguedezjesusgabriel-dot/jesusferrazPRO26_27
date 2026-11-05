/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package almacendeprogramas;

import java.util.Scanner;

/**
 *
 * @author Jesus Ferraz
 */
public class Practica30 {
    
    public static void main(String[] args) {
        
        
        Scanner sc = new Scanner(System.in);
        
         char continuar;
        do{
            
            int aleatorio = (int)(Math.random()*20);
            
            while(aleatorio < 10){
                if(aleatorio < 10){
                    
                    aleatorio = (int) (Math.random()*20);
                    
                }
            
            }
            
            System.out.println("El numero elegido es: "+ aleatorio);
            System.out.println("Continuar?: ");
           continuar = sc.next().charAt(0);
            
        } while (continuar == 'C' || continuar == 'c');
        
        System.out.println("Termino el programa.");
        
    }
    
}
