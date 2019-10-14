/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author DAC_125
 */
public class ClassifyTarget {

    public void classify(ArrayList<ColorList> lista) {

        ArrayList<ArrayList<Chromosome>> chromo = new ArrayList();

        for (int x = 0; x < lista.size(); x++) {
            ArrayList<Chromosome> cromo = new ArrayList();
            // System.out.println("mmmmmmmmmmmmmmmmmmmmmmmmmmm");
            ArrayList<Coords> black = new ArrayList();
            for (Coords cuadrante_color : lista.get(x).getBlack()) {
                Coords coordblack = new Coords();
                coordblack.setR(cuadrante_color.getR());
                coordblack.setG(cuadrante_color.getG());
                coordblack.setB(cuadrante_color.getB());
                coordblack.setX(cuadrante_color.getX());
                coordblack.setY(cuadrante_color.getY());
                black.add(coordblack);
                if (black.size() != 0) {
                    Quicksort.quickSortx(black, 0, black.size() - 1);
                }
            }

            ArrayList<ArrayList<Coords>> selectblackx = new ArrayList();
            int blacki = 0;
            Iterator blackit = black.iterator();

            while (blackit.hasNext()) {
                ArrayList<Coords> partial_black = new ArrayList();
                blacki++;
                while (blackit.hasNext() && black.get(blacki).getX() - black.get(blacki - 1).getX() < 5) {
                    partial_black.add(black.get(blacki));
                    blackit.next();
                }
                selectblackx.add(partial_black);
            }

            for (ArrayList<Coords> selecty : selectblackx) {
                Quicksort.quickSorty(selecty, 0, selecty.size() - 1);
            }

            ArrayList<ArrayList<Coords>> selectblacky = new ArrayList();
            int blackj = 0;
            while (blackit.hasNext()) {
                ArrayList<Coords> partial_black = new ArrayList();
                blackj++;
                while (blackit.hasNext() && black.get(blackj).getY() - black.get(blackj - 1).getY() < 5) {
                    partial_black.add(black.get(blackj));
                    blackit.next();
                }
                selectblacky.add(partial_black);
            }

            for (ArrayList<Coords> select : selectblacky) {
                Chromosome cromosoma = new Chromosome();
                cromosoma.setR(select.get(0).getR());
                cromosoma.setG(select.get(0).getG());
                cromosoma.setB(select.get(0).getB());
                cromosoma.setX1(select.get(0).getX());
                cromosoma.setY1(select.get(0).getY());
                cromosoma.setX2(select.get(select.size() - 1).getX());
                cromosoma.setY2(select.get(select.size() - 1).getX());
                cromo.add(cromosoma);
            }
//--------------------------------------------------------------------------------------------            

            for (Coords cuadrante_color : lista.get(x).getNavy()) {

                Coords coordblack = new Coords();
                coordblack.setR(cuadrante_color.getR());
                coordblack.setG(cuadrante_color.getG());
                coordblack.setB(cuadrante_color.getB());
                coordblack.setX(cuadrante_color.getX());
                coordblack.setY(cuadrante_color.getY());
                black.add(coordblack);
                if (black.size() != 0) {
                    Quicksort.quickSortx(black, 0, black.size() - 1);
                }
            }

            ArrayList<ArrayList<Coords>> selectnavyx = new ArrayList();
            int navyi = 0;
            Iterator navyit = black.iterator();

            while (navyit.hasNext()) {
                ArrayList<Coords> partial_black = new ArrayList();
                navyi++;
                while (navyit.hasNext() && black.get(navyi).getX() - black.get(navyi - 1).getX() < 5) {
                    partial_black.add(black.get(navyi));
                    navyit.next();
                }
                selectnavyx.add(partial_black);
            }

            for (ArrayList<Coords> selecty : selectnavyx) {
                Quicksort.quickSorty(selecty, 0, selecty.size() - 1);
            }

            ArrayList<ArrayList<Coords>> selectnavy = new ArrayList();
            int navyj = 0;
            while (navyit.hasNext()) {
                ArrayList<Coords> partial_black = new ArrayList();
                navyj++;
                while (navyit.hasNext() && black.get(navyj).getY() - black.get(navyj - 1).getY() < 5) {
                    partial_black.add(black.get(navyj));
                    navyit.next();
                }
                selectnavy.add(partial_black);
            }

            for (ArrayList<Coords> select : selectnavy) {
                Chromosome cromosoma = new Chromosome();
                cromosoma.setR(select.get(0).getR());
                cromosoma.setG(select.get(0).getG());
                cromosoma.setB(select.get(0).getB());
                cromosoma.setX1(select.get(0).getX());
                cromosoma.setY1(select.get(0).getY());
                cromosoma.setX2(select.get(select.size() - 1).getX());
                cromosoma.setY2(select.get(select.size() - 1).getX());
                cromo.add(cromosoma);
            }

//---------------------------------------------------------------------------------------------
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
            
            chromo.add(cromo);

        }
        
        //return chromo;
    }
}
