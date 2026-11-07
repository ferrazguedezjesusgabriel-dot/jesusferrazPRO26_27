/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasdelaptop;

import java.util.Scanner;

/**
 *
 * @author Jesus
 */
public class Practica37 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int billetesde500, billetesde200, billetesde100;
        int billetesde50, billetesde20, billetesde10, billetesde5;

        int total;

        System.out.print("¿Cuántos billetes de 500 tienes? ");
        billetesde500 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 200 tienes? ");
        billetesde200 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 100 tienes? ");
        billetesde100 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 50 tienes? ");
        billetesde50 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 20 tienes? ");
        billetesde20 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 10 tienes? ");
        billetesde10 = sc.nextInt();

        System.out.print("¿Cuántos billetes de 5 tienes? ");
        billetesde5 = sc.nextInt();

        total = (billetesde500 * 500) +
                (billetesde200 * 200) +
                (billetesde100 * 100) +
                (billetesde50 * 50) +
                (billetesde20 * 20) +
                (billetesde10 * 10) +
                (billetesde5 * 5);

        System.out.println("El dinero total que tienes es: " + total + " euros");
        
    }
    
}
