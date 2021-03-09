package concurrent.cachecoherence;

public class CacheCoherenceSynchronized {

	public static void main(String[] args) throws InterruptedException {
		Hammer h = new Hammer();
		h.start();
		for (;;) {
			synchronized (h) {
				if (h.isFlag()) {
					System.out.println("A");
				}
			}
		}
	}

}

