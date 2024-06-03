package polymorphism;

public class OverlodingChild extends Overloding
{ 
	String ballpen;
	String Gelpen;

	public OverlodingChild() 
	{
	
	}
	public  void sum ()
	{ super.sum();
		this.ballpen ="30";
		this.Gelpen = "15";
		String value= ballpen+Gelpen;
		
		
		System.out.println("Total quntity of ballpen and Gelpen is ="+ ballpen +" "+ Gelpen);
	}
	
	}

