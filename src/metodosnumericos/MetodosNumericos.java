/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metodosnumericos;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.concurrent.TimeUnit;
import static java.util.concurrent.TimeUnit.DAYS;
import javax.swing.JOptionPane;
import metodos.Bairstow;
import metodos.Muller;
/**
 *
 * @author Juanes
 */
public class MetodosNumericos {

    /**
     * @param args the command line arguments
    */
    Calendar fecha = Calendar.getInstance();

        int[] año = new int[500];
        int[] mes = new int[500];
        int[] dia = new int[500];
        int[] hora = new int[500];
        int[] min = new int[500];
        int[] seg = new int[500]; 
    
    public void date(){
        int i = 0;
        
        año[i] = fecha.get(Calendar.YEAR);
        mes[i] = fecha.get(Calendar.MONTH) + 1;
        dia[i] = fecha.get(Calendar.DAY_OF_MONTH);
        hora[i] = fecha.get(Calendar.HOUR_OF_DAY);
        min[i] = fecha.get(Calendar.MINUTE);
        seg[i] = fecha.get(Calendar.SECOND);
        
        i++;
    }
    public long minutos(){
        Calendar calendario1 = Calendar.getInstance();
        Calendar calendario2 = Calendar.getInstance();
        
        int idBills = 0;
        int Año = año[idBills-1];
        int Mes = mes[idBills-1];
        int Dia = dia[idBills-1];
        int Hora = año[idBills-1];
        int Min = min[idBills-1];
        int Seg = seg[idBills-1];
        
        calendario2.set(Año, Mes-1, Dia, Hora, Min, Seg);
        Date fecha = calendario2.getTime();

        long diferenciaMilisegundos = Math.abs(calendario1.getTimeInMillis() - fecha.getTime());
        long minutos = TimeUnit.MILLISECONDS.toMinutes(diferenciaMilisegundos);
        return minutos;
    }
    public static void main(String[] args) {
            
        
        

            
    // TODO code application logic here
    /*    Scanner sc = new Scanner(System.in);      
        int opcion1 = 0;
        int opcion2 = 0;
        
        do{
            try{
                opcion1 = Integer.parseInt(JOptionPane.showInputDialog(null,
                        "1. Metodo de Muller.\n"
                       +"2. Metodo de Bairstow.\n"
                       +"3. Salir.",JOptionPane.QUESTION_MESSAGE));
                    switch(opcion1){
                        case 1:
                            System.out.print("\tMETODO DE MULLER\n");                             
                            System.out.println("El ejercicio a realizar es: x^3 -0.5x^2+4x-2");
                            System.out.print("Digite la cantidad de iteraciones: ");
                            byte i = sc.nextByte();
                            System.out.println("Digite el valor x0, x1, x2 respectivamente: " );
                            double x0 = sc.nextDouble();
                            double x1 = sc.nextDouble();
                            double x2 = sc.nextDouble();
                            System.out.println(Muller.metodoDeMuller(i,x0,x1,x2));                               
                            break;
                        case 2:
                            System.out.print("\tMETODO DE BAIRSTOW\n");                            
                            System.out.println("El ejercicio a realizar es: 3.34-21.97x+16.3x^2-3.704x^3");                            
                            System.out.print("Digite la cantidad de iteraciones: ");
                            byte y = sc.nextByte();
                            System.out.print("Digite la cantidad de numeros: ");
                            byte n = sc.nextByte();
                            System.out.print("Digite el valor de r: ");
                            double r = sc.nextDouble();
                            System.out.print("Digite el valor de s: ");
                            double s = sc.nextDouble();
                            System.out.println(Bairstow.metodoDeBairstow(y,n,r,s));                            
                            break;
                        case 3:
                            JOptionPane.showMessageDialog(null,"Saliendo...","FIN",JOptionPane.QUESTION_MESSAGE);    
                            break; 
                        default:
                            JOptionPane.showMessageDialog(null, "Opción incorrecta","¡Ojo!",JOptionPane.QUESTION_MESSAGE);                            
                    }   
            }catch(NumberFormatException n){
            JOptionPane.showConfirmDialog(null, "error" +n.getMessage());
            } 
        }while(opcion1 != 3);
    }
    */
    }
}    
