
/**
 * Write a description of class Torpedo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.event.*;

public class Torpedo
{
    private int speed;
    private boolean isUnderwater;
    private int locationX,locationY;
    private String facing;
    /**
     * Constructor for objects of class Torpedo
     */
    public Torpedo(int s, boolean uw,int x,int y)
    {
        speed = s;
        isUnderwater = uw;
        locationX=x;
        locationY=y;
    }
    
    
    
    public class Launch implements ActionListener{
    public void actionPerformed(ActionEvent evt){
       
    }
    }
}
