package com.hammer.principle.open_close_principle.a6_2.kuozhan;

import com.hammer.principle.open_close_principle.a6_2.base.NovelBook;

//目前需求修改,需要对小说打折处理,则扩展
public class OffNovelBook extends NovelBook {

	public OffNovelBook(int price, String name, String author) {
		super(price, name, author);
	}

	public int getPrice() {
		int basePrice = super.getPrice();
		int offPrice = 0;
		if (basePrice > 4000) {
			offPrice = basePrice * 90 / 100;
		} else {
			offPrice = basePrice * 80 / 100;
		}
		return offPrice;
	}
}
