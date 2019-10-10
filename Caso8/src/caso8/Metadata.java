/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Ricardo
 */
public class Metadata {

    //getting metadata from image
    public static BufferedImage getting_metadata(BufferedImage imagen, double[][] prob_x_cuadrante) {

        int num_cuadranteX = 0;
        int num_cuadranteY = 0;

        int cuadrante = 0;
        Hash colors = new Hash();
        for (int x = 0; x <= 896; x += 128) {//x se refiere a la coord x de la imagen, se llega hsta 896 para no salirse de los lim
            num_cuadranteY = 0;
            System.out.println("\n");
            //System.out.println("x"+num_cuadranteX);
            for (int y = 0; y <= 896; y += 128) {//a la hora de producir random. Es lo mismo con la y
                System.out.println("probabilidad por cuadrante" + cuadrante + ":" + prob_x_cuadrante[num_cuadranteX][num_cuadranteY]);
                //System.out.println(num_cuadranteY);
                int[] media_RGB = new int[3];//el 1638 es el 10% de un cuadrante
                for (int cont_random = 0; cont_random < 819 * prob_x_cuadrante[num_cuadranteX][num_cuadranteY]; cont_random++) {//32768//mitad de cada subcuadro

                    double random1 = Math.floor(Math.random() * ((x + 128) - (x + 1)) + x);  // Valor entre x+128 y x, ambos incluidos
                    int x1 = (int) Math.round(random1);

                    double random2 = Math.floor(Math.random() * ((y + 128) - (y + 1)) + y);  // Valor entre x+128 y x, ambos incluidos
                    int y1 = (int) Math.round(random2);

                    Color pixel = new Color(imagen.getRGB(x1, y1));

                    int R = pixel.getRed();
                    media_RGB[0] = media_RGB[0] + R;
                    int G = pixel.getGreen();
                    media_RGB[1] = media_RGB[1] + G;
                    int B = pixel.getBlue();
                    media_RGB[2] = media_RGB[2] + B;

                    imagen.setRGB(x1, y1, 16711680);

                    String binary = binario.obtenerBinario(R);
                    
                    System.out.println(binary);
                    colors.FunctionHash(R, G, B, x1, y1);

                }

                System.out.println(media_RGB[0] + "," + media_RGB[1] + "," + media_RGB[2]);
                media_RGB[0] = (int) (media_RGB[0] / (819 * prob_x_cuadrante[num_cuadranteX][num_cuadranteY]));
                media_RGB[1] = (int) (media_RGB[1] / (819 * prob_x_cuadrante[num_cuadranteX][num_cuadranteY]));
                media_RGB[2] = (int) (media_RGB[2] / (819 * prob_x_cuadrante[num_cuadranteX][num_cuadranteY]));

                if (media_RGB[0] >= 225 && media_RGB[1] >= 225 && media_RGB[2] >= 225) {
                    if (prob_x_cuadrante[num_cuadranteX][num_cuadranteY] >= 0.50) {
                        prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY] - 0.25);
                    } else {
                        break;
                    }
                } else {
                    prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY] * 1.5);
                }

                cuadrante++;
                num_cuadranteY += 1;

                //prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = 
            }
            num_cuadranteX += 1;
        }

        return imagen/*, probabilidades*/;//hacer imagenes de probabilidades
    }

    //Metadata(BufferedImage image) {
    // throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    //getting_metadata met= new Metadata(image);
    //}
    /*public int get_prob(int r; int g, int b, int){
        if(r>==253 && g>==253 && b>=253){
            prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (int) (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]*0.25);
        }else if((media_RGB[0]<253 && media_RGB[0]>=200) && (media_RGB[1]<253 && media_RGB[1]>=200) && (media_RGB[2]<253 && media_RGB[2]>=200)){

        }else{
            prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (int) (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]*3);
        }
        
        return b;
    }*/
}
