package com.wolken.wolkenapp.DTO;

public class BiscuitsDTO implements Comparable<BiscuitsDTO>{
	private int id;
	private int price;
	private String name;
	private String brand;
	private int quantity;
	
	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public BiscuitsDTO() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	@Override 
	public String toString() {
		return "BiscuitsDTO: Id-"+id+" price-"+price+" name-"+name+" brand"+brand+" quantity"+quantity;
	}
	@Override
	public int hashCode() {
		return this.id;
	}
	@Override
	public int compareTo(BiscuitsDTO o) {
		// TODO Auto-generated method stub
	
		return this.hashCode()-o.hashCode();
	}
}
