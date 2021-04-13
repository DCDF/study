package com.hammer.concurrent.scheduledexecutortservice;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.TimeUnit;

public class EnergySource {
	private final long MAXLEVEL = 100;
	private long level = MAXLEVEL;

	// 周期性任务的优雅解决方案
	//多个实例共用这个线程池,因为任务轻10个线程数量的小池子就够了
	
	private static final ScheduledExecutorService replenishTimer = Executors.newScheduledThreadPool(10);

	private ScheduledFuture<?> replenishTask;

	private EnergySource() {
	}

	private void init() {
		replenishTask = replenishTimer.scheduleAtFixedRate(new Runnable() {

			@Override
			public void run() {
				replenish();
			}
		}, 0, 1, TimeUnit.SECONDS);
	}

	public static EnergySource create() {
		final EnergySource energySource = new EnergySource();
		energySource.init();
		return energySource;
	}

	public long getUnitsAvailable() {
		return level;
	}

	public boolean useEnergy(final long units) {
		if (units > 0 && level >= units) {
			level -= units;
			return true;
		}
		return false;
	}

	public synchronized void stopEnergySource() {
		replenishTask.cancel(false);
	}

	private void replenish() {
		if (level < MAXLEVEL) {
			level++;
		}
	}
	
	//默认情况下replenishTime的执行线程都是非守护线程,JVM不会替我们停掉
	//第一种方法
	public static void shutdown() {
		replenishTimer.shutdown();
		//以创建的energysource实例处理
	}
	//第二种方法,给newScheduledThreadPool传额外的ThreadFactory参数
	private static final ScheduledExecutorService timer2 = Executors.newScheduledThreadPool(10, new ThreadFactory() {
		
		@Override
		public Thread newThread(Runnable r) {
			Thread thread = new Thread(r);
			thread.setDaemon(true);//守护线程
			return thread;
		}
	});
}
