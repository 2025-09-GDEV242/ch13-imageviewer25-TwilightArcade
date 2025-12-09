import java.awt.Color;
/**
 * Write a description of class RedTintFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedTintFilter extends Filter
{
    public RedTintFilter()
    { 
        super("Red Tint");
    }
    
    public void apply(OFImage image)
    { 
        int width = image.getWidth();
        int height = image.getHeight();
        
        for(int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x,y);
                
                int red = 255;
                int green = pixel.getGreen();
                int blue = pixel.getBlue();
                
                Color newColor = new Color(red, green, blue);
                image.setPixel(x,y,newColor);
            }
            
        }
    }
}