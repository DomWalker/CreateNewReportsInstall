import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 * Created by Dominique on 1/1/2015.
 */

public class FolderChooserGui {

    JFrame frame = new JFrame();
    JPanel panelA = new JPanel();
    JPanel panelB = new JPanel();
    JButton createNewDirectoryButton = new JButton("Create New Directory");
    JButton copyTestInstallationButton = new JButton("Copy Test Installation");
    JButton button3 = new JButton("Test Button 3");
    Font font1 = new Font(Font.MONOSPACED, Font.BOLD, 12);


   /* public static void main (String[] args) {
        folderChooserGui FC = new folderChooserGui();
        FC.go();
    }*/

    public void go() {
        panelA.setBackground(Color.DARK_GRAY);
        panelA.add(createNewDirectoryButton);
       // panelA.add(copyTestInstallationButton);
       // panelA.add(button3);
        panelB.add(copyTestInstallationButton);
        panelB.setBackground(Color.blue);

        createNewDirectoryButton.addActionListener(new newDirectoryListener());
        createNewDirectoryButton.setFont(font1);
       // createNewDirectoryButton.setPreferredSize(new Dimension(144,36));

        copyTestInstallationButton.addActionListener(new copyDirectoryListener());
        copyTestInstallationButton.setFont(font1);
        //copyTestInstallationButton.setPreferredSize(new Dimension(144, 36));

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(BorderLayout.EAST, panelA);
        frame.getContentPane().add(BorderLayout.WEST, panelB);
        frame.setSize(400, 200);
        frame.setVisible(true);

    }
    class newDirectoryListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            createNewDirectoryButton.setText("Been Clicked 1");
        }
    }
    class copyDirectoryListener implements ActionListener{
        public void actionPerformed(ActionEvent event){
            copyTestInstallationButton.setText("Been Clicked 2");
        }
    }



}

