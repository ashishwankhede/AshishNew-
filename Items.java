package com.nt.pojo;

public class Items 
{
	int id;
	String name;
	
	Items()
	{
		
	}
	
	public Items(int id, String name) 
	{
		super();
		this.id = id;
		this.name = name;
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

	@Override
	public String toString() 
	{
		return "Items [id=" + id + ", name=" + name + "]";
	}
	
}
