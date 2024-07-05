package Basics;
import java.awt.Color;

import javax.swing.*;

public class Jlayeredpane {
    public static void main(String[] args) {

        JLabel label=new JLabel();
        label.setOpaque(true);
        label.setBackground(Color.RED);
        label.setBounds(50,50,200,200);

        JLabel label1=new JLabel();
        label1.setOpaque(true);
        label1.setBackground(Color.BLUE);
        label1.setBounds(100,100,200,200);

        JLabel label2=new JLabel();
        label2.setOpaque(true);
        label2.setBackground(Color.GREEN);
        label2.setBounds(150,150,200,200);

        JLayeredPane pane=new JLayeredPane();
        pane.setBounds(0,0,500,500);
        pane.add(label,Integer.valueOf(0));
        pane.add(label1,Integer.valueOf(2));
        pane.add(label2,Integer.valueOf(1));

        JFrame frame =new JFrame();
        frame.add(pane);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500,500);
        frame.setVisible(true);

    }
}
