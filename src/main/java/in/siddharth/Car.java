package in.siddharth;

public class Car {

	private IEngine engine;

	public void setterEngine(IEngine engine) {
		this.engine = engine;
	}

	public void Drive() {

		int status = engine.start();
		if (status >= 1) {
			System.out.println("Journey begin !!!");
		} else {
			System.out.println("Engine Troubled !!!");
		}
	}
}
