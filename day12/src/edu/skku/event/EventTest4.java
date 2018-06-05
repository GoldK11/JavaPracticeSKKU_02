package edu.skku.event;

import java.awt.Button;
import java.awt.Frame;
import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;
//�̺�Ʈ�� ������ִ� ��� 4. 3���� ���� ���� h ���� ���ϰ� �׳� �־���
// WindowAdapter
public class EventTest4 {
	Frame f;
	Button b;
	TextField tf;
	
	public EventTest4() {
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
		//�̰� ��ģ���̾�;;;;;�ٵ� ���̵� ��,,,,
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tf.setText("��ư�� Ŭ���Ǿ����ϴ�");
			}	
		}); 
		
		//f.setLayout(new FlowLayout()); 
		//���� �� �Ⱦ��� ����Ʈ�� border layout�̴�
		
		//��ư�� add���ְ�
		f.add(b, "Center");
		f.add(tf,"South");
		f.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				System.exit(0); // 0 �ָ� ���������� �ý��� ����
			}
		});
		
		//ȭ������ �������� ������ �������ְ� visible true�� �ֱ�
		f.setSize(300,300);
		f.setVisible(true);
	}
	public static void main(String[] args) {
		new EventTest4();
	}
	

	//�̰� �ϳ��ϳ� �� �ʱ�ȭ���ֱ� ����ϱ�
	// ���ʿ� �� �� ������ �ϼ��س��� abstract class WindowAdapter ��� class�ִ�
	// �׷��ϱ� �� �� �ϳ������� ���Ÿ� WindowAdapter�� ��ӹ���

}
