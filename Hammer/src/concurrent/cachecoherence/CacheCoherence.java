package concurrent.cachecoherence;

public class CacheCoherence {


	public static void main(String[] args) throws InterruptedException {
		Hammer h = new Hammer();
		h.start();
		for(;;) {
			if(h.isFlag()) {
				System.out.println("A");
			}
				
		}
	}

}


