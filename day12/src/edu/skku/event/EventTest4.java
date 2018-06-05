package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//이벤트를 만들어주는 방법 4. 3에서 따로 변수 h 생성 안하고 그냥 넣어줌
// WindowAdapter
public class EventTest4 {
	Frame f;
	Button b;
	TextField tf;
	
	public EventTest4() {
		createGUI();
	}
		
	public void createGUI() {

		f = new Frame("Event Test"); // 윈도우 창의 타이틀바에 들어가는 글자!
		b = new Button("버튼을 클릭해 주세요"); //버튼 위에 찍히는 글자!		
		tf = new TextField();
		
		//MyHandler 대신 수퍼타입인 ActionListener 써주는 방법
		//얘는 인터페이스라 원래는 new해서 못쓴다
		//근데 ;으로 문장이 끝나기 전에 블럭 안에 미완성 메서드를 완성시켜주면 new가능!
		//현장에서 이렇게 그지같이 많이들 쓰니 익혀두자
		//이건 미친짓이야;;;;;근데 많이들 써,,,,
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("버튼이 클릭되었습니다");
			}	
		}); 
		
		//f.setLayout(new FlowLayout()); 
		//위에 줄 안쓰면 디폴트는 border layout이다
		
		//버튼을 add해주고
		f.add(b, "Center");
		f.add(tf,"South");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 0 주면 정상적으로 시스템 종료
			}
		});
		
		//화면으로 보여지게 사이즈 지정해주고 visible true값 주기
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventTest4();
	}
	

	//이거 하나하나 다 초기화해주기 힘드니까
	// 애초에 다 빈 블럭으로 완성해놓은 abstract class WindowAdapter 라는 class있다
	// 그러니까 이 중 하나정도만 쓸거면 WindowAdapter를 상속받자

}
