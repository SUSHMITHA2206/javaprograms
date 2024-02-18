package com.java.violations.model;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;



@Entity
@Table(name="violations")

public class Violations {
 @Id
 @GeneratedValue(strategy=GenerationType.IDENTITY)
 
 private Long id;
 
 @Column(name="vno")
 private int vno;
 
 @Column(name="vcat")
 private String vcat;
 
 @Column(name="Amount")
 private int Amount;
 
 @Column(name="location")
 private String location;
 
 @Column(name="vdate")
 private Date vdate;
 
 public Violations() {
	 
 }
	
 public Violations(int vno,String vcat,int Amount,String location,Date vdate) {
	 this.vno=vno;
	 this.vcat=vcat;
	 this.Amount=Amount;
	 this.location=location;
	 this.vdate=vdate;
 }

public Long getId() {
	return id;
}

public void setId(Long id) {
	this.id = id;
}

public int getVno() {
	return vno;
}

public void setVno(int vno) {
	this.vno = vno;
}

public String getVcat() {
	return vcat;
}

public void setVcat(String vcat) {
	this.vcat = vcat;
}

public int getAmount() {
	return Amount;
}

public void setAmount(int amount) {
	Amount = amount;
}

public String getLocation() {
	return location;
}

public void setLocation(String location) {
	this.location = location;
}

public Date getVdate() {
	return vdate;
}

public void setVdate(Date vdate) {
	this.vdate = vdate;
}
}
