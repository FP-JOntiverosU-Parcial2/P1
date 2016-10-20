/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema1;
import java.util.*;

/**
 *
 * @author jaime
 */
public class Problema1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int anyo,resultado;
        anyo=solicitarDato(); //solicitamos el dato
        resultado = operacion(anyo);// se hace la operacion
        mensajeSalida();

        
        
    }
     public static int solicitarDato(){
        int anyo;
        System.out.println("Introduce el año, para saber si es bisiesto o no, ;) : ");
        Scanner teclado= new Scanner(System.in);
        anyo=teclado.nextInt();
        return anyo;
     }
        
       public static int operacion(int anyo){
      
        if ((anyo % 4 == 0) && ((anyo % 100 != 0) || (anyo % 400 == 0))){ //si el anyo se pude dividir entre 4 o entre 100 y 400 y no quede ressiduo
            System.out.println("El año es bisiesto");   //entonces es bisiesto
        }
        else{
            System.out.println("El año no es bisiesto");}
        return anyo;
       }
       public static void mensajeSalida(){
           System.out.println("Gracias por usar el programa"); // se agradece por usar el programa
           System.exit(0);
       }
}
