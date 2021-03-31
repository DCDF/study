package com.hammer.concurrent.waitnotify.misssignals;

import com.hammer.concurrent.waitnotify.MonitorObject;

/**
 * 丢失的信号(wait调用在notify之后,导致错过信号)
 * 
 * @author Hammer
 */
public class MyWaitNotify {

	MonitorObject myMonitorObject = new MonitorObject();
	boolean wasSignalled = false;

	public void doWait() {
		synchronized (myMonitorObject) {
			if (!wasSignalled) {
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
