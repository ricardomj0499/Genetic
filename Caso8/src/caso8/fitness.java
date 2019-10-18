/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DAC_125
 */
public class fitness {

    public void descartapoblacion(ArrayList<ArrayList<Chromosome>> poblacion, int total) {
        //System.out.println(poblacion.size());
        ArrayList<ArrayList<Chromosome>> reproducibles = new ArrayList();
        System.out.println("h");
        
        reproduccion(poblacion);
    }

    public void reproduccion(ArrayList<ArrayList<Chromosome>> reproductores) {
        //System.out.println(reproductores.size());
       for(ArrayList<Chromosome> l:reproductores){
           if (l.size()>0){
               for (int i=0;i<l.size();i++){
                    System.out.println(l.get(i).getCantidad());
               }
              
           }
       }
    }
}
