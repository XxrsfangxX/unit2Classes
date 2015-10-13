import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;


public class TargetComponent extends JComponent{
    public void paintComponent(Graphics g)
    {
        Graphics2D g2= (Graphics2D) g;
        
        Target target= new Target(0,0);        
        target.draw(g2);
        
        Target target2= new Target(200, 200);
        target.draw(g2);
    
}
}