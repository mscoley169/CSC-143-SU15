package edu.nashcc.booktest;

public class Book {

	// fields
	private String name;
	private double price;
	
	// constructors
	private Book(){
	// prevents an empty item to be instantiated	
	}
	public Book(String name, double price){
		this.name = name;
		this.price = price;
	}
	
	// getters and setters
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
}
