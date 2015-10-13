import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * Write a description of class Pillar here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Pillar
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xleft;
    private int ybottom;
    /**
     * Default constructor for objects of class Pillar
     */
    public Pillar(int x, int y)
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
        Ellipse2D.Double top= new Ellipse2D.Double(xleft, ybottom, 25,50);
        Ellipse2D.Double bottom= new Ellipse2D.Double(xleft, ybottom+100, 25, 50);
        Rectangle2D.Double middle= new Rectangle2D.Double(xleft, ybottom+12.5, 25, 100);
        
        g2.setColor(Color.black);
        g2.draw(middle);
        g2.draw(top);
        g2.draw(bottom);
        g2.setColor(Color.white);
        g2.fill(top);
        g2.fill(middle);
        g2.fill(bottom);
        
    }

}
