/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;

/**
 *
 * @author DAC_125
 */
public class binario {
    
    public static String obtenerBinario(int numero){
   ArrayList<String> binario = new ArrayList<String>();
   int resto;
   String binarioString = "";

   do{
      resto = numero%2;
      numero = numero/2;
      binario.add(0, Integer.toString(resto));
   }while(numero > 2); //Haremos el bucle hasta que el cociente no se pueda dividir mas

   binario.add(0, Integer.toString(numero)); //Cogeremos el ultimo cociente

   //Cogemos cada uno de los elementos del ArrayList y los juntamos en un String
   for(int i = 0; i < binario.size(); i++){
       binarioString += binario.get(i);
   }
   return binarioString;
 }
    
}
