package edu.skku.ui;

import java.awt.Button;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextField;

public class UiTest {
	public static void main(String[] args) {
	Button b1= new Button("OK1");
	Button b2= new Button("OK2");
	Button b3= new Button("OK3");
	
	Label b4= new Label("OK4");
	TextField b5 =new TextField("OK5");
	
	Frame f = new Frame("Test");
	
	
	f.add(b1);
	f.add(b2);
	f.add(b3);
	f.add(b4);
	f.add(b5);
	
	//layout변경
	f.setLayout(new FlowLayout());
	//화면표시
	
	f.setSize(300,200);
	
	f.setVisible(true);

	}
	
}
