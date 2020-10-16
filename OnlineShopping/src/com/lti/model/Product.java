package com.lti.model;

public class Product {
	int productId;
	String productName;
	int price;
	
	
	
	public int getPrice(){
		return price;
	}
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	

}
