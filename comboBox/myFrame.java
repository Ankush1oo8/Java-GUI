package comboBox;
import javax.swing.*;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class myFrame extends JFrame implements ActionListener {
    JComboBox box;
    myFrame(){
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        String animals[]={"Dog","Cat","Elephant"};

        box=new JComboBox(animals);
        box.addActionListener(this);
        this.add(box);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==box){
            System.out.println(box.getSelectedItem());
        }
        
    }
}
