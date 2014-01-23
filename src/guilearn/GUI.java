package guilearn;

import javax.swing.*;

/* Swing Gui by hand - notice the integration into other classes */

public class GUI {
    public static void createAndShowGUI() {
        //Create and set up the window.
        JFrame frame = new JFrame("Squares");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        //Add the ubiquitous "Hello World" label.
        JLabel label = new JLabel( String.valueOf((Ops.square(5))));
        frame.getContentPane().add(label);

        //Display the window.
        frame.pack();
        frame.setVisible(true);	
    }
}
