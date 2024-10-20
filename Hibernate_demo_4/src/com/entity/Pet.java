package com.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Pet_record")
public class Pet {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String breed;
	private String color;
	private String favourite_food;
	
	public Pet() {
	}

	public Pet(int id, String breed, String color, String favourite_food) {
		super();
		this.id = id;
		this.breed = breed;
		this.color = color;
		this.favourite_food = favourite_food;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getBreed() {
		return breed;
	}

	public void setBreed(String breed) {
		this.breed = breed;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	public String getFavourite_food() {
		return favourite_food;
	}

	public void setFavourite_food(String favourite_food) {
		this.favourite_food = favourite_food;
	}

	@Override
	public String toString() {
		return "Pet [id=" + id + ", breed=" + breed + ", color=" + color + ", favourite_food=" + favourite_food + "]";
	}

}

