package org.cris.dicegame.main;

import javax.swing.SwingUtilities;

import org.cris.dicegame.gui.MainWindow;

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
