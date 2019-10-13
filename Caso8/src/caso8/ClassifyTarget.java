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
public class ClassifyTarget {

    public void classify(ArrayList<ColorList> lista) {
        for (int x = 0; x < lista.size(); x++) {
            ArrayList<Coords> blacky = new ArrayList();
            for (Coords coord : lista.get(x).getBlack()) {
               blacky.add(coord);
              // Quicksort.quickSortx(blacky, 0, blacky.size());
            }
            for (Coords coord : lista.get(x).getNavy()) {
                
            }
            for (Coords coord : lista.get(x).getBlue()) {
                
            }
            for (Coords coord : lista.get(x).getGreen()) {
                
            }
            for (Coords coord : lista.get(x).getTeal()) {
                
            }
            for (Coords coord : lista.get(x).getDeepskyblue()) {
                
            }
            for (Coords coord : lista.get(x).getLime()) {
                
            }
            for (Coords coord : lista.get(x).getSpringgreen()) {
                
            }
            for (Coords coord : lista.get(x).getCyan()) {
                
            }
            for (Coords coord : lista.get(x).getDarkred()) {
                
            }
            
        }
    }
}
