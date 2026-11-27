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
public class Practica4UT3 {
    
    /**
     * Determina si la entrada que aporto el usuario esta entre 
     * 20 y 50 y si es multiplo de 3.
     * @param numerousuario recibe un numero entero del usuario.
     * @return un boolean que dice si el numero cumple o no sus requisitos
     */
    
    public static boolean numeroValido(int numerousuario) {
        
        if(numerousuario >= 20 && numerousuario <= 50 && numerousuario % 3 == 0){
            
            return true;
            
        } else {
            
        return false;    
            
        }     
        
    }
    
    public static void main(String[] args) {
        
        int num;
        Scanner cin = new Scanner(System.in);
        do{
            System.out.println("Introducir un numero: ");
            num= cin.nextInt();
        }
        
    }
    
}
