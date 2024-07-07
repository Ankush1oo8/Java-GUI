package DragImage;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseMotionAdapter;

import javax.swing.JPanel;

public class dragPanel extends JPanel{
    ImageIcon img=new ImageIcon("DragImage/img.png");
    final int WIDTH=img.getIconWidth();
    final int HEIGHT = img.getIconHeight();
    Point imageCorner;
    Point prevPt;
    dragPanel(){
        imageCorner=new Point(0,0);
        ClickListener click=new ClickListener();
        DragListener drag=new DragListener();
        
        this.addMouseListener(click);
        this.addMouseMotionListener(drag);
        this.repaint();

    }

    public void paintComponent(Graphics g){
        super.paintComponent(g);
        img.paintIcon(this, g, (int)imageCorner.getX(), (int)imageCorner.getY());
    }
    private class ClickListener extends MouseAdapter{
        public void mousePressed(MouseEvent e){
            prevPt=e.getPoint();
        }
    }
    private class DragListener extends MouseMotionAdapter{
        public void mouseDragged(MouseEvent e){
            Point curr=e.getPoint();
            imageCorner.translate(
                        (int)(curr.getX()-prevPt.getX())
                        ,(int)(curr.getY()-prevPt.getY()));

                        prevPt=curr;
                        repaint();

        }
    }
}
