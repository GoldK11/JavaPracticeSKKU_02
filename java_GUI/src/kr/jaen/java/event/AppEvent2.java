package kr.jaen.java.event;
import java.awt.*;
import java.awt.event.*;

class AppEvent2{
	Frame mainWin;
	Button b;
	TextField tf;
	AppEvent2(){
		createGUI();
		addEvent();
	}
	public void createGUI(){
		mainWin = new Frame("First Frame");
		b = new Button("Press me!!");
		tf=new TextField(30);
		mainWin.add(b);
		mainWin.add(tf,"South");
		mainWin.setSize(200, 100);     
		mainWin.setVisible(true);       
   }
   public void addEvent(){
		b.addActionListener(new EventInner());
		mainWin.addWindowListener(new EventWindow());
	}
   public static void main(String  arg[]) {
		new AppEvent2();
	}
/////Inner
	class EventInner implements ActionListener{
		public void actionPerformed(ActionEvent e){
			tf.setText(" Thankyou!!");
		}
	}
//////Inner
/*
class EventWindow implements WindowListener{
		public void windowClosing(WindowEvent e){
			System.exit(0);
		}
		public void windowOpened(WindowEvent e){}
		public void windowIconified(WindowEvent e){}
		public void windowDeiconified(WindowEvent e){}
		public void windowClosed(WindowEvent e){}
		public void windowActivated(WindowEvent e){}
		public void windowDeactivated(WindowEvent e){}
	}
*/
class EventWindow extends WindowAdapter{
	public void windowClosing(WindowEvent e){
		System.exit(0);
	}
}
}