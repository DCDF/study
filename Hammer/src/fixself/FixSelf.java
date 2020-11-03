package fixself;

import java.util.ArrayList;
import java.util.List;

import fixself.observer.imp.Observer;

public class FixSelf {

	private FixSelf() {
	}

	private static class LazyHolder {
		private static final FixSelf instance = new FixSelf();
	}

	private MainThing mainthing = null;

	private List<Observer> observers = new ArrayList<>();
	
	
}
