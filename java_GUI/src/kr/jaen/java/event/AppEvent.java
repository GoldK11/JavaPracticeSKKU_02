package kr.jaen.java.event;
import java.awt.*;
import java.awt.event.*;

class AppEvent{
  Frame mainWin;
  Button a,b,c,d,cen;
   AppEvent(){
        mainWin = new Frame("First Frame");
		a = new Button("Red");
		a.setBackground(Color.red);		
		b = new Button("Blue");
		b.setBackground(Color.blue);		
		c = new Button("Yellow");
		c.setBackground(Color.yellow);		
		d = new Button("Pink");
		d.setBackground(Color.pink);		
		cen=new Button("center");
		cen.setBackground(Color.white);

		Panel menu=new Panel();
		menu.setLayout(new GridLayout(2,2));
	    menu.add(a);
		menu.add(b);
		menu.add(c);
		menu.add(d);

		mainWin.setLayout(new  GridLayout(2,1));
		mainWin.add(cen);
		mainWin.add(menu);
	
		a.addActionListener(new EventInner());
		b.addActionListener(new EventInner());
		c.addActionListener(new EventInner());
		d.addActionListener(new EventInner());
		
		mainWin.addWindowListener(new WindowAdapter(){
				public void windowClosing(WindowEvent e)
				{
								System.exit(0);
				} 
		});
 
      mainWin.setSize(300, 400);     
      mainWin.setVisible(true);       
   }
   public static void main(String  arg[]) {
		new AppEvent();
	}
	//////Inner
	class EventInner implements ActionListener 	{
			public void actionPerformed(ActionEvent e){
				//if (e.getSource()==a)
				if (e.getActionCommand().equals("Red"))
					cen.setBackground(Color.red);
				if(e.getSource()==b)
					cen.setBackground(Color.blue);			
				if(e.getSource()==c)
					cen.setBackground(Color.yellow);	
				if(e.getSource()==d)
					cen.setBackground(Color.pink);
		}
	}//End Inner
}//End Outer
