package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import static javafx.scene.paint.Color.color;
import javax.imageio.ImageIO;

/**
 *
 * @author Ricardo
 */
public class Caso8 {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        /*
        todos los cuadrantes van a tener una probablilidad de uno
        */
        double[][] probabilidades = new double[8][8];
        
        for(int i = 0;i <8; i++){
            for(int j = 0; j<8; j++){
                probabilidades[i][j] = 1;
            }
        }
        
        BufferedImage image = ImageIO.read(Metadata.class.getResource("stick.jpg"));//imagen a tomar   Inkedverduras_LI
        BufferedImage imagen = new BufferedImage(1024,1024, TYPE_INT_RGB);
        ArrayList<ColorList> coords_a_ordenar  = new ArrayList();//coords de cada cuadrante
        
        //for(int i = 0; i<5; i++){
            imagen= Metadata.getting_metadata(image, probabilidades, coords_a_ordenar);
                        //System.out.println("\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n\n");

        //}
            try {
                        // retrieve image
                        File outputfile = new File("newImage.jpg");
                        ImageIO.write(imagen, "jpg", outputfile);
                } catch (IOException e) {
                        e.printStackTrace();
                } 
            try {
                        // retrieve image
                        File outputfile = new File("newImage2.jpg");
                        ImageIO.write(image, "jpg", outputfile);
                } catch (IOException e) {
                        e.printStackTrace();
                } 

        //coords_a_ordenar = Metadata.getting_metadata(image, probabilidades, coords_a_ordenar);++++++++++++++++++++++++++++++++++
            
        //Metadata FirstImage = new Metadata(image);
        //FirstImage.getting_metadata(image);
        
       // acá se recorren las listas de xy de determindo color
        int size=coords_a_ordenar.size();
        
        for(int x=0;x<coords_a_ordenar.size();x++) {
            for(Coords coord: coords_a_ordenar.get(x).getRed()){
                    System.out.println("++++++++++++++++++++++");
                    System.out.println(coord.getX());
                }
            System.out.println("\n");
            
            /*coords_a_ordenar.get(x).getBlue().;
            coords_a_ordenar.get(x).getCyan();
            coords_a_ordenar.get(x).getGreen();
            coords_a_ordenar.get(x).getMagenta();
            coords_a_ordenar.get(x).getNegro();
            coords_a_ordenar.get(x).getRed();
            coords_a_ordenar.get(x).getYellow();*/
        }
        
        NewCreateHTML HTML = new NewCreateHTML();
        HTML.generarHTML();
        
        /*
        Iterator<ColorList> nombreIterator = coords_a_ordenar.iterator();
        while(nombreIterator.hasNext()){
            ArrayList<ColorList> numeros = nombreIterator.next();
            Iterator<Integer> itrNumeros = numeros.iterator();
            while(itrNumeros.hasNext()){
                    int numero = itrNumeros.next();
                    if (numero == 0)
                            itrNumeros.remove();
            }
        }*/
        /*
        for(Coords coord: coords_a_ordenar.getYellow()){
                    System.out.println(coord.getY());
        }*/
    }
    
    
}
