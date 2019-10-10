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
import java.util.ArrayList;


/**
 *
 * @author Ricardo
 */
public class Metadata{
    //getting metadata from image, get data  from an image, and probabilities of each square(128x128) in wich the image is divided 
    public static BufferedImage getting_metadata(BufferedImage image, double[][] prob_x_cuadrante){
        ArrayList<Color_list> Info_x_Cuadrante  = new ArrayList();
        int num_cuadranteX = 0; 
        int num_cuadranteY = 0; 
        
        int cuadrante = 0;
        
        for(int x=0; x<=896; x+=128){//x se refiere a la coord x de la imagen, se llega hsta 896 para no salirse de los lim
            num_cuadranteY = 0;
            //System.out.println("\n");;+++++++++++++++++++++++++++++++++++++
            for(int y = 0; y<=896; y+=128){//a la hora de producir random. Es lo mismo con la y
                //System.out.println("probabilidad por cuadrante"+cuadrante+":" + prob_x_cuadrante[num_cuadranteX][num_cuadranteY]);+++++++++++++++++++++++++++++
                
                //int[] media_RGB = new int[3];//el 1638 es el 10% de un cuadrante
               
                //System.out.println("random generado para el muestreo:"+rand_muestreo);++++++++++++++++++++++++++++++++++
                
                Color_list colors=new Color_list();
                for(int iteraciones_x_cuadrante = 0; iteraciones_x_cuadrante<100;iteraciones_x_cuadrante++){
                     double rand_muestreo = Math.random();
                    int[] media_RGB_iteracion = new int[3];//el 1638 es el 10% de un cuadrante
                    if(prob_x_cuadrante[num_cuadranteX][num_cuadranteY] >= 1  || rand_muestreo<prob_x_cuadrante[num_cuadranteX][num_cuadranteY]){
                        for(int cont_random=0; cont_random<819; cont_random++){//32768//mitad de cada subcuadro

                            double random1 = Math.floor(Math.random()*((x+128)-x)+x);  // Valor entre x+128 y x, ambos incluidos
                            int x1 = (int)Math.round(random1);

                            double random2 = Math.floor(Math.random()*((y+128)-y)+y);  // Valor entre x+128 y x, ambos incluidos
                            int y1= (int)Math.round(random2);

                            Color pixel = new Color(image.getRGB(x1, y1));

                            int R = pixel.getRed();
                            media_RGB_iteracion[0] = media_RGB_iteracion[0]+R;
                            int G = pixel.getGreen();
                            media_RGB_iteracion[1] = media_RGB_iteracion[1]+G;                    
                            int B = pixel.getBlue();
                            media_RGB_iteracion[2] = media_RGB_iteracion[2]+B;
                            
                            
                            if(R==255 && G==255 && B==255){
                                image.setRGB(x1, y1, 16777215);
                            }else{
                                image.setRGB(x1, y1, 0);
                            }
                            colors.FunctionHash(R,G,B,x1,y1);
                        }
                    }else{
                        System.out.println("acá no sé hace nada"+rand_muestreo);
                    }
                    //System.out.println("antes division;"+media_RGB_iteracion[0]+","+media_RGB_iteracion[1]+","+media_RGB_iteracion[2]);+++++++++++++++++++++++++++++++++++++++
                            media_RGB_iteracion[0] = (int)(media_RGB_iteracion[0]/819);
                            media_RGB_iteracion[1] =(int)(media_RGB_iteracion[1]/819);
                            media_RGB_iteracion[2] = (int)(media_RGB_iteracion[2]/819);
                    //System.out.println("despues division;"+media_RGB_iteracion[0]+","+media_RGB_iteracion[1]+","+media_RGB_iteracion[2]);++++++++++++++++++++++++++++++++++++++++++++++++++
                    if(media_RGB_iteracion[0]>=255 && media_RGB_iteracion[1]>=255 && media_RGB_iteracion[2]>=255){
                        if(prob_x_cuadrante[num_cuadranteX][num_cuadranteY]>0.25){
                            prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]-0.75);
                        }
                    }else{
                        prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]+0.1);
                    }
                }
                
                //System.out.println("despues division;"+media_RGB[0]+","+media_RGB[1]+","+media_RGB[2]);
                Info_x_Cuadrante.add(colors);
               /* for(Coords coord: colors.getYellow()){
                    System.out.println(coord.getY());
                }*/
                
                cuadrante++;
                num_cuadranteY+=1;
            }
            num_cuadranteX+=1;
        }
        return image;
    }      
}






