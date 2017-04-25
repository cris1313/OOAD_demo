package org.cris.dicegame.gui;

import org.cris.dicegame.classes.DiceGame;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainWindow extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5560233305329289994L;
	JPanel mainPanel;
	public MainWindow() {
		// TODO Auto-generated constructor stub
		init();
	}
	public void init(){
		mainPanel = new JPanel();
		mainPanel.setLayout(new GridLayout(4, 2));
		
		JLabel dice1=new JLabel("Dice  one");
		JLabel dice2 = new JLabel("Dice  two");
		JLabel sum  = new JLabel(" Sum ");
		final JTextField j1 = new JTextField(12);
		final JTextField j2 = new JTextField(12);
		final JTextField j3 = new JTextField(12);
		JButton playButton = new JButton("play");
		
		mainPanel.add(dice1);
		mainPanel.add(j1);
		mainPanel.add(dice2);
		mainPanel.add(j2);
		mainPanel.add(sum);
		mainPanel.add(j3);
		mainPanel.add(playButton);
		add(mainPanel);
		
		//
		playButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//clear textfiled
				j1.setText("");
				j2.setText("");
				j3.setText("");
				final DiceGame diceGame = new DiceGame();
				diceGame.play();
				
				//set result to the textfiled and use thread to delay display
				
				j1.setText(diceGame.getResult1()+"");
				
				new Thread(){
		            public void run(){
		               try {
		                  Thread.sleep(2000);
		                  j2.setText(diceGame.getResult2()+"");
		                  j3.setText(diceGame.getResult1()+diceGame.getResult2()+"");
		               } catch (InterruptedException e) { }
		            }
		         }.start();
				
				
				
				
				if((diceGame.getResult1()+diceGame.getResult2())%2==1){
					new Thread(){
			            public void run(){
			               try {
			                  Thread.sleep(4000);
			                  JOptionPane.showMessageDialog(mainPanel,"you win");
			               } catch (InterruptedException e) { }
			            }
			         }.start();
					
				}
				else
					new Thread(){
		            public void run(){
		               try {
		                  Thread.sleep(4000);
		                  JOptionPane.showMessageDialog(mainPanel,"you lose");
		               } catch (InterruptedException e) { }
		            }
		         }.start();
					
			}
		});
		
		
		pack();
		setTitle("Dice Game");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
}
