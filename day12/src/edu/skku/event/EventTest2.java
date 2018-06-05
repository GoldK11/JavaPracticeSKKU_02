package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
// 이벤트를 만들어주는 방법 2. MyHandler대신 전체 클래스가 직접 ActionListener를 상속받자
// actionPerformed는 메서드로만 오버라이딩 해주고
// actionListener의 아규면트는 this로 준다

public class EventTest2 implements ActionListener{
	Frame f;
	Button b;
	TextField tf;
	
	public EventTest2() {
		createGUI();
	}
	
	//actionPerformed 오버라이딩
	public void actionPerformed(ActionEvent e) {
		tf.setText("버튼이 클릭되었습니다");
	}
		
	public void createGUI() {

		f = new Frame("Event Test"); // 윈도우 창의 타이틀바에 들어가는 글자!
		b = new Button("버튼을 클릭해 주세요"); //버튼 위에 찍히는 글자!		
		tf = new TextField();
		b.addActionListener(this); // set과 달리 여러개 등록 가능
		
		//f.setLayout(new FlowLayout()); 
		//위에 줄 안쓰면 디폴트는 border layout이다
		
		//버튼을 add해주고
		f.add(b, "Center");
		f.add(tf,"South");
		f.addWindowListener(new MyHandler3());
		
		//화면으로 보여지게 사이즈 지정해주고 visible true값 주기
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventTest2();
	}


	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}		
		public void windowClosing(WindowEvent e) {
			System.exit(0); // 0 주면 정상적으로 시스템 종료
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}

}
