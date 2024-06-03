package polymorphism;

public class Mock1 {
	
	public void game (int num,int num2) {
		System.out.println(num+num2);
	}
	
}
 class Mock2 extends Mock1{
	
	public void game (int num1, int num2) {
		System.out.println(num1+num2);
	}
}
 class Mock3 {
	 public static void main(String[] args) {
		Mock2 mc = new Mock2();
		mc.game(10, 30);
		
	}
 }