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
        ArrayList<ArrayList<ArrayList<Coords>>> tmpe = new ArrayList();

        for (int x = 0; x < lista.size(); x++) {

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
            ArrayList<ArrayList<Coords>> tmpnegro = new ArrayList();
            int blacknegro = 0;
            //System.out.println("top"+lista.get(x).getBlack().size());
            if (lista.get(x).getBlack().size() > 0) {

                // Quicksort.quickSortx(lista.get(x).getBlack(), 0, lista.get(x).getBlack().size() - 1);
                // System.out.println(Math.abs(lista.get(x).getBlack().get(blacknegro + 1).getX() - lista.get(x).getBlack().get(blacknegro).getX()) + "p");
                while (blacknegro < lista.get(x).getBlack().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (blacknegro < lista.get(x).getBlack().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getBlack().size();
                        while (Math.abs(lista.get(x).getBlack().get(blacknegro + 1).getX() - lista.get(x).getBlack().get(blacknegro).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getBlack().get(blacknegro).getR());
                            cord.setG(lista.get(x).getBlack().get(blacknegro).getG());
                            cord.setB(lista.get(x).getBlack().get(blacknegro).getB());
                            cord.setX(lista.get(x).getBlack().get(blacknegro).getX());
                            cord.setY(lista.get(x).getBlack().get(blacknegro).getY());
                            tmpx.add(cord);
                            if (blacknegro + 1 < lista.get(x).getBlack().size() - 2) {
                                blacknegro++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpnegro.add(tmpx);
                        blacknegro++;

                    } else {
                        blacknegro++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                ArrayList<ArrayList<Coords>> tmpy = new ArrayList();
                blacknegro = 0;
                //System.out.println("top"+lista.get(x).getBlack().size());

                for (ArrayList<Coords> types : tmpnegro) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpnegro);
            }
//--------------------------------------------------------------------------------------------            
            ArrayList<ArrayList<Coords>> tmpnavy = new ArrayList();
            int navyi = 0;
            //System.out.println("top"+lista.get(x).getn().size());
            if (lista.get(x).getNavy().size() > 0) {

                //  Quicksort.quickSortx(lista.get(x).getNavy(), 0, lista.get(x).getNavy().size() - 1);
                while (navyi < lista.get(x).getNavy().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (navyi < lista.get(x).getNavy().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getNavy().size();
                        while (Math.abs(lista.get(x).getNavy().get(navyi + 1).getX() - lista.get(x).getNavy().get(navyi).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getNavy().get(navyi).getR());
                            cord.setG(lista.get(x).getNavy().get(navyi).getG());
                            cord.setB(lista.get(x).getNavy().get(navyi).getB());
                            cord.setX(lista.get(x).getNavy().get(navyi).getX());
                            cord.setY(lista.get(x).getNavy().get(navyi).getY());
                            tmpx.add(cord);
                            if (navyi + 1 < lista.get(x).getNavy().size() - 2) {
                                navyi++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpnavy.add(tmpx);
                        navyi++;

                    } else {
                        navyi++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                navyi = 0;
                //System.out.println("top"+lista.get(x).getBlack().size());

                for (ArrayList<Coords> types : tmpnavy) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpnavy);
            }
//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmpblue = new ArrayList();
            int bluei = 0;
            //System.out.println("top"+lista.get(x).getBlue().size());
            if (lista.get(x).getBlue().size() > 0) {

                // Quicksort.quickSortx(lista.get(x).getBlue(), 0, lista.get(x).getBlue().size() - 1);
                while (bluei < lista.get(x).getBlue().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (bluei < lista.get(x).getBlue().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getBlue().size();
                        while (Math.abs(lista.get(x).getBlue().get(bluei + 1).getX() - lista.get(x).getBlue().get(bluei).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getBlue().get(bluei).getR());
                            cord.setG(lista.get(x).getBlue().get(bluei).getG());
                            cord.setB(lista.get(x).getBlue().get(bluei).getB());
                            cord.setX(lista.get(x).getBlue().get(bluei).getX());
                            cord.setY(lista.get(x).getBlue().get(bluei).getY());
                            tmpx.add(cord);
                            if (bluei + 1 < lista.get(x).getBlue().size() - 2) {
                                bluei++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpblue.add(tmpx);
                        bluei++;

                    } else {
                        bluei++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                bluei = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmpblue) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpblue);
            }
//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmpgreen = new ArrayList();
            int greeni = 0;
            //System.out.println("top"+lista.get(x).getGreen().size());
            if (lista.get(x).getGreen().size() > 0) {

                //       Quicksort.quickSortx(lista.get(x).getGreen(), 0, lista.get(x).getGreen().size() - 1);
                while (greeni < lista.get(x).getGreen().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (greeni < lista.get(x).getGreen().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getGreen().size();
                        while (Math.abs(lista.get(x).getGreen().get(greeni + 1).getX() - lista.get(x).getGreen().get(greeni).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getGreen().get(greeni).getR());
                            cord.setG(lista.get(x).getGreen().get(greeni).getG());
                            cord.setB(lista.get(x).getGreen().get(greeni).getB());
                            cord.setX(lista.get(x).getGreen().get(greeni).getX());
                            cord.setY(lista.get(x).getGreen().get(greeni).getY());
                            tmpx.add(cord);
                            if (greeni + 1 < lista.get(x).getGreen().size() - 2) {
                                greeni++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpgreen.add(tmpx);
                        greeni++;

                    } else {
                        greeni++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                greeni = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmpgreen) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpgreen);
            }

//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmpteal = new ArrayList();
            int teali = 0;
            //System.out.println("top"+lista.get(x).getGreen().size());
            if (lista.get(x).getTeal().size() > 0) {

                //       Quicksort.quickSortx(lista.get(x).getTeal(), 0, lista.get(x).getTeal().size() - 1);
                while (teali < lista.get(x).getTeal().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (teali < lista.get(x).getTeal().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getTeal().size();
                        while (Math.abs(lista.get(x).getTeal().get(teali + 1).getX() - lista.get(x).getTeal().get(teali).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getTeal().get(teali).getR());
                            cord.setG(lista.get(x).getTeal().get(teali).getG());
                            cord.setB(lista.get(x).getTeal().get(teali).getB());
                            cord.setX(lista.get(x).getTeal().get(teali).getX());
                            cord.setY(lista.get(x).getTeal().get(teali).getY());
                            tmpx.add(cord);
                            if (teali + 1 < lista.get(x).getTeal().size() - 2) {
                                teali++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpteal.add(tmpx);
                        teali++;

                    } else {
                        teali++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                teali = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmpteal) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpteal);
            }

//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmpdeepskyblue = new ArrayList();
            int deepskybluei = 0;
            //System.out.println("top"+lista.get(x).getGreen().size());
            if (lista.get(x).getDeepskyblue().size() > 0) {

                //       Quicksort.quickSortx(lista.get(x).getDeepskyblue(), 0, lista.get(x).getDeepskyblue().size() - 1);
                while (deepskybluei < lista.get(x).getDeepskyblue().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (deepskybluei < lista.get(x).getDeepskyblue().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getDeepskyblue().size();
                        while (Math.abs(lista.get(x).getDeepskyblue().get(deepskybluei + 1).getX() - lista.get(x).getDeepskyblue().get(deepskybluei).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getDeepskyblue().get(deepskybluei).getR());
                            cord.setG(lista.get(x).getDeepskyblue().get(deepskybluei).getG());
                            cord.setB(lista.get(x).getDeepskyblue().get(deepskybluei).getB());
                            cord.setX(lista.get(x).getDeepskyblue().get(deepskybluei).getX());
                            cord.setY(lista.get(x).getDeepskyblue().get(deepskybluei).getY());
                            tmpx.add(cord);
                            if (deepskybluei + 1 < lista.get(x).getDeepskyblue().size() - 2) {
                                deepskybluei++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpdeepskyblue.add(tmpx);
                        deepskybluei++;

                    } else {
                        deepskybluei++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                deepskybluei = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmpdeepskyblue) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpdeepskyblue);
            }

//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmplime = new ArrayList();
            int limei = 0;
            //System.out.println("top"+lista.get(x).getGreen().size());
            if (lista.get(x).getLime().size() > 0) {

                //      Quicksort.quickSortx(lista.get(x).getLime(), 0, lista.get(x).getLime().size() - 1);
                while (limei < lista.get(x).getLime().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (limei < lista.get(x).getLime().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getLime().size();
                        while (Math.abs(lista.get(x).getLime().get(limei + 1).getX() - lista.get(x).getLime().get(limei).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getLime().get(limei).getR());
                            cord.setG(lista.get(x).getLime().get(limei).getG());
                            cord.setB(lista.get(x).getLime().get(limei).getB());
                            cord.setX(lista.get(x).getLime().get(limei).getX());
                            cord.setY(lista.get(x).getLime().get(limei).getY());
                            tmpx.add(cord);
                            if (limei + 1 < lista.get(x).getLime().size() - 2) {
                                limei++;
                            } else {
                                sale = true;
                            }
                        }

                        tmplime.add(tmpx);
                        limei++;

                    } else {
                        limei++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                limei = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmplime) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmplime);
            }

//---------------------------------------------------------------------------------------------
            for (Coords coord
                    : lista.get(x)
                    .getSpringgreen()) {

            }

//---------------------------------------------------------------------------------------------
            for (Coords coord
                    : lista.get(x)
                    .getCyan()) {

            }

//---------------------------------------------------------------------------------------------
            ArrayList<ArrayList<Coords>> tmpdarkred = new ArrayList();
            int darkredi = 0;
            //System.out.println("top"+lista.get(x).getGreen().size());
            if (lista.get(x).getDarkred().size() > 0) {

                //      Quicksort.quickSortx(lista.get(x).getLime(), 0, lista.get(x).getLime().size() - 1);
                while (darkredi < lista.get(x).getDarkred().size()) {
                    ArrayList<Coords> tmpx = new ArrayList();

                    if (darkredi < lista.get(x).getDarkred().size() - 2) {
                        boolean sale = false;
                        int tamano = lista.get(x).getDarkred().size();
                        while (Math.abs(lista.get(x).getDarkred().get(darkredi + 1).getX() - lista.get(x).getDarkred().get(darkredi).getX()) < 5 && sale == false) {
                            // System.out.println("entra?");

                            Coords cord = new Coords();
                            cord.setR(lista.get(x).getDarkred().get(darkredi).getR());
                            cord.setG(lista.get(x).getDarkred().get(darkredi).getG());
                            cord.setB(lista.get(x).getDarkred().get(darkredi).getB());
                            cord.setX(lista.get(x).getDarkred().get(darkredi).getX());
                            cord.setY(lista.get(x).getDarkred().get(darkredi).getY());
                            tmpx.add(cord);
                            if (darkredi + 1 < lista.get(x).getDarkred().size() - 2) {
                                darkredi++;
                            } else {
                                sale = true;
                            }
                        }

                        tmpdarkred.add(tmpx);
                        darkredi++;

                    } else {
                        darkredi++;
                    }

                }

                //+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++
                darkredi = 0;
                //System.out.println("top"+lista.get(x).getBlue().size());

                for (ArrayList<Coords> types : tmpdarkred) {
                    if (types.size() > 0) {
                        int index;
                        if ((types.size() / 2) % 2 == 0) {
                            index = types.size() / 2;
                        } else {
                            index = (types.size() + 1) / 2;
                        }
                        // Quicksort.quickSorty(types, index, types.size() - 1);
                    }

                }

                tmpe.add(tmpdarkred);
            }

//---------------------------------------------------------------------------------------------
        }/*
        for (ArrayList<ArrayList<Coords>> tmpx : tmpe) {
            System.out.println("oooooooooooooooCuadranteoooooooooooooooooooooooo");
            for (ArrayList<Coords> aa : tmpx) {
                System.out.println("-------tipo-----------------");
                for (Coords cord : aa) {
                    System.out.println(cord.getX() + " , " + cord.getY());
                }
            }
        }*/
        makecromo(tmpe);

//return chromo;
    }

    public void makecromo(ArrayList<ArrayList<ArrayList<Coords>>> lista) {
        ArrayList<ArrayList<Chromosome>> crom = new ArrayList();
        ArrayList<ArrayList<Coords>> target = new ArrayList();
        int total = 0;
        for (ArrayList<ArrayList<Coords>> tmpx : lista) {//cuadrantes
            ArrayList<Chromosome> chromos = new ArrayList();
            //System.out.println("oooooooooooooooCuadranteoooooooooooooooooooooooo");
            for (ArrayList<Coords> aa : tmpx) {
                // System.out.println("-------tipo-----------------");
                if (aa.size() > 0) {
                    Chromosome chromo = new Chromosome();
                    chromo.setR(aa.get(0).getR());
                    chromo.setG(aa.get(0).getG());
                    chromo.setB(aa.get(0).getB());
                    chromo.setCantidad(aa.size());
                    chromo.setX1(aa.get(0).getX());
                    chromo.setY1(aa.get(0).getY());
                    chromo.setX2(aa.get(aa.size() - 1).getX());
                    chromo.setY2(aa.get(aa.size() - 1).getY());
                    chromos.add(chromo);
                    total+=aa.size();
                }
            }
            crom.add(chromos);
        }
        

        Population p = new Population();
        ArrayList<ArrayList<Chromosome>> poblacion = p.populationInicial(crom,total);
        
      //  System.out.println(poblacion.get(0).get(1).getCantidad());
     //   fitness fit = new fitness();
       // fit.descartapoblacion(poblacion, total);
        /*
int f=0;
        for (ArrayList<Chromosome> pp : crom) {

            System.out.println("oooooooooooooooCuadranteoooooooooooooooooooooooo");
            f++;
            for (Chromosome aa : pp) {
                System.out.println("-------tipo-----------------");

                System.out.println(aa.getR() + "," + aa.getG() + "," + aa.getB());
                System.out.println("x1,y1 = " + aa.getX1() + "," + aa.getY1());
                System.out.println("x2,y2 = " + aa.getX2() + "," + aa.getY2());
            }

        }
        System.out.println(f);
    }*/
    }

}
