package kr.jaen.java;

import java.util.*;
import java.io.*;
/** ������ ����Ÿ�� ����, �����ϴ� Ŭ���� */
public class  CustomerDAO{
	private List<Customer> list;
	public CustomerDAO(){
		list=new ArrayList<Customer>(); 
	}

/** ���޵� ������ ������ �߰��Ѵ�.
 * @throws Exception */
	public void addCust( String name,String phone,int hotKey) throws DupException{
		Customer c = search(hotKey);
		if(c==null) list.add(new Customer(name,phone,hotKey));
		else {
			throw new DupException();
			// VM�Ӹ� �ƴ϶� �����ڵ� ���� �߻���ų �� �־�!!
		}
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

	/** �̸� �˻��Ͽ� ��ȣ, �ּҸ� �����Ѵ�. �������� ���� ����
	 * @throws Exception */
	public void updateCust( String name,String phone,int hotKey) throws Exception{
		Customer c = search(name);
		if (c!=null) c.setPhone(phone);
		else throw new Exception();
		
	}
}
