import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * Write a description of class Fish here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xleft;
    private int ybottom;
    /**
     * Default constructor for objects of class Fish
     */
    public Fish(int x, int y)
    {
        // initialise instance variables
        xleft = x;
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
        Ellipse2D.Double body= new Ellipse2D.Double(xleft, ybottom, 200, 100);
        Rectangle2D.Double fin= new Rectangle2D.Double(xleft-50, ybottom+10, 50,100);
        Ellipse2D.Double eye= new Ellipse2D.Double(xleft+125, ybottom+30, 25,25);
        
        g2.setColor(Color.red);
        g2.draw(body);
        g2.fill(body);
        g2.setColor(Color.green);
        g2.draw(fin);
        g2.fill(fin);
        g2.setColor(Color.black);
        g2.draw(eye);
        g2.fill(eye);
    }
    
    /**
     * An example of a method - replace this comment with your own
     *  that describes the operation of the method
     *
     * @pre     preconditions for the method
     *          (what the method assumes about the method's parameters and class's state)
     * @post    postconditions for the method
     *          (what the method guarantees upon completion)
     * @param   y   description of parameter y
     * @return  description of the return value
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return y;
    }

}
