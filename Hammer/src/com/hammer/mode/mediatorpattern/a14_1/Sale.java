package com.hammer.mode.mediatorpattern.a14_1;

import java.util.Random;

public class Sale {

	public void sellIBMComputer(int number) {
		Stock stock = new Stock();

		Purchase purchase = new Purchase();

		if (stock.getStockNumber() < number) {
			purchase.buyIBMcomputer(number);
		}

		System.out.println("销售:" + number);

		stock.decrease(number);

	}

	public int getSaleStatus() {
		Random rand = new Random(System.currentTimeMillis());
		int saleStatus = rand.nextInt(100);
		System.out.println("状态(1~100分):" + saleStatus);
		return saleStatus;
	}

	public void offSale() {
		Stock stock = new Stock();
		System.out.println("清仓:" + stock.getStockNumber());
	}
}
