import java.awt.Color;
/**
 * Write a description of class RedChannelFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class RedChannelFilter extends Filter
{
    public RedChannelFilter()
    {
        super("Red Channel");
    }
    
    public void apply(OFImage image)
    {
        int width = image.getWidth();
        int height = image.getHeight();
        
        for(int y = 0; y < height; y++) {
            for(int x = 0; x < width; x++) {
                
                Color pixel = image.getPixel(x,y);
                
                int red = pixel.getRed();
                
                Color newColor = new Color(red, 0, 0);
                
                image.setPixel(x, y, newColor);
                
            }
        }
    }
}