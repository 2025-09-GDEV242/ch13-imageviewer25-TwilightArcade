import java.awt.Color;
/**
 * Write a description of class GreenChannelFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class GreenChannelFilter extends Filter
{
    public GreenChannelFilter()
    {
        super("Green Channel");
    }
    
    public void apply(OFImage image)
    { 
        int width = image.getWidth();
        int height = image.getHeight();
        
        for (int y = 0; y < height; y++) {
             for(int x = 0; x < width; x++) {
                 
                 Color pixel = image.getPixel(x,y);
                 
                 int green = pixel.getGreen();
                 
                 Color newColor = new Color(0, green, 0);
                 
                 image.setPixel(x, y, newColor);
                }
             }
        }
}