package com.java.orders.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="customers")
public class Customers {
@Id
@GeneratedValue(strategy=GenerationType.IDENTITY)	
private long id;

@Column(name="custId")
private int custId;

@Column(name="firstName")
private String firstName;

@Column(name="lastName")
private String lastName;

@Column(name="address")
private String address;

@Column(name="email")
private String email;

@Column(name="mobile")
private long mobile;

public Customers() {
	
}
public Customers(int custId,String firstName,String lastName,String address,String email,Long mobile) {
	this.custId=custId;
	this.firstName=firstName;
	this.lastName=lastName;
	this.address=address;
	this.email=email;
	this.mobile=mobile;
}

public long getId() {
	return id;
}

public void setId(long id) {
	this.id = id;
}

public int getCustId() {
	return custId;
}

public void setCustId(int custId) {
	this.custId = custId;
}

public String getFirstName() {
	return firstName;
}

public void setFirstName(String firstName) {
	this.firstName = firstName;
}

public String getLastName() {
	return lastName;
}

public void setLastName(String lastName) {
	this.lastName = lastName;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public long getMobile() {
	return mobile;
}

public void setMobile(long mobile) {
	this.mobile = mobile;
}


}
