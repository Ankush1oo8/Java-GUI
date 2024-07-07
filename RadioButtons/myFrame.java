package RadioButtons;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ButtonGroup;

import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class myFrame extends JFrame implements ActionListener {

    JRadioButton pizzabutton;
    JRadioButton burgerbutton;
    JRadioButton hotdogbutton;

    myFrame() {
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        pizzabutton = new JRadioButton("PIZZA");
        burgerbutton = new JRadioButton("HAMBURGER");
        hotdogbutton = new JRadioButton("HOT DOG");
        hotdogbutton.addActionListener(this);
        burgerbutton.addActionListener(this);
        pizzabutton.addActionListener(this);
        ButtonGroup group = new ButtonGroup();
        group.add(pizzabutton);
        group.add(burgerbutton);
        group.add(hotdogbutton);
        

        this.add(pizzabutton);
        this.add(burgerbutton);
        this.add(hotdogbutton);
        this.pack();
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (pizzabutton.isSelected()) {
            System.out.println("PIZZA");
        } else if (burgerbutton.isSelected()) {
            System.out.println("HAMBURGER");
        } else if (hotdogbutton.isSelected()) {
            System.out.println("HOT DOG");
        }
    }

}