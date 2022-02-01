import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class KalkulatorGUI extends JFrame {
    private JTextField FNumberField;
    private JTextField OperatorField;
    private JTextField SNumberField;
    private JButton wyjscieButton;
    private JButton obliczButton;
    private JPanel mainPanel;
    private JPanel numberPanel;
    private JPanel ButtonPanel;
    private JLabel ResaultLabel;

    private double FNumber, SNumber, Resault;

    public static void main(String[] args) {
        KalkulatorGUI kalkulatorGUI = new KalkulatorGUI();
    }

    public KalkulatorGUI() {
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setSize(550, 200);
        this.setVisible(true);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();

                if(ob1 == obliczButton)
                {
                    if(Objects.equals(FNumberField.getText(), "") || Objects.equals(SNumberField.getText(), "") || Objects.equals(OperatorField.getText(), ""))
                    {
                        JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                    }
                    else
                    {
                        if(Objects.equals(OperatorField.getText(), "+"))
                        {
                            FNumber = Double.parseDouble(FNumberField.getText());
                            SNumber = Double.parseDouble(SNumberField.getText());

                            Resault = FNumber + SNumber;

                            ResaultLabel.setText(String.valueOf(Resault));
                        }
                        else if(Objects.equals(OperatorField.getText(), "-"))
                        {
                            FNumber = Double.parseDouble(FNumberField.getText());
                            SNumber = Double.parseDouble(SNumberField.getText());

                            Resault = FNumber - SNumber;

                            ResaultLabel.setText(String.valueOf(Resault));
                        }
                        else if(Objects.equals(OperatorField.getText(), "*"))
                        {
                            FNumber = Double.parseDouble(FNumberField.getText());
                            SNumber = Double.parseDouble(SNumberField.getText());

                            Resault = FNumber * SNumber;

                            ResaultLabel.setText(String.valueOf(Resault));
                        }
                        else if(Objects.equals(OperatorField.getText(), "/"))
                        {
                            FNumber = Double.parseDouble(FNumberField.getText());
                            SNumber = Double.parseDouble(SNumberField.getText());

                            if(SNumber == 0)
                            {
                                JOptionPane.showMessageDialog(null, "Nie wolno dzielic przez 0!");
                            }
                            else
                            {
                                Resault = FNumber / SNumber;

                                ResaultLabel.setText(String.valueOf(Resault));
                            }

                        }
                        else
                        {
                            JOptionPane.showMessageDialog(null, "Podano niepoprawny operator!");
                        }
                    }
                }
                else if (ob1 == wyjscieButton)
                {
                    int confirm = JOptionPane.showConfirmDialog(null,"Czy na pewno wyjsc?","Are you sure?",JOptionPane.YES_NO_OPTION);

                    if(confirm == JOptionPane.YES_OPTION)
                    {
                        dispose();
                    }
                    else if(confirm == JOptionPane.NO_OPTION)
                    {
                        JOptionPane.showMessageDialog(null, "Zostajesz z nami :)");
                    }
                }
            }

        };

        obliczButton.addActionListener(listener);
        wyjscieButton.addActionListener(listener);
    }
}