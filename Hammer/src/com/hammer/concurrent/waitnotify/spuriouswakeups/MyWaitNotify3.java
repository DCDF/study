package com.hammer.concurrent.waitnotify.spuriouswakeups;

import com.hammer.concurrent.waitnotify.MonitorObject;

public class MyWaitNotify3 {

	MonitorObject myMonitorObject = new MonitorObject();
	boolean wasSignalled = false;

	public void doWait() {
		synchronized (myMonitorObject) {
			//等待线程没有收到信号就被唤醒时,此时的wasSignalled还是为false,while会再次进入循环调用wait让线程回到等待状态
			while (!wasSignalled) {//保存信号的成员变量在while中而不是if中,这种叫自旋锁(自旋会消耗CPU,谨慎)
				try {
					myMonitorObject.wait();
				} catch (InterruptedException e) {
				}
			}
			// clear signal and continue running.
			wasSignalled = false;
		}
	}

	public void doNotify() {
		synchronized (myMonitorObject) {
			wasSignalled = true;
			myMonitorObject.notify();
		}
	}
}