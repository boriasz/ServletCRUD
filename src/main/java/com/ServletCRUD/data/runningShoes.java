package com.ServletCRUD.data;

import java.util.UUID;

public class runningShoes {
	private UUID id;
	private String brand;
	private String model;
	private String footType;
	private int runnersWeight;
	private float price;
	private String color;
	
	
	
	public runningShoes(String brand, String model, String footType,
			int runnersWeight, float price, String color) {
		super();
		this.id = UUID.randomUUID();
		this.brand = brand;
		this.model = model;
		this.footType = footType;
		this.runnersWeight = runnersWeight;
		this.price = price;
		this.color = color;
	}
	
	public runningShoes(UUID id, String brand, String model, String footType,
			int runnersWeight, float price, String color) {
		super();
		this.id = id;
		this.brand = brand;
		this.model = model;
		this.footType = footType;
		this.runnersWeight = runnersWeight;
		this.price = price;
		this.color = color;
	}

	public runningShoes() {
		super();
	}

	public UUID getId() {
		return id;
	}
	
	public void setId(UUID id) {
		this.id = id;
	}

	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getFootType() {
		return footType;
	}
	public void setFootType(String footType) {
		this.footType = footType;
	}
	public int getRunnersWeight() {
		return runnersWeight;
	}
	public void setRunnersWeight(int runnersWeight) {
		this.runnersWeight = runnersWeight;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	

}
