package com.example.demo.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="category")
public class Category {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	

	@Size(min=3,max=15)
	@Column(name="title")
	private String title;
	
	@OneToMany
	@JoinColumn(name="category_id")
	private List<Cheese> cheeses = new ArrayList<>();

	public Category() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Category(@NotNull @Size(min = 3, max = 15) String title) {
		super();
		this.title = title;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Cheese> getCheeses() {
		return cheeses;
	}	
}
