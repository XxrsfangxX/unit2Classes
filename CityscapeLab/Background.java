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
     */
    public Background(int x, int y)
    {
        // initialise instance variables
        xleft= x;
        ybottom= y;
    }

    /**
     * An example of a method - replace this comment with your own
     *    that describes the operation of the method
     *
     * @pre        preconditions for the method
     *            (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *            (what the method guarantees upon completion)
     * @param    y    description of parameter y
     * @return    description of the return value
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
