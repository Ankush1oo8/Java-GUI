import java.awt.*;
import javax.swing.*;
import javax.swing.event.*;

class myFrame implements ChangeListener{
    JFrame frame;
    JPanel panel;
    JLabel label;
    JSlider slider;
    myFrame(){
        frame=new JFrame();
        panel=new JPanel();
        label=new JLabel();
        slider=new JSlider(0,100,50);
        slider.setPreferredSize(new Dimension(400,200));
        slider.setPaintTicks(true);
        slider.setMinorTickSpacing(10);

        slider.setPaintTrack(true);
        slider.setMajorTickSpacing(25);

        slider.setPaintLabels(true);
        slider.setFont(new Font("MV Boli",Font.PLAIN,25));

        slider.setOrientation(SwingConstants.VERTICAL);
        slider.addChangeListener(this);
        
        label.setText("'C = "+ slider.getValue());
        label.setFont(new Font("MV Boli",Font.PLAIN,35));

        panel.add(slider);
        panel.add(label);
        frame.add(panel);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

    @Override
    public void stateChanged(ChangeEvent arg0) {
        label.setText("'C = "+ slider.getValue());
    }
}