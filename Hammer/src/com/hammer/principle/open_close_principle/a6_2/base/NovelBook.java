package com.hammer.principle.open_close_principle.a6_2.base;

import com.hammer.principle.open_close_principle.a6_2.base.imp.IBook;

public class NovelBook implements IBook {
	private int price;
	private String name;
	private String author;

	public NovelBook(int price, String name, String author) {
		this.price = price;
		this.name = name;
		this.author = author;
	}

	@Override
	public int getPrice() {
		return price;
	}

	@Override
	public String getName() {
		return name;
	}

	@Override
	public String getAuthor() {
		return author;
	}
}
