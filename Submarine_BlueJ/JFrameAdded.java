
/**
 * Write a description of class JFrameAdded here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;
import java.awt.Toolkit;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.imageio.ImageIO;
import javax.swing.*;
public class JFrameAdded extends JFrame
{
    /**
     * Constructor for objects of class JFrameAdded
     */
    public JFrameAdded()
    //added a JFrame for use later but no real use yet
    {
        JPanel p = new JPanel();
        p.setBackground(Color.BLUE);
        this.setSize(500,500);
        this.setLocation(100,100);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Submarine Game");
        this.add(p);
        setBackground(Color.BLUE);
        this.setVisible(true);
        try{
            setIconImage(ImageIO.read(this.getClass().getResource("Sub1.png")));
        }
        catch(Exception e1){
            e1.printStackTrace();
        }

    }
}
