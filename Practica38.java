/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package tareasdelaptop;

import java.util.Scanner;

/**
 *
 * @author Jesus Ferraz
 */
public class Practica38 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        double horasTotales;
        int dias, horas, minutos, segundos;

        System.out.print("Introduce el número de horas: ");
        horasTotales = sc.nextDouble();

        dias = (int) (horasTotales / 24);

        horas = (int) (horasTotales % 24);

        minutos = (int) ((horasTotales * 60) % 60);

        segundos = (int) ((horasTotales * 3600) % 60);

        System.out.println(dias + " días " + horas + " horas "
                + minutos + " minutos " + segundos + " segundos");
        
    }
}
