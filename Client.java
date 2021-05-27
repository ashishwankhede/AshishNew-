package com.nt.Client;

import java.util.ArrayList;

import com.nt.pojo.Cart;
import com.nt.pojo.Items;

public class Client 
{
	public static void main(String[] args) 
	{
		Items item1 = new Items(101,"Laptop");
		Items item2 = new Items(102,"Mobile");
		
		ArrayList<Items> al = new ArrayList<Items>();
		al.add(item1);al.add(item2);
		
		Cart cart1 = new Cart(201,"Electronics Cart",al);
		
		System.out.println(" "+cart1);
	}
}
