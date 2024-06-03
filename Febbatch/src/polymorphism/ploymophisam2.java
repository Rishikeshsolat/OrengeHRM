package polymorphism;

public class ploymophisam2 {

	
	public int sum ( int num , int num1) {
		
		return num+num1;
	}
	public int sum (int num , int num1, int num3) {
		
		return num*(num1+num3);
	}
	public static void main (String[]args) {
		ploymophisam2 pl = new ploymophisam2();
		System.out.println(pl.sum(40, 60));
		System.out.println(pl.sum(10, 50, 70));
	}
	
}
