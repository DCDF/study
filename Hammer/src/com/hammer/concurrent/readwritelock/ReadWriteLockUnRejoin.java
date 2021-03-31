package com.hammer.concurrent.readwritelock;

/**
 * 不可重入锁
 *
 */
public class ReadWriteLockUnRejoin {
	private int readers = 0;
	private int writers = 0;
	private int writeRequests = 0;

	public synchronized void lockRead() throws InterruptedException {
		while (writers > 0 || writeRequests > 0) {
			wait();
		}
		readers++;
	}

	public synchronized void unlockRead() {
		readers--;
		notifyAll();
		//notify可能导致在有等待写锁的线程情况下唤醒一个等待读锁的线程,唤醒后会继续进入等待状态,导致型号丢失(waitnotify.misssignals包下MyWaitNotify.java)
	}

	public synchronized void lockWrite() throws InterruptedException {
		writeRequests++;

		while (readers > 0 || writers > 0) {
			wait();
		}
		writeRequests--;
		writers++;
	}

	public synchronized void unlockWrite() throws InterruptedException {
		writers--;
		notifyAll();
		//notify可能导致在有等待写锁的线程情况下唤醒一个等待读锁的线程,唤醒后会继续进入等待状态,导致型号丢失(waitnotify.misssignals包下MyWaitNotify.java)
		//在这里还有个好处是在调用unlockWrite后,没有其他写锁的情况下所有读锁都能马上获得
	}
}