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
 
       public static String  decorador(String texto){
        
        String respuesta = "";
        String asteriscos = "";
        for (int i = 0; i < texto.length() +2; i++) {
            asteriscos += "*";
        }
        respuesta += asteriscos;
        respuesta += "\n";
        respuesta += "*"+texto+"*\n";
        respuesta += asteriscos;
        //System.out.println(respuesta);
        return respuesta;
        
    }
    
    
    public static void main(String[] args) {
        
        /* decorador de textos
        El usuario introduce un texto y se lo muestras "decorado"

        si pone: hola se muestra:
          ******

        *hola*
        ******
*/
        
        System.out.println("Elige la palabra o texto a decorar: ");
        Scanner sc = new Scanner(System.in);
        String eleccion = sc.nextLine();
        
        System.out.println(decorador(decorador(eleccion)));
    }
    
}
