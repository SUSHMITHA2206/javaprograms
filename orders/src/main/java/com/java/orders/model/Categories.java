package com.java.orders.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;

import jakarta.persistence.*;


@Entity
@Table(name = "categorie")
public class Categories {
	
 public Categories(long id, String categoryName, String description) {
  super();
  this.categoryId = id;
  this.categoryName = categoryName;
  this.description = description;
 }


 @Id
 @GeneratedValue(strategy = GenerationType.IDENTITY)
 private long categoryId;
	
 @Column(name = "categoryName")
 private String categoryName;

 @Column(name = "description")
 private String description;
	
// @JsonManagedReference
 @JsonIgnore
 @OneToMany(mappedBy = "category")
private List<Products> products;
	
 public Categories() {
  
 }

 public String getCategoryName() {
  return categoryName;
 }


 public void setCategoryName(String categoryName) {
  this.categoryName = categoryName;
 }


 public String getDescription() {
  return description;
 }


 public void setDescription(String description) {
  this.description = description;
 }


 public long getCategoryId() {
  return categoryId;
 }


 public void setCategoryId(long categoryId) {
  this.categoryId = categoryId;
 }

 @Override
 public String toString() {
  return "Categories [categoryId=" + categoryId + ", categoryName=" + categoryName + ", description="
    + description + ", getCategoryName()=" + getCategoryName()
    + ", getDescription()=" + getDescription() + ", getCategoryId()=" + getCategoryId() + "]";
 }

 public List<Products> getProducts() {
  return products;
 }

 public void setProducts(List<Products> products) {
  this.products = products;
 }

	
	
}