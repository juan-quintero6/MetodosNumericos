/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

/**
 *
 * @author Juanes
 */
public class Funcion {
    
    public static double calcularFuncion(double n){
        double funcion = Math.pow(n, 3) -0.5*Math.pow(n,2) +4*n -2;
        return funcion;
    }    
}

