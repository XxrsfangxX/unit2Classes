import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;
import java.awt.Color;
import java.awt.geom.Ellipse2D;
import javax.swing.JFrame;

public class TargetViewer{
    public static void main(String[] args){
        
        JFrame frame= new JFrame();
        
        frame.setSize(1000,1000);
        frame.setTitle("Target");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        TargetComponent component= new TargetComponent();
        frame.add(component);
        frame.setVisible(true);
    
    
}
}