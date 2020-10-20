package com.hammer.principle.open_close_principle.a6_2.kuozhan;

import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;

import com.hammer.principle.open_close_principle.a6_2.base.imp.IBook;

public class BootStore {
	private final static List<IBook> bookList = new ArrayList<IBook>();
	static {
		bookList.add(new OffNovelBook(200, "2元的书", "hammer2"));
		bookList.add(new OffNovelBook(1000, "10元的书", "hammer10"));
		bookList.add(new OffNovelBook(3200, "32元的书", "hammer32"));
		bookList.add(new OffNovelBook(6400, "64元的书", "hammer64"));
	}

	public static void main(String[] args) {
		NumberFormat format = NumberFormat.getCurrencyInstance();
		format.setMaximumFractionDigits(2);
		for (IBook book : bookList) {
			System.err.println("name:" + book.getName() + "\nprice:" + format.format(book.getPrice() / 100.0) + "\n作者:" + book.getAuthor()+"\n");
		}
	}
}
