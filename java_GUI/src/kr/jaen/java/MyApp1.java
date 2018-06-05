package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;

class MyApp1 {
   public static void main(String  arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");
      Button  b2 = new Button("CANCEL");

	  mainWin.setLayout(new FlowLayout() ); //Layout 변경
	  mainWin.add(b);
	  mainWin.add(b2);

      mainWin.setSize(200, 100);     
      mainWin.setVisible(true);
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0); //이거 있으면 x버튼 누름 꺼진다
		  }
	  });
   }
}