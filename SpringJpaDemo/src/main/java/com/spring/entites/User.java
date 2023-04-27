package com.spring.entites;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="User_Table")
public class User {
	
	@Column(name="name_user")
	private String name;
	@Id
	private int id;
	@Column(name="cust_no")
	private int custNo;
	
	public User(String name, int id, int custNo) {
		super();
		this.name = name;
		this.id = id;
		this.custNo = custNo;
	}
	
	@Override
	public String toString() {
		return "User [name=" + name + ", id=" + id + ", custNo=" + custNo + "]";
	}
	

	public User() {
		super();
		// TODO Auto-generated constructor stub
	}

	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getCustNo() {
		return custNo;
	}
	public void setCustNo(int custNo) {
		this.custNo = custNo;
	}
	

}
