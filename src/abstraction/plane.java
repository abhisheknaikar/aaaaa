package abstraction;

abstract public class plane {
	
	abstract public void takeoff();

	public void fly()
	{
		System.out.println("plane is flying");
	}
	
	abstract public void land();

}
