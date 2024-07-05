package textFields;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class myFrame extends JFrame implements ActionListener {
    
    JTextField input;
    JButton button;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("submit");
        button.addActionListener(this);


        input=new JTextField();
        input.setPreferredSize(new Dimension(250,40));
        input.setFont(new Font("Consolas",Font.PLAIN,35));
        input.setForeground(Color.GREEN);
        input.setBackground(Color.BLACK);
        input.setCaretColor(Color.WHITE);
        input.setText("UserName");


        this.add(button);
        this.add(input);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==button){
            input.setEditable(false);
            button.setEnabled(false);
            System.out.println(input.getText());
        }
    }
    
}
