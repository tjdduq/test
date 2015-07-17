package com.bean;

import java.util.ArrayList;

public class EchoBean {
	//property
	private int num; 
	private String name;
	
	ArrayList list; 
	public EchoBean(ArrayList list) {
		super();
		this.list = list;
	}

	public EchoBean(int num, String name, ArrayList list) {
		super();
		this.num = num;
		this.name = name;
		this.list = list;
	}

	public ArrayList getList() {
		return list;
	}

	public void setList(ArrayList list) {
		this.list = list;
	}

	//contractor injection
	public EchoBean(int num) {
		System.out.println("echobean(n)  생성자"+ num);
		this.num = num;
	}
//	public EchoBean(String name) {
//		System.out.println("echobean(n) kk 생성자"+ name);
//		this.name = name;
//	}
	
	public EchoBean() {
		super();
		System.out.println("EchoBean 생성");
	}
	public int getNum() {
		return num;
	}

	public void setNum(int num) {
		this.num = num;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public EchoBean(int num, String name) {
		System.out.println("2개 "+num + name);
		this.num = num;
		this.name = name;
	}
	public String sayEcho(String mesg){
		return "Hello"+mesg;
	}

}
