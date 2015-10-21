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
    * @pre
     * @post
     * @param 2 integer parameters that determine the x cordinate and y cordinate of the object.
     * @return
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
     * @pre
     * @post
     * @param The parameter is the graphics 2d. Which is the base for the drawing.
     * @return
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
