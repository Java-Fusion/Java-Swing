package com.java.Swings;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LoginUI 
{
	public LoginUI() 
	{
		
		JFrame jf = new JFrame("AniFest");
		JPanel jp = new JPanel();
			
		JLabel j1 = new JLabel("User Name:");
		j1.setBounds(10, 10, 190, 30);
		
		JLabel j2 = new JLabel("Password :");
		j2.setBounds(10, 40, 190, 30);
		
		JTextField jtt = new JTextField(10);
		jtt.setBounds(200, 10, 150, 30);
		JTextField jt = new JTextField(10);
		jt.setBounds(200, 40, 150, 30);
		
		JButton b1=new JButton("Log in");
		b1.setBounds(15,90,170,30);
		JButton b2 = new JButton("Sign in");
		b2.setBounds(200,90,170,30);
		
		jp.add(j1);
		jp.add(jtt);
		jp.add(j2);
		jp.add(jt);  
		jp.add(b1);
		jp.add(b2);
		
		//jf.pack();
		jf.setContentPane(jp); // finally adding jpanel(child container) to parent container
		jf.setSize(400,160); //setting size of the from to be displayed
		jf.setLayout(null);
		jf.setVisible(true); //enabling the jframe to be displayed
		
	}
	public static void main(String[] args) {
		LoginUI sbd = new LoginUI();
		
	}

}