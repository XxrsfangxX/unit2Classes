import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * This is a class that creates a pillar.
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
<<<<<<< HEAD
     * Default constructor for objects of class Pillar
     * @pre
     * @post
     * @param 2 integer parameters that determine the x cordinate and y cordinate of the object.
     * @return
=======
     * This is the constructor for the pillar class
     * @param two ints, are their starting position. The first parameter creates how far right or left. The Second parameter decides how high or how low. 
>>>>>>> origin/master
     */
    public Pillar(int x, int y)
    {
        // initialise instance variables
        xleft= x;
        ybottom= y;
    }

    /**
<<<<<<< HEAD
     * This method draws a pillar
     
     * @pre
     * @post
     * @return
     *           
     * @param    Parameter is Graphics 2D g2. Which is the base of the image.
=======
     * This method draws the pillar
>>>>>>> origin/master
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
