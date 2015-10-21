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
<<<<<<< HEAD
     * @pre
     * @post
     * @param 2 integer parameters that determine the x cordinate and y cordinate of the object.
     * @return
=======
     * @param two ints, are their starting position. The first parameter creates how far right or left. The Second parameter decides how high or how low. 
>>>>>>> origin/master
     */
    public Ground(int x, int y)
    {
        // initialise instance variables
       xleft= x;
       ybottom= y;
       
    }

    /**
<<<<<<< HEAD
 This method draws the ground
    * 
     * @pre
     * @post
     * @return  
     * @param    Parameter is Graphics 2D g2. Which is the base of the image.
=======
 *This method draws the ground

>>>>>>> origin/master
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

