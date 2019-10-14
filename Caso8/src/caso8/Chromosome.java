/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

/**
 *
 * @author DAC_125
 */
public class Chromosome {

    /*private String cromocolor;
    private String cromocoord;
    String cromosoma;
    int color;
    int cordenada;
    Binary binario = new Binary();*/
    Binary binario = new Binary();
    int R;
    int G;
    int B;
    int x1;
    int y1;
    int x2;
    int y2;       
    String cromosoma;
    private String cromocolor;
    private String cromocoord;
    
    public Chromosome() {
        
    }

    

    public int getR() {
        return R;
    }

    public void setR(int R) {
        this.R = R;
    }

    public int getG() {
        return G;
    }

    public void setG(int G) {
        this.G = G;
    }

    public int getB() {
        return B;
    }

    public void setB(int B) {
        this.B = B;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public String getCromosoma() {
        return cromosoma;
    }

    public void setCromosoma(String cromosoma) {
        this.cromosoma = cromosoma;
    }

    public String getCromocolor() {
        return cromocolor;
    }

    public void setCromocolor(String cromocolor) {
        this.cromocolor = cromocolor;
    }

    public String getCromocoord() {
        return cromocoord;
    }

    public void setCromocoord(String cromocoord) {
        this.cromocoord = cromocoord;
    }
    
    

   
    
}
