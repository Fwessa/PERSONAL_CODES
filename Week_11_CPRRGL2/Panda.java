
import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class Panda extends JFrame implements KeyListener, MouseListener{
    ImageIcon img = new ImageIcon("TWERK.gif");
    JTextField tfAction = new JTextField(30);
    JLabel object = new JLabel(img);
    
    public Panda(){
        setSize(1000,1080);
        setLayout(new FlowLayout());
        setTitle("The Ramen House");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        
        tfAction.setFocusable(false);
        addKeyListener(this);
        addMouseListener(this);
        
        add(tfAction);
        add(object);
        
        setVisible(true);
        
    }
    
    public static void main(String[] args){
        new Panda();
    }

    @Override
    public void keyTyped(KeyEvent e) {
        
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if(e.getKeyCode() == KeyEvent.VK_UP){
            tfAction.setText("Press arrow key UP");
            object.setLocation(object.getX(), object.getY()-50);
            
        }
        else if(e.getKeyCode() == KeyEvent.VK_DOWN){
            tfAction.setText("Press arrow key DOWN");
            object.setLocation(object.getX(), object.getY()+50);
        }
        else if(e.getKeyCode() == KeyEvent.VK_LEFT){
            tfAction.setText("Press arrow key LEFT");
            object.setLocation(object.getX()-50, object.getY());
        }
        else if(e.getKeyCode() == KeyEvent.VK_RIGHT){
            tfAction.setText("Press arrow key RIGHT");
            object.setLocation(object.getX()+50, object.getY());
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        
    }

    @Override
    public void mouseClicked(MouseEvent e) {
        tfAction.setText("Mouse clicked");
        object.setLocation(e.getX(),e.getY());
    }

    @Override
    public void mousePressed(MouseEvent e) {
        tfAction.setText("Mouse pressed");
        object.setLocation(e.getX(),e.getY());
    }

    @Override
    public void mouseReleased(MouseEvent e) {
        tfAction.setText("Mouse released");
        object.setLocation(e.getX(),e.getY());
    }

    @Override
    public void mouseEntered(MouseEvent e) {
        tfAction.setText("Mouse entered the frame");
        object.setLocation(0,0);
    }

    @Override
    public void mouseExited(MouseEvent e) {
        tfAction.setText("Mouse excited the frame");
        object.setLocation(400,400);
    }
}
