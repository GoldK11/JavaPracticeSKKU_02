package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class EventTest {
	Frame f;
	Button b;
	Button b2;  //���� Ÿ�� �� �ٿ� ������ �ᵵ �Ǳ��Ѵ�
	TextField tf;
	
	public EventTest() {
		createGUI();
	}
		
	public void createGUI() {

		f = new Frame("Event Test"); // ������ â�� Ÿ��Ʋ�ٿ� ���� ����!
		b = new Button("��ư�� Ŭ���� �ּ���"); //��ư ���� ������ ����!		
		b2 = new Button("Cancle");
		tf = new TextField();
		b.addActionListener(new MyHandler()); // set�� �޸� ������ ��� ����
		b2.addActionListener(new MyHandler2());
		
		//f.setLayout(new FlowLayout()); 
		//���� �� �Ⱦ��� ����Ʈ�� border layout�̴�
		
		//��ư�� add���ְ�
		f.add(b, "Center");
		f.add(tf,"South");
		f.add(b2,"North");
		f.addWindowListener(new MyHandler3());
		
		//ȭ������ �������� ������ �������ְ� visible true�� �ֱ�
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventTest();
	}
	
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tf.setText("��ư�� Ŭ���Ǿ����ϴ�");
		}
	}
	class MyHandler2 implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tf.setText("��ҵǾ����ϴ�.");
		}
	}
	class MyHandler3 implements WindowListener{
		public void windowOpened(WindowEvent e) {}		
		public void windowClosing(WindowEvent e) {
			System.exit(0); // 0 �ָ� ���������� �ý��� ����
		}
		public void windowClosed(WindowEvent e) {}
		public void windowIconified(WindowEvent e) {}
		public void windowDeiconified(WindowEvent e) {}
		public void windowActivated(WindowEvent e) {}
		public void windowDeactivated(WindowEvent e) {}
		
	}

}
