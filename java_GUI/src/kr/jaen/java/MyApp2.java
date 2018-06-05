package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp2 {  //좌표를 통한 container 위치와 크기 조절
   public static void main(String arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");

      mainWin.setLayout(null); //frame안에 layout의 위치를 알려주지 않음
      //하나하나 어디에 어떤 사이즈로 그릴지 알려줘야 함
      //권장되는 방법은 아니다 이렇게 쓰지마!
      
      mainWin.add(b);
      b.setSize(50, 30);               
      b.setLocation(30, 30);          

      mainWin.setSize(200,100);     
      mainWin.setVisible(true); 
	  // event handling...
	  mainWin.addWindowListener(new WindowAdapter(){
		  public void windowClosing(WindowEvent e){
			  System.exit(0);
		  }
	  });
   }
}