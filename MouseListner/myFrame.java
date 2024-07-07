package MouseListner;
import java.awt.event.*;
import java.awt.Color;
import javax.swing.*;

public class myFrame extends JFrame implements MouseListener{
    
    JLabel label;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(null);

        label=new JLabel();
        label.setBounds(0,0,100,100);
        label.setBackground(Color.red);
        label.setOpaque(true);
        label.addMouseListener(this);
        this.add(label);
        this.setVisible(true);
    }

    @Override
    public void mouseClicked(MouseEvent e){
        System.out.println("You clicked this mouse");
    }

    @Override
    public void mousePressed(MouseEvent e){
        System.out.println("pressed");
        label.setBackground(Color.YELLOW);
    }
    @Override
    public void mouseEntered(MouseEvent e){
        System.out.println("entered area");
        label.setBackground(Color.BLUE);
    }
    @Override
    public void mouseReleased(MouseEvent e){
        System.out.println("released mouse");
    }
    @Override
    public void mouseExited(MouseEvent e){
        System.out.println("exited");
        label.setBackground(Color.RED);
    }
}
