import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;

public class tesUsun extends JFrame {

    private JPanel panel1;
    private JPanel JPanelTop;
    private JPanel JPanelLeft;
    private JPanel JPanelRight;
    private JList list1;
    private JLabel NameLabel;
    private JTextField textName;
    private JTextField textEmail;
    private JTextField textPhone;
    private JTextField textAdress;
    private JTextField textDob;
    private JPanel InPanelTop;
    private JLabel HowOldLabel;
    private JLabel AgeLabel;
    private JLabel EmailLabel;
    private JLabel PhonenrLabel;
    private JLabel AdressLabel;
    private JLabel DobLabel;
    private JPanel InPanelBottom;
    private JButton SaveNButton;
    private JButton SaveEButton;
    private ArrayList<person>people;
    private DefaultListModel listPeopleModel;

    person jan = new person("Jan Kowalski", "jkowalski@test.com", "547 893 829", "Pigonia 1, Rzeszow", "26/02/1980");
    person marian = new person("Marian Nowak", "mnowak@test.com", "678 903 812", "Pigonia 1, Rzeszow", "01/03/1981");
    person janina = new person("Janina Urban", "jurban@test.com", "789 372 672", "Pigonia 1, Rzeszow", "01/01/1984");
    person ewelina = new person("Ewelina Nowak-Maciag", "enm@test.com", "789 341 234", "Pigonia 1, Rzeszow", "06/10/1981");
    person pawel = new person("Pawel Kot", "pkot@test.com", "678 907 327", "Pigonia 1, Rzeszow", "02/12/1985");
    person franek = new person("Franciszek Kowalski", "fkowalski@test.com", "368 283 123", "Pigonia 1, Rzeszow", "17/05/1981");
    person julia = new person("Julia Nowak", "jnowak@test.com", "763 234 234", "Pigonia 1, Rzeszow", "17/12/1979");

    public tesUsun(){
        super("Moj projekt");
        this.setContentPane(this.panel1);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        people = new ArrayList<person>();
        listPeopleModel = new DefaultListModel();
        list1.setModel(listPeopleModel);

        list1.addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                int personNumber = list1.getSelectedIndex();
                if(personNumber >= 0)
                {
                    person p = people.get(personNumber);
                    textName.setText(p.getName());
                    textEmail.setText(p.getEmail());
                    textPhone.setText(p.getPhoneNumber());
                    textAdress.setText(p.getAdress());
                    textDob.setText(p.getDateOfBirth().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

                    HowOldLabel.setText(Integer.toString(p.getAge()) + " lat / lata");
                    SaveEButton.setEnabled(true);
                }
                else
                {
                    SaveEButton.setEnabled(false);
                }
            }
        });

        SaveNButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                person p = new person(
                        textName.getText(),
                        textEmail.getText(),
                        textPhone.getText(),
                        textAdress.getText(),
                        textDob.getText()
                );
                people.add(p);
                refreshPeopleList();
            }
        });

        SaveEButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int personNumber = list1.getSelectedIndex();
                if(personNumber >= 0)
                {
                    person p = people.get(personNumber);
                    p.setName(textName.getText());
                    p.setEmail(textEmail.getText());
                    p.setPhoneNumber(textPhone.getText());
                    p.setAdress(textAdress.getText());
                    p.setDateOfBirth(textDob.getText());
                    refreshPeopleList();
                }
            }
        });
    }

    public void refreshPeopleList(){
        listPeopleModel.removeAllElements();
        System.out.println("Usunieto wszystkie osoby z listy");
        for(person p: people)
        {
            System.out.println("Dodanie osoby do listy" + p.getName());
            listPeopleModel.addElement(p.getName());
        }
    }

    public void addPerson(person p){
        people.add(p);
        refreshPeopleList();
    }

    public static void main(String[] args){
        tesUsun swingApp = new tesUsun();

        swingApp.addPerson(swingApp.jan);
        swingApp.addPerson(swingApp.marian);
        swingApp.addPerson(swingApp.janina);
        swingApp.addPerson(swingApp.ewelina);
    }
}
