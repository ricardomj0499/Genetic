/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import static java.lang.Math.max;
import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author DAC_125
 */
public class Population {

    public ArrayList<ArrayList<Chromosome>> populationInicial(ArrayList<ArrayList<Chromosome>> cromostarget, int total) {
        int cuadrante = 0;
        ArrayList<ArrayList<Chromosome>> poblaciones = new ArrayList();

        for (ArrayList<Chromosome> cuad : cromostarget) {
        

            System.out.println("oooooooooooooooCuadranteoooooooooooooooooooooooo");
          
            for (Chromosome aa : cuad) {
                 double por=aa.getCantidad()/total;
                 double pp=aa.cantidad-1/total-1;
                    System.out.println(por);
            }

        
           /* int tipo = 0;
            cuadrante++;
            ArrayList<ArrayList<Double>> cant = new ArrayList();
            int begin = 0;
            for (Chromosome indi : cuad) {
                ArrayList<Double> porc = new ArrayList();
                if (begin == 0) {
                    porc.add(0.0);
                    porc.add(Math.round(((indi.getCantidad() * 1) / total) * 100.0) / 100.0);
                    begin++;
                } else {
                    begin++;
                    for (int i=0;i<cant.size();i++){
                         for (int j=0;j<cant.size();j++){
                        System.out.println(cant.get(i).get(j));
                         }
                    }
                    //double sas = cant.get(cant.size() - 1).get(1) + 0.01;
                    //porc.add(sas);
                    //porc.add(Math.round(((indi.getCantidad() * 1) / total) * 100.0) / 100.0);
                }

            }

            double random = Math.round((0 + Math.random() * 1 - 0) * 100.0) / 100.0;
            ArrayList<Chromosome> poblacion = new ArrayList();
            for (ArrayList<Double> porcen : cant) {
                tipo++;
                if (random > porcen.get(0) && random < porcen.get(1)) {

                    poblacion.add(cromostarget.get(cuadrante).get(tipo));

                }
            }
            poblaciones.add(poblacion);
        }
        
        for(ArrayList<Chromosome> a:poblaciones){
            for (Chromosome aa : a) {
                System.out.println("-------tipo-----------------");

                System.out.println(aa.getR() + "," + aa.getG() + "," + aa.getB());
                System.out.println("x1,y1 = " + aa.getX1() + "," + aa.getY1());
                System.out.println("x2,y2 = " + aa.getX2() + "," + aa.getY2());
            }*/
        }
        

        return poblaciones;
    }

}
