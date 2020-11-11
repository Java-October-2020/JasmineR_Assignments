package com.jasmine.productsCategories.models;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.PostPersist;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name="products")
public class Product {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private String id;
	private String name;
	private String description;
	private double price;
	@Column(updatable=false)
	private Date createdAt;
	private Date updatedAt; 
	@OneToMany(mappedBy="product", fetch = FetchType.LAZY)
    @JsonIgnore
	private List<Association> categoriesproducts; 
	public Product() {
		
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public List<Association> getCategoriesproducts() {
		return categoriesproducts;
	}
	public void setCategoriesproducts(List<Association> categoriesproducts) {
		this.categoriesproducts = categoriesproducts;
	}
	@PrePersist
	protected void onCreate() {
		this.createdAt = new Date();
	}
	@PostPersist
	protected void onUpdate() {
		this.updatedAt = new Date();
	}
	
}
