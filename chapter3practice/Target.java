import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;

/**
 *This class creates a targe
 */
public class Target
{
    /** description of instance variable x (add comment for each instance variable) */
    private int xLeft;
    private int yTop;
    /**
     * Default constructor for objects of class Target
     */
    public Target(int x, int y)
    {
         xLeft= x;
         yTop= y;
         
    }

    public void draw(Graphics2D g2){
     Ellipse2D.Double circle1= new Ellipse2D.Double(xLeft, yTop, 200,200 );
     Ellipse2D.Double circle2= new Ellipse2D.Double(xLeft+20, yTop+20, 160, 160);
     Ellipse2D.Double circle3= new Ellipse2D.Double(xLeft+40, yTop+40, 120, 120);
     Ellipse2D.Double circle4= new Ellipse2D.Double(xLeft+60, yTop+60, 80, 80);
     Ellipse2D.Double circle5= new Ellipse2D.Double(xLeft+80, yTop+80, 40, 40);
     g2.draw(circle1);
     g2.setColor(Color.pink);
     g2.fill(circle1);
     g2.draw(circle2);
     g2.setColor(Color.blue);
     g2.fill(circle2);
     g2.draw(circle3);
     g2.setColor(Color.red);
     g2.fill(circle3);
     g2.draw(circle4);
     g2.setColor(Color.yellow);
     g2.fill(circle4);
     g2.draw(circle5);
     g2.setColor(Color.black);
     g2.fill(circle5);
}

}
