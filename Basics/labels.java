package Basics;
import java.awt.*;
import javax.swing.*;
import javax.swing.border.Border;


public class labels {
    public static void main(String[] args) {
        
        JLabel label=new JLabel();
        label.setText("Making label in frame");
        label.setForeground(Color.GREEN);
        ImageIcon img=new ImageIcon("download.jpeg");
        Border border=BorderFactory.createLineBorder(Color.green,3);
        label.setIcon(img);
        label.setHorizontalTextPosition(JLabel.CENTER);
        label.setVerticalTextPosition(JLabel.TOP);
        label.setFont(new Font("MV Boli",Font.PLAIN,20));
        label.setIconTextGap(10);
        label.setBackground(Color.BLACK );
        label.setOpaque(true);
        label.setBorder(border);
        label.setVerticalAlignment(JLabel.CENTER);
        label.setHorizontalAlignment(JLabel.CENTER);
        // label.setBounds(100,100,280,280);

        JFrame frame=new JFrame();
        frame.setSize(500, 500);
        // frame.setLayout(null);
        frame.setVisible(true);
        frame.add(label);
        frame.pack();
    }
}
