/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practicaj_g2_t2_java;

import Logica.Recursividades;

/**
 *
 * @author joss
 */
public class PracticaJ_G2_T2_Java {

    /**
     * @param args the command line arguments
     */
    
    //este es el principal
    public static void main(String[] args) {
       System.out.println("Metodos Recursivos");
        System.out.println("\n\nCalcular factorial de 5");
        
        Recursividades oRecursividades = new Recursividades();
        int resultado = oRecursividades.CalcularFactorial(5);
        
        System.out.println("El factorial de 5 es: "+resultado);
    }
    
}
