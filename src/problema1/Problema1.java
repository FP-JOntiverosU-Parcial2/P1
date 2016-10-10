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
       int anyo;
        anyo = solicitarAnyo();
        
        
    }
     public static int solicitarDato(String d){
        int miDato;
        System.out.println("Introduce el año, para saber si es bisiesto o no: " + d);
        Scanner teclado= new Scanner(System.in);
        miDato=teclado.nextInt();
        return miDato;
     }
        
       public static int solicitarAnyo(){
        int anyo;
        anyo = solicitarDato("");
        if (((400 % anyo == 0) && (100 % anyo != 0)) || (4 % anyo == 0)){
    	System.out.println("El año es bisiesto");}
        else{
    	System.out.println("El año no es bisiesto");
        }
        return anyo;
       }
}
