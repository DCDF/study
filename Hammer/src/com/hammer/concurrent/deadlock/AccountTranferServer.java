package com.hammer.concurrent.deadlock;

import java.util.Arrays;
import java.util.concurrent.TimeUnit;

public class AccountTranferServer {

	//通过按照自然顺序排序,规避了from给to转账时双方先拿自己锁后再去拿对方的锁
	//排序后,拿锁的顺序固定了,不会死锁
	public boolean tran(Account from, Account to, int num) throws InterruptedException{
		Account[] arr = new Account[] { from, to };
		Arrays.sort(arr);
		try {
			if (arr[0].monitor.tryLock(1, TimeUnit.SECONDS)) {
				if (arr[1].monitor.tryLock(1, TimeUnit.SECONDS)) {
					try {
						if (from.withdraw(num)) {
							to.deposit(num);
							return true;
						} else {
							return false;
						}
					} finally {
						arr[1].monitor.unlock();
					}
				}
			}
		} finally {
			arr[0].monitor.unlock();
		}
		return true;
	}
}
