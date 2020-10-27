package com.hammer.mode.mediatorpattern.a14_1;

public class Purchase {

	public void buyIBMcomputer(int number) {

		Stock stock = new Stock();

		Sale sale = new Sale();

		int saleStatus = sale.getSaleStatus();

		if (saleStatus > 80) {
			System.out.println("可以,再来" + number + "台");
			stock.increase(number);
		} else {
			int buyNumber = number / 2;
			System.out.println("卖得不好,折半采购:" + buyNumber);
		}
	}

	public void refuseBuyIBM() {
		System.out.println("停止采购");
	}
}
