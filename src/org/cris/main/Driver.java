package org.cris.main;

import javax.swing.SwingUtilities;

import org.cris.gui.MainWindow;

public class Driver {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable(){
			@Override
			public void run() {
				// TODO Auto-generated method stub
				MainWindow mw = new MainWindow();
				mw.setVisible(true);
			}
		});
	}
}
