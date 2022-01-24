import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Objects;

public class FigureCalcGUI extends JFrame{
    private JRadioButton kwadratRadioButton;
    private JRadioButton prostopadłościanRadioButton;
    private JRadioButton prostokątRadioButton;
    private JRadioButton sześcianRadioButton;
    private JRadioButton trójkątRadioButton;
    private JRadioButton walecRadioButton;
    private JRadioButton trapezRadioButton;
    private JRadioButton kulaRadioButton;
    private JTextField aTextField;
    private JTextField bTextField;
    private JTextField hTextField;
    private JTextField rTextField;
    private JButton obliczButton;
    private JButton wyczyśćButton;
    private JButton wyjdźButton;
    private JPanel mainPanel;
    private JLabel PLabel;
    private JLabel obwLabel;
    private JLabel VLabel;

    private double a, b, h, r, P, obw, V;

    public static void main(String[] args){
        FigureCalcGUI figureCalcGUI = new FigureCalcGUI();
    }

    public FigureCalcGUI() {
        super("Figury geometryczne - kalkulator");
        this.setContentPane(this.mainPanel);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.pack();
        this.setVisible(true);

        aTextField.setEnabled(true);
        bTextField.setEnabled(false);
        hTextField.setEnabled(false);
        rTextField.setEnabled(false);

        ActionListener listener = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                Object ob1 = e.getSource();
                if(ob1 == kwadratRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(false);
                    hTextField.setEnabled(false);
                    rTextField.setEnabled(false);

                    bTextField.setText("");
                    hTextField.setText("");
                    rTextField.setText("");
                }
                else if(ob1 == prostokątRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(true);
                    hTextField.setEnabled(false);
                    rTextField.setEnabled(false);

                    hTextField.setText("");
                    rTextField.setText("");
                }
                else if(ob1 == trójkątRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(false);
                    hTextField.setEnabled(true);
                    rTextField.setEnabled(false);

                    bTextField.setText("");
                    rTextField.setText("");
                }
                else if(ob1 == trapezRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(true);
                    hTextField.setEnabled(true);
                    rTextField.setEnabled(false);

                    rTextField.setText("");
                }
                else if(ob1 == sześcianRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(false);
                    hTextField.setEnabled(false);
                    rTextField.setEnabled(false);

                    bTextField.setText("");
                    hTextField.setText("");
                    rTextField.setText("");
                }
                else if(ob1 == prostopadłościanRadioButton)
                {
                    aTextField.setEnabled(true);
                    bTextField.setEnabled(true);
                    hTextField.setEnabled(true);
                    rTextField.setEnabled(false);

                    rTextField.setText("");
                }
                else if(ob1 == walecRadioButton)
                {
                    aTextField.setEnabled(false);
                    bTextField.setEnabled(false);
                    hTextField.setEnabled(true);
                    rTextField.setEnabled(true);

                    aTextField.setText("");
                    bTextField.setText("");
                }
                else if(ob1 == kulaRadioButton)
                {
                    aTextField.setEnabled(false);
                    bTextField.setEnabled(false);
                    hTextField.setEnabled(false);
                    rTextField.setEnabled(true);

                    aTextField.setText("");
                    bTextField.setText("");
                    hTextField.setText("");
                }
                else if(ob1 == obliczButton)
                {
                    if (kwadratRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());

                            if(a <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = a * a;
                                obw = 4.0 * a;

                                PLabel.setText("Pole: " + String.valueOf(P));
                                obwLabel.setText("Obwód: " + String.valueOf(obw));
                            }
                        }
                    }
                    else if(prostokątRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), "") || Objects.equals(bTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());
                            b = Double.parseDouble(bTextField.getText());

                            if(a <= 0 || b <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = a * b;
                                obw = (2.0 * a) + (2.0 * b);

                                PLabel.setText("Pole: " + String.valueOf(P));
                                obwLabel.setText("Obwód: " + String.valueOf(obw));
                            }
                        }
                    }
                    else if(trójkątRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), "") || Objects.equals(hTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());
                            h = Double.parseDouble(hTextField.getText());

                            if(a <= 0 || h <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = 0.5 * a * h;

                                PLabel.setText("Pole: " + String.valueOf(P));
                            }
                        }
                    }
                    else if(trapezRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), "") || Objects.equals(bTextField.getText(), "") || Objects.equals(hTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());
                            b = Double.parseDouble(bTextField.getText());
                            h = Double.parseDouble(hTextField.getText());

                            if(a <= 0 || b <= 0 || h <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = ((a + b) * h) / 2.0;

                                if (a == b)
                                {
                                    obw = a + b + h + h;
                                }
                                else if(a > b)
                                {
                                    obw = a + b + 2.0 * Math.sqrt(Math.pow(((a - b) / 2.0), 2.0) + Math.pow(h, 2.0));
                                }
                                else
                                {
                                    obw = a + b + 2.0 * Math.sqrt(Math.pow(((b - a) / 2.0), 2.0) + Math.pow(h, 2.0));
                                }

                                PLabel.setText("Pole: " + String.valueOf(P));
                                obwLabel.setText("Obwód: " + String.valueOf(obw));
                            }
                        }
                    }
                    else if(sześcianRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());

                            if(a <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else {
                                P = 6.0 * a * a;
                                obw = 12.0 * a;
                                V = a * a * a;

                                PLabel.setText("Pole: " + String.valueOf(P));
                                obwLabel.setText("Obwód: " + String.valueOf(obw));
                                VLabel.setText("Objętość: " + String.valueOf(V));
                            }
                        }
                    }
                    else if(prostopadłościanRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), "") || Objects.equals(bTextField.getText(), "") || Objects.equals(hTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());
                            b = Double.parseDouble(bTextField.getText());
                            h = Double.parseDouble(hTextField.getText());

                            if(a <= 0 || b <= 0 || h <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else {
                                P = (2.0 * a * b) + (2.0 * a * h) + (2.0 * b * h);
                                obw = (4.0 * a) + (4.0 * b) + (4.0 * h);

                                PLabel.setText("Pole: " + String.valueOf(P));
                                obwLabel.setText("Obwód: " + String.valueOf(obw));
                            }
                        }
                    }
                    else if(walecRadioButton.isSelected())
                    {
                        if(Objects.equals(aTextField.getText(), "") || Objects.equals(rTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            a = Double.parseDouble(aTextField.getText());
                            r = Double.parseDouble(rTextField.getText());

                            if(a <= 0 || r <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = (2.0 * 3.14 * Math.pow(r, 2.0)) + (2.0 * 3.14 * r * h);
                                V = 3.14 * Math.pow(r, 2.0) * h;

                                PLabel.setText("Pole: " + String.valueOf(P));
                                VLabel.setText("Objętość: " + String.valueOf(V));
                            }
                        }
                    }
                    else if(kulaRadioButton.isSelected())
                    {
                        if(Objects.equals(rTextField.getText(), ""))
                        {
                            JOptionPane.showMessageDialog(null, "Podaj wymagane wartości!");
                        }
                        else
                        {
                            r = Double.parseDouble(rTextField.getText());

                            if(r <= 0)
                            {
                                JOptionPane.showMessageDialog(null, "Wartości muszą być większe od 0!");
                            }
                            else
                            {
                                P = 4.0 * 3.14 * Math.pow(r, 2.0);
                                V = (4.0 / 3.0) * 3.14 * Math.pow(r, 3.0);

                                PLabel.setText("Pole: " + String.valueOf(P));
                                VLabel.setText("Objętość: " + String.valueOf(V));
                            }
                        }
                    }
                }
                else if(ob1 == wyczyśćButton)
                {
                    kwadratRadioButton.setSelected(true);

                    aTextField.setEnabled(true);
                    bTextField.setEnabled(true);
                    hTextField.setEnabled(false);
                    rTextField.setEnabled(false);

                    aTextField.setText("");
                    bTextField.setText("");
                    hTextField.setText("");
                    rTextField.setText("");

                    PLabel.setText("Pole: brak");
                    obwLabel.setText("Obwód: brak");
                    VLabel.setText("Objętość: brak");
                }
                else if(ob1 == wyjdźButton)
                {
                    dispose();
                }
            }
        };

        kwadratRadioButton.addActionListener(listener);
        prostokątRadioButton.addActionListener(listener);
        trójkątRadioButton.addActionListener(listener);
        trapezRadioButton.addActionListener(listener);
        sześcianRadioButton.addActionListener(listener);
        prostopadłościanRadioButton.addActionListener(listener);
        walecRadioButton.addActionListener(listener);
        kulaRadioButton.addActionListener(listener);
        obliczButton.addActionListener(listener);
        wyczyśćButton.addActionListener(listener);
        wyjdźButton.addActionListener(listener);
    }
}
