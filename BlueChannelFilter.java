import java.awt.Color;
/**
 * Write a description of class BlueChannelFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class BlueChannelFilter extends Filter
{
    public BlueChannelFilter()
    {
        super("Blue Channel");
        
    }
    
    public void apply(OFImage image)
    {  
        int width = image.getWidth();
        int height = image.getHeight();
        
        for (int y = 0; y < height; y++)
        { 
            for(int x = 0; x < width; x++)
            {
                Color pixel = image.getPixel(x,y);
                
                int blue = pixel.getBlue();
                
                Color newColor = new Color(0, 0, blue);
                
                image.setPixel(x, y, newColor);
            }
        }
    }
}