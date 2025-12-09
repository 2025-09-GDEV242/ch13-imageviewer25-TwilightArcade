import java.awt.Color;
/**
 * Write a description of class BlueTintFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueTintFilter extends Filter
{
    public BlueTintFilter()
    {
        super("Blue Tint");
    }
    
    public void apply(OFImage image)
    { 
        int width = image.getWidth();
        int height = image.getHeight();
        
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                Color pixel = image.getPixel(x, y);
                
                int red = pixel.getRed();
                int green = pixel.getGreen();
                int blue = 255;
                
                Color newColor = new Color(red, green, blue);
                image.setPixel(x, y, newColor);
            }
        }
    }
}