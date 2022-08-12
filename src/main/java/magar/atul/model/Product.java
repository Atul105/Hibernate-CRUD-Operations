package magar.atul.model;

import java.util.Date;

public class Product {

	private int id; //same name as hibernate.hbm.xml -> "name=id"
	
	private String name; //same name as hibernate.hbm.xml -> "name=name"
	private double price; //same name as hibernate.hbm.xml -> "name=price"
	private String desc; //same name as hibernate.hbm.xml -> "name:desc"
	private Date createdAt; //same name as hibernate.hbm.xml -> "name=createdAt"
	private Date modifiedAt; //same name as hibernate.hbm.xml -> "name=modifiedAt"
	
	//constructor
	public Product() { }
	
	public Product(  String name,double price, String desc) {
		super();
		
		this.price = price;
		this.name = name;
		this.desc = desc;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	
	}
	
	public Product(int id,String name,double price, String desc) {
		super();
		this.id =id;
		this.price = price;
		this.name = name;
		this.desc = desc;
		this.createdAt = new Date();
		this.modifiedAt = new Date();
	
	}
	
	public Product(int id) {
		
		this.id =id;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public Date getModifiedAt() {
		return modifiedAt;
	}

	public void setModifiedAt(Date modifiedAt) {
		this.modifiedAt = modifiedAt;
	}

	@Override
	public String toString() {
		return "Product [id=" + id + ", price=" + price + ", name=" + name + ", desc=" + desc + ", createdAt="
				+ createdAt + ", modifiedAt=" + modifiedAt + "]";
	}
	
	
}
	
	
