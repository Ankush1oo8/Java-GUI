package KeyListener;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

public class myFrame extends JFrame implements KeyListener{
    JLabel label;
    myFrame(){

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);
        this.addKeyListener(this);
        

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.CYAN);
        label.setOpaque(true);

        this.add(label);
        
        this.setVisible(true);

    }



    @Override
    public void keyPressed(KeyEvent e) {
        switch(e.getKeyCode()){
            case 37: label.setLocation(label.getX()-10,label.getY());
                break;
            case 38:label.setLocation(label.getX(),label.getY()-10);
                break;
            case 39: label.setLocation(label.getX()+10,label.getY());
                break;
            case 40: label.setLocation(label.getX(),label.getY()+10);
                break;

        }
    }

    @Override
    public void keyReleased(KeyEvent arg0) {
        
    }

    @Override
    public void keyTyped(KeyEvent arg0) {
        
    }
}
