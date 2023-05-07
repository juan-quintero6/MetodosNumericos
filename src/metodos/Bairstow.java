/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodos;

import java.util.Scanner;

/**
 *
 * @author Juanes
 */
public class Bairstow {
    
        Scanner sc = new Scanner(System.in);   
        public static String metodoDeBairstow(byte iter, byte n, double r, double s){
            
            
            for (int i = 1; i <= iter; i++) {
                double a0 = 9.34;
                double a1 = -21.97;                
                double a2 = 16.3;                
                double a3 = -3.704;
                double a4 = 0;
                double a5 = 0; 
                
                if(n == 5){
                    //Coeficientes a
                    double b5 = a5;
                    double b4 = a4 + r*b5;
                    double b3 = a3 + r*b4 + s*b5;
                    double b2 = a2 + r*b3 + s*b4;
                    double b1 = a1 + r*b2 + s*b3;
                    double b0 = a0 + r*b1 + s*b2;    
                    //Coeficientes c
                    double c5 = b5;
                    double c4 = b4 + r*c5;                
                    double c3 = b3 + r*c4 + s*c5;                
                    double c2 = b2 + r*c3 + s*c4;                
                    double c1 = b1 + r*c2 + s*c3;                    
                    //DeltaR y DeltaS
                    double Dr = (c3*b0-c2*b1)/(Math.pow(c2, 2)-c1*c3);
                    double Ds = (c1*b1-c2*b0)/(Math.pow(c2, 2)-c1*c3);                
                    //Nuevos valores de r y s
                    r = r + Dr;
                    s = s + Ds;

                    System.out.println("-------------------------Iteración " +i +"-------------------------");
                    System.out.println("\tCoeficientes b" +"\nb5 = "+b5 +"\nb4 = "+b4 +"\nb3 = "+b3 +"\nb2 = "+b2 +"\nb1 = "+b1 +"\nb0 = "+b0);
                    System.out.println("\tCoeficientes c" +"\nb5 = "+b5 +"\nc4 = "+c4 +"\nc3 = "+c3 +"\nc2 = "+c2 +"\nc1 = "+c1);
                    System.out.println("\nDr = " +Dr +"\nr = "+r +"\nEar = " +Ear(Dr, r) +"\n");
                    System.out.println("\nDs = " +Ds +"\ns = "+s +"\nEas = " +Eas(Ds, s) );
                }else if(n == 4){   
                    //Coeficientes b
                    double b4 = a4;
                    double b3 = a3 + r*b4;
                    double b2 = a2 + r*b3 + s*b4;
                    double b1 = a1 + r*b2 + s*b3;
                    double b0 = a0 + r*b1 + s*b2;
                    //Coeficientes c
                    double c4 = b4;                
                    double c3 = b3 + r*c4;                
                    double c2 = b2 + r*c3 + s*c4;                
                    double c1 = b1 + r*c2 + s*c3;                       
                    //DeltaR y DeltaS
                    double Dr = (c3*b0-c2*b1)/(Math.pow(c2, 2)-c1*c3);
                    double Ds = (c1*b1-c2*b0)/(Math.pow(c2, 2)-c1*c3);                
                    //Nuevos valores de r y s
                    r = r + Dr;
                    s = s + Ds;

                    System.out.println("-------------------------Iteración " +i +"-------------------------");
                    System.out.println("\tCoeficientes b" +"\nb4 = "+b4 +"\nb3 = "+b3 +"\nb2 = "+b2 +"\nb1 = "+b1 +"\nb0 = "+b0);
                    System.out.println("\tCoeficientes c" +"\nc4 = "+c4 +"\nc3 = "+c3 +"\nc2 = "+c2 +"\nc1 = "+c1);
                    System.out.println("\nDr = " +Dr +"\nr = "+r +"\nEar = " +Ear(Dr, r) +"\n");
                    System.out.println("\nDs = " +Ds +"\ns = "+s +"\nEas = " +Eas(Ds, s) );
                }else if(n == 3){
                    //Coeficientes b
                    double b3 = a3;
                    double b2 = a2 + r*b3;
                    double b1 = a1 + r*b2 + s*b3;
                    double b0 = a0 + r*b1 + s*b2;
                    //Coeficientes c           
                    double c3 = b3;                
                    double c2 = b2 + r*c3;                
                    double c1 = b1 + r*c2 + s*c3;                       
                    //DeltaR y DeltaS
                    double Dr = (c3*b0-c2*b1)/(Math.pow(c2, 2)-c1*c3);
                    double Ds = (c1*b1-c2*b0)/(Math.pow(c2, 2)-c1*c3);                
                    //Nuevos valores de r y s
                    r = r + Dr;
                    s = s + Ds;

                    System.out.println("-------------------------Iteración " +i +"-------------------------");
                    System.out.println("\tCoeficientes b" +"\nb3 = "+b3 +"\nb2 = "+b2 +"\nb1 = "+b1 +"\nb0 = "+b0);
                    System.out.println("\tCoeficientes c" +"\nc3 = "+c3 +"\nc2 = "+c2 +"\nc1 = "+c1);
                    System.out.println("\nDr = " +Dr +"\nr = "+r +"\nEar = " +Ear(Dr, r) +"\n");
                    System.out.println("\nDs = " +Ds +"\ns = "+s +"\nEas = " +Eas(Ds, s) );    
                }
        }     
            double x1 = (r + Math.sqrt(Math.pow(r, 2)+4*s))/2;
            double x2 = (r - Math.sqrt(Math.pow(r, 2)+4*s))/2;                
            
            System.out.println("\nRaices");    
            System.out.println("x1 = " +x1);
            System.out.println("x2 = " +x2);            
            return "FIN";
        }
        
        //Metodos
        public static double Ear(double Dr, double r){
            double Ear = (Dr/r)*100;
            if (Ear < 0){Ear*=-1;}
            return Ear;
        }
        public static double Eas(double Ds, double s){
            double Eas = (Ds/s)*100;
            if (Eas < 0){Eas*=-1;}
            return Eas;
        }
        
}
