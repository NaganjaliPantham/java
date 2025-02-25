package javaproject;

abstract class vehicles {
	abstract void start();

	public void stop() {
		System.out.println("vehicle stopped");
	}
}
class car extends vehicles{
	@Override
	void start() {
		System.out.println("car has been started");
	}
	
}
public class abstraction {
	public static void main(String[] args) {
		vehicles v=new car();
		v.start();
		v.stop();
	}

}
