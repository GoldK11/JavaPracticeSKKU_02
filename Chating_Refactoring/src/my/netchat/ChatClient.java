package my.netchat;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.io.*;

public class  ChatClient extends Frame implements ActionListener{

	private TextArea ta=new TextArea();
	private TextField tf = new TextField();
	private Button b1=new Button("Send");
	private Button b2=new Button("Exit");
	private Panel p=new Panel();
	
	private ChatConnect  cc;

	public ChatClient(String ip, int port, String name){
		createGUI();
		cc=new ChatConnect(this,ip,port, name);
	}
	//GUI 생성하고 Event 등록,처리
	public void createGUI(){
		p.add(b1);
		p.add(b2);
		add( ta,"West" );
		add(p,"Center");		
		add( tf, "South");		
		tf.addActionListener( this );//Event 등록
		setBounds( 200,200,500,400 );
		setVisible( true );
		b1.addActionListener(this);//Event 등록
		b2.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent ae){
					System.exit(0);
		    }
		});
		
		addWindowListener( new WindowAdapter() {
				public void windowClosing( WindowEvent we ) {
					System.exit(0);
				}
		});
		tf.requestFocus();
	}
	public void show(String msg){
		ta.append(msg);
	}
	public void actionPerformed( ActionEvent ae ) {
		String msg=tf.getText().trim();
		cc.send(msg);
	}
	public static void main(String[] args) 	{
		String ip = "192.168.10.33"; //원격 접속 서버 ip 확인
		int port = 5500;
		String name = "userID";
		new ChatClient( ip,port,name );
	}
}//outer










