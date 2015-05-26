import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.imageio.*;
/**
 * Write a description of class Play here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Play
{
    //private Submarine p1 = new ARROWS();
    //private Submarine p2 = new WASD();
    private int BOARD_WIDTH;
    private int BOARD_HEIGHT;
    private boolean [][] obstacles;
    private Submarine p1 = new ARROWS(false, 5);
    private Submarine p2 = new WASD(false, 5);
    public Play (int width, int height) {
        BOARD_WIDTH = width;
        BOARD_HEIGHT = height;
        createBoard();
    }
    
    public void createBoard(){
        //fills obstacles[][]
        obstacles = new boolean [BOARD_HEIGHT/5][BOARD_WIDTH/5];
        for (int x = 0; x < BOARD_WIDTH/10; x++)
        {
            obstacles[(int)(Math.random()*obstacles.length)]
                        [(int)(Math.random()*obstacles[0].length)] = true;
        }
        for (int r = 0; r < obstacles.length; r++)
        {
            for (int c = 0; c < obstacles[0].length; c++)
            {
                if (isAdjacent(r,c) && (int)(Math.random()*2) == 0)
                {
                    obstacles[r][c] = true;
                }
            }
        }
        for (int r = 0; r < obstacles.length; r++)
        {
            for (int c = 0; c < obstacles[0].length; c++)
            {
                if (isAdjacent(r,c) && (int)(Math.random()*3) == 0)
                {
                    obstacles[r][c] = true;
                }
            }
        }
        
        //builds board
        new Board();
    }
    
    public boolean isAdjacent(int row, int col){
        if (col > 0 && obstacles[row][col-1])
            return true;
        if (col < obstacles[0].length-1 && obstacles[row][col+1])
            return true;
        if (row > 0 && obstacles[row-1][col])
            return true;
        //use the below and change first Math.random() in createBoard() 
        //to *3 for a different map layout
        /*if (col < obstacles[0].length-1 && row > 0 && obstacles[row-1][col+1])
            return true;
        if (col > 0 && row > 0 && obstacles[row-1][col-1])
            return true;*/
        return false;
    }
    
    private class Board extends JFrame
    {
        public Board(){
            JPanel pan = new JPanel();
            
            this.setSize(BOARD_WIDTH,BOARD_HEIGHT);
            this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            this.setTitle("Submarines");
            this.add(pan);
            pan.setBackground(Color.CYAN);
            this.setVisible(true);
            //islands();
        }
        
        public void paint(Graphics m){
            m.setColor(Color.CYAN);
            m.fillRect(0,0,BOARD_WIDTH,BOARD_HEIGHT);
            m.setColor(Color.GREEN);
            for (int r = 0; r < obstacles.length; r++)
            {
                for (int c = 0; c < obstacles[0].length; c++)
                {
                    if (obstacles[r][c])
                        m.fillRect(r*5, c*5, 5, 5);
                }
            }
            p1.draw(m);
            p2.draw(m);
        }
        
        public void init(){}
        public void start(){}
        public void stop(){}
    }
}
