package Basics;
import javax.swing.*;
import java.awt.*;


public class MyFrame extends JFrame{

    JButton button;
    MyFrame() {
        ImageIcon img1=new ImageIcon("download.jpeg");
        button=new JButton();
        button.setBounds(200,100,250,100);
        button.addActionListener(e -> System.out.println("hello"));
        button.setText("SUBMIT");
        button.setFocusable(false);
        button.setIcon(img1);
        button.setBackground(Color.BLACK);
        button.setBorder(BorderFactory.createEtchedBorder());
        this.setTitle("Using JFrame ");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setResizable(true); //prvent frame being resized

        this.setSize(600,600);
        this.setVisible(true);
        ImageIcon img=new ImageIcon("download.jpeg");
        this.setIconImage(img.getImage());
        this.getContentPane().setBackground(new Color(66,66,66));
        this.add(button);

    }
    
}