/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package problema9;
import java.util.*;
/**
 *
 * @author jaime
 */
public class Problema9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int dato;
       
        String var = "dato";
        
        dato =solicitarNumero();
        operacion("dato");
                
    }
    public static int solicitarNumero(){
            int dato;
            Scanner teclado= new Scanner (System.in);
            System.out.print("Introduzca digito de 4 numeros: ");
            dato=teclado.nextInt();
            return dato;
        
    }
    public static String operacion(String d){
        int numero1, numero2, numero3, numero4;
        char cad [];
        int longitud = d.length();
        cad= d.toCharArray();
        
        numero1= d.charAt(0);
        numero2= d.charAt(1);
        numero3= d.charAt(2);
        numero4= d.charAt(3);
        System.out.println("El resultado es igua a: " + numero1 + " + " + numero2 + " + " + numero3 + " + " + numero4 );
        
        
        
       
        return d;
    }

   
    }

