/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.util.ArrayList;

/**
 *
 * @author Ricardo
 */
public class ColorList {

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


    public ColorList() {

    }

    public ArrayList<Coords> getBlack() {
        return black;
    }

    public void setBlack(ArrayList<Coords> black) {
        this.black = black;
    }

    public ArrayList<Coords> getNavy() {
        return navy;
    }

    public void setNavy(ArrayList<Coords> navy) {
        this.navy = navy;
    }

    public ArrayList<Coords> getBlue() {
        return blue;
    }

    public void setBlue(ArrayList<Coords> blue) {
        this.blue = blue;
    }

    public ArrayList<Coords> getGreen() {
        return green;
    }

    public void setGreen(ArrayList<Coords> green) {
        this.green = green;
    }

    public ArrayList<Coords> getTeal() {
        return teal;
    }

    public void setTeal(ArrayList<Coords> teal) {
        this.teal = teal;
    }

    public ArrayList<Coords> getDeepskyblue() {
        return deepskyblue;
    }

    public void setDeepskyblue(ArrayList<Coords> deepskyblue) {
        this.deepskyblue = deepskyblue;
    }

    public ArrayList<Coords> getLime() {
        return lime;
    }

    public void setLime(ArrayList<Coords> lime) {
        this.lime = lime;
    }

    public ArrayList<Coords> getSpringgreen() {
        return springgreen;
    }

    public void setSpringgreen(ArrayList<Coords> springgreen) {
        this.springgreen = springgreen;
    }

    public ArrayList<Coords> getCyan() {
        return cyan;
    }

    public void setCyan(ArrayList<Coords> cyan) {
        this.cyan = cyan;
    }

    public ArrayList<Coords> getDarkred() {
        return darkred;
    }

    public void setDarkred(ArrayList<Coords> darkred) {
        this.darkred = darkred;
    }

    public ArrayList<Coords> getPurple() {
        return purple;
    }

    public void setPurple(ArrayList<Coords> purple) {
        this.purple = purple;
    }

    public ArrayList<Coords> getDarkviolet() {
        return darkviolet;
    }

    public void setDarkviolet(ArrayList<Coords> darkviolet) {
        this.darkviolet = darkviolet;
    }

    public ArrayList<Coords> getOlive() {
        return olive;
    }

    public void setOlive(ArrayList<Coords> olive) {
        this.olive = olive;
    }

    public ArrayList<Coords> getGray() {
        return gray;
    }

    public void setGray(ArrayList<Coords> gray) {
        this.gray = gray;
    }

    public ArrayList<Coords> getMediumslateblue() {
        return mediumslateblue;
    }

    public void setMediumslateblue(ArrayList<Coords> mediumslateblue) {
        this.mediumslateblue = mediumslateblue;
    }

    public ArrayList<Coords> getChartreuse() {
        return chartreuse;
    }

    public void setChartreuse(ArrayList<Coords> chartreuse) {
        this.chartreuse = chartreuse;
    }

    public ArrayList<Coords> getPalegreen() {
        return palegreen;
    }

    public void setPalegreen(ArrayList<Coords> palegreen) {
        this.palegreen = palegreen;
    }

    public ArrayList<Coords> getAqua() {
        return aqua;
    }

    public void setAqua(ArrayList<Coords> aqua) {
        this.aqua = aqua;
    }

    public ArrayList<Coords> getRed() {
        return red;
    }

    public void setRed(ArrayList<Coords> red) {
        this.red = red;
    }

    public ArrayList<Coords> getDeepink() {
        return deepink;
    }

    public void setDeepink(ArrayList<Coords> deepink) {
        this.deepink = deepink;
    }

    public ArrayList<Coords> getMagenta() {
        return magenta;
    }

    public void setMagenta(ArrayList<Coords> magenta) {
        this.magenta = magenta;
    }

    public ArrayList<Coords> getOrange() {
        return orange;
    }

    public void setOrange(ArrayList<Coords> orange) {
        this.orange = orange;
    }

    public ArrayList<Coords> getLigthsalmon() {
        return ligthsalmon;
    }

    public void setLigthsalmon(ArrayList<Coords> ligthsalmon) {
        this.ligthsalmon = ligthsalmon;
    }

    public ArrayList<Coords> getViolet() {
        return violet;
    }

    public void setViolet(ArrayList<Coords> violet) {
        this.violet = violet;
    }

