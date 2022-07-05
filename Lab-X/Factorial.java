package com.java.Swings;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Factorial implements ActionListener
{
    JTextField jtf1 = new JTextField();
    JTextField jtf2 = new JTextField();
    public Factorial()
    {
        JFrame jf = new JFrame("Find Factorial");
        JPanel jp = new JPanel();

        JLabel jlbl1 = new JLabel("Number:");
        JLabel jlbl2 = new JLabel ("Factorial:");

        JButton jbtn = new JButton("Compute");

        jlbl1.setBounds(10, 10, 190,20);
        jlbl2.setBounds(10, 40, 190,20);
        jbtn.setBounds(100,90,170,30);
        jtf1.setBounds(200, 10, 150, 30);
        jtf2.setBounds(200, 40, 150, 30);

        jf.add(jp);
        jp.add(jlbl1);
        jp.add(jtf1);
        jp.add(jlbl2);
        jp.add(jtf2);
        jp.add(jbtn);

        jtf2.setEditable(false);
        jbtn.addActionListener(this);
        jf.setContentPane(jp);
        jf.setLayout(null);
        jf.setSize(400,200);
        jf.setVisible(true);
    }
    public static void main(String[] args)
    {
        Factorial fact = new Factorial();
    }
    public void actionPerformed(ActionEvent e)
    {
        int a= Integer.parseInt(jtf1.getText());
        int  facto = 1;
        for (int i=1;i<=a;i++)
        {
            facto = facto*i;
        }
        jtf2.setText(Integer.toString(facto));
    }
}