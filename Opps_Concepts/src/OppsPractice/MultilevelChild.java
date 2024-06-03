package OppsPractice;

public class MultilevelChild extends Multilevel {
		int price;
		int type;
		
		MultilevelChild (int price, int type,String boat, String firebolt)
		{ 
			super(boat,firebolt);
			super.price("Smart","Andriod");
			this.price = price;
			this.type = type;
			
			System.out.println(boat +"&"+ firebolt);
			System.out.println("My earphone price is "+price+ "+ and its type is " +type);
			
		}
}
