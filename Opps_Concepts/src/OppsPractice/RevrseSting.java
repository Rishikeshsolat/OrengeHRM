package OppsPractice;

public class RevrseSting
{
	public static void main(String[] args)
	{
	
		String name = "Rishikesh Solat";
		
		String rev = "";
		char [] ch = name.toCharArray();
		for(int i=ch.length-1;i>=0;i--)
		{
			rev += ch[i];
		}
		
		System.out.println(rev	);
     }
}
