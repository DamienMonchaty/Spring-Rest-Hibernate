package com.example.demo.entities;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.Id;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Column;

@Entity
@Table(name="role")
public class Role implements Serializable {
	
	@Id 
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="role_id")
	private int role_id;
	@Column(name="role")
	private int role;
	
	public int getId() {
		return role_id;
	}
	public void setId(int role_id) {
		this.role_id = role_id;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
	
	

}
