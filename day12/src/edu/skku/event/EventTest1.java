package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//�̺�Ʈ�� ������ִ� ��� 1. Member Nested Class


public class EventTest1 {
	Frame f;
	Button b;
	TextField tf;
	
	public EventTest1() {
		createGUI();
	}
		
	public void createGUI() {

		f = new Frame("Event Test"); // ������ â�� Ÿ��Ʋ�ٿ� ���� ����!
		b = new Button("��ư�� Ŭ���� �ּ���"); //��ư ���� ������ ����!		
		tf = new TextField();
		b.addActionListener(new MyHandler()); // set�� �޸� ������ ��� ����
		
		//f.setLayout(new FlowLayout()); 
		//���� �� �Ⱦ��� ����Ʈ�� border layout�̴�
		
		//��ư�� add���ְ�
		f.add(b, "Center");
		f.add(tf,"South");
		f.addWindowListener(new MyHandler3());
		
		//ȭ������ �������� ������ �������ְ� visible true�� �ֱ�
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventTest1();
	}
	
	//Inner class
	// Member Nested class
	class MyHandler implements ActionListener{
		public void actionPerformed(ActionEvent e) {
			tf.setText("��ư�� Ŭ���Ǿ����ϴ�");
		}
	}
	
	//Inner class
	// Member Nested class
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
