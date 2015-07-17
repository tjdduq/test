package com.bean;

public class BoardService {

	DAO dao;
	

	public void setDao(DAO dao) {
		this.dao = dao;
	}
	public String getData(){
		return dao.getData();
	}
}
