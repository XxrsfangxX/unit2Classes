import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;


/**
 * This class creates a fish object
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fish
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xleft;
    private int ybottom;
    private int distance=0;
    /**
     * Default constructor for objects of class Fish
     * @param two ints, are their starting position. The first parameter creates how far right or left. The Second parameter decides how high or how low. 
     */
    public Fish(int x, int y)
    {
        // initialise instance variables
        xleft = x;
        ybottom= y;
    }

    /** 
     * This method draws the fish.
     *@param Graphics 2d g2
     */
    public void draw(Graphics2D g2)
    {
        // put your code here
        Ellipse2D.Double body= new Ellipse2D.Double(xleft+distance, ybottom, 200, 100);
        Rectangle2D.Double fin= new Rectangle2D.Double(xleft-50+distance, ybottom+10, 50,100);
        Ellipse2D.Double eye= new Ellipse2D.Double(xleft+125+distance, ybottom+30, 25,25);
        
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
     * This method moves the fish right a certain distance
     */
    public void swim(){
        if (distance<=1320){distance+=60;
    }
        else
        distance=0;
        }
   }
   
        

