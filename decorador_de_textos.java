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
public class decorador_de_textos {
 
    public static String Decorador_de_textos(String texto){
    
        int longitudTexto = texto.length();

        String asterisco = "";

    for (int i = 0; i < longitudTexto; i++) {
        asterisco += "*";
    }
        
    return
        System.out.println(asterisco + "\n" + texto + "\n" + asterisco);

    } 
    
    
    
    public static void main(String[] args) {
        
        /* decorador de textos
        El usuario introduce un texto y se lo muestras "decorado"

        si pone: hola se muestra:
          ******

        *hola*
        ******
*/
        System.out.println("Introduce el texto");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine();
        System.out.println(Decorador_de_textos(eleccion));

    
}
}