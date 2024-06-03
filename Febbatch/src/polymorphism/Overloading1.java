package polymorphism;

public class Overloading1 

{
		public static void sum(int num1, int num2)
		{
			System.out.println(num1+num2);
		}
		public static void sum(int num1, int num2,int num3)
		{
			System.out.println(num1+num2+num3);
		}
		public static int sub(int num1, int num2, int num3)
		{
		//	System.out.println(num1-num2-num3);
			return num1-num2-num3;
		}
		public static void main(String[] args) {
			Overloading1 od= new Overloading1();
			
			System.out.println(od.sub(20, 50, 40));
			
			od.sum(80, 70);
			od.sum(20,50,60);
		}

}
