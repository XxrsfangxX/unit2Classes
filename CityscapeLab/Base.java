import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *Draws base of building.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Base
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xleft;
    private int ybottom;
    
    /**
     * Default constructor for objects of class Building
     */
    public Base(int x, int y)
    {
        // initialise instance variables
       xleft= x;
       ybottom=y;
       
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
       Rectangle2D.Double bottom= new Rectangle2D.Double(xleft, ybottom, 200, 100);
       
       
       g2.setColor(Color.black);
       g2.draw(bottom);
       
       g2.setColor(Color.white);
       g2.fill(bottom);
      
       
    }

}
