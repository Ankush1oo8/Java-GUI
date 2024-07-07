package DragImage;
import java.awt.Component;

import javax.swing.*;
public class myFrame extends JFrame{

    dragPanel panel=new dragPanel();
    myFrame(){

        this.setTitle("DRAG & DROP DEMO");
        this.setSize(600,600);
        
        this.add(panel) ;
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
    }
}
