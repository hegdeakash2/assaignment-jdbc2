package com.hotelapp.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
@Entity
public class Item {
	@Id
	@GeneratedValue(generator="item_gen",strategy =GenerationType.AUTO )
	@SequenceGenerator(name="item_gen",sequenceName  ="item_sequence",initialValue=1,allocationSize=1)
	
	private Integer itemId;
	
	@Column(name="itemname",length=20)
	private String itemName;
	
	@Column(name="category",length=20)
	@Enumerated(EnumType.STRING)
	private Category category;
	
	
	@Column(length=20)
	private String cuisine;
	
	@Column(name="itemtype",length=20)
	@Enumerated(EnumType.STRING)
	private Category itemType;
	
	private double price;

	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Integer itemId, String itemName, Category category, String cuisine, Category itemType, double price) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.category = category;
		this.cuisine = cuisine;
		this.itemType = itemType;
		this.price = price;
	}

	public Item(String itemName, Category category, String cuisine, Category itemType, double price) {
		super();
		this.itemName = itemName;
		this.category = category;
		this.cuisine = cuisine;
		this.itemType = itemType;
		this.price = price;
	}

	public Integer getItemId() {
		return itemId;
	}

	public void setItemId(Integer itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public String getCuisine() {
		return cuisine;
	}

	public void setCuisine(String cuisine) {
		this.cuisine = cuisine;
	}

	public Category getItemType() {
		return itemType;
	}

	public void setItemType(Category itemType) {
		this.itemType = itemType;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", category=" + category + ", cuisine=" + cuisine
				+ ", itemType=" + itemType + ", price=" + price + "]";
	}
	
	
	
	
	
	

}
