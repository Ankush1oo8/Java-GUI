package Basics;
import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.*;

public class panels {
    public static void main(String[] args) {
ImageIcon img=new ImageIcon("download.jpeg");

        JLabel label=new JLabel();
        label.setText("Hi There!!");
        label.setIcon(img);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);


        JPanel blackPanel=new JPanel();
        blackPanel.setBackground(Color.BLACK);
        blackPanel.setBounds(0,0,250,250);

        // red panel
        JPanel redPanel=new JPanel();
        redPanel.setBackground(Color.RED);
        redPanel.setBounds(0,250,500,250);
        redPanel.setLayout(new BorderLayout());

        // green panel
        JPanel greenPanel=new JPanel();
        greenPanel.setBackground(Color.GREEN);
        greenPanel.setBounds(250,0,250,250);


        JFrame frame=new JFrame();
        frame.setSize(750,750);
        frame.setLayout(null);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
        redPanel.add(label);
        frame.add(blackPanel);
        frame.add(redPanel);
        frame.add(greenPanel);
        
    }
}
