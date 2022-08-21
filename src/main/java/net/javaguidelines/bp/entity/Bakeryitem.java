package net.javaguidelines.bp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "bakeryitems")
public class Bakeryitem {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private long id;
	
	@Column(name= "item_name", nullable=false)
	private String itemName;
	
	@Column(name= "quant")
	private int quantity;
	
	@Column(name= "address")
	private String address;
	
	
	public Bakeryitem() {
		
	}
	public Bakeryitem(String itemName, int quantity, String address) {
		super();
		this.itemName = itemName;
		this.quantity = quantity;
		this.address = address;
		System.out.println(itemName);
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	
	

}
