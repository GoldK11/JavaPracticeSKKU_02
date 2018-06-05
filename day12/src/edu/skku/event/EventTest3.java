package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//�̺�Ʈ�� ������ִ� ��� 3.MyHandler��� ActionListener�ٷ� ����


public class EventTest3 {
	Frame f;
	Button b;
	TextField tf;
	
	public EventTest3() {
		createGUI();
	}
		
	public void createGUI() {

		f = new Frame("Event Test"); // ������ â�� Ÿ��Ʋ�ٿ� ���� ����!
		b = new Button("��ư�� Ŭ���� �ּ���"); //��ư ���� ������ ����!		
		tf = new TextField();
		
		//MyHandler ��� ����Ÿ���� ActionListener ���ִ� ���
		//��� �������̽��� ������ new�ؼ� ������
		//�ٵ� ;���� ������ ������ ���� �� �ȿ� �̿ϼ� �޼��带 �ϼ������ָ� new����!
		//���忡�� �̷��� �������� ���̵� ���� ��������
		ActionListener h = new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("��ư�� Ŭ���Ǿ����ϴ�");
			}	
		}; 
		b.addActionListener(h); 
		
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
		new EventTest3();
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
