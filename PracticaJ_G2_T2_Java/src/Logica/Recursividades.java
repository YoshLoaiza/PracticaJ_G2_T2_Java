/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author joss
 */
//comentarios
public class Recursividades {
     public int CalcularFactorial(int num)
    {
    if(num== 1   )
    {
    return 1;   
    }
    return num*CalcularFactorial(num-1);
    }
}
