import java.awt.Color;
/**
 * Write a description of class FlippedWarholFilter here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class FlippedWarholFilter extends Filter
{
   public FlippedWarholFilter()
   { 
       super("Flipped Warhol");
    } 
   
   public void apply(OFImage image)
   {
       int width = image.getWidth();
       int height = image.getHeight();
       
       int halfW = width / 2;
       int halfH = height / 2;
       
       OFImage original = new OFImage(width, height);
       for (int y = 0; y < halfH; y++) {
            for (int x = 0; x < halfW; x++) {
           
           int srcX = width - 1 - (x * 2);
           int srcY = y * 2;
           
           if (srcX < 0) {
               srcX = 0;
               
           }
           if (srcY >= height ) {
               srcY = height - 1;
           }
           
           Color c = new Color(original.getRGB(srcX, srcY));
           
           image.setRGB(x, y, c.getRGB());
           
           image.setRGB(x +  halfW, y, tintRed(c).getRGB());
           
           image.setRGB(x, y + halfH, tintGreen(c).getRGB());
           
           image.setRGB(x + halfW, y + halfH, tintBlue(c).getRGB());
       }
     }
   }
   
       
   
   private Color tintRed(Color c)
   {
       int r = c.getRed();
       int g = c.getGreen() / 2;
       int b = c.getBlue() / 2;
       return new Color(r,g,b);
       
   }
   
   private Color tintGreen(Color c)
   {
       int r = c.getRed() / 2;
       int g = c.getGreen();
       int b = c.getBlue() / 2;
       return new Color(r,g,b);
   }
   
   private Color tintBlue(Color c)
   {
       int r = c.getRed() / 2;
       int g = c.getGreen() / 2;
       int b = c.getBlue();
       return new Color(r, g, b);
       
   }
}