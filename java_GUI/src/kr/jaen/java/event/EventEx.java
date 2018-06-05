package kr.jaen.java.event;
import java.awt.*;
import java.awt.event.*;

class EventEx implements ActionListener{///////1
	Frame mainWin;
	Button b;
	TextField tf;
	EventEx(){
		createGUI();
	}
	public void createGUI(){
		mainWin = new Frame("First Frame");
		b = new Button("Press me!!");
		b.addActionListener(this);//////3
		tf=new TextField(30);
		mainWin.add(b);
		mainWin.add(tf,"South");
		mainWin.setSize(200, 100);     
		mainWin.setVisible(true);       
   }
	public static void main(String  arg[]) {
		new EventEx();
	}
	public void actionPerformed(ActionEvent e){////////2
		tf.setText(" Thankyou!!");
	}
}