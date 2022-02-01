import javax.swing.*;
import java.awt.*;

public class appMenuGUI extends JFrame {

    JMenuBar menuBar;
    JMenu menuPlik, menuEdit, submenu;
    JMenuItem mNProject, mNFile, mSubIteam;
    JRadioButtonMenuItem mRBMI, mArb;
    JCheckBoxMenuItem mACB, mAo;
    ButtonGroup radio;


    public appMenuGUI() {
        int DEFAULT_WIDTH = 600;
        int DEFAULT_HEIGHT = 600;
        setSize(DEFAULT_WIDTH, DEFAULT_HEIGHT);
        setTitle("przyklad");
        setLayout(null);

        menuBar = new JMenuBar();
        //=========================================
        menuPlik = new JMenu("Plik");

        mNProject = new JMenuItem("New Project");// dodanie menu Item wraz z memonic

        mNFile = new JMenuItem("New File...");

        mACB = new JCheckBoxMenuItem("A check box menu iteam");

        mAo = new JCheckBoxMenuItem("Another one");

        mRBMI = new JRadioButtonMenuItem("Radio button menu iteam");

        mArb = new JRadioButtonMenuItem("Another radio button");

        submenu = new JMenu("A submenu");

        mSubIteam = new JMenuItem("Submenu iteam");

        radio = new ButtonGroup();
        radio.add(mRBMI);
        radio.add(mArb);

        menuPlik.add(mNProject);
        menuPlik.add(mNFile);
        menuPlik.addSeparator();
        menuPlik.add(mACB);
        menuPlik.add(mAo);
        menuPlik.addSeparator();
        menuPlik.add(mRBMI);
        menuPlik.add(mArb);
        menuPlik.addSeparator();
        submenu.add(mSubIteam);
        menuPlik.add(submenu);

        mNProject.setAccelerator(KeyStroke.getKeyStroke("Alt-1"));

        setJMenuBar(menuBar);
        //=========================================
        menuEdit = new JMenu("Edit");

        //=========================================
        menuBar.add(menuPlik);
        menuBar.add(menuEdit);
    }


    public static void main(String[] args) {
                appMenuGUI frame = new appMenuGUI();
                frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
                frame.setVisible(true);
    }
}
