package OppsPractice;

public class Inheritance {

	int Ganesh = 20;
	int Sai = 40;
	public Inheritance (){
		System.out.println("i am in constrctor");
		
	}
	public void sum() {
		int sum = this.Sai+this.Ganesh;
		System.out.println(sum);
	}
}
