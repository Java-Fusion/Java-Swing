package swing;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.AbstractButton;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class gui implements ActionListener {
JTextField a;
JTextField b;
//JButton b1;
//JButton b2;
//JPanel jp;
public gui() {
	JFrame jf=new JFrame();
	JPanel jp =new JPanel();
	JLabel jl=new JLabel("Enter the temperature");
	JLabel jli=new JLabel("Converted to ");
	a=new JTextField(10);
	b=new JTextField(10);
	JButton b1=new JButton("Convert to Fahrenheit");
	JButton b2 = new JButton("Convert to Celcius");
	jl.setBounds(10,10,190,30);
	a.setBounds(200,10,150,30);
	jli.setBounds(10,40,190,30);
	b .setBounds(200,40,150,30);
	b1.setBounds(40,90,170,30);
	b2.setBounds(40, 150, 170, 30);
	b.setEditable(true);
	a.setEditable(true);
	jp.add(jl);
	jp.add(a);
	jp.add(jli);
	jp.add(b);
	jp.add(b1);
	jp.add(b2);



	b1.addActionListener(this);
	b2.addActionListener(this);
	jf.setContentPane(jp);
	jf.setSize(400,300);
	jf.setLayout(null);
	jf.setVisible(true);


	}

public static void main(String args[]){
		gui r=new gui();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

			//	Object o=e.getSource();



				if(e.getActionCommand()=="Convert to Celcius") {
				float fr=Float.parseFloat(a.getText());
				float cl=(float) ((fr-32.0)*(5.0/9.0));
				b.setText(Float.toString(cl));

			}
				else if(e.getActionCommand()=="Convert to Fahrenheit") {
					float cel=Float.parseFloat(a.getText());
					float far=(float)(9.0/5.0)*cel+32;
					b.setText(Float.toString(far));
			}
			}
} 