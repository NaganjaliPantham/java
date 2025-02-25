package javaproject;
class vehicle{
	//method with single parameter
	void speed(int maxspeed) {
		System.out.println("vehicle speed:"+maxspeed+"kmph");
	}
	//overloaded method 
	void speed(int maxspeed,String unit) {
		System.out.println("vehicle speed:"+maxspeed+unit);
	}
}
public class polymorphism {
//	runtime-overriding
//	compiletime-overloading
	public static void main(String[] args) {
		vehicle v=new vehicle();
		v.speed(100);
		v.speed(100,"kmph");
	}
}
