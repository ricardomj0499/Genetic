/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ricardo
 */
public class Metadata{
    
    //bufferef
    public static void getting_metadata(BufferedImage imagen){
        System.out.println("dasdasdasdasda");
        //altura = image.getHeight();
        //anchura = image.getWidth();
        
        for(int i = 0; i<896; i+=128){//i va a servir como el limite min para producir los randoms, el max, es min+128
            System.out.println("\n");
            System.out.println("\n");
            for(int x=0; x<32768; x++){
                System.out.println(x);
                int R=0, G=0, B=0;
                double random1 = Math.floor(Math.random()*1024);  // Valor entre M y N, ambos incluidos
                int x1 = (int)Math.round(random1);

                double random2 = Math.floor(Math.random()*((i+128)-(i+1))+i);  // Valor entre M y N, ambos incluidos
                int y1= (int)Math.round(random2);
                System.out.println("+++++++++++x"+x1);
                System.out.println("+++++++++++y"+y1);
                Color pixel = new Color(imagen.getRGB(x1, y1));

                R = pixel.getRed();
                G = pixel.getGreen();
                B = pixel.getBlue();
                
                /*
                *aplicar Hash con los valores de RGB 
                */
                
            }
        }
    } 


    //Metadata(BufferedImage image) {
        
       // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //getting_metadata met= new Metadata(image);
    //}
        
}
