package com.java.Swings;

import javax.swing.*;

import java.awt.*;

public class Layout 
{
	public static void main (String[]args)
	{
		Layout lt = new Layout();
		{
			GridLayout gl = new GridLayout();
			
			JFrame jf = new JFrame("AniFest");
			jf.setSize(250,150);
		
			JPanel jp = new JPanel();
			jf.setLayout(gl);
			GridLayout(2,2);
			
			JLabel j1 = new JLabel("Username:");
			
			JLabel j2 = new JLabel("Password:");
			
			JTextField jtt = new JTextField(10);
			
			JTextField jt = new JTextField(10);
			
			JButton b1 = new JButton("Login");
			//b1.setBounds(100,400,50,50);
			JButton b2 = new JButton("Register");
			//b2.setBounds(200,400,50,50);
			
			jp.add(j1);
			jp.add(jtt);
			jp.add(j2);
			jp.add(jt);
			jp.add(b1);
			jp.add(b2);
			jf.setContentPane(jp);
			
			jf.setVisible(true);
		}
	}

	private static void GridLayout(int i, int j) {
		// TODO Auto-generated method stub
		
	}
			
}