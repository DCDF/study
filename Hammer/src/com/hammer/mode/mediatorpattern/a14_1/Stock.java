package com.hammer.mode.mediatorpattern.a14_1;

public class Stock {

	private static int COMPUTER_NUMBER = 100;

	public void increase(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER + number;
		System.out.println("库存数量:" + COMPUTER_NUMBER);
	}

	public void decrease(int number) {
		COMPUTER_NUMBER = COMPUTER_NUMBER - number;
		System.out.println("库存数量:" + COMPUTER_NUMBER);
	}

	public int getStockNumber() {
		return COMPUTER_NUMBER;
	}

	public void cleanStock() {
		Purchase purchase = new Purchase();
		Sale sale = new Sale();

		System.out.println("清理存货数量:" + COMPUTER_NUMBER);
		sale.offSale();
		purchase.refuseBuyIBM();
	}
}
