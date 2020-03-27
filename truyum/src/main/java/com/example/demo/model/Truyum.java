package com.example.demo.model;

public class Truyum {
	private int sno;
	private String name;
	private String price;
	private String active;
	private String category;
	private String freeDelivery;

	public Truyum() {
		super();
	}

	public Truyum(int sno, String name, String price, String active, String category, String freeDelivery) {
		super();
		this.sno = sno;
		this.name = name;
		this.price = price;
		this.active = active;
		this.category = category;
		this.freeDelivery = freeDelivery;
	}

	public int getSno() {
		return sno;
	}

	public void setSno(int sno) {
		this.sno = sno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getActive() {
		return active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public String getFreeDelivery() {
		return freeDelivery;
	}

	public void setFreeDelivery(String freeDelivery) {
		this.freeDelivery = freeDelivery;
	}

}
