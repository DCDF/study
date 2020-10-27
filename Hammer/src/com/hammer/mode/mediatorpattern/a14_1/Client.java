package com.hammer.mode.mediatorpattern.a14_1;

public class Client {
	public static void main(String[] args) {
		System.out.println("开始采购");
		Purchase purchase = new Purchase();
		purchase.buyIBMcomputer(100);
		System.out.println("开始销售");
		Sale sale = new Sale();
		sale.sellIBMComputer(1);
		System.out.println("管理库存");
		Stock stock = new Stock();
		stock.cleanStock();
	}
}
