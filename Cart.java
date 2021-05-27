package com.nt.pojo;

import java.util.List;

public class Cart 
{
	int id;
	String name;
	List<Items> items;
	
	public Cart()
	{
		
	}
	
	public Cart(int id, String name, List<Items> items) 
	{
		super();
		this.id = id;
		this.name = name;
		this.items = items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Items> getItems() {
		return items;
	}

	public void setItems(List<Items> items) {
		this.items = items;
	}

	@Override
	public String toString() 
	{
		return "Cart [id=" + id + ", name=" + name + ", items=" + items + "]";
	}
	
}
