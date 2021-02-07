package javasession;

public abstract class Car  {

	static int x=10;int y=20;
	
	public final void start()
	{
		System.out.println("car start");
	}
	
	public static void stop()
	{
		System.out.println("car stop");
	}
	
	public void refuel()
	{
		System.out.println("car refuel");
	}

	public abstract void horn();
}
