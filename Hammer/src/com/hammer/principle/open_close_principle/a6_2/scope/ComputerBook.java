package com.hammer.principle.open_close_principle.a6_2.scope;

import com.hammer.principle.open_close_principle.a6_2.scope.imp.IComputerBook;

public class ComputerBook implements IComputerBook {

	private int price;
	private String name;
	private String author;
	private String scope;
	public ComputerBook(int price, String name, String author, String scope) {
		this.price = price;
		this.name = name;
		this.author = author;
		this.scope = scope;
	}
	public int getPrice() {
		return price;
	}
	public String getName() {
		return name;
	}
	public String getAuthor() {
		return author;
	}
	public String getScope() {
		return scope;
	}
	
}
