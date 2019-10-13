package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;
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
    public static/* ArrayList*/BufferedImage getting_metadata(BufferedImage image, double[][] prob_x_cuadrante,ArrayList<ColorList> lista){
        BufferedImage nueva = new BufferedImage(1024,1024, TYPE_INT_RGB);
        for(int x = 0; x<1024;x++){
            for(int y = 0; y<1024;y++){
                nueva.setRGB(x, y, image.getRGB(x, y));
            }
        }
        System.out.println("ewfwerwwe");
        ArrayList<ColorList> Info_x_Cuadrante  = new ArrayList();
        Info_x_Cuadrante = lista;
        int num_cuadranteX = 0; 
        int num_cuadranteY = 0; 
        
        int cuadrante = 0;
        
        for(int x=0; x<=896; x+=128){//x se refiere a la coord x de la imagen, se llega hsta 896 para no salirse de los lim
            System.out.println("for x");
            num_cuadranteY = 0;
            for(int y = 0; y<=896; y+=128){//a la hora de producir random. Es lo mismo con la y
                //System.out.println("probabilidad por cuadrante"+cuadrante+":" + prob_x_cuadrante[num_cuadranteX][num_cuadranteY]);+++++++++++++++++++++++++++++
                
                System.out.println("for x");
                ColorList colors=new ColorList();
                for(int iteraciones_x_cuadrante = 0; iteraciones_x_cuadrante<10;iteraciones_x_cuadrante++){
                    double rand_muestreo = Math.random();
                    System.out.println(rand_muestreo);
                    System.out.println("for iteraciones");
                    int[] media_RGB_iteracion = new int[3];//el 1638 es el 10% de un cuadrante
                    if(prob_x_cuadrante[num_cuadranteX][num_cuadranteY] >= 1 || rand_muestreo<(prob_x_cuadrante[num_cuadranteX][num_cuadranteY])){
                        for(int cont_random=0; cont_random<819; cont_random++){//32768//mitad de cada subcuadro
                                //System.out.println("for randoms");
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
                            
                            
                            /*if(R==255 && G==255 && B==255){
                                image.setRGB(x1, y1, 0);
                            }else{
                                image.setRGB(x1, y1, 0);
                            }*/
                            nueva.setRGB(x1, y1, 0);
                            colors.FunctionHash(R,G,B,x1,y1);
                        }
                    }else{
                        System.out.println("acá no sé hace nada"+rand_muestreo);
                    }
                    System.out.println("antes media:"+media_RGB_iteracion[0]+","+media_RGB_iteracion[1]+","+media_RGB_iteracion[2]);
                            media_RGB_iteracion[0] = (int)(media_RGB_iteracion[0]/819);
                            media_RGB_iteracion[1] =(int)(media_RGB_iteracion[1]/819);
                            media_RGB_iteracion[2] = (int)(media_RGB_iteracion[2]/819);
                    System.out.println("Despues media:"+media_RGB_iteracion[0]+","+media_RGB_iteracion[1]+","+media_RGB_iteracion[2]);        
                    if(media_RGB_iteracion[0]>=255 && media_RGB_iteracion[1]>=255 && media_RGB_iteracion[2]>=255){
                        if(prob_x_cuadrante[num_cuadranteX][num_cuadranteY]>0){
                            prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]-0.50);
                        }else{
                            System.out.println("no se puede bajar mas");
                        }
                    }else{
                        prob_x_cuadrante[num_cuadranteX][num_cuadranteY] = (prob_x_cuadrante[num_cuadranteX][num_cuadranteY]+0.1);
                    }
                }
                
                Info_x_Cuadrante.add(colors);
                cuadrante++;
                num_cuadranteY+=1;
            }
            num_cuadranteX+=1;
        }
        return nueva/*Info_x_Cuadrante;*/;
    }      
}






