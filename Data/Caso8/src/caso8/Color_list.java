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
public class Color_list {

    ArrayList<Coords> negro = new ArrayList();
    ArrayList<Coords> blue = new ArrayList();
    ArrayList<Coords> green = new ArrayList();
    ArrayList<Coords> cyan = new ArrayList();
    ArrayList<Coords> red = new ArrayList();
    ArrayList<Coords> magenta = new ArrayList();
    ArrayList<Coords> yellow = new ArrayList();

    public Color_list() {

    }

    public ArrayList<Coords> getNegro() {
        return negro;
    }

    public void setNegro(ArrayList<Coords> negro) {
        this.negro = negro;
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

    public ArrayList<Coords> getCyan() {
        return cyan;
    }

    public void setCyan(ArrayList<Coords> cyan) {
        this.cyan = cyan;
    }

    public ArrayList<Coords> getRed() {
        return red;
    }

    public void setRed(ArrayList<Coords> red) {
        this.red = red;
    }

    public ArrayList<Coords> getMagenta() {
        return magenta;
    }

    public void setMagenta(ArrayList<Coords> magenta) {
        this.magenta = magenta;
    }

    public ArrayList<Coords> getYellow() {
        return yellow;
    }

    public void setYellow(ArrayList<Coords> yellow) {
        this.yellow = yellow;
    }

    public void FunctionHash(int R, int G, int B, int x, int y) {
        String r, g, b, valor;
        Coords coord = new Coords();

        if (R <= 128 && G <= 128 && B <= 128) {
            coord.setX(x);
            coord.setY(y);
            negro.add(coord);
        }
        if (R <= 128 && G <= 128 && B <= 128) {
            coord.setX(x);
            coord.setY(y);
            negro.add(coord);
        }
        if (R <= 128 && G <= 128 && B > 128) {
            coord.setX(x);
            coord.setY(y);
            blue.add(coord);
        }
        if (R <= 128 && G > 128 && B <= 128) {
            coord.setX(x);
            coord.setY(y);
            green.add(coord);
        }
        if (R <= 128 && G > 128 && B > 128) {
            coord.setX(x);
            coord.setY(y);
            cyan.add(coord);
        }
        if (R > 128 && G <= 128 && B <= 128) {
            coord.setX(x);
            coord.setY(y);
            red.add(coord);
        }
        if (R > 128 && G <= 128 && B > 128) {
            coord.setX(x);
            coord.setY(y);
            magenta.add(coord);
        }
        if (R > 128 && G > 128 && B <= 128) {
            coord.setX(x);
            coord.setY(y);
            yellow.add(coord);
        }

    }
    
}
