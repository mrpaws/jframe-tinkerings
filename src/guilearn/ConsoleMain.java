package guilearn;

import java.awt.EventQueue;

public class ConsoleMain {

	public static void main(String[] args) {
		/*
		    Swing By Hand:
		
        Schedule a job for the event-dispatching thread:
        creating and showing this application's GUI.
        
        */
        javax.swing.SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                GUI.createAndShowGUI();
            }
        });
        
        /* 
            Swing By WindowBuilderPro
            
            Took the main class created by the layout and imported here
         */
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIWindowBuilderAppWin window = new GUIWindowBuilderAppWin();
					window.getFrame().setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
  		System.out.println(args[0]);
		System.out.println(Ops.square(Integer.parseInt(args[0])));
	}

}
