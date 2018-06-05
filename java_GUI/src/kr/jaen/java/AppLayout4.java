package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;

//Grid를 두 번 쓴 layout(panel이용)

class AppLayout4{
  Frame mainWin;
  Button a,b,c,d,cen;
   AppLayout4(){
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
		mainWin.add(cen); //위에는 센터만 있는 그리드
		mainWin.add(menu); //아래는 그리드로 4구역을 나눈걸 담은 패널을 넣은 그리드
	
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
		AppLayout4  ev=new AppLayout4();
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
