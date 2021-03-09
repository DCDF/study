package concurrent.cachecoherence;

public class Hammer extends Thread {
	private boolean flag = false;

	public boolean isFlag() {
		return flag;
	}

	@Override
	public void run() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		flag = true;
		System.out.println("flag = " + flag);
	}

}