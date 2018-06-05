package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;

class AppLayout1{
  Frame mainWin;
  Button a,b,c,d,cen;
   AppLayout1(){
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

		mainWin.add("Center",cen);
		mainWin.add("North",a);
		mainWin.add(b,BorderLayout.SOUTH);
		mainWin.add(c,"West");
		mainWin.add(d,"East");
	
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
		AppLayout1  ev=new AppLayout1();
	}
//////Inner
class EventInner implements ActionListener
	{
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
