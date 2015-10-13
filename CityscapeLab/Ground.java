import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
Draws ground object.
 * 
 * Ryan Fang
 * @version (a version number or a date)
 */
public class Ground
{
    private int xleft;
    private int ybottom;

    /**
     * Default constructor for objects of class Ground
     */
    public Ground(int x, int y)
    {
        // initialise instance variables
       xleft= x;
       ybottom= y;
       
    }

    /**
 This method draws the ground
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
        Rectangle2D.Double land= new Rectangle2D.Double(xleft, ybottom, 10000, 100);
        Color mycolor= new Color(255, 222, 156);
        g2.setColor(mycolor);
        g2.draw(land);
        g2.fill(land);
        g2.draw(land);
        
    }

}
