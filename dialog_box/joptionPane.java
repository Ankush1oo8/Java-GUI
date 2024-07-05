package dialog_box;

import javax.swing.JOptionPane;

public class joptionPane {
    public static void main(String[] args) {
        // JOptionPane.showMessageDialog(null,"This is some INFO","title",JOptionPane.PLAIN_MESSAGE);
        // JOptionPane.showMessageDialog(null,"This is some INFO","title",JOptionPane.INFORMATION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"This is some INFO","title",JOptionPane.QUESTION_MESSAGE);
        // JOptionPane.showMessageDialog(null,"This is some INFO","title",JOptionPane.WARNING_MESSAGE);
        // JOptionPane.showMessageDialog(null,"This is some INFO","title",JOptionPane.ERROR_MESSAGE);

        int ans=JOptionPane.showConfirmDialog(null, "Bro do you code!!", "This is my Title", JOptionPane.YES_NO_CANCEL_OPTION);
        String name=JOptionPane.showInputDialog("What is your Name: ");
        System.out.println(name);




    }
}
