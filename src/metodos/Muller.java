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
public class Muller {
    
    public static String metodoDeMuller(byte x, double x0, double x1, double x2){
    
            
        for (int i = 1; i <= x; i++) {
         
            double fx0 = Math.pow(x0, 3) -0.5*Math.pow(x0,2) +4*x0 -2;
            double fx1 = Math.pow(x1, 3) -0.5*Math.pow(x1,2) +4*x1 -2;
            double fx2 = Math.pow(x2, 3) -0.5*Math.pow(x2,2) +4*x2 -2;
   
            //double fx0 = Math.pow(x0, 3) +Math.pow(x0, 2) -4*x0 -4; 
            //double fx1 = Math.pow(x1, 3) +Math.pow(x1, 2) -4*x1 -4;
            //double fx2 = Math.pow(x2, 3) +Math.pow(x2, 2) -4*x2 -4;
            
            //Parte 1
            double h0 = x1-x0;
            double h1 = x2-x1;

            double d0 = (fx1-fx0)/h0;
            double d1 = (fx2-fx1)/h1;                
            //Parte 2
            double a = (d1-d0)/(h1+h0);
            double b = a*h1+d1;
            double c = fx2;
            //Parte 3        
            if(b >= 0){
                double x3 = x2 + -2*c/(b+ Math.sqrt(Math.pow(b, 2)- (4*a*c)));    
                double EA = (float)((x3-x2)/x3)*100;

                if (EA < 0){
                    EA*=-1;
                }
                
                x0 = x1;
                x1 = x2;
                x2 = x3;
                                
                System.out.println("Iteración" +i +": " +x3 +" EA: " +EA +"%");
              /*System.out.println("fx0= "+fx0 +" fx1= "+fx1 +" fx2= "+fx2);
                System.out.println("h0= " +h0 +" h1= " +h1);
                System.out.println("d0= " +d0 +" d1= " +d1);
                System.out.println("a= " +a +" b= " +b +" c= " +c);
                System.out.println("-----------------------------------------");
                */
        }               
            else{    
                double x3 = x2 + -2*c/(b - Math.sqrt(Math.pow(b, 2)- (4*a*c))); 
                double EA = ((x3-x2)/x3)*100;
                
               if (EA < 0){
                    EA*=-1;
                }                
                
                x0 = x1;
                x1 = x2;
                x2 = x3;
                System.out.println("Iteración" +i +": " +x3 +" EA: " +EA +"%");
            }
        }
        return "\nFIN";    
    }
    public static double ErrorAbsoluto(double x3, double x2){
        double EA = ((x3-x2)/x2)*100;    
        if (EA >= 0){
           return EA;
        }else{
           return (-1)*EA;    
        }
    }
}
