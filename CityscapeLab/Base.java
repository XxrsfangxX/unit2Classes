import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

/**
 *Draws base of building.
 * 
 * 
 */
public class Base
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xleft;
    private int ybottom;
    
    /**
     * Default constructor for objects of class Building
     * @param Two integer parameters. The first parameter sets how left or right it is. The second parameter sets how high or low it is. 
     */
    public Base(int x, int y)
    {
        // initialise instance variables
       xleft= x;
       ybottom=y;
       
    }

    /**
     * This method draws the base. 
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
