package kr.jaen.java;

import java.util.*;
import java.io.*;
/** 고객의 데이타를 관리, 저장하는 클래스 */
public class  CustomerDAO{
	private List<Customer> list;
	public CustomerDAO(){
		list=new ArrayList<Customer>(); 
	}

/** 전달된 고객의 정보를 추가한다.
 * @throws Exception */
	public void addCust( String name,String phone,int hotKey) throws DupException{
		Customer c = search(hotKey);
		if(c==null) list.add(new Customer(name,phone,hotKey));
		else {
			throw new DupException();
			// VM뿐만 아니라 개발자도 에러 발생시킬 수 있어!!
		}
	}
	
/** 고객의 모든 정보를 리턴한다.*/
	public List<Customer> allCust(){
		return list;
	}
	
	/** 이름 검색 메소드*/
	public Customer search(String name){
		for(Customer c : list) {
			if(c.getName().equals(name)) return c;
		}
		return null;
	}
	
	/** 단축키 검색 메소드*/
	public Customer search(int hotKey){
		for(Customer c : list) {
			if(c.getHotKey() == hotKey) return c;
		}		
		return null;
	}
	
	/** 이름 검색, 제거 메소드 */
	public void delete(String name){
		Customer cu=search(name);
		list.remove(cu);
	}
	
	/** 단축키를 검색, 제거 메소드*/
	public void delete(int hotKey){
		Customer c = search(hotKey);
		list.remove(c);
	}

	/** 이름 검색하여 번호, 주소를 수정한다. 동명이인 없음 가정
	 * @throws Exception */
	public void updateCust( String name,String phone,int hotKey) throws Exception{
		Customer c = search(name);
		if (c!=null) c.setPhone(phone);
		else throw new Exception();
		
	}
}

