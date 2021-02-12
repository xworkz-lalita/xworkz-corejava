package com.xworkz.frame.exception;

public class EventCreater {
	public EventCreater() {
		System.out.println("created event creator");
	}

	public void createEvent(boolean create) throws Throwable {
		if (create) {
			System.out.println("creating an event");
			Throwable throwable = new Throwable();
			throw throwable;// checked exception
		} else {
			System.out.println("not creating an event");
		}
	}

	// stack trace
	public void frame1() throws Throwable {
		System.out.println("frame1");
		this.frame2();
	}

	public void frame2() throws Throwable {
		System.out.println("frame2");
		this.frame3();
	}

	public void frame3() throws Throwable {
		System.out.println("frame3");
		this.frame4();
	}

	public void frame4() throws Throwable {
		System.out.println("frame4");
		this.frame5();

	}

	private void frame5() throws Throwable {
		System.out.println("frame5");
		this.createEvent(true);

	}
}
