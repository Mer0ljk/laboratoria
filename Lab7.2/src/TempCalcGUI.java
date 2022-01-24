import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class TempCalcGUI extends JFrame{
    private JPanel TextPanel;
    private JPanel ButtonPanel;
    private JTextField textFCelciusz;
    private JTextField textFFarenheit;
    private JButton konwertujButton;
    private JButton wyczyśćButton;
    private JButton wyjścieButton;
    private JPanel FontPanel;
    private JRadioButton czcionkaMałaRadioButton;
    private JRadioButton czcionkaŚredniaRadioButton;
    private JRadioButton czcionkaDużaRadioButton;
    private JCheckBox wielkieLiteryCheckBox;
    private JButton resetujButton;
    private JPanel MainPanel;

    private double tempC, tempF;

    public static void main(String[] args){
        TempCalcGUI tempCalc = new TempCalcGUI();
        tempCalc.setVisible(true);
    }

    public TempCalcGUI() {
        super("Konwertowanie stopni C -> F");
        this.setContentPane(MainPanel);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.pack();
        setLayout(null);


        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();

                if (ob1 == konwertujButton || ob1 == textFCelciusz) {
                    tempC = Double.parseDouble(textFCelciusz.getText());
                    tempF = 32.00 + (9.0 / 5.0) * tempC;
                    textFFarenheit.setText(String.valueOf(tempF));
                } else if (ob1 == wyczyśćButton) {
                    textFCelciusz.setText("");
                    textFFarenheit.setText("");
                    if (wielkieLiteryCheckBox.isSelected()) {
                        wielkieLiteryCheckBox.setSelected(false);
                    } else if (czcionkaMałaRadioButton.isSelected()) {
                        czcionkaMałaRadioButton.setSelected(false);
                    } else if (!czcionkaŚredniaRadioButton.isSelected()) {
                        czcionkaŚredniaRadioButton.setSelected(true);
                    } else if (czcionkaDużaRadioButton.isSelected()) {
                        czcionkaDużaRadioButton.setSelected(false);
                    }

                } else if (ob1 == wyjścieButton) {
                    dispose();
                } else if (ob1 == wielkieLiteryCheckBox) {
                    if (wielkieLiteryCheckBox.isSelected()) {
                        textFCelciusz.setFont(new Font("SansSerif", Font.BOLD, 18));
                        textFFarenheit.setFont(new Font("SansSerif", Font.BOLD, 18));
                    } else {
                        textFCelciusz.setFont(new Font("SansSerif", Font.PLAIN, 12));
                        textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    }
                } else if (ob1 == czcionkaMałaRadioButton) {
                    textFCelciusz.setFont(new Font("SansSerif", Font.PLAIN, 8));
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 8));
                } else if (ob1 == czcionkaŚredniaRadioButton) {
                    textFCelciusz.setFont(new Font("SansSerif", Font.PLAIN, 12));
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 12));
                } else if (ob1 == czcionkaDużaRadioButton) {
                    textFCelciusz.setFont(new Font("SansSerif", Font.PLAIN, 20));
                    textFFarenheit.setFont(new Font("SansSerif", Font.PLAIN, 20));
                }
            }
        };

        konwertujButton.addActionListener(listener);
        wyczyśćButton.addActionListener(listener);
        wyjścieButton.addActionListener(listener);
        wielkieLiteryCheckBox.addActionListener(listener);
        czcionkaMałaRadioButton.addActionListener(listener);
        czcionkaŚredniaRadioButton.addActionListener(listener);
        czcionkaDużaRadioButton.addActionListener(listener);
    }
}