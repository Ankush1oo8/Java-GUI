package MenuBar;

import java.awt.*;

import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import java.awt.event.*;

public class myFrame extends JFrame implements ActionListener{

    JMenuBar bar;
    JMenuItem loadItem;
    JMenuItem saveItem;
    JMenuItem exitItem;
    myFrame(){
        bar=new JMenuBar();
        JMenu fileMenu=new JMenu("FILE");
        JMenu editMenu=new JMenu("EDIT");
        JMenu helpMenu=new JMenu("HELP");

        loadItem=new JMenuItem("Load");
        saveItem=new JMenuItem("Save");
        exitItem=new JMenuItem("Exit");

        loadItem.addActionListener(this);
        saveItem.addActionListener(this);
        exitItem.addActionListener(this);
        fileMenu.add(loadItem);
        fileMenu.add(saveItem);
        fileMenu.add(exitItem);

        fileMenu.setMnemonic(KeyEvent.VK_F); //alt +
        editMenu.setMnemonic(KeyEvent.VK_A);
        helpMenu.setMnemonic(KeyEvent.VK_H);

        loadItem.setMnemonic(KeyEvent.VK_L);
        saveItem.setMnemonic(KeyEvent.VK_S);
        exitItem.setMnemonic(KeyEvent.VK_E);

        bar.add(fileMenu);
        bar.add(editMenu);
        bar.add(helpMenu);
        this.setJMenuBar(bar);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setSize(500,500);
        this.setLayout(new FlowLayout());
        this.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==loadItem){
            System.out.println("Load MENU");
        }
        if(e.getSource()==saveItem){
            System.out.println("SAVED");
        }
        if(e.getSource()==exitItem){
            System.exit(0);
        }
    }
    
}
