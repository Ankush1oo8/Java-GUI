package ChoseFileFromSystem;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class myFrame extends JFrame implements ActionListener{
    JButton button;
    myFrame(){


        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLayout(new FlowLayout());

        button=new JButton("Open Files");
        button.addActionListener(this);
        this.add(button);
        this.pack();
        this.setVisible(true);


    }
    @Override
    public void actionPerformed(ActionEvent e) {
        
        if(e.getSource()==button){
            JFileChooser file=new JFileChooser();

            file.setCurrentDirectory(new File("."));

            int res=file.showSaveDialog(null);//select file to save
            if (res==JFileChooser.APPROVE_OPTION){
                File file1=new File(file.getSelectedFile().getAbsolutePath());
                System.out.println(file1);
            }

        }
    }
}
