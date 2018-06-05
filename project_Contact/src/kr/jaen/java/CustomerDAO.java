package kr.jaen.java;

import java.util.*;
import java.io.*;
/** ������ ����Ÿ�� ����, �����ϴ� Ŭ���� */
public class  CustomerDAO{
	private List<Customer> list;
	public CustomerDAO(){
		list=new ArrayList<Customer>(); 
	}

/** ���޵� ������ ������ �߰��Ѵ�.*/
	public void addCust( String name,String phone,int hotKey){
		list.add(new Customer(name,phone,hotKey));
	}
	
/** ������ ��� ������ �����Ѵ�.*/
	public List<Customer> allCust(){
		return list;
	}
	
	/** �̸� �˻� �޼ҵ�*/
	public Customer search(String name){
		for(Customer c : list) {
			if(c.getName().equals(name)) return c;
		}
		return null;
	}
	
	/** ����Ű �˻� �޼ҵ�*/
	public Customer search(int hotKey){
		for(Customer c : list) {
			if(c.getHotKey() == hotKey) return c;
		}		
		return null;
	}
	
	/** �̸� �˻�, ���� �޼ҵ� */
	public void delete(String name){
		Customer cu=search(name);
		list.remove(cu);
	}
	
	/** ����Ű�� �˻�, ���� �޼ҵ�*/
	public void delete(int hotKey){
		Customer c = search(hotKey);
		list.remove(c);
	}

	/** �̸� �˻��Ͽ� ��ȣ, �ּҸ� �����Ѵ�. �������� ���� ����*/
	public void updateCust( String name,String phone,int hotKey){
		Customer c = search(name);
		c.setPhone(phone);
		
	}
}
