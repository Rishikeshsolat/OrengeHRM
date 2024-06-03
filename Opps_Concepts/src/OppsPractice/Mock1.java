package OppsPractice;

public class Mock1 
{
	 
	public Mock1()
	{
		int a[] = {50, 10, 20, 30, 60};
		int max = a[0];
		for (int i=0;i<a.length;i++) 
		{
			if (max<a[i]) 
			{
			max = a[i];
			
			}	
		}
		System.out.println(max);
	 }
	
	public static void main(String[] args) 
	{
		new Mock1();
	}
}
			
