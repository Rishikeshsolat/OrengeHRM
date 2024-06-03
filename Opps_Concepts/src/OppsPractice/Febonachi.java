package OppsPractice;


import java.util.Arrays;
import java.util.Collections;

public class Febonachi {
	

		public static void main(String[] args) {

			int num = 5;
			int fact=1;
			
			// 5 4 *3 2* 1
			
			for(int i=1; i<=num; i++) {
				fact = fact* i;
				//num = fact;
			}
			
			System.out.println(fact);


		}

	}

