import java.awt.Graphics;
import java.awt.Graphics2D;
import javax.swing.JComponent;

/**
 * Class that creates instances of the classes that comprise the cityscape and delegates drawing the
 *  cityscape to these object.
 * 
 * @author @gcschmit
 * @version 18 July 2014
 */
public class CityscapeComponent extends JComponent
{
    // define the objects in your Cityscape as instance variables
    // ...
    private int n;
    private int m=0;
    private int time=0;
    public CityscapeComponent(int n,int m){
        this.n= n;
        this.m= m;
        Fish fish= new Fish(50+time*100,100);

        fish.draw(g2);

    }
    // define the CityscapeComponent contructor and intiailize all instance variables
    // ...
    
    
    /**
     * This method is invoked by the Java Run-Time whenever the component needs to be redrawn.
     * It does not need to be invoked explicitly.
     *
     */
    public void paintComponent(Graphics g)
    {
       int angle= 60;
       double anglex= Math.toRadians(angle);
        Graphics2D g2 = (Graphics2D) g;
        Background background= new Background(0,0);
        background.draw(g2);
        Ground ground= new Ground(0,900);
        ground.draw(g2);
        int l;
    for ( int z= 0; z<m; z++){
     for( int i=0; i< n; i++){
        Base base= new Base(100+i*300, 875-z*200);
        base.draw(g2);
        Pillar pillar = new Pillar(110+i*300, 775-z*200);
        pillar.draw(g2);
        if (m==1){
            Base topbase= new Base(100+i*300, 680);
            topbase.draw(g2);
        }
       else{
            if( z==m-1){
        
                if (m==2){
         l = 400;}
        else if(m==3){
         l= 300;}
        else{
        l= 267;}
        Base topbase= new Base(100+i*300, 875-z*l);
        topbase.draw(g2);
}
}
        for(int x=1; x<4; x++){
        pillar= new Pillar(110+i*300+x*50, 775-z*200);
        pillar.draw(g2);

        // invoke the draw method on each object in your Cityscape
        // ...
        
    }
    }
    
}
fish.move();

}
    /**
     * Animate the cityscape by updating the objects such that they appear to be animated when they are next drawn.
     *
     */
    public void nextFrame()
    {
        // update the objects in the cityscape so they are animated
        // ...
        time+=1;
        
        
        // request that the Java Runtime repaints this component by invoking its paintComponent method
        repaint();
    }

}
