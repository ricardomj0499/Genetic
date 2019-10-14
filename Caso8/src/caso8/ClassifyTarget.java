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
            //System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
            ArrayList<Coords> blacky = new ArrayList();
            for (Coords coords : lista.get(x).getBlack()) {
                Coords coord = new Coords();
                coord.setR(coords.getR());
                coord.setG(coords.getG());
                coord.setB(coords.getB());
                coord.setX(coords.getX());
                coord.setY(coords.getY());

                for (Coords coorda : blacky) {
                    System.out.println("-------------------------");
                    System.out.println(coorda.getX());
                }

                blacky.add(coord);
                if (blacky.size() != 0) {
                    Quicksort.quickSortx(blacky, 0, blacky.size() - 1);
                }

            }

            for (Coords coorda : blacky) {
                System.out.println("++++++++++++++++++++++");
                System.out.println(coorda.getX());
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
