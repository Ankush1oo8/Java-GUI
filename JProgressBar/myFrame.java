package JProgressBar;
import javax.swing.*;
import java.awt.*;
import javax.swing.event.*;
public class myFrame {

    JFrame frame;
    JProgressBar bar;
    myFrame(){
        frame=new JFrame();
        bar=new JProgressBar(0,500);

        bar.setValue(0);
        bar.setBounds(0, 0, 400, 50);
        bar.setStringPainted(true);
        bar.setFont(new Font("MV Boli",Font.BOLD,25));
        bar.setForeground(Color.BLUE);
        bar.setBackground(Color.BLACK);
        frame.add(bar);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);

        fill();
    }
    public void fill(){
        int count=500;
        while(count>0){
            bar.setValue(count);
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            count-=1;
        }
        bar.setString("DONE!!");
    }
}
