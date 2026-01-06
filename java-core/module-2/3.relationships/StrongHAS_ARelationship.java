class Engine{
	public void start(){
		System.out.println("Engine Started");
	}
	public void stop(){
		System.out.println("Engine Stopped");
	}
}
class Car{
	private Engine engine;
	public Car(){
		engine = new Engine();
	}
	public void drive(){
		engine.start();
		System.out.println("Car is running");
	}
	public void park(){
		engine.stop();
		System.out.println("Car is parked");
	}
}



public class StrongHAS_ARelationship{
	public static void main(String[] args) {
		Car car = new Car();
		car.drive();

		car.park();
	}
}