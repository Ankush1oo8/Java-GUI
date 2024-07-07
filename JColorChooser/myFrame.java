package JColorChooser;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class myFrame extends JFrame implements ActionListener {

    JButton button;
    JLabel label;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Pick A Color");
        button.addActionListener(this);

        label=new JLabel("THIS IS SOME TEXT");
        label.setBackground(Color.WHITE);
        label.setFont(new Font("MV Boli",Font.PLAIN,100));
        label.setOpaque(true);


        this.add(button);
        this.add(label);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            JColorChooser colorChooser=new JColorChooser();
            
            Color color=JColorChooser.showDialog(null, "Pick a Color", Color.BLACK);
            label.setForeground(color);
        }
    }
    
}
