package caso8;

import java.awt.Color;
import java.awt.image.BufferedImage;
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
        
        BufferedImage image = ImageIO.read(Metadata.class.getResource("verduras.jpg"));//imagen a tomar
        int altura, anchura;
        Metadata.getting_metadata(image);
        //Metadata FirstImage = new Metadata(image);
        //FirstImage.getting_metadata(image);
        
    }
    
}
