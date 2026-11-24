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
public class primeraactfunciones {
    
 /*   public static int main(String[] args) {
        
        
        
    }
    
   */ 
    public static void main(String[] args) {
     
        System.out.println("Menu");
        System.out.println("------------");
        System.out.println("1. Sumar");
        System.out.println("2. Restar");
        System.out.println("3. Multiplicar");
        System.out.println("4. Dividir");
        System.out.println("------------/n");
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Introduce tu elección: ");
        int eleccionusuario = sc.nextInt();
        
        switch(eleccionusuario) {
            
            case 1: System.out.println("Ingresa el primer numero a sumar: ");
                    int num1 = sc.nextInt();
                    System.out.println("Ahora el segundo: ");
                    int num2 = sc.nextInt();

                    int suma = num1 + num2;
            
                    System.out.println("El resultado de tu operación es: "+suma);
                    break;
            
            case 2: System.out.println("Ingresa el primer numero a restar: ");
                    int numr1 = sc.nextInt();
                    System.out.println("Ahora el segundo: ");
                    int numr2 = sc.nextInt();
            
                    int resta = num1 + num2;
                    
                    System.out.println("El resultado de tu operación es: "+resta);
                    break;
            
            case 3: System.out.println("Ingresa el primer numero a multiplicar: ");
                    int numm1 = sc.nextInt();
                    System.out.println("Ahora el segundo: ");
                    int numm2 = sc.nextInt();
            
                    int multiplicacion = num1 + num2;
                    
                    System.out.println("El resultado de tu operación es: "+multiplicacion);
                    break;
                    
            case 4: System.out.println("Ingresa el primer numero a dividir: ");
                    int numd1 = sc.nextInt();
                    System.out.println("Ahora el segundo: ");
                    int numd2 = sc.nextInt();
            
                    int division = num1 + num2;
                    
                    System.out.println("El resultado de tu operación es: "+division);
                    break;
                
                
        }
        
    }
    
}
