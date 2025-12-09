import java.awt.Color;
/**
 * Write a description of class WarholFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class WarholFilter extends Filter 
{
    public WarholFilter()
    {
        super("warhol");
    }
    
    public void apply(OFImage image)
    { 
        int width = image.getWidth();
        int height = image.getHeight();
        
        int halfW = width / 2;
        int halfH = height / 2;
        
        OFImage original = new OFImage(image);
        
        for (int y = 0; y < halfH; y++) {
            for (int x = 0; x < halfW; x++) {
                
                int srcX = x * 2;
                int srcY = y * 2;
                
                if ( srcX >= original.getWidth()) srcX = original.getWidth() - 1;
                if ( srcY >= original.getHeight()) srcY = original.getHeight() - 1;
                
                Color p = original.getPixel(srcX, srcY);
                
                image.setPixel(x, y, p);
                
                Color redTint = new Color(255, p.getGreen(), p.getBlue());
                image.setPixel(x + halfW, y, redTint);
                
                Color greenTint = new Color(p.getRed(), 255, p.getBlue());
                image.setPixel(x, y + halfH, greenTint);
                
                Color blueTint = new Color(p.getRed(), p.getGreen(), 255);
                image.setPixel(x + halfW, y + halfH, blueTint);
            }
        }
    }
}