/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema5;

import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author USUARIO PC
 */
public class Problema5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada= new Scanner(System.in);
        entrada.useLocale(Locale.US);
        int contador= 1;
        String nombre;
        double promedio;
        String cadenaF = "";
        while(contador<=4){
            System.out.println("Ingrese el nombre del estudiante:");
            nombre= entrada.nextLine();
            System.out.println("Integrese el promedio:");
            promedio= entrada.nextDouble();
            if(promedio>=7){
                cadenaF = String.format("%s\t%s\t%.2f\t"+"Aprobado\n",
                        cadenaF,nombre,promedio); 
            }else{
                cadenaF = String.format("%s\t%s\t%.2f\t"+"Reprobado\n",
                        cadenaF,nombre,promedio); 
            }
            contador=contador+1;
            entrada.nextLine();
        }
         System.out.printf("%s\n", cadenaF);
    }
    
}
