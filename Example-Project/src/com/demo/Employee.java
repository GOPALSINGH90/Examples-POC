package com.demo;

public class Employee {
	private int id;
	private String companyName;
	private String imageUrl;
	
	
	public Employee(int id, String companyName, String imageUrl) {
		super();
		this.id = id;
		this.companyName = companyName;
		this.imageUrl = imageUrl;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCompanyName() {
		return companyName;
	}
	public void setCompanyName(String companyName) {
		this.companyName = companyName;
	}
	public String getImageUrl() {
		return imageUrl;
	}
	public void setImageUrl(String imageUrl) {
		this.imageUrl = imageUrl;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", companyName=" + companyName + ", imageUrl=" + imageUrl + "]";
	}
	
	
	
}
