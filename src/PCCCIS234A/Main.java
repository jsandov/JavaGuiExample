package PCCCIS234A;

import javax.swing.*;

public class Main {

    
    public static void main(String[] args) {
	// write your code here


        javax.swing.SwingUtilities.invokeLater(() -> createAndShowGui());
    }

    private static void createAndShowGui() {
        //Creates window of GUI

        JFrame frame = new JFrame("Introductions");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().add(new IntroductionForm().getRootPanel());
        frame.pack();
        frame.setVisible(true);

    }
}
