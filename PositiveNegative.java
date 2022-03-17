package Basic;

import java.util.Scanner;

public class PositiveNegative {
	

	
		
		int a;
		Scanner num = new Scanner(System.in);
		
		void Result() {
			 
			 
			  System.out.print("Enter No.=");
			  a = num.nextInt();
			  if(a>=0) {
				  System.out.print(a +" is a positve number." );
				}
			  else {
				System.out.print(a +" is a negative number." );
				}
		 }
		
		public static void main(String[] args) {
				 
			 PositiveNegative e = new  PositiveNegative();
			e.Result();
				  
		}
	}



