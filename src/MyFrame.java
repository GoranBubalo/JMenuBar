import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;

public class MyFrame extends JFrame implements ActionListener {

    JMenuBar menuBar;
    JMenu fileMenu;
    JMenu editMenu;
    JMenu helpMenu;

    JMenuItem loadIteam;
    JMenuItem saveIteam;
    JMenuItem exitIteam;

    ImageIcon loadIcon;
    ImageIcon saveIcon;
    ImageIcon exitIcon;

    MyFrame(){
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setSize(500,500);
    this.setLayout(new FlowLayout());

    loadIcon = new ImageIcon("load.png");
    saveIcon = new ImageIcon("save.png");
    exitIcon = new ImageIcon("exit.png");

    Image imageTempLoad = loadIcon.getImage();
    Image newLoadImg = imageTempLoad.getScaledInstance(50,50,Image.SCALE_DEFAULT);

    Image imageTempSave = saveIcon.getImage();
    Image newSaveImg = imageTempSave.getScaledInstance(50,50,Image.SCALE_DEFAULT);

    Image imageTempExit = exitIcon.getImage();
    Image newExitImg = imageTempExit.getScaledInstance(50,50,Image.SCALE_DEFAULT);

    loadIcon = new ImageIcon(newLoadImg);

    saveIcon = new ImageIcon(newSaveImg);

    exitIcon = new ImageIcon(newExitImg);




    menuBar = new JMenuBar();

    //Defining menu
    fileMenu = new JMenu("File");
    editMenu = new JMenu("Edit");
    helpMenu = new JMenu("Help");

    loadIteam = new JMenuItem("Load");
    saveIteam = new JMenuItem("Save");
    exitIteam = new JMenuItem("Exit");

    loadIteam.addActionListener(this);
    saveIteam.addActionListener(this);
    exitIteam.addActionListener(this);

    loadIteam.setIcon(loadIcon);
    saveIteam.setIcon(saveIcon);
    exitIteam.setIcon(exitIcon);


    fileMenu.setMnemonic(KeyEvent.VK_F);//Alt + f for file
    editMenu.setMnemonic(KeyEvent.VK_E);//Alt + e for edit
    helpMenu.setMnemonic(KeyEvent.VK_H);//Alt + h for help
    loadIteam.setMnemonic(KeyEvent.VK_L);//L for Load
    saveIteam.setMnemonic(KeyEvent.VK_S);//S for Save
    exitIteam.setMnemonic(KeyEvent.VK_E);//E for Exit

    //Adding to our a menu to our file-menu
    fileMenu.add(loadIteam);
    fileMenu.add(saveIteam);
    fileMenu.add(exitIteam);

    // Adding menu
    menuBar.add(fileMenu);
    menuBar.add(editMenu);
    menuBar.add(helpMenu);


    this.setJMenuBar(menuBar);
    this.setVisible(true);
    }


    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource() == loadIteam){
        System.out.println("You loaded a file");
        }
        if (e.getSource() == saveIteam){
        System.out.println("You saved the file");
        }
        if (e.getSource() == exitIteam){
        System.out.println("You exited the file");
        }

    }
}
