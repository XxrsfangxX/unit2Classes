import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;
/**
 * Draws the Background
 * 
 * @author Ryan Fang
 * @version (a version number or a date)
 */
public class Background
{
    private int xleft;
    private int ybottom;
    /**
     * Default constructor for objects of class Background
     * @pre
     * @post
     * @param 2 integer parameters that determine the x cordinate and y cordinate of the object.
     * @return
     */
    public Background(int x, int y)
    {
        // initialise instance variables
        xleft= x;
        ybottom= y;
    }

    /**
     *This method draws the background 
     * @pre
     * @post
 
     * @return
    *@param    Parameter is Graphics 2D g2. Which is the base of the image.
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Rectangle2D.Double sea= new Rectangle2D.Double(xleft, ybottom, 100000,10000);
        Color mycolor= new Color(0, 102, 204,122);
        g2.setColor(mycolor);
        g2.draw(sea);
        g2.fill(sea);
        g2.draw(sea);
        
    }

}
