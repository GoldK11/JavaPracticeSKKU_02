package kr.jaen.java;
import java.awt.*;
import java.awt.event.*;
class MyApp2 {  //��ǥ�� ���� container ��ġ�� ũ�� ����
   public static void main(String arg[]) {
      Frame  mainWin = new Frame("First Frame");
      Button  b = new Button("OK");

      mainWin.setLayout(null); //frame�ȿ� layout�� ��ġ�� �˷����� ����
      //�ϳ��ϳ� ��� � ������� �׸��� �˷���� ��
      //����Ǵ� ����� �ƴϴ� �̷��� ������!
      
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