    public ArrayList<Coords> getYellow() {
        return yellow;
    }

    public void setYellow(ArrayList<Coords> yellow) {
        this.yellow = yellow;
    }

    public ArrayList<Coords> getNavajowhite() {
        return navajowhite;
    }

    public void setNavajowhite(ArrayList<Coords> navajowhite) {
        this.navajowhite = navajowhite;
    }

    public ArrayList<Coords> getWhitegray() {
        return whitegray;
    }

    public void setWhitegray(ArrayList<Coords> whitegray) {
        this.whitegray = whitegray;
    }
    

    public void FuncionColor(int R, int G, int B, int x, int y) {
        String r, g, b, valor;
        Coords coord = new Coords();

        if (R <= 64 && G <= 64 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(000);
            coord.setB(000);
            black.add(coord);
        }
        if (R <= 64 && G <= 64 && 64 < B && B <= 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(000);
            coord.setB(128);
            navy.add(coord);
        }
        if (R <= 64 && G <= 64 && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(000);
            coord.setB(255);
            blue.add(coord);
        }
        if (R <= 64 && 64 < G && G < 192 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(128);
            coord.setB(000);
            green.add(coord);
        }
        if (R <= 64 && 64 < G && G < 192 && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(128);
            coord.setB(128);
            teal.add(coord);
        }
        if (R <= 64 && 64 < G && G < 192 && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(128);
            coord.setB(255);
            deepskyblue.add(coord);
        }
        if (R <= 64 && 192 < G && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(255);
            coord.setB(000);
            lime.add(coord);
        }
        if (R <= 64 && 192 < G && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(255);
            coord.setB(128);
            springgreen.add(coord);
        }
        if (R <= 64 && 192 < G && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(000);
            coord.setG(255);
            coord.setB(128);
            cyan.add(coord);
        }
        if (64 < R && R < 192 && G <= 64 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(000);
            coord.setB(000);
            darkred.add(coord);
        }
        if (64 < R && R < 192 && G <= 64 && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(000);
            coord.setB(128);
            purple.add(coord);
        }
        if (64 < R && R < 192 && G <= 64 && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(000);
            coord.setB(255);
            darkviolet.add(coord);
        }
        if (64 < R && R < 192 && 64 < G && G < 192 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(128);
            coord.setB(000);
            olive.add(coord);
        }
        if (64 < R && R < 192 && 64 < G && G < 192 && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(128);
            coord.setB(128);
            gray.add(coord);
        }
        if (64 < R && R < 192 && 64 < G && G < 192 && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(128);
            coord.setB(255);
            mediumslateblue.add(coord);
        }
        if (64 < R && R < 192 && 192 < G && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(255);
            coord.setB(000);
            chartreuse.add(coord);
        }
        if (64 < R && R < 192 && 192 < G && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(128);
            coord.setG(255);
            coord.setB(128);
            palegreen.add(coord);
        }
        if (64 < R && R < 192 && 192 < G && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(125);
            coord.setG(255);
            coord.setB(255);
            aqua.add(coord);
        }
        if (192 < R && G <= 64 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(000);
            coord.setB(000);
            red.add(coord);
        }
        if (192 < R && G <= 64 && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(000);
            coord.setB(128);
            deepink.add(coord);
        }
        if (192 < R && G <= 64 && 192 < R) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(000);
            coord.setB(255);
            magenta.add(coord);
        }
        if (192 < R && 64 < G && G < 192 && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(128);
            coord.setB(000);
            orange.add(coord);
        }
        if (192 < R && 64 < G && G < 192 && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(128);
            coord.setB(128);
            ligthsalmon.add(coord);
        }
        if (192 < R && 64 < G && G < 192 && 192 < B) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(128);
            coord.setB(255);
            violet.add(coord);
        }
        if (192 < R && 192 < G && B <= 64) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(255);
            coord.setB(000);
            yellow.add(coord);
        }
        if (192 < R && 192 < G && 64 < B && B < 192) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(255);
            coord.setG(255);
            coord.setB(128);
            navajowhite.add(coord);
        }
        if (192 < R && 192 < G && 192 < B && R <= 240 && G <= 240 && B <= 240 ) {
            coord.setX(x);
            coord.setY(y);
            coord.setR(240);
            coord.setG(240);
            coord.setB(240);
            whitegray.add(coord);
        }

    }

}
