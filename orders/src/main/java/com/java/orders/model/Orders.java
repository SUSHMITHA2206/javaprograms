package com.java.orders.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "orders")
public class Orders {

@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long id;

@Column(name = "ord_name")
private String ordName;
@Column(name = "ord_id")
private long ord_id;
@Column(name = "quantity")
private int quantity;
@Column(name = "price_item")
private int price_item;
@Column(name = "tord")
private int tord;
@Column(name = "gst")
private int gst;
@Column(name = "ttax")
private int ttax;
@Column(name = "tpit")
private int tpit;

public Orders() {

}

public Orders(String ordName, long ord_id, int quantity, int price_item, int tord, int gst,int tgst,int ttax) {
super();
this.ordName = ordName;
this.ord_id = ord_id;
this.quantity = quantity;
this.price_item = price_item;
this.tord = quantity*price_item;
this.gst = gst;
this.ttax=tord*gst/100;
this.tpit=tord+ttax;

}
public long getId() {
return id;
}

public void setId(long id) {
this.id = id;
}


public String getOrdName() {
return ordName;
}

public void setOrdName(String ordName) {
this.ordName = ordName;
}
public long getOrdId() {
return ord_id;
}

public void setOrdId(long ord_id) {
this.ord_id = ord_id;
}

public int getQuantity() {
return quantity;
}

public void setQuantity(int quantity) {
this.quantity = quantity;
}

public int getPriceItem() {
return price_item;
}

public void setPriceItem(int price_item ) {
this.price_item = price_item;
}

public int getTord() {
return quantity*price_item;
}

public void setTord(int tord) {
this.tord=quantity*price_item;
}

public int getGst() {
return gst;
}

public void setGst(int gst) {
this.gst = gst;
}


public int getTtax() {
return ttax;
}

public void setTtax(int ttax) {
this.ttax = ttax;
}



public int getTpit() {
return tpit;
}

public void setTpit(int tpit) {
this.tpit = tpit;
}
}
