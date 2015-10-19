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
     * @param two ints, are their starting position. The first parameter creates how far right or left. The Second parameter decides how high or how low. 
     */
    public Background(int x, int y)
    {
        // initialise instance variables
        xleft= x;
        ybottom= y;
    }

    /**
     * This method draws the background
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
