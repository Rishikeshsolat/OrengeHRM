package OppsPractice;

public class Multilevel {

	String boat;
	String firebolt;
	Multilevel (String boat, String firebolt)
	{
		this.boat= boat;
		this.firebolt= firebolt;
		System.out.println("i have two earphone one is "+boat+" second is "+ firebolt );
		
	}
	protected void price (String boat1,String firebolt1)
	{
		this.boat = boat1;
		this.firebolt= firebolt1;
		System.out.println("i have two earphone one is "+boat1+" second is "+ firebolt1 );
	}
}
