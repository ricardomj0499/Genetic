/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;
import java.util.Collections;

import java.util.Iterator;

/**
 *
 * @author DAC_125
 */
public class ClassifyTarget {

    public void classify(ArrayList<ColorList> lista) {

        ArrayList<ArrayList<Chromosome>> chromo = new ArrayList();

        for (int x = 0; x < 4; x++) {
            ArrayList<Chromosome> cromo = new ArrayList();

            ArrayList<Coords> black = new ArrayList();
            ArrayList<Coords> navy = new ArrayList();
            ArrayList<Coords> blue = new ArrayList();
            ArrayList<Coords> green = new ArrayList();
            ArrayList<Coords> teal = new ArrayList();
            ArrayList<Coords> deepskyblue = new ArrayList();
            ArrayList<Coords> lime = new ArrayList();
            ArrayList<Coords> springgreen = new ArrayList();
            ArrayList<Coords> cyan = new ArrayList();
            ArrayList<Coords> darkred = new ArrayList();
            ArrayList<Coords> purple = new ArrayList();
            ArrayList<Coords> darkviolet = new ArrayList();
            ArrayList<Coords> olive = new ArrayList();
            ArrayList<Coords> gray = new ArrayList();
            ArrayList<Coords> mediumslateblue = new ArrayList();
            ArrayList<Coords> chartreuse = new ArrayList();
            ArrayList<Coords> palegreen = new ArrayList();
            ArrayList<Coords> aqua = new ArrayList();
            ArrayList<Coords> red = new ArrayList();
            ArrayList<Coords> deepink = new ArrayList();
            ArrayList<Coords> magenta = new ArrayList();
            ArrayList<Coords> orange = new ArrayList();
            ArrayList<Coords> ligthsalmon = new ArrayList();
            ArrayList<Coords> violet = new ArrayList();
            ArrayList<Coords> yellow = new ArrayList();
            ArrayList<Coords> navajowhite = new ArrayList();
            ArrayList<Coords> whitegray = new ArrayList();

            /*Quicksort.quickSortx(lista.get(x).getBlack(), 0, lista.get(x).getBlack().size() - 1);/*
            Quicksort.quickSortx(lista.get(x).getNavy(), 0,lista.get(x).getNavy().size() - 1);
            Quicksort.quickSortx(lista.get(x).getBlue(), 0,lista.get(x).getBlue().size() - 1);
            Quicksort.quickSortx(lista.get(x).getGreen(), 0,lista.get(x).getGreen().size() - 1);
            Quicksort.quickSortx(lista.get(x).getTeal(), 0,lista.get(x).getTeal().size() - 1);
            Quicksort.quickSortx(lista.get(x).getDeepskyblue(), 0,lista.get(x).getDeepskyblue().size() - 1);
            Quicksort.quickSortx(lista.get(x).getLime(), 0,lista.get(x).getLime().size() - 1);
            Quicksort.quickSortx(lista.get(x).getSpringgreen(), 0,lista.get(x).getSpringgreen().size() - 1);
            Quicksort.quickSortx(lista.get(x).getCyan(), 0,lista.get(x).getCyan().size() - 1);
            Quicksort.quickSortx(lista.get(x).getDarkred(), 0,lista.get(x).getDarkred().size() - 1);
            Quicksort.quickSortx(lista.get(x).getPurple(), 0,lista.get(x).getPurple().size() - 1);
            Quicksort.quickSortx(lista.get(x).getDarkviolet(), 0,lista.get(x).getDarkviolet().size() - 1);
            Quicksort.quickSortx(lista.get(x).getOlive(), 0,lista.get(x).getOlive().size() - 1);
            Quicksort.quickSortx(lista.get(x).getGray(), 0,lista.get(x).getGray().size() - 1);
            Quicksort.quickSortx(lista.get(x).getMediumslateblue(), 0,lista.get(x).getMediumslateblue().size() - 1);
            Quicksort.quickSortx(lista.get(x).getChartreuse(), 0,lista.get(x).getChartreuse().size() - 1);
            Quicksort.quickSortx(lista.get(x).getPalegreen(), 0,lista.get(x).getPalegreen().size() - 1);
            Quicksort.quickSortx(lista.get(x).getAqua(), 0,lista.get(x).getAqua().size() - 1);
            Quicksort.quickSortx(lista.get(x).getRed(), 0,lista.get(x).getRed().size() - 1);
            Quicksort.quickSortx(lista.get(x).getDeepink(), 0,lista.get(x).getDeepink().size() - 1);
            Quicksort.quickSortx(lista.get(x).getMagenta(), 0,lista.get(x).getMagenta().size() - 1);
            Quicksort.quickSortx(lista.get(x).getOrange(), 0,lista.get(x).getOrange().size() - 1);
            Quicksort.quickSortx(lista.get(x).getLigthsalmon(), 0,lista.get(x).getLigthsalmon().size() - 1);
            Quicksort.quickSortx(lista.get(x).getViolet(), 0,lista.get(x).getViolet().size() - 1);
            Quicksort.quickSortx(lista.get(x).getYellow(), 0,lista.get(x).getYellow().size() - 1);
            Quicksort.quickSortx(lista.get(x).getNavajowhite(), 0,lista.get(x).getNavajowhite().size() - 1);
            Quicksort.quickSortx(lista.get(x).getWhitegray(), 0,lista.get(x).getWhitegray().size() - 1);*/
            for (Coords cuadrante_color : lista.get(x).getBlack()) {

                System.out.println(cuadrante_color.getX());
            }


            if (lista.get(x).getBlack().size() > 0) {
                //
                //icksort blackx = new Quicksort(lista.get(x).getBlack().get(x));
               Quicksort.quickSortx(lista.get(x).getBlack(), 0, lista.get(x).getBlack().size() - 1);
           
                System.out.println("ooooooooooooooooooooooooooooooooooooooo\n"+x);
                for (int blacki = 0; blacki < lista.get(x).getBlack().size(); blacki++) {
                    System.out.println(lista.get(x).getBlack().get(blacki).getX());
                    if (blacki < lista.get(x).getBlack().size() - 1) {
                        if (lista.get(x).getBlack().get(blacki).getX() - lista.get(x).getBlack().get(blacki).getX() < 5) {

                        }
                    }
                }
                //System.out.println(lista.get(x).getBlack().size());
               
            }
/*
            System.out.println("000000000000" + x);
            for (Coords cuadrante_color : lista.get(x).getBlack()) {

                System.out.println(cuadrante_color.getX());
            }
            System.out.println("\n");*/

            /*  

            for (Coords cuadrante_color : lista.get(x).getBlack()) {

                Coords coordblack = new Coords();
                coordblack.setR(cuadrante_color.getR());
                coordblack.setG(cuadrante_color.getG());
                coordblack.setB(cuadrante_color.getB());
                coordblack.setX(cuadrante_color.getX());
                coordblack.setY(cuadrante_color.getY());
                black.add(coordblack);
                if (!black.isEmpty()) {
                    Quicksort.quickSortx(black, 0, black.size() - 1);
                }
            }

 
            ArrayList<ArrayList<Coords>> selectblackx = new ArrayList();
            Iterator blackit = black.iterator();
            int blacki = 0;
            while (blackit.hasNext()) {
                ArrayList<Coords> partial_black = new ArrayList();
                blacki++;
                while (blackit.hasNext() && black.get(blacki).getY() - black.get(blacki - 1).getY() < 5) {
                    partial_black.add(black.get(blacki));
                    blackit.next();
                }
                if (!partial_black.isEmpty()) {
                    selectblackx.add(partial_black);
                }

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
                if (!partial_black.isEmpty()) {
                    selectblacky.add(partial_black);
                }

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
            }*/
//--------------------------------------------------------------------------------------------            
            for (Coords cuadrante_color : lista.get(x).getNavy()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords cuadrante_color : lista.get(x).getBlue()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords cuadrante_color : lista.get(x).getGreen()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getTeal()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getDeepskyblue()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getLime()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getSpringgreen()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getCyan()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord : lista.get(x).getDarkred()) {

            }

//---------------------------------------------------------------------------------------------
            chromo.add(cromo);

        }

        //return chromo;
    }
}
