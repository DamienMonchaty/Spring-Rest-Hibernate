package com.example.demo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.SecondaryTable;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name="cheese")
public class Cheese {
	
	@Id
	@GeneratedValue
	@Column(name="id")
	private Integer id;
	
	@NotNull
	@Size(min=3, max=15)
	@Column(name="nom")
	private String nom;
	
	@NotNull
	@Size(min=1, message="et la description !!!!")
	@Column(name="description")
	private String description;
	
	@ManyToOne
	private Category category;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public Cheese(@NotNull @Size(min = 3, max = 15) String nom,
			@NotNull @Size(min = 1, message = "et la description !!!!") String description) {
		super();
		this.nom = nom;
		this.description = description;
	

	}

	public Cheese() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
	
	

}
