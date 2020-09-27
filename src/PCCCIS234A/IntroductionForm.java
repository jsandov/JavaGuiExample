package PCCCIS234A;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IntroductionForm {
    private JPanel rootPanel;
    private JTextField nameTextField;
    private JButton sayHelloButton;

    public IntroductionForm() {
        rootPanel.setPreferredSize(new Dimension(300,200));
        sayHelloButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                JOptionPane.showMessageDialog(rootPanel,"Hello! " + getNameTextField());
            }
        });
    }


    public JPanel getRootPanel() {
        return rootPanel;
    }

    public String getNameTextField() {
        return nameTextField.getText();
    }




}
