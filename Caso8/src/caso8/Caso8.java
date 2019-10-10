package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
import static java.awt.image.BufferedImage.TYPE_INT_RGB;
import java.io.File;
import java.io.IOException;
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
        //for(int i = 0; i<40; i++){
            imagen = Metadata.getting_metadata(image, probabilidades);
        //}
            try {
                        // retrieve image
                        File outputfile = new File("newImage.jpg");
                        ImageIO.write(imagen, "jpg", outputfile);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }    

        
        //Metadata FirstImage = new Metadata(image);
        //FirstImage.getting_metadata(image);
        
    }
    
}
