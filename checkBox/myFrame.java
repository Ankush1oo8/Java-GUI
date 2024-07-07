package checkBox;



import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;


public class myFrame extends JFrame implements ActionListener {

    
    JButton button;
    JCheckBox checkbox;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        JButton button=new JButton("Submit");
        button.addActionListener(this);


        checkbox=new JCheckBox();
        checkbox.setText("I'M NOT A ROBOT!");
        checkbox.setFocusable(false);
        checkbox.setFont(new Font("Consolas",Font.PLAIN,35));
        this.add(button);
        this.add(checkbox);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            System.out.println(checkbox.isSelected());
        }
    }
    
}

