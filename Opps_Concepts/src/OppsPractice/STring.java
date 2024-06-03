package OppsPractice;

public class STring {

	public static void main(String[] args) {
		String str = "RISHI SOLAT";
		String str1 = "Trushant Solat";
		String str2 = "rishi Solat";
		String str3 = "RISHI SOLATrs";
					//0123456789101112
				/*System.out.println(str.toLowerCase());
				System.out.println(str.indexOf("I"));// it will show index number of I
				System.out.println(str.lastIndexOf("S"));// show index of last S 
				System.out.println(str.lastIndexOf("S",12));// show index of last S and print index from start
				System.out.println(str.indexOf("I",3));// in this it will check I after index 2(I)  and print index number from start
				System.out.println(str.equalsIgnoreCase("RIShi Solat"));// check string is equal or not without checking lower or upper case
				System.out.println(str.replace("RISHI SOLAT", "TRUSHANT SOLAT"));// replace it with new string
				System.out.println(str.trim());// it will delete the space before and after string*/
				str = str.replace(" ", "");// replace space with underscore (_)
						System.out.println(str);
						System.out.println(str.compareTo(str2));// to compare it will take unicode value od str 1st ch. (R) is 82 and - with str2 
																//1st ch. (r) is 114 so 82-114=-32 is our out put
						
						
	}
} 